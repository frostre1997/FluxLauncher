plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.flux.launcher"
    compileSdk = 34 // Usiamo le API più recenti per Material 3

    defaultConfig {
        applicationId = "com.flux.launcher"
        minSdk = 26 // Supporto per Android 8.0+
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.0"
    }
}

dependencies {
    // Material 3 Expressive (Il cuore grafico)
    implementation("androidx.compose.material3:material3:1.2.0")
    
    // Base di Compose
    implementation("androidx.compose.ui:ui:1.6.0")
    implementation("androidx.activity:activity-compose:1.8.0")
    
    // Supporto icone e grafica moderna
    implementation("androidx.compose.ui:ui-graphics:1.6.0")
}
