//[coroutine-fire-adapter](../../index.md)/[com.app.coroutinefireadapter](index.md)/[toValue](to-value.md)

# toValue

[androidJvm]\
inline suspend fun <[M](to-value.md)> DocumentReference.[toValue](to-value.md)(fieldPath: FieldPath? = null, source: Source = Source.SERVER): [M](to-value.md)?

#### Return

Parsed model or null if data doesn't exist

## Parameters

androidJvm

| | |
|---|---|
| <receiver> | DocumentReference of which value needs to be extracted |
| fieldPath | Optional field path which needs to be parsed instead of complete object. Default value is null |
| source | What should be the source of data for this DocumentReference. See Source |
