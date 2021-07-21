//[property-delegates](../../../index.md)/[com.app.propertydelegates](../index.md)/[PropertyDelegate](index.md)

# PropertyDelegate

[androidJvm]\
interface [PropertyDelegate](index.md)<in [This](index.md), [T](index.md)> : [DelegateProvider](../-delegate-provider/index.md)<[PropertyDelegate](index.md)<[This](index.md), [T](index.md)>> 

A property delegate that can read and write from a receiver of type [This](index.md).

## Functions

| Name | Summary |
|---|---|
| [getValue](get-value.md) | [androidJvm]<br>abstract operator fun [getValue](get-value.md)(thisRef: [This](index.md), property: [KProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)<*>): [T](index.md) |
| [provideDelegate](../-delegate-provider/provide-delegate.md) | [androidJvm]<br>abstract operator fun [provideDelegate](../-delegate-provider/provide-delegate.md)(thisRef: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?, property: [KProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)<*>): [PropertyDelegate](index.md)<[This](index.md), [T](index.md)> |
| [setValue](set-value.md) | [androidJvm]<br>abstract operator fun [setValue](set-value.md)(thisRef: [This](index.md), property: [KProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)<*>, value: [T](index.md)) |
