@file:Suppress("UnstableApiUsage")

dependencyResolutionManagement {
    // Commented due to: https://youtrack.jetbrains.com/issue/KT-51379/Build-fails-when-using-RepositoriesModeFAILONPROJECTREPOS-with-kotlin-multiplatform-projects
    // repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

include(":app")

include(":feature:feed")

include(":core:data")
include(":core:designsystem")
include(":core:model")
include(":core:network")
