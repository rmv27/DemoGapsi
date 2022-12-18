package com.example.demo.repositories;
import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;
import com.example.demo.models.*;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoModel,String>{

}
