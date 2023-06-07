package org.antop.kotlin.chapter10

import ru.yole.jkid.*
import ru.yole.jkid.deserialization.deserialize
import ru.yole.jkid.serialization.serialize
import java.time.LocalDate
import java.time.format.DateTimeFormatter

interface Company {
    val name: String
}

data class CompanyImpl(override val name: String) : Company

class LocalDateSerializer : ValueSerializer<LocalDate?> {
    private val formatter = DateTimeFormatter.ofPattern("yyyyMMdd")
    override fun fromJsonValue(jsonValue: Any?): LocalDate? {
        val string = jsonValue as? String
        return string?.let { LocalDate.parse(it, formatter) }
    }

    override fun toJsonValue(value: LocalDate?): Any? {
        return value?.format(formatter)
    }

}

data class Person(
    @JsonName("alias")
    val name: String,
    @JsonExclude
    val age: Int? = null,
    @DeserializeInterface(CompanyImpl::class)
    val company: Company,
    @CustomSerializer(LocalDateSerializer::class)
    val birthDate: LocalDate?
)

fun main() {
    val person = Person("Alice", 29, CompanyImpl("antop"), LocalDate.of(1983, 11, 12))
    println(person)
    val serialized = serialize(person)
    println(serialized) // // {"birthDate": "19831112", "company": {"name": "antop"}, "alias": "Alice"}
    val deserialized = deserialize<Person>(serialized) // Person(name=Alice, age=29)
    println(deserialized) // Person(name=Alice, age=null, company=CompanyImpl(name=antop), birthDate=1983-11-12)
}
