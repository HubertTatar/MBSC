package com.hutatar.restaurant;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;


@MappedSuperclass
abstract class AbstractEntity implements Serializable {
    @Id
    @GenericGenerator(
            name = "idSequenceGenerator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "ids_sequence"),
                    @Parameter(name = "schema", value = "restaurant"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    @GeneratedValue(generator = "idSequenceGenerator")
    private BigInteger id;
    @Version
    private Integer version;
    private LocalDateTime createdDate;
    private LocalDateTime modificationDate;
}
