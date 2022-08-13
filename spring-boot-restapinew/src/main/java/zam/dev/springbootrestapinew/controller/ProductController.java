package zam.dev.springbootrestapinew.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zam.dev.springbootrestapinew.model.entity.Product;
import zam.dev.springbootrestapinew.service.ProductService;

import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String home(){
        return "hai";
    }
    @PostMapping("/add")
    public Product create(@RequestBody Product product){
        return productService.create(product);
    }

    @GetMapping("/all")
    public Iterable<Product> findAll(){
        return productService.findAll();
    }
    @GetMapping("/show/{id}")
    public Optional <Product> findById(@PathVariable(name = "id") long id){
        return productService.findOne(id);
    }
    @PutMapping("/update")
    public Product update(@RequestBody Product product){
        return productService.update(product);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") long id){
        productService.deleteById(id);
    }
    

}
