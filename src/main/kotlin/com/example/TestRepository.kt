package com.example


import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.kotlin.CoroutineCrudRepository
import kotlinx.coroutines.flow.Flow
import java.time.Instant
import java.util.*


@JdbcRepository(dialect = Dialect.POSTGRES)
abstract class TestRepository: CoroutineCrudRepository<TestEntity, UUID> {
    abstract suspend fun findByScheduledTimeBeforeAndAttemptsLessThanEquals(scheduledTime: Instant, attempts: Int): Flow<TestEntity>
}
