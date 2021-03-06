object Libs {
  private object Versions {
    const val androidX = "1.1.0-alpha05"
    const val andoridXLifecycle = "2.2.0-rc03"
    const val androidXConstraint = "2.0.0-beta4"
    const val androidXAnnotations = "1.0.1"
    const val androidMaterial = "1.1.0-alpha06"
    const val retrofit = "2.7.0"
    const val moshi = "1.9.2"
    const val okhttpLogging = "3.14.4"
    const val anko = "0.10.8"
    const val playServicesMaps = "17.0.0"
    const val lottie = "2.8.0"
    const val koin = "2.0.1"
    const val mpaAndroidChart = "v3.1.0"
    const val likeButton = "0.2.3"
    const val leakcanary = "1.6.2"
    const val timerKt = "1.5.1"
    const val targetTooltip = "2.0.1"

    // Crashlytics
    const val playServicesFirebaseAnalytics = "17.2.1"
    const val crashlytics = "2.10.1"
  }

  const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${ProjectVersions.kotlin}"
  const val androidX = "androidx.appcompat:appcompat:${Versions.androidX}"
  const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.androidX}"
  const val androidMaterial = "com.google.android.material:material:${Versions.androidMaterial}"
  const val androidXAnnotations = "androidx.annotation:annotation:${Versions.androidXAnnotations}"
  const val constaintLayout = "androidx.constraintlayout:constraintlayout:${Versions.androidXConstraint}"
  const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime:${Versions.andoridXLifecycle}"
  const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.andoridXLifecycle}"
  const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.andoridXLifecycle}"
  const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
  const val retrofitConverterMoshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
  const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
  const val moshiAdapter = "com.squareup.moshi:moshi-adapters:${Versions.moshi}"
  const val moshiCodegen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"
  const val anko = "org.jetbrains.anko:anko-commons:${Versions.anko}"
  const val googleMaps = "com.google.android.gms:play-services-maps:${Versions.playServicesMaps}"
  const val playServicesLocation = "com.google.android.gms:play-services-location:${Versions.playServicesMaps}"
  const val mpaAndroidChart = "com.github.PhilJay:MPAndroidChart:${Versions.mpaAndroidChart}"
  const val lottie = "com.airbnb.android:lottie:${Versions.lottie}"
  const val likeButton = "com.github.jd-alexander:LikeButton:${Versions.likeButton}"
  const val targetTooltip = "it.sephiroth.android.library.targettooltip:target-tooltip-library:${Versions.targetTooltip}"
  const val koin = "org.koin:koin-android:${Versions.koin}"
  const val koinScope = "org.koin:koin-androidx-scope:${Versions.koin}"
  const val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
  const val leakcanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakcanary}"
  const val leakcanaryFragment = "com.squareup.leakcanary:leakcanary-support-fragment:${Versions.leakcanary}"
  const val leakcanaryNoOp = "com.squareup.leakcanary:leakcanary-android-no-op:${Versions.leakcanary}"
  const val timber = "com.github.ajalt:timberkt:${Versions.timerKt}"
  const val okHttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpLogging}"

  // Crashlytics
  const val firebaseAnalytics = "com.google.firebase:firebase-analytics:${Versions.playServicesFirebaseAnalytics}"
  const val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Versions.crashlytics}"
}