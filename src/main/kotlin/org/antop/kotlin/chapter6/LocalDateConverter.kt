package org.antop.kotlin.chapter6

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import javax.persistence.AttributeConverter

/**
 * [LocalDate]와 6자리 문자열(yyyyMMdd) 매핑
 */
class LocalDateConverter : AttributeConverter<LocalDate, String> {
    private val pattern = DateTimeFormatter.ofPattern("yyyyMMdd")

    override fun convertToDatabaseColumn(attribute: LocalDate?): String? {
        return attribute?.let { attribute.format(pattern) }
    }

    override fun convertToEntityAttribute(dbData: String?): LocalDate? {
        return dbData?.let { LocalDate.parse(it, pattern) }
    }
}
