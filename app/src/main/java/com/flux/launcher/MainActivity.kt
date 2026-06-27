package com.flux.launcher

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.flux.launcher.ui.theme.FluxLauncherTheme
import com.flux.launcher.ui.components.AppGrid
import com.flux.launcher.data.AppProvider

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Inizializziamo il nostro "cervello" che cerca le app
        val appProvider = AppProvider(this)
        appProvider.loadApps()
        
        setContent {
            FluxLauncherTheme {
                // Qui richiamiamo la griglia che abbiamo creato in AppGrid.kt
                AppGrid(apps = appProvider.installedApps)
            }
        }
    }
}
