package com.springbootboilerplate.modules.shipping.controller;

import com.springbootboilerplate.modules.shipping.entity.Shipping;
import com.springbootboilerplate.modules.shipping.service.ShippingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/shipping")
@Slf4j
public class ShippingController {

    @Autowired
    private ShippingService service;



    // Read operation
    @GetMapping("/")
    public ResponseEntity<List<Shipping>> list() {
        log.info("shipping list....");


        return new ResponseEntity<>(service.listAll(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Shipping> get(@PathVariable Long id) {
        try {
            Optional<Shipping> optionalShipping = service.get(id);
            if (optionalShipping.isPresent()) {
                return new ResponseEntity(optionalShipping.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Save operation
    @PostMapping("/")
    public ResponseEntity<Shipping> save(@Valid @RequestBody Shipping shipping) {
        try {
            return new ResponseEntity(service.save(shipping), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Update operation
    @PutMapping("/{id}")
    public ResponseEntity<Shipping> update(@RequestBody Shipping shipping, @PathVariable("id") Long id) {
        try {
            Optional<Shipping> shippingOptional = service.get(id);
            if (shippingOptional.isPresent()) {

                Shipping _shipping = shippingOptional.get();

                //Set values
                _shipping.setShippingType( shipping.getShippingType());



                return new ResponseEntity<>(service.save(_shipping), HttpStatus.OK);
            }else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Delete operation
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        try {
            Optional<Shipping> optionalShipping = service.get(id);
            if(optionalShipping.isPresent()) {
                service.delete(id);
                return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
            }else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
