plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }

android { namespace="com.example.karambol"; compileSdk=35
    defaultConfig { applicationId="com.example.karambol"; minSdk=24; targetSdk=35; versionCode=2; versionName="0.2" }
}
dependencies { implementation("androidx.core:core-ktx:1.15.0"); implementation("androidx.activity:activity-ktx:1.10.0") }
