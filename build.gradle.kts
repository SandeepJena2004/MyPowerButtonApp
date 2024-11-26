// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    id("com.android.application") version "8.7.2" apply false
    alias(libs.plugins.kotlin.android) apply false
}

buildscript {
    dependencies {
        // Add the classpath for the Android Gradle Plugin
        classpath("com.android.tools.build:gradle:8.0.0")
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
