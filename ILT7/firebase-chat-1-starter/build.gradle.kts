// TODO [3] Add Dependency at build.gradle.kts (Project: My_Firebase_Chat)
buildscript {
    dependencies {
        classpath(libs.google.services)
    }
}

plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
}