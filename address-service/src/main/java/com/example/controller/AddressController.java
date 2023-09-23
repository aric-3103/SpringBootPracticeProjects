package com.example.controller;

import com.example.request.CreateAddressRequest;
import com.example.response.AddressResponse;
import com.example.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/create")
    public AddressResponse createAddress(@RequestBody CreateAddressRequest createAddressRequest) {
        return addressService.createAddress(createAddressRequest);
    }

    @GetMapping("/getById/{addressId}")
    public AddressResponse getById(@PathVariable long addressId) {
        System.out.println("pass address : " + addressId);
        return addressService.getById(addressId);

    }

}
