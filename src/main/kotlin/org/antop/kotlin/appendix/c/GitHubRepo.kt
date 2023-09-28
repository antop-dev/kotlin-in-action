package org.antop.kotlin.appendix.c

import com.google.gson.annotations.SerializedName

data class GitHubRepo(
    val id: Long,
    val name: String,
    @SerializedName("full_name")
    val fullName: String,
    val private: Boolean,
    val owner: GitHubUser,
    val description: String,
    val fork: Boolean,
    val url: String
)
