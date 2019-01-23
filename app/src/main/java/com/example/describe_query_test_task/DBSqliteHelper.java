package com.example.describe_query_test_task;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.describe_query_test_task.Constants.TABLE_NAME;

public class DBSqliteHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 3;
    public static final String DATABASE_NAME = "accounts_database";
    MvpContract.DefaultDbModel mModel;

    public DBSqliteHelper(Context context, MvpContract.DefaultDbModel mModel) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.mModel = mModel;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        DBContract.AccountTable accountTable = new DBContract.AccountTable();
        sqLiteDatabase.execSQL(accountTable.createStringTable(mModel.getFields()));
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}