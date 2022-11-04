package com.springbootboilerplate.modules.shipping.entity;

import javax.persistence.*;

@Entity
@Table(name = "shipping")
public class Shipping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;



    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "shipping_type_id", nullable = false)
    private ShippingType shippingType;


    //getters & setters


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public ShippingType getShippingType() {
        return shippingType;
    }

    public void setShippingType(ShippingType shippingType) {
        this.shippingType = shippingType;
    }



}
