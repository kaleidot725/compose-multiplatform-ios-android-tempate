import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
internal fun App() {
    MaterialTheme {
        var count by remember { mutableStateOf(0) }
        Box(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.align(Alignment.Center)) {
                Text("$count")
                Button(onClick = { count += 1 }) {
                    Text("PLUS")
                }
                Button(onClick = { count -= 1 }) {
                    Text("MINUS")
                }
                Button(onClick = { count = 0 }) {
                    Text("RESET")
                }
            }
        }
    }
}

expect fun getPlatformName(): String