//[uistate-lib](../../index.md)/[com.app.uistatelib](index.md)/[fold](fold.md)

# fold

[jvm]\
inline fun <[M](fold.md), [E](fold.md)> [UiState](-ui-state/index.md)<[M](fold.md), [E](fold.md)>.[fold](fold.md)(failureBlock: ([E](fold.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = { }, successBlock: ([M](fold.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [UiState](-ui-state/index.md)<[M](fold.md), [E](fold.md)>

Performs the [successBlock](fold.md) function for the encapsulated value [M](fold.md) if this instance represents [success](-ui-state/-success/index.md) or performs the [failureBlock](fold.md) function for the encapsulated [UiState.Failure](-ui-state/-failure/index.md) if it is [failure](-ui-state/-failure/index.md).

Note, that this function rethrows any [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) exception thrown by [successBlock](fold.md) or by [failureBlock](fold.md) function.
