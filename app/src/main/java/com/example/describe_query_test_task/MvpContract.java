package com.example.describe_query_test_task;

import android.content.Context;

import com.example.describe_query_test_task.pojo.Field;

import java.util.List;
import java.util.Map;

public interface MvpContract {


    interface View {
        void showLoading();

        void hideLoading();

        void showError();

        Context getContext();

        void displayRecords(List<Map<String, String>> mapReadyFromDB);

        void saveToDB(List<Field> fields, List<Map<String, String>> mapReadyTODB, boolean b);
    }

    interface MainView extends View {

        void displayRecords(List<Map<String, String>> records);

    }

    interface Presenter {

        void onDestroy();

        void requestDescribe();


        void showError();


        void addData();


        Context getContext();

        void setDataToView(List<Map<String, String>> mapReadyFromDB);

        String getShowedRecordsCount();

        void saveDataToDB(List<Field> fields, List<Map<String, String>> mapReadyTODB, boolean b);
    }

    interface Model {


        void onDestroy();


        void loadDescribe(Presenter describePresenter);


        List<Field> getFields();

        void addData(Presenter presenter);


        void saveDataToDB(List<Field> fields, List<Map<String, String>> mapReadyTODB, DBPresenter dbPresenter, boolean b);
    }

}