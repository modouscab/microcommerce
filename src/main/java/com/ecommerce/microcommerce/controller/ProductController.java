package com.ecommerce.microcommerce.controller;

import java.util.Optional;

import com.ecommerce.microcommerce.dao.ProductDao;
import com.ecommerce.microcommerce.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController  //indiquer à Spring que ce contrôleur est un contrôleur REST
//@Component
public class ProductController {
   //@Autowired(required=true)
    @Autowired
    private ProductDao productDao;

    //ajouter un produit
    @PostMapping(path="/produit/add")
    
    public @ResponseBody Product addNewProduct(@RequestBody Product product) {
    	return productDao.save(product);
    }
    
    //recuperer la liste des produits
    @GetMapping(value="/produits")
    public @ResponseBody Iterable<Product> listProduits(){
        // This returns a JSON or XML with the users
        return productDao.findAll();
    }
    
    @RequestMapping(value="/Produits1", method= RequestMethod.GET)
    public String listProduit(){
        // This returns a JSON or XML with the users
        return "la liste des produits";
    }
    
    //Récupérer un produit par son Id
    @GetMapping(value="/Produits/{id}")
    public Optional<Product> afficherUnProduit(@PathVariable int id) {
       // Product product=new Product(id, new String("Ordinateur"), 1500 );
        return productDao.findById(id);
    }
}
