//[property-delegates](../../index.md)/[com.app.propertydelegates.bundle.base](index.md)/[Serializable](-serializable.md)

# Serializable

[androidJvm]\
inline fun <[T](-serializable.md) : [Serializable](https://developer.android.com/reference/kotlin/java/io/Serializable.html)> [BundleExtra](../com.app.propertydelegates.bundle/-bundle-extra/index.md).[Serializable](-serializable.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, customPrefix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): BundlePropertyDelegate<[T](-serializable.md)?>

inline fun <[T](-serializable.md) : [Serializable](https://developer.android.com/reference/kotlin/java/io/Serializable.html)> [BundleExtra](../com.app.propertydelegates.bundle/-bundle-extra/index.md).[Serializable](-serializable.md)(defaultValue: [T](-serializable.md), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, customPrefix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): BundlePropertyDelegate<[T](-serializable.md)>

inline fun <[T](-serializable.md), [R](-serializable.md) : [Serializable](https://developer.android.com/reference/kotlin/java/io/Serializable.html)> [BundleExtra](../com.app.propertydelegates.bundle/-bundle-extra/index.md).[Serializable](-serializable.md)(crossinline reader: TypeReader<[T](-serializable.md), [R](-serializable.md)?>, crossinline writer: TypeWriter<[T](-serializable.md), [R](-serializable.md)?>, name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, customPrefix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [PropertyDelegate](../com.app.propertydelegates/-property-delegate/index.md)<[Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html), [T](-serializable.md)>
