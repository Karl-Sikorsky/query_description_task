package com.example.describe_query_test_task;

import android.content.Context;
import android.util.Log;

import com.example.describe_query_test_task.pojo.Field;

import java.util.List;
import java.util.Map;

public class MainPresenter implements MvpContract.DefaultMainPresenter {
    MvpContract.DefaultMainModel mModel;
    MvpContract.View mView;


    public MainPresenter(MvpContract.View mView) {
        mModel = new MainModel();
        this.mView = mView;
    }

    @Override
    public void onDestroy() {
        mModel.onDestroy();
    }

    @Override
    public void requestDescribe() {
        mView.showLoading();
        mModel.loadDescribe(this);

    }

    @Override
    public void showError() {
        mView.showError();
    }

    @Override
    public void saveDataToDB(List<Field> fields, List<Map<String, String>> mapReadyTODB, boolean b) {
        Log.d("FIELDSLOG", "fields in Mpresenter " + fields.size());
        mView.saveToDB(fields, mapReadyTODB, b);
    }
}
