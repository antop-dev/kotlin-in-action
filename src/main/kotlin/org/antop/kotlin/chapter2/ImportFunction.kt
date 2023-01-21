package org.antop.kotlin.chapter2

import org.apache.commons.lang3.StringUtils.substring

class ImportFunction {
    /**
     * 전문에서 트랜잭션 코드 추출
     *
     * @param message 전문
     * @return 트랜잭션 코드
     */
    fun getTransactionCode(message: String): String {
        return substring(message, 0, 10)
    }
}
