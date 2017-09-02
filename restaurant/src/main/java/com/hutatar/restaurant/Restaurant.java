package com.hutatar.restaurant;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "restaurants", schema="restaurant", indexes = {
        @Index(columnList = "id, version", unique = true, name="restaurants_idx_1")
})
class Restaurant extends AbstractEntity {

    private String name;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "restaurant"
    )
    private List<Tables> tables;

    public String getName() {
        return name;
    }

    public List<Tables> getTables() {
        return tables;
    }
}
