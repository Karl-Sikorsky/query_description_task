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

        void saveDataToDB(List<Field> fields, List<Map<String, String>> mapReadyTODB, boolean b);

    }

    interface DefaultMainPresenter extends Presenter{

        void requestDescribe();

        void showError();


    }

    interface DefaultDbPresenter extends Presenter{

        void addData();

        Context getContext();

        void setDataToView(List<Map<String, String>> mapReadyFromDB);

        String getShowedRecordsCount();


    }

    interface Model {

        void onDestroy();

    }
    interface DefaultDbModel extends Model{

        List<Field> getFields();

        void addData(DefaultDbPresenter presenter);

        void saveDataToDB(List<Field> fields, List<Map<String, String>> mapReadyTODB, DBPresenter dbPresenter, boolean b);
    }
    interface DefaultMainModel extends Model{

        void loadDescribe(DefaultMainPresenter describePresenter);

    }

}