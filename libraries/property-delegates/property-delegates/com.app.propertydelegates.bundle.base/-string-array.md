//[property-delegates](../../index.md)/[com.app.propertydelegates.bundle.base](index.md)/[StringArray](-string-array.md)

# StringArray

[androidJvm]\
inline fun [BundleExtra](../com.app.propertydelegates.bundle/-bundle-extra/index.md).[StringArray](-string-array.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, customPrefix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [PropertyDelegate](../com.app.propertydelegates/-property-delegate/index.md)<[Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html), [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?>?>

inline fun [BundleExtra](../com.app.propertydelegates.bundle/-bundle-extra/index.md).[StringArray](-string-array.md)(defaultValue: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?>, name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, customPrefix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [PropertyDelegate](../com.app.propertydelegates/-property-delegate/index.md)<[Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html), [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?>>

inline fun <[T](-string-array.md)> [BundleExtra](../com.app.propertydelegates.bundle/-bundle-extra/index.md).[StringArray](-string-array.md)(crossinline reader: TypeReader<[T](-string-array.md), [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?>?>, crossinline writer: TypeWriter<[T](-string-array.md), [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?>?>, name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, customPrefix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [PropertyDelegate](../com.app.propertydelegates/-property-delegate/index.md)<[Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html), [T](-string-array.md)>