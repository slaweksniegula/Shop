package com.sda.repository;

import com.sda.dto.CreateProductDto;
import com.sda.model.Product;

import java.util.List;
import java.util.Optional;

public class InMemoryProductRepository implements ProductRepository{
    @Override
    public void saveProduct(CreateProductDto createProductDto) {

    }

    @Override
    public Optional<Product> findProductById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public List<Product> findProductByName(String name) {
        return null;
    }

    @Override
    public void delateProduct(Integer id) {

    }
}
