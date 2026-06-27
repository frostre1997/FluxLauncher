import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun AppGrid(apps: List<AppInfo>) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 80.dp), // Si adatta allo schermo
        modifier = Modifier.padding(16.dp)
    ) {
        items(apps) { app ->
            // Qui inseriremo il componente per la singola icona
            AppIconItem(app)
        }
    }
}

