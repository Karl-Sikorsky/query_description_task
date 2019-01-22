package com.example.describe_query_test_task.network;


import com.example.describe_query_test_task.pojo.Describe;

import io.reactivex.Single;
import okhttp3.ResponseBody;
import retrofit2.http.GET;


public interface ApiService {
    @GET("describe")
    Single<Describe> requestDescribe();

    @GET("query1")
    Single<ResponseBody> requestRecordsFirstPart();

    @GET("query2")
    Single<ResponseBody> requestRecordsSecondPart();
}
