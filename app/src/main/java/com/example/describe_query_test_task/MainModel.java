package com.example.describe_query_test_task;

import android.support.annotation.NonNull;
import android.util.Log;

import com.example.describe_query_test_task.network.ApiService;
import com.example.describe_query_test_task.network.RetrofitHelper;
import com.example.describe_query_test_task.pojo.Describe;
import com.example.describe_query_test_task.pojo.Field;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;


public class MainModel implements MvpContract.DefaultMainModel {


    public List<Field> fields;

    private CompositeDisposable mCompositeDisposable = new CompositeDisposable();

    @NonNull
    private ApiService mApiService;

    MainModel() {
        mapReadyFromDB = new ArrayList<>();
        mApiService = new RetrofitHelper().getDescribeFromApi();
    }

    @Override
    public void onDestroy() {
        mCompositeDisposable.dispose();
    }

    public void loadRecords(final MvpContract.DefaultMainPresenter describePresenter) {


        mCompositeDisposable.add(mApiService.requestRecordsSecondPart()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(new Function<ResponseBody, JSONArray>() {
                    @Override
                    public JSONArray apply(
                            @io.reactivex.annotations.NonNull final ResponseBody response) throws IOException {
                        JSONArray records = new JSONArray();
                        Log.d("usersLog", "have an apply in model and can change response");
                        try {
                            JSONObject json = new JSONObject((response.string()));
                            Log.d("usersLog", "responseBody length = " + response.string().length());
                            records = json.getJSONArray("records");
                            Log.d("usersLog", "records size = " + records.length());
                        } catch (JSONException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (response != null) {
                            Log.d("usersLog", "Query size = " + response.string().length());
                        }

                        return records;
                    }
                })
                .subscribe(new Consumer<JSONArray>() {

                    @Override
                    public void accept(
                            @io.reactivex.annotations.NonNull final JSONArray results) throws JSONException {
                        Log.d("usersLog", "have an  list of ready Fields in model");

                        parseQuery(results, describePresenter, false);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@io.reactivex.annotations.NonNull Throwable throwable) {

                        Log.d("usersLog", "have trouble: " + throwable.getMessage());
                    }
                })
        );

        mCompositeDisposable.add(mApiService.requestRecordsFirstPart()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(new Function<ResponseBody, JSONArray>() {
                    @Override
                    public JSONArray apply(
                            @io.reactivex.annotations.NonNull final ResponseBody response) throws IOException {
                        JSONArray records = new JSONArray();
                        Log.d("usersLog", "have an apply in model and can change response");
                        try {
                            JSONObject json = new JSONObject((response.string()));
                            Log.d("usersLog", "responseBody length = " + response.string().length());
                            records = json.getJSONArray("records");
                            Log.d("usersLog", "records size = " + records.length());
                        } catch (JSONException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (response != null) {
                            Log.d("usersLog", "Query size = " + response.string().length());
                        }

                        return records;
                    }
                })
                .subscribe(new Consumer<JSONArray>() {

                    @Override
                    public void accept(
                            @io.reactivex.annotations.NonNull final JSONArray results) throws JSONException {
                        Log.d("usersLog", "have an  list of ready Fields in model");

                        parseQuery(results, describePresenter, true);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@io.reactivex.annotations.NonNull Throwable throwable) {

                        Log.d("usersLog", "have trouble: " + throwable.getMessage());
                    }
                })
        );
    }

    List<Map<String, String>> mapReadyTODB;
    List<Map<String, String>> mapReadyFromDB;

    private void parseQuery(JSONArray results, MvpContract.DefaultMainPresenter describePresenter, boolean b) {
        mapReadyTODB = new ArrayList<>();

        if (results != null) {
            for (int i = 0; i < results.length(); i++) {
                JSONObject jsonObject = null;
                try {
                    jsonObject = results.getJSONObject(i);
                    Map<String, String> localMap = new HashMap<>();
                    for (int j = 0; j < fields.size(); j++) {
                        if (jsonObject.has(fields.get(j).getName())) {
                            String fieldData;
                            try {
                                fieldData = jsonObject.getString(fields.get(j).getName());
                                localMap.put(fields.get(j).getName(), fieldData);
                                Log.d("usersLog", "put to - " + fields.get(j).getName() + " : " + fieldData);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }


                    }
                    mapReadyTODB.add(localMap);
                    Log.d("usersLog", "add local map with " + localMap.size() + " fields");
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                Log.d("usersLog", "all map have size = " + mapReadyTODB.size());

            }
        }
        describePresenter.saveDataToDB(fields, mapReadyTODB, b);
        Log.d("FIELDSLOG", "fields in Mmodel " + fields.size());
    }


    @Override
    public void loadDescribe(final MvpContract.DefaultMainPresenter describePresenter) {
        mCompositeDisposable.add(mApiService.requestDescribe()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(new Function<Describe, List<Field>>() {
                    @Override
                    public List<Field> apply(
                            @io.reactivex.annotations.NonNull final Describe response) {
                        Log.d("usersLog", "have an apply in model and can change response");

                        return response.getFields();
                    }
                })
                .subscribe(new Consumer<List<Field>>() {

                    @Override
                    public void accept(
                            @io.reactivex.annotations.NonNull final List<Field> results) {
                        Log.d("usersLog", "have an  list of ready Fields in model");
                        Log.d("usersLog", "as example name = " + results.get(99).getName());
                        setFields(results);
                        loadRecords(describePresenter);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@io.reactivex.annotations.NonNull Throwable throwable) {
                        describePresenter.showError();
                        Log.d("usersLog", "have trouble: " + throwable.getMessage());
                    }
                })
        );
    }

    private void setFields(List<Field> results) {
        this.fields = results;
    }

}
