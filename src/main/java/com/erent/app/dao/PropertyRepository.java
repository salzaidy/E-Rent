package com.erent.app.dao;

import com.erent.app.entity.Property;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:4200/")
public interface PropertyRepository extends JpaRepository<Property, Long> {
    Page<Property> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);

    Page<Property> findByPropertyAddressContaining(@RequestParam("property_address") String property_address , Pageable pageable);

}
