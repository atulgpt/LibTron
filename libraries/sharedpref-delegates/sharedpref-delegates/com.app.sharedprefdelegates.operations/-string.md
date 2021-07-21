//[sharedpref-delegates](../../index.md)/[com.app.sharedprefdelegates.operations](index.md)/[String](-string.md)

# String

[androidJvm]\
inline fun [SharedPreferences](https://developer.android.com/reference/kotlin/android/content/SharedPreferences.html).[String](-string.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), defaultValue: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [ReadWriteProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-write-property/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?, [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?>

To be used to get the delegated property to access the shared pref [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value

#### Return

Delegated property PrimitiveGeneric

## Parameters

androidJvm

| | |
|---|---|
| name | Name of the [SharedPreferences](https://developer.android.com/reference/kotlin/android/content/SharedPreferences.html) key |
| defaultValue | Default value to be used when key is absent, defaults to null and hence the property     becomes nullable |
