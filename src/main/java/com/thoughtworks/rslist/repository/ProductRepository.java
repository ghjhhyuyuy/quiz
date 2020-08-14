package com.thoughtworks.rslist.repository;

import com.thoughtworks.rslist.dto.ProductDto;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by wzw on 2020/8/14.
 */
public interface ProductRepository extends CrudRepository<ProductDto, Integer> {
}
