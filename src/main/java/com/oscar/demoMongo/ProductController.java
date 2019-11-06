package com.oscar.demoMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
 
import javax.validation.Valid;
import java.util.List;
 
@RestController
@RequestMapping("/api/products")
final class ProductController {
 
    private final ProductService service;
 
    @Autowired
    ProductController(ProductService service) {
        this.service = service;
    }
 
 
    @RequestMapping(method = RequestMethod.GET)
    List<ProductDTO> findAll() {
        return service.findAll();
    }
 
    //@ExceptionHandler
    //@ResponseStatus(HttpStatus.NOT_FOUND)
    //public void handleTodoNotFound(TodoNotFoundException ex) {
    //}
}