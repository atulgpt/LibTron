//[uistate-lib](../../../index.md)/[com.app.uistatelib](../index.md)/[UiState](index.md)

# UiState

[jvm]\
sealed class [UiState](index.md)<out [M](index.md), out [E](index.md)>

A discriminated union that encapsulates a successful outcome with a value of type [M](index.md) or a failure with value of type [E](index.md) or a loading/initial state of the operation

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [jvm]<br>object [Companion](-companion/index.md) |
| [Failure](-failure/index.md) | [jvm]<br>data class [Failure](-failure/index.md)<out [E](-failure/index.md)>(**failureValue**: [E](-failure/index.md)) : [UiState](index.md)<[Nothing](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html), [E](-failure/index.md)> |
| [Loading](-loading/index.md) | [jvm]<br>object [Loading](-loading/index.md) : [UiState](index.md)<[Nothing](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html), [Nothing](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)> |
| [Success](-success/index.md) | [jvm]<br>data class [Success](-success/index.md)<out [M](-success/index.md)>(**value**: [M](-success/index.md)) : [UiState](index.md)<[M](-success/index.md), [Nothing](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)> |

## Inheritors

| Name |
|---|
| [UiState](-success/index.md) |
| [UiState](-loading/index.md) |
| [UiState](-failure/index.md) |

## Extensions

| Name | Summary |
|---|---|
| [flatMap](../flat-map.md) | [jvm]<br>inline fun <[M](../flat-map.md), [T](../flat-map.md), [E](../flat-map.md)> [UiState](index.md)<[M](../flat-map.md), [E](../flat-map.md)>.[flatMap](../flat-map.md)(transform: ([M](../flat-map.md)) -> [T](../flat-map.md)): [UiState](index.md)<[T](../flat-map.md), [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?><br>Returns the encapsulated result of the given [transform](../flat-map.md) function applied to the encapsulated value if this instance represents [success](-success/index.md) or original encapsulated [UiState](index.md) if it is [failure](-failure/index.md) or [loading](-loading/index.md). |
| [fold](../fold.md) | [jvm]<br>inline fun <[M](../fold.md), [E](../fold.md)> [UiState](index.md)<[M](../fold.md), [E](../fold.md)>.[fold](../fold.md)(failureBlock: ([E](../fold.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = { }, successBlock: ([M](../fold.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [UiState](index.md)<[M](../fold.md), [E](../fold.md)><br>Performs the [successBlock](../fold.md) function for the encapsulated value [M](../fold.md) if this instance represents [success](-success/index.md) or performs the [failureBlock](../fold.md) function for the encapsulated [UiState.Failure](-failure/index.md) if it is [failure](-failure/index.md). |
| [map](../map.md) | [jvm]<br>inline fun <[M](../map.md), [T](../map.md), [E](../map.md)> [UiState](index.md)<[M](../map.md), [E](../map.md)>.[map](../map.md)(transform: ([M](../map.md)) -> [T](../map.md)): [UiState](index.md)<[T](../map.md), [E](../map.md)><br>Returns the encapsulated result of the given [transform](../map.md) function applied to the encapsulated value if this instance represents [success](-success/index.md) or the original encapsulated [UiState](index.md) if it is [failure](-failure/index.md) or [loading](-loading/index.md). |
| [onFailure](../on-failure.md) | [jvm]<br>inline fun <[M](../on-failure.md), [E](../on-failure.md)> [UiState](index.md)<[M](../on-failure.md), [E](../on-failure.md)>.[onFailure](../on-failure.md)(failureBlock: ([E](../on-failure.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [UiState](index.md)<[M](../on-failure.md), [E](../on-failure.md)><br>Performs the given [failureBlock](../on-failure.md) on the [UiState.Failure](-failure/index.md) value if this instance represents [failure](-failure/index.md). |
| [onSuccess](../on-success.md) | [jvm]<br>inline fun <[M](../on-success.md), [E](../on-success.md)> [UiState](index.md)<[M](../on-success.md), [E](../on-success.md)>.[onSuccess](../on-success.md)(successBlock: ([M](../on-success.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [UiState](index.md)<[M](../on-success.md), [E](../on-success.md)><br>Performs the given [successBlock](../on-success.md) on the encapsulated value if this instance represents [success](-success/index.md). |
