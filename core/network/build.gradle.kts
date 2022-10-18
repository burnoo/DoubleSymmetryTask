@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    kotlin("multiplatform")
    alias(libs.plugins.kotlinSerialization)
    alias(libs.plugins.kotest)
}

kotlin {
    jvm()
    iosX64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.kotlin.serialization)
                implementation(libs.ktor.core)
                implementation(libs.ktor.contentNegotiations.core)
                implementation(libs.ktor.contentNegotiations.json)
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(libs.test.kotest.core)
                implementation(libs.ktor.test)
            }
        }

        val jvmTest by getting {
            dependencies {
                implementation(libs.test.kotest.junitRunner)
            }
        }
    }
}

tasks.named<Test>("jvmTest") {
    useJUnitPlatform()
}