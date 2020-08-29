package com.sda.repository;

import com.sda.dto.CreateProductDto;
import com.sda.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

void saveProduct(CreateProductDto createProductDto);

Optional<Product> findProductById (Integer id);

List<Product> findAll();

List<Product> findProductByName(String name);

void delateProduct(Integer id);
}
