package com.example.describe_query_test_task;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.describe_query_test_task.pojo.Field;

import java.util.List;
import java.util.Map;

import static com.example.describe_query_test_task.Constants.SIZE_OF_PORTION;

public class MainActivity extends AppCompatActivity implements MvpContract.MainView {

    private MvpContract.DefaultMainPresenter mPresenter;
    private MvpContract.DefaultDbPresenter dbPresenter;

    RecyclerView rv;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mPresenter = new MainPresenter(this);
        dbPresenter = new DBPresenter(this);
        dialog = new ProgressDialog(this);
        mPresenter.requestDescribe();

        rv = findViewById(R.id.rv);
        rv.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

                if (!recyclerView.canScrollVertically(1)) {
                    Log.d("addingLog", "call presenter addData");
                    dbPresenter.addData();

                }
            }
        });


    }

    @Override
    public void showLoading() {
        dialog.setMessage("Loading data, please wait.");
        dialog.show();
    }

    @Override
    public void hideLoading() {
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    @Override
    public void displayRecords(List<Map<String, String>> records) {
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        RVAdapter adapter = new RVAdapter(records, this);
        rv.setAdapter(adapter);
        rv.scrollToPosition(records.size() - (SIZE_OF_PORTION));
        adapter.notifyDataSetChanged();
    }

    @Override
    public void saveToDB(List<Field> fields, List<Map<String, String>> mapReadyTODB, boolean b) {
        Log.d("FIELDSLOG", "fields in Mactivity " + fields.size());
        dbPresenter.saveDataToDB(fields, mapReadyTODB, b);
    }

    @Override
    public void showError() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Something went wrong");
        builder.setMessage("Check your internet connection and retry");
        builder.setPositiveButton("Retry",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        mPresenter.requestDescribe();
                    }
                });
        builder.setCancelable(false);
        builder.show();
    }

    @Override
    public Context getContext() {
        return getApplicationContext();
    }

}
