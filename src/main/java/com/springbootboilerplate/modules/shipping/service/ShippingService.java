package com.springbootboilerplate.modules.shipping.service;

import com.springbootboilerplate.modules.shipping.entity.Shipping;
import com.springbootboilerplate.modules.shipping.repository.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ShippingService {

    @Autowired
    private ShippingRepository repository;

    public List<Shipping> listAll() {
        return repository.findAll();
    }

    public Shipping save(Shipping shipping) {
        return repository.save(shipping);
    }

    public Optional<Shipping> get(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
