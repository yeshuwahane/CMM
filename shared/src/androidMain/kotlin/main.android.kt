import androidx.compose.runtime.Composable
import data.remote.dto.JokeDto

actual fun getPlatformName(): String = "Android"
private val stringList = listOf<String>("Light","Gintama","Katsura","Yeshu","Alien","Bro")
@Composable fun MainView(jokeDto: JokeDto) = App(jokeDto)
