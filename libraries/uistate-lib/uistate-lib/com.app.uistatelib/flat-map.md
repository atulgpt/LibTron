//[uistate-lib](../../index.md)/[com.app.uistatelib](index.md)/[flatMap](flat-map.md)

# flatMap

[jvm]\
inline fun <[M](flat-map.md), [T](flat-map.md), [E](flat-map.md)> [UiState](-ui-state/index.md)<[M](flat-map.md), [E](flat-map.md)>.[flatMap](flat-map.md)(transform: ([M](flat-map.md)) -> [T](flat-map.md)): [UiState](-ui-state/index.md)<[T](flat-map.md), [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?>

Returns the encapsulated result of the given [transform](flat-map.md) function applied to the encapsulated value if this instance represents [success](-ui-state/-success/index.md) or original encapsulated [UiState](-ui-state/index.md) if it is [failure](-ui-state/-failure/index.md) or [loading](-ui-state/-loading/index.md).

This function catches any [UiState](-ui-state/index.md) failure or loading state emitted by [transform](flat-map.md) function and encapsulates it as a corresponding [UiState](-ui-state/index.md). In case, when first operation fails then [E](flat-map.md) information is lost and generic [Failure](-ui-state/-failure/index.md) with [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) is thrown. Message of the thrown [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) is [PREVIOUS_OP_FAILED](-p-r-e-v-i-o-u-s_-o-p_-f-a-i-l-e-d.md) See [map](map.md) for an alternative that rethrows exceptions from transform function.
