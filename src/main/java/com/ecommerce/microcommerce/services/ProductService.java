package com.ecommerce.microcommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.microcommerce.dao.ProductDao;
import com.ecommerce.microcommerce.model.Product;

@Service
public class ProductService implements IProductService {
	
	@Autowired
	ProductDao productDao;

	public List<Product> listeDesProduits() {
		// TODO Auto-generated method stub
		return null;
	}

}
