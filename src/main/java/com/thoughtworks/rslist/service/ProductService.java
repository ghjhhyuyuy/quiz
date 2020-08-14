package com.thoughtworks.rslist.service;

import com.thoughtworks.rslist.dto.ProductDto;
import com.thoughtworks.rslist.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wzw on 2020/8/14.
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<ProductDto> getProducts() {
        return productRepository.findAll();
    }
}
