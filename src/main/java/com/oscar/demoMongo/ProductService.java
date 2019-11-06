package com.oscar.demoMongo;
import java.util.List;
 
interface ProductService {
 
    List<ProductDTO> findAll();
}