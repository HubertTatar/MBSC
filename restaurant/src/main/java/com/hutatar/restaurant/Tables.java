package com.hutatar.restaurant;

import javax.persistence.*;

@Entity
@Table(name = "tables", schema="restaurant", indexes = {
        @Index(columnList = "id, version", unique = true, name = "tables_idx_1")
})
class Tables extends AbstractEntity {

    private Integer capacity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "restaurant_id", foreignKey = @ForeignKey(name="tables_fk1"))
    private Restaurant restaurant;

    public Integer getCapacity() {
        return capacity;
    }
}
