package org.antop.kotlin.appendix.c

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String): Call<List<GitHubRepo>>

    @GET("users/{user}")
    fun user(@Path("user") user: String): Call<GitHubRepo>
}

fun main() {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val service = retrofit.create(GitHubService::class.java)
    val call = service.listRepos("antop-dev")
    val response = call.execute()
    val repositories = response.body()
    repositories?.run {
        for (repo in this) {
            println(repo)
        }
    }
}
