//[uistate-lib](../../index.md)/[com.app.uistatelib](index.md)/[map](map.md)

# map

[jvm]\
inline fun <[M](map.md), [T](map.md), [E](map.md)> [UiState](-ui-state/index.md)<[M](map.md), [E](map.md)>.[map](map.md)(transform: ([M](map.md)) -> [T](map.md)): [UiState](-ui-state/index.md)<[T](map.md), [E](map.md)>

Returns the encapsulated result of the given [transform](map.md) function applied to the encapsulated value if this instance represents [success](-ui-state/-success/index.md) or the original encapsulated [UiState](-ui-state/index.md) if it is [failure](-ui-state/-failure/index.md) or [loading](-ui-state/-loading/index.md).

Note, that this function rethrows any [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) exception thrown by [transform](map.md) function. See [flatMap](flat-map.md) for an alternative that encapsulates exceptions and loading state.
