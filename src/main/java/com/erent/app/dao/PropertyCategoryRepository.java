package com.erent.app.dao;

import com.erent.app.entity.PropertyCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200/")
@RepositoryRestResource(collectionResourceRel = "propertyCategory", path = "property-category")
public interface PropertyCategoryRepository extends JpaRepository<PropertyCategory, Long> {
}
