package com.flux.launcher.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@Composable
fun FluxLauncherTheme(content: @Composable () -> Unit) {
    val context = LocalContext.current
    val colorScheme = dynamicDarkColorScheme(context) // Prende i colori dallo sfondo

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}
