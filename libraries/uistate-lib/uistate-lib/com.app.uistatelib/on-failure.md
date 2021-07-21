//[uistate-lib](../../index.md)/[com.app.uistatelib](index.md)/[onFailure](on-failure.md)

# onFailure

[jvm]\
inline fun <[M](on-failure.md), [E](on-failure.md)> [UiState](-ui-state/index.md)<[M](on-failure.md), [E](on-failure.md)>.[onFailure](on-failure.md)(failureBlock: ([E](on-failure.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [UiState](-ui-state/index.md)<[M](on-failure.md), [E](on-failure.md)>

Performs the given [failureBlock](on-failure.md) on the [UiState.Failure](-ui-state/-failure/index.md) value if this instance represents [failure](-ui-state/-failure/index.md).

#### Return

the original UiState unchanged.
