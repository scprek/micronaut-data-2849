## Recreate for Micronaut Data 2849 and 2927

> [!NOTE]
> Switching to return `List<T>` works

```kotlin
@JdbcRepository(dialect = Dialect.POSTGRES)
abstract class TestRepository: CoroutineCrudRepository<TestEntity, UUID> {
    /**
     * Showcase that making this return a List instead of Flow works... idk the implications of this. Does it internally
     * call Flow.toList()?
     */
    abstract suspend fun findByScheduledTimeBefore(scheduledTime: Instant): List<TestEntity>
}
```

### 2927: Empty table is null

https://github.com/micronaut-projects/micronaut-data/issues/2927

### 2984: Micronaut data fails when trying to convert results to Flow

https://github.com/micronaut-projects/micronaut-data/issues/2849


#### Test Results

<img width="2126" alt="Screenshot 2025-03-03 at 1 38 59 PM" src="https://github.com/user-attachments/assets/88330839-f92a-4bf5-aabe-14723b6173c7" />
