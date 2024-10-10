# CustomToast Library

A simple and customizable toast message library for Android.

## 1. Integration
Follow the steps below to add **CustomToast** to your Android project.

### 1.1. Add the JitPack repository

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


## 2.Add the CustomToast dependency

```gradle
dependencies {
    implementation 'com.github.AnurupJaiswal:CustomToast:1.0.8'
}


