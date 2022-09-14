package com.sicre.springsecurity;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private List<Product> products = new ArrayList<Product>();
    private long id = 123;

    public ProductServiceImpl() {
        Product product = new Product();
        product.setId(++id);
        product.setDescription("Angular 6");
        products.add(product);
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public long addProduct(Product product) {
        product.setId(++id);
        products.add(product);
        return product.getId();
    }
}
