package com.springbootboilerplate.modules.shipping.config;

import com.springbootboilerplate.modules.shipping.entity.ShippingType;
import com.springbootboilerplate.modules.shipping.repository.ShippingTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
public class FreightBookingConfiguration {

    @Autowired
    private ShippingTypeRepository shippingTypeRepository;


    @Bean
    public void setupShippingType(){
        ShippingType shippingType;
        Optional<ShippingType> shippingTypeOptional;

        shippingType = new ShippingType();
        shippingType.setId(1L);
        shippingType.setName("Cash On Delivery");
        shippingTypeRepository.save(shippingType);


        shippingType = new ShippingType();
        shippingType.setId(2L);
        shippingType.setName("Credit Card");
        shippingTypeRepository.save(shippingType);
    }
}
