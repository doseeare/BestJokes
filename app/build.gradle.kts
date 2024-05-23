plugins {
	alias(libs.plugins.androidApplication)
	alias(libs.plugins.jetbrainsKotlin)
	alias(libs.plugins.androidHilt)
	id("kotlin-kapt")
}

android {
	namespace = "com.example.bestjokes"
	compileSdk = 33
	
	defaultConfig {
		applicationId = "com.example.bestjokes"
		minSdk = 24
		targetSdk = 33
		versionCode = 1
		versionName = "1.0"
		
		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
		vectorDrawables {
			useSupportLibrary = true
		}
	}
	
	buildTypes {
		release {
			isMinifyEnabled = false
			proguardFiles(
				getDefaultProguardFile("proguard-android-optimize.txt"),
				"proguard-rules.pro"
			)
		}
	}
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}
	kotlinOptions {
		jvmTarget = "1.8"
	}
	buildFeatures {
		compose = true
	}
	composeOptions {
		kotlinCompilerExtensionVersion = "1.4.3"
	}
	packaging {
		resources {
			excludes += "/META-INF/{AL2.0,LGPL2.1}"
		}
	}
}

dependencies {
	
	implementation(libs.androidx.core.ktx)
	implementation(libs.androidx.lifecycle.runtime.ktx)
	implementation(libs.androidx.activity.compose)
	implementation(platform(libs.compose.bom))
	implementation(libs.androidx.ui)
	implementation(libs.androidx.ui.graphics)
	implementation(libs.androidx.ui.tooling.preview)
	implementation(libs.androidx.material3)
	testImplementation(libs.junit)
	androidTestImplementation(libs.androidx.junit)
	androidTestImplementation(libs.androidx.espresso.core)
	androidTestImplementation(platform(libs.compose.bom))
	androidTestImplementation(libs.androidx.ui.test.junit4)
	debugImplementation(libs.androidx.ui.tooling)
	debugImplementation(libs.androidx.ui.test.manifest)
	
	
	//Dagger - Hilt
	implementation(libs.hilt.android)
	kapt(libs.kapt)
	
	//Room
	implementation(libs.androidx.room.runtime)
	kapt(libs.androidx.room.compiler)
	implementation(libs.androidx.room.ktx)
	
	//Glide
	implementation(libs.glide)

//    kapt("com.google.dagger:hilt-android-compiler:2.40.5")
//    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")
//    kapt("androidx.hilt:hilt-compiler:1.0.0")
//    implementation('androidx.hilt:hilt-navigation-compose:1.0.0')

}

kapt {
	correctErrorTypes = true
}
