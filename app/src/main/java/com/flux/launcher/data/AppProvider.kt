package com.flux.launcher.data

import android.content.Context
import android.content.pm.LauncherApps
import android.graphics.drawable.Drawable
import android.os.Process
import androidx.compose.runtime.mutableStateListOf

// Questa classe tiene traccia di tutte le app installate
class AppProvider(private val context: Context) {
    private val launcherApps = context.getSystemService(Context.LAUNCHER_APPS_SERVICE) as LauncherApps
    
    // Lista osservabile che si aggiornerà automaticamente nella UI
    val installedApps = mutableStateListOf<AppInfo>()

    fun loadApps() {
        // Query per tutte le app installate nel profilo corrente
        val apps = launcherApps.getActivityList(null, Process.myUserHandle())
        
        installedApps.clear()
        apps.forEach { activityInfo ->
            installedApps.add(AppInfo(
                label = activityInfo.label.toString(),
                packageName = activityInfo.applicationInfo.packageName,
                icon = activityInfo.getIcon(0) // Recupera l'icona adattiva
            ))
        }
    }
}

data class AppInfo(
    val label: String,
    val packageName: String,
    val icon: Drawable
)
