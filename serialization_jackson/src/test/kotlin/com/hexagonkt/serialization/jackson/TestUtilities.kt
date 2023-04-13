package com.hexagonkt.serialization.jackson

import com.hexagonkt.core.media.APPLICATION_JSON
import com.hexagonkt.core.media.MediaType
import java.net.InetAddress
import java.net.URL
import java.nio.ByteBuffer
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

internal enum class Department { DESIGN, DEVELOPMENT }

internal data class Person(val name: String)

internal data class Company(
    val id: String,
    val foundation: LocalDate,
    val closeTime: LocalTime,
    val openTime: ClosedRange<LocalTime>,
    val web: URL?,
    val clients: List<URL> = listOf(),
    val logo: ByteBuffer? = null,
    val notes: String? = null,
    val people: Set<Person>,
    val departments: Set<Department> = setOf(),
    val creationDate: LocalDateTime = LocalDateTime.now(),
    val host: InetAddress,
    val averageMargin: Float,
)

object TextFormat : JacksonTextFormat() {
    override val mediaType: MediaType = APPLICATION_JSON
}