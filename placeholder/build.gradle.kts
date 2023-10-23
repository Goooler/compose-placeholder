import com.eygraber.conventions.kotlin.kmp.androidUnitTest
import com.eygraber.conventions.kotlin.kmp.jvmTest

plugins {
  id("com.eygraber.conventions-kotlin-multiplatform")
  id("com.eygraber.conventions-android-library")
  id("com.eygraber.conventions-compose-jetbrains")
  id("com.eygraber.conventions-detekt")
  id("com.eygraber.conventions-publish-maven-central")
}

android {
  namespace = "com.eygraber.compose.placeholder"
}

kotlin {
  explicitApi()

  kmpTargets(
    project = project,
    useDefaultTargetHierarchy = true,
    android = true,
    ios = true,
    jvm = true,
    js = true
  )

  sourceSets {
    commonMain {
      dependencies {
        implementation(compose.foundation)
        implementation(libs.compose.uiUtil)
      }
    }

    commonTest {
      dependencies {
        implementation(libs.kotlinx.coroutines.test)
        implementation(libs.test.kotest.assertions)
      }
    }

    androidUnitTest {
      dependencies {
        implementation(libs.test.compose.android.uiJunit)
        implementation(libs.test.compose.android.uiTestManifest)
        implementation(libs.test.robolectric)
      }
    }

    jvmTest {
      dependencies {
        implementation(compose.desktop.currentOs)
        implementation(compose.desktop.uiTestJUnit4)
      }
    }
  }
}

android {
  @Suppress("UnstableApiUsage")
  testOptions {
    unitTests {
      isIncludeAndroidResources = true
    }
    unitTests.all {
      it.useJUnit()
    }
    animationsDisabled = true
  }
}
