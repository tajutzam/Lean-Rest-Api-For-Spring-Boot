package zam.dev.springbootrestapinew.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zam.dev.springbootrestapinew.model.entity.Product;
import zam.dev.springbootrestapinew.model.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {

//    service logic

    @Autowired
    private ProductRepository productRepository;


    public Product create(Product product){
        return productRepository.save(product);
    }

    public Optional<Product> findOne(long id){
        Optional<Product> productOptional = productRepository.findById(id);
        if(!productOptional.isPresent()){
            return null;
        }else{
            return productRepository.findById(id);
        }

    }

    public Iterable<Product> findAll(){
        return productRepository.findAll();
    }

    public void deleteById(long id){
        productRepository.deleteById(id);
    }

    public List<Product> finfByName(String name){

        return productRepository.findByNameContains(name);

    }
    public Product update(Product product){
        return productRepository.save(product);
    }




}
