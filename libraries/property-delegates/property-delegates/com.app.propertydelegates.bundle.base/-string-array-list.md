//[property-delegates](../../index.md)/[com.app.propertydelegates.bundle.base](index.md)/[StringArrayList](-string-array-list.md)

# StringArrayList

[androidJvm]\
inline fun [BundleExtra](../com.app.propertydelegates.bundle/-bundle-extra/index.md).[StringArrayList](-string-array-list.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, customPrefix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [PropertyDelegate](../com.app.propertydelegates/-property-delegate/index.md)<[Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html), [ArrayList](https://developer.android.com/reference/kotlin/java/util/ArrayList.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?>?>

inline fun [BundleExtra](../com.app.propertydelegates.bundle/-bundle-extra/index.md).[StringArrayList](-string-array-list.md)(defaultValue: [ArrayList](https://developer.android.com/reference/kotlin/java/util/ArrayList.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?>, name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, customPrefix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [PropertyDelegate](../com.app.propertydelegates/-property-delegate/index.md)<[Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html), [ArrayList](https://developer.android.com/reference/kotlin/java/util/ArrayList.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?>>

inline fun <[T](-string-array-list.md)> [BundleExtra](../com.app.propertydelegates.bundle/-bundle-extra/index.md).[StringArrayList](-string-array-list.md)(crossinline reader: TypeReader<[T](-string-array-list.md), [ArrayList](https://developer.android.com/reference/kotlin/java/util/ArrayList.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?>?>, crossinline writer: TypeWriter<[T](-string-array-list.md), [ArrayList](https://developer.android.com/reference/kotlin/java/util/ArrayList.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?>?>, name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, customPrefix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [PropertyDelegate](../com.app.propertydelegates/-property-delegate/index.md)<[Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html), [T](-string-array-list.md)>