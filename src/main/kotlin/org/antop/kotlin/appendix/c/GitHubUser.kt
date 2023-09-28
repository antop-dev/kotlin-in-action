package org.antop.kotlin.appendix.c

import com.google.gson.annotations.SerializedName

data class GitHubUser(
    val login: String,
    val id: Long,
    @SerializedName("node_id")
    val nodeId: String,
    val url: String,
    @SerializedName("html_url")
    val htmlUrl: String
)
