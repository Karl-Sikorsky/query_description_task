package com.example.describe_query_test_task;

import android.content.Context;
import android.util.Log;

import com.example.describe_query_test_task.pojo.Field;

import java.util.List;
import java.util.Map;

public class DBPresenter implements MvpContract.DefaultDbPresenter {
    MvpContract.View mView;
    MvpContract.DefaultDbModel mModel;

    public DBPresenter(MvpContract.View activity) {
        this.mView = activity;
        mModel = new DBModel();
    }

    @Override
    public void onDestroy() {
mModel.onDestroy();
    }



    @Override
    public void addData() {
        mModel.addData(this);
    }

    @Override
    public Context getContext() {
        return mView.getContext();
    }

    @Override
    public void setDataToView(List<Map<String, String>> mapReadyFromDB) {
        mView.hideLoading();
        mView.displayRecords(mapReadyFromDB);
        showedListSize = mapReadyFromDB.size();
    }

    int showedListSize;

    @Override
    public String getShowedRecordsCount() {
        return String.valueOf(showedListSize);
    }

    @Override
    public void saveDataToDB(List<Field> fields, List<Map<String, String>> mapReadyTODB, boolean b) {
        Log.d("FIELDSLOG", "fields in Dpresenter " + fields.size());
        mModel.saveDataToDB(fields, mapReadyTODB, this, b);

    }
}
