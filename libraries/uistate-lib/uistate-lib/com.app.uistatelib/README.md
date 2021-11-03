//[uistate-lib](../../index.md)/[com.app.uistatelib](index.md)

# Package com.app.uistatelib

## Types

| Name | Summary |
|---|---|
| [UiState](-ui-state/index.md) | [jvm]<br>sealed class [UiState](-ui-state/index.md)<out [M](-ui-state/index.md), out [E](-ui-state/index.md)><br>A discriminated union that encapsulates a successful outcome with a value of type [M](-ui-state/index.md) or a failure with value of type [E](-ui-state/index.md) or a loading/initial state of the operation |

## Functions

| Name | Summary |
|---|---|
| [flatMap](flat-map.md) | [jvm]<br>inline fun <[M](flat-map.md), [T](flat-map.md), [E](flat-map.md)> [UiState](-ui-state/index.md)<[M](flat-map.md), [E](flat-map.md)>.[flatMap](flat-map.md)(transform: ([M](flat-map.md)) -> [T](flat-map.md)): [UiState](-ui-state/index.md)<[T](flat-map.md), [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?><br>Returns the encapsulated result of the given [transform](flat-map.md) function applied to the encapsulated value if this instance represents [success](-ui-state/-success/index.md) or original encapsulated [UiState](-ui-state/index.md) if it is [failure](-ui-state/-failure/index.md) or [loading](-ui-state/-loading/index.md). |
| [fold](fold.md) | [jvm]<br>inline fun <[M](fold.md), [E](fold.md)> [UiState](-ui-state/index.md)<[M](fold.md), [E](fold.md)>.[fold](fold.md)(failureBlock: ([E](fold.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = { }, successBlock: ([M](fold.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [UiState](-ui-state/index.md)<[M](fold.md), [E](fold.md)><br>Performs the [successBlock](fold.md) function for the encapsulated value [M](fold.md) if this instance represents [success](-ui-state/-success/index.md) or performs the [failureBlock](fold.md) function for the encapsulated [UiState.Failure](-ui-state/-failure/index.md) if it is [failure](-ui-state/-failure/index.md). |
| [map](map.md) | [jvm]<br>inline fun <[M](map.md), [T](map.md), [E](map.md)> [UiState](-ui-state/index.md)<[M](map.md), [E](map.md)>.[map](map.md)(transform: ([M](map.md)) -> [T](map.md)): [UiState](-ui-state/index.md)<[T](map.md), [E](map.md)><br>Returns the encapsulated result of the given [transform](map.md) function applied to the encapsulated value if this instance represents [success](-ui-state/-success/index.md) or the original encapsulated [UiState](-ui-state/index.md) if it is [failure](-ui-state/-failure/index.md) or [loading](-ui-state/-loading/index.md). |
| [onFailure](on-failure.md) | [jvm]<br>inline fun <[M](on-failure.md), [E](on-failure.md)> [UiState](-ui-state/index.md)<[M](on-failure.md), [E](on-failure.md)>.[onFailure](on-failure.md)(failureBlock: ([E](on-failure.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [UiState](-ui-state/index.md)<[M](on-failure.md), [E](on-failure.md)><br>Performs the given [failureBlock](on-failure.md) on the [UiState.Failure](-ui-state/-failure/index.md) value if this instance represents [failure](-ui-state/-failure/index.md). |
| [onSuccess](on-success.md) | [jvm]<br>inline fun <[M](on-success.md), [E](on-success.md)> [UiState](-ui-state/index.md)<[M](on-success.md), [E](on-success.md)>.[onSuccess](on-success.md)(successBlock: ([M](on-success.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [UiState](-ui-state/index.md)<[M](on-success.md), [E](on-success.md)><br>Performs the given [successBlock](on-success.md) on the encapsulated value if this instance represents [success](-ui-state/-success/index.md). |

## Properties

| Name | Summary |
|---|---|
| [PREVIOUS_OP_FAILED](-p-r-e-v-i-o-u-s_-o-p_-f-a-i-l-e-d.md) | [jvm]<br>const val [PREVIOUS_OP_FAILED](-p-r-e-v-i-o-u-s_-o-p_-f-a-i-l-e-d.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
