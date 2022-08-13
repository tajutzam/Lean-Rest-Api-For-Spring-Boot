package zam.dev.springbootrestapinew.model.repository;

import org.springframework.data.repository.CrudRepository;
import zam.dev.springbootrestapinew.model.entity.Product;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product , Long> {

    List<Product> findByNameContains(String name);

}
