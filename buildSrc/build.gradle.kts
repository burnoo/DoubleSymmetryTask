import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.gradle.android)
    implementation(libs.gradle.kotlin)
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}