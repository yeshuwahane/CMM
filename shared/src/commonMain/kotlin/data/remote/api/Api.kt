package data.remote.api

import data.remote.dto.JokeDto
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class Api {

    private val BASE_URL = "https://api.chucknorris.io/jokes/random"

    private val client = HttpClient(){
        install(ContentNegotiation){
            json(Json {
                ignoreUnknownKeys = true
                useAlternativeNames = false
            })
        }
    }

    suspend fun getRandomJoke():JokeDto{
        return client.get(BASE_URL).body()
    }


}