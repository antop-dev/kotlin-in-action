package org.antop.kotlin.chapter6

import javax.persistence.AttributeConverter

class BooleanYnConverter : AttributeConverter<Boolean, String> {
    // 파라미터 attribute는 null일 수 있을까?
    override fun convertToDatabaseColumn(attribute: Boolean): String {
        return if (attribute) "Y" else "N"
    }

    // 파라미터 dbData는 null일 수 있을까?
    override fun convertToEntityAttribute(dbData: String?): Boolean {
        return dbData?.let { it == "Y" } ?: false
    }
}
