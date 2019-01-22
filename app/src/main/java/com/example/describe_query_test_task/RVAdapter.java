package com.example.describe_query_test_task;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.RecordViewHolder> {

    @Override
    public void onBindViewHolder(final RecordViewHolder recordViewHolder, final int position) {

        recordViewHolder.showButton.setText("show");
        recordViewHolder.recordId.setText(String.valueOf(position));
        String recordText = "";
        for (Map.Entry entry : records.get(position).entrySet()) {
            if ((entry.getValue() != null) && (!(entry.getValue().toString().trim().equals("")))) {
                recordText = recordText + "\n" + entry.getKey() + " : " + entry.getValue();
            }
        }
        recordViewHolder.recordData.setText("Record " + String.valueOf(position));

        recordViewHolder.showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (recordViewHolder.showButton.getText().toString().equals("show")) {
                    String recordText = "";
                    for (Map.Entry entry : records.get(position).entrySet()) {
                        if ((entry.getValue() != null) && (!(entry.getValue().toString().trim().equals("")))) {
                            recordText = recordText + "\n" + entry.getKey() + " : " + entry.getValue();
                        }
                    }
                    recordViewHolder.showButton.setText("unshow");
                    recordViewHolder.recordData.setText(recordText);
                } else {
                    recordViewHolder.recordData.setText("Record " + String.valueOf(position));
                    recordViewHolder.showButton.setText("show");
                }
            }
        });


    }

    List<Map<String, String>> records;
    Context context;

    RVAdapter(List<Map<String, String>> records, Context context) {
        this.records = records;
        this.context = context;
    }


    @NonNull
    @Override
    public RecordViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.record_card, viewGroup, false);
        RecordViewHolder rvh = new RecordViewHolder(v);

        return rvh;
    }

    public static class RecordViewHolder extends RecyclerView.ViewHolder {

        TextView recordData;
        TextView recordId;
        Button showButton;


        RecordViewHolder(View itemView) {
            super(itemView);
            itemView.setTag(this);
            recordData = itemView.findViewById(R.id.textViewRecord);
            recordId = itemView.findViewById(R.id.textViewId);
            showButton = itemView.findViewById(R.id.buttonShow);
        }
    }

    @Override
    public int getItemCount() {
        return records.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {

        super.onAttachedToRecyclerView(recyclerView);
    }
}