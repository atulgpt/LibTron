//[sharedpref-delegates](../../index.md)/[com.app.sharedprefdelegates.operations](index.md)/[ObjectNotNull](-object-not-null.md)

# ObjectNotNull

[androidJvm]\
inline fun <[M](-object-not-null.md)> [SharedPreferences](https://developer.android.com/reference/kotlin/android/content/SharedPreferences.html).[ObjectNotNull](-object-not-null.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), defaultValue: [M](-object-not-null.md)): [ReadWriteProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-write-property/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?, [M](-object-not-null.md)>

To be used to get the delegated property to access the shared pref [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) value The object should be allowed to serialized by Gson for example it should not have any inner class which is not static

#### Return

Delegated property SharedPrefPropertyDelegate

## See also

androidJvm

| | |
|---|---|
| [SharedPreferences.Object](-object.md) | for null cases |
| toStringUsingGson |  |
| fromJson |  |

## Parameters

androidJvm

| | |
|---|---|
| name | Name of the key |
| defaultValue | Default value, this is non-nullable version |
