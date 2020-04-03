package com.ecommerce.microcommerce.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ecommerce.microcommerce.model.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {

}
