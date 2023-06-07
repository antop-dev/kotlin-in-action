package org.antop.java.chapter10;

import org.antop.kotlin.chapter10.Address;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;

public class OverrideEntity {
    @AttributeOverride(
            name = "address1",
            column = @Column(name = "road_name")
    )
    private Address address;
}
