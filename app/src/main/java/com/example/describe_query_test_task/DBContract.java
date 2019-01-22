package com.example.describe_query_test_task;

import android.provider.BaseColumns;

import com.example.describe_query_test_task.pojo.Field;

import java.util.List;

import static com.example.describe_query_test_task.Constants.TABLE_NAME;

public final class DBContract {

    private DBContract() {
    }

    public static class AccountTable implements BaseColumns {


        public String createStringTable(List<Field> fields) {
            String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " +
                    TABLE_NAME + " (";
            for (int i = 0; i < fields.size(); i++) {
                CREATE_TABLE = CREATE_TABLE + fields.get(i).getName() + " TEXT, ";
            }
            CREATE_TABLE = CREATE_TABLE.substring(0, CREATE_TABLE.length() - 2);
            CREATE_TABLE = CREATE_TABLE + ")";
            return CREATE_TABLE;

        }
    }
}

