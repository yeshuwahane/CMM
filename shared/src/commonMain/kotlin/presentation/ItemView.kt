package presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import domain.BeerModel
import io.kamel.core.utils.URI
import io.kamel.core.utils.URL
import io.kamel.image.asyncPainterResource
import io.ktor.http.Url

@Composable
fun ItemView(beerModel: BeerModel) {

    Box(
        modifier = Modifier
            .height(200.dp)
            .width(200.dp)
            .padding(10.dp)
            ,
        contentAlignment = Alignment.Center
    ) {
        asyncPainterResource(data = Url(beerModel.imgSrc))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(MaterialTheme.colors.secondary),
            contentAlignment = Alignment.Center,
        )
        {
            Text(beerModel.name)
        }

    }
}