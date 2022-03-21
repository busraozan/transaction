package com.bsf.transaction.service;

import com.bsf.transaction.model.Product;
import com.bsf.transaction.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public void createProduct(){
        Product product = new Product();
        product.setPrice(30);
        product.setTitle("Transaction created");
        productRepository.save(product);
    }
}
