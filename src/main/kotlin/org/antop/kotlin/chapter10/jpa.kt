package org.antop.kotlin.chapter10

import javax.persistence.*

class BooleanEntity(
    @Convert(converter = BooleanYnConverter::class)
    val removed: Boolean = false
)

class BooleanYnConverter : AttributeConverter<Boolean, String> {
    companion object {
        const val TRUE = "Y"
        const val FALSE = "N"
    }

    override fun convertToDatabaseColumn(attribute: Boolean?): String {
        return if (attribute == true) TRUE else FALSE
    }

    override fun convertToEntityAttribute(dbData: String?): Boolean {
        return dbData == TRUE
    }
}

class OverrideEntity(
    @AttributeOverride(
        name = "address1",
        column = Column(name = "road_name"),
    )
    val address: Address
)

@Embeddable
class Address {
    @Column(name = "address1")
    var address1: String = ""

    @Column(name = "address2")
    var address2: String = ""

    @Column(name = "zipcode")
    var zipcode: String = ""
}
