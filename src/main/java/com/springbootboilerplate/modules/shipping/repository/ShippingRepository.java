package com.springbootboilerplate.modules.shipping.repository;

import com.springbootboilerplate.modules.shipping.entity.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingRepository extends JpaRepository<Shipping, Long> {

}
