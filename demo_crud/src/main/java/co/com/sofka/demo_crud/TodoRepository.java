package co.com.sofka.demo_crud;

import java.util.ArrayList;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface TodoRepository extends CrudRepository<Todo, Long> { //tipo de usuario y tipo de dato del id
  
    
}
