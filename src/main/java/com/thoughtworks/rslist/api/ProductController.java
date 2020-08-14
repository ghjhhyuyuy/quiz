package com.thoughtworks.rslist.api;

import com.thoughtworks.rslist.dto.ProductDto;
import com.thoughtworks.rslist.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wzw on 2020/8/5.
 */
@RestController
public class ProductController {
    Logger logger = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    private ProductService productService;
    @GetMapping("/products")
    public ResponseEntity getProducts(){
        List<ProductDto> productDtoList = productService.getProducts();
        return ResponseEntity.ok(productDtoList);
    }
}
