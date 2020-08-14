package com.thoughtworks.rslist.api;

import com.thoughtworks.rslist.dto.ProductDto;
import com.thoughtworks.rslist.repository.ProductRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.hasKey;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ProductControllerTests {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ProductRepository productRepository;
    ProductDto productDto;

    @BeforeEach
    void setUp() {
        productDto = ProductDto.builder().imgUrl("/img/apple.img").price(100.00).productName("apple").unit("箱").build();
        productDto = productRepository.save(productDto);
    }

    @Test
    @Order(1)
    void should_return_product_list() throws Exception {
        mockMvc.perform(get("/products")).andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].imgUrl", is("/img/apple.img")))
                .andExpect(jsonPath("$[0].price", is(100.00)))
                .andExpect(jsonPath("$[0].productName", is("apple")))
                .andExpect(jsonPath("$[0].unit", is("箱")))
                .andExpect(status().isOk());
    }
}