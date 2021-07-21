//[coroutine-fire-adapter](../../index.md)/[com.app.coroutinefireadapter](index.md)/[toValueFlow](to-value-flow.md)

# toValueFlow

[androidJvm]\
inline fun <[M](to-value-flow.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> DocumentReference.[toValueFlow](to-value-flow.md)(fieldPath: FieldPath? = null, excludeCache: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, includeMetaDataChanges: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true): Flow<[M](to-value-flow.md)>

## Parameters

androidJvm

| | |
|---|---|
| <receiver> | DocumentReference for which we want to monitor the changes |
| fieldPath | Optional field path which needs to be parsed instead of complete object. Default value null |
| excludeCache | If true then only server value changes are propagated into the Flow else changes from cached value is also propagated |
| includeMetaDataChanges | Indicates whether metadata-only changes (that is, only DocumentSnapshot.getMetadata or QuerySnapshot.getMetadata changed) should trigger snapshot events. |
