package com.example.describe_query_test_task;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.describe_query_test_task.pojo.Field;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.describe_query_test_task.Constants.SIZE_OF_PORTION;
import static com.example.describe_query_test_task.Constants.TABLE_NAME;


public class DBModel implements MvpContract.DefaultDbModel {

    public List<Field> fields;

    public DBModel() {
        mapReadyFromDB = new ArrayList<>();
        fields = new ArrayList<>();
    }

    @Override
    public void onDestroy() {

    }



    @Override
    public List<Field> getFields() {
        return fields;
    }

    @Override
    public void addData(MvpContract.DefaultDbPresenter presenter) {
        getDataFromDB(mapReadyFromDB, presenter);
    }

    public void getDataFromDB(List<Map<String, String>> mapReadyFromDB, MvpContract.DefaultDbPresenter describePresenter) {

        SQLiteDatabase database = new DBSqliteHelper(describePresenter.getContext(), this).getReadableDatabase();
        Cursor cursor = database.rawQuery("SELECT * FROM " + TABLE_NAME + " LIMIT " + SIZE_OF_PORTION + " OFFSET " + describePresenter.getShowedRecordsCount(), null);


        while (cursor.moveToNext()) {

            Map<String, String> mapLocal = new HashMap<>();

            for (int i = 0; i < cursor.getColumnCount(); i++) {
                if (cursor.getString(i) != null) {
                    mapLocal.put(getFields().get(i).getName(), cursor.getString(i));
                }
            }
            mapReadyFromDB.add(mapLocal);
        }

        cursor.close();
        Log.d("READDB", " setted map size = " + mapReadyFromDB.size());
        describePresenter.setDataToView(mapReadyFromDB);
    }

    @Override
    public void saveDataToDB(List<Field> fields, List<Map<String, String>> mapReadyTODB, DBPresenter dbPresenter, boolean b) {

        this.fields.addAll(fields);
        Log.d("FIELDSLOG", "fields in Dmodel " + getFields().size());
        SQLiteDatabase database = new DBSqliteHelper(dbPresenter.getContext(), this).getWritableDatabase();
        database.execSQL("delete from " + TABLE_NAME);
        for (int i = 0; i < mapReadyTODB.size(); i++) {
            ContentValues values = new ContentValues();
            for (Map.Entry<String, String> entry : mapReadyTODB.get(i).entrySet()) {
                values.put(entry.getKey(), entry.getValue());
            }
            long newRowId = database.insert(TABLE_NAME, null, values);
            Log.d("DatabaseLog", "just added row to table id = " + newRowId);
        }
        if (b) {
            getDataFromDB(getMapReadyFromDB(), dbPresenter);
        }
    }

    public List<Map<String, String>> getMapReadyFromDB() {
        return mapReadyFromDB;
    }

    public void setMapReadyTODB(List<Map<String, String>> mapReadyTODB) {
        this.mapReadyFromDB = mapReadyTODB;
    }

    List<Map<String, String>> mapReadyFromDB;

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
}
