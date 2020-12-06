# LibTron [![](https://jitpack.io/v/atulgpt/LibTron.svg)](https://jitpack.io/#atulgpt/LibTron)

LibTron is collections of small libraries that help in making android apps fun and efficient. This library extensively use the magic of Kotlin such as its type-safety and language features to provide maximum developer satisfaction

Each library has been designed to have a **small footprint** and be as **efficient** as possible.

## All the Android libraries

- **[SharedprefDelegates:](libraries/sharedpref-delegates)** Type safe ways to read and write from Sharedpreferences in Android.
- **[UiStateLib:](libraries/uistate-lib)** Easy way to represent Network responses in Loading, Success and Failure state.
- **[PropertyDelegates:](libraries/property-delegates)** Type safe ways to access properties from Intent and Bundle.

## Download

### Gradle instructions

Project `build.gradle` 

```groovy
allprojects {
	repositories {
		//...
		maven { url 'https://jitpack.io' }
	}
}
```

Gradle dependency for SharedprefDelegates:

App `build.gradle`
```groovy
implementation 'com.github.atulgpt.LibTron:sharedpref-delegates:0.0.3'
```

Gradle dependency for UiStateLib:

App `build.gradle`
```groovy
implementation 'com.github.atulgpt.LibTron:uistate-lib:0.0.3'
```

Gradle dependency for PropertyDelegates:

App `build.gradle`
```groovy
implementation 'com.github.atulgpt.LibTron:property-delegates:0.0.3'
```

## New versions notifications
Releases are announced on GitHub, you can subscribe by [clicking on "Watch", then "Releases only"](
https://docs.github.com/en/github/managing-subscriptions-and-notifications-on-github/viewing-your-subscriptions#configuring-your-watch-settings-for-an-individual-repository
).

## Improve this library
If you want this library to have **a new feature or an improvement** in a
new or in an existing module, please, open an issue or vote/comment a
similar one first, so it can be discussed.

**Documentation contributions** are also welcome.
For typos or other small improvements, feel free to submit a PR
(pull request) directly.
For more significant doc contributions, please, open an issue first so it
can be discussed.

**If you find a bug**, please open an issue with all the important details.
If you know a simple fix that is not API breaking and that does not have
side-effects that need to be considered, you may also directly submit a PR.

## Developed By

Atul Gupta - <atlgpt17@gmail.com>

## License
This library is published under Apache License version 2.0 which you can see
[here](https://github.com/atulgpt/LibTron/blob/master/LICENSE.txt).
