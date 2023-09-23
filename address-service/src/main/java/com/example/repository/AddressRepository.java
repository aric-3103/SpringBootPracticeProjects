package com.example.repository;

import com.example.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
   // @Query("select u  from Address u where u.id =: addressId")
     //Address getById(@PathVariable  long addressId);

}
