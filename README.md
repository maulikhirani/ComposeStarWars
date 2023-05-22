# Compose StarWars
![Release Workflow](https://github.com/maulikhirani/ComposeStarWars/actions/workflows/android.yml/badge.svg) 

This is a simple & low-to-medium complexity demo app which covers multiple aspects of Modern Android Development practices and tools.

## What does the app looks like?

Well, the idea is fairly simple - we are using an open source API from https://swapi.dev/ to load the list of StarWars universe characters. We don't load all characters at once, so we use the concept of pagination to load more data when scrolled to bottom.

https://github.com/maulikhirani/ComposeStarWars/assets/25861055/a41bb41f-a5ff-4ffc-b01a-e680387f3ac2

## How the app is built?

The app is built with the latest tools and development practices:

|Tool/SDK|Usage|
|---|---|
|[Jetpack Compose][1] with [Material 3][2]|UI design|
|[Retrofit][3]|Networking (calling the API)|
|[Coil][4]|Loading network images|
|[Lottie][5]|Animated loading indicator|
|[Hilt][6]|Dependency injection|
|[Paging 3 for Compose][7]|Loading the list with pagination|

## Looking for a Kotlin Multiplatform version of this?
I have created another repo which uses KMM to do the same thing as this app. You can find it here: https://github.com/maulikhirani/KmmStarWars

[1]: https://developer.android.com/jetpack/compose
[2]: https://m3.material.io/develop/android/jetpack-compose
[3]: https://square.github.io/retrofit/
[4]: https://coil-kt.github.io/coil/compose/
[5]: https://github.com/airbnb/lottie/blob/master/android-compose.md
[6]: https://developer.android.com/training/dependency-injection/hilt-android
[7]: https://developer.android.com/reference/kotlin/androidx/paging/compose/package-summary#collectaslazypagingitems
