package com.springbootboilerplate.modules.shipping.repository;

import com.springbootboilerplate.modules.shipping.entity.ShippingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShippingTypeRepository extends JpaRepository<ShippingType, Long> {

    Optional<ShippingType> findByName(String shippingType);
}
