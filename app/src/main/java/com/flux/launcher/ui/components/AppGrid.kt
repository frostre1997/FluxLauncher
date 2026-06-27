package com.flux.launcher.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.drawablepainter.rememberDrawablePainter // Assicurati di avere questa dipendenza o usa un metodo standard
import com.flux.launcher.data.AppInfo

@Composable
fun AppGrid(apps: List<AppInfo>) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 80.dp),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(apps) { app ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(8.dp)
            ) {
                // Qui mostriamo l'icona dell'app
                // Nota: In un progetto reale, useresti una libreria come Coil per gestire le icone
                Text(text = app.label)
            }
        }
    }
}
