package org.antop.java.chapter10;

import org.antop.kotlin.chapter10.BooleanYnConverter;

import javax.persistence.Convert;

public class BooleanEntity {
    @Convert(converter = BooleanYnConverter.class)
    private boolean removed = false;
}
