# CustomToast Library

A simple and customizable toast message library for Android.

1. Add the JitPack repository

In your **root-level `build.gradle`** or **`settings.gradle`** file, add the following JitPack repository:

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```


2. Add the Dependency
```gradle

dependencies {
    implementation 'com.github.AnurupJaiswal:CustomToast:1.0.8'
}
```
## Usage

Example: MainActivity.kt

```kotlin


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Display Custom Toast message
        CustomToast.showToast(this, "ॐ श्री श्याम देवाय नमः✨")
    }
}
```
## Requirements
- minSdkVersion: 25
- compileSdkVersion: 34
- targetSdkVersion: 34



