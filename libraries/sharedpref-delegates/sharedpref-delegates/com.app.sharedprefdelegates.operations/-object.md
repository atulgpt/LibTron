//[sharedpref-delegates](../../index.md)/[com.app.sharedprefdelegates.operations](index.md)/[Object](-object.md)

# Object

[androidJvm]\
inline fun <[M](-object.md)> [SharedPreferences](https://developer.android.com/reference/kotlin/android/content/SharedPreferences.html).[Object](-object.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), defaultValue: [M](-object.md)? = null): [ReadWriteProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-write-property/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?, [M](-object.md)?>

To be used to get the delegated property to access the shared pref [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) value The object should be allowed to serialized by Gson for example it should not have any inner class which is not static

#### Return

Delegated property SharedPrefPropertyDelegate

## See also

androidJvm

| | |
|---|---|
| [ObjectNotNull](-object-not-null.md) | for non-null cases |
| toStringUsingGson |  |
| fromJson |  |

## Parameters

androidJvm

| | |
|---|---|
| name | Name of the key |
| defaultValue | Default value, defaults to {@code null} |
