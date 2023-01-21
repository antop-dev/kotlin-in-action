package org.antop.java.chapter2;

import org.apache.commons.lang3.StringUtils;

public class ImportFunction {
    /**
     * 전문에서 트랜잭션 코드 추출
     *
     * @param message 전문
     * @return 트랜잭션 코드
     */
    public String getTransactionCode(String message) {
        return StringUtils.substring(message, 0, 10);
    }
}
