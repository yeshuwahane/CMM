package data.remote.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class JokeDto(
    @SerialName("categories")
    val categories: List<String>,
    @SerialName("created_at")
    val created_at: String,
    @SerialName("icon_url")
    val icon_url: String,
    @SerialName("id")
    val id: String,
    @SerialName("updated_at")
    val updated_at: String,
    @SerialName("url")
    val url: String,
    @SerialName("value")
    val value: String
)