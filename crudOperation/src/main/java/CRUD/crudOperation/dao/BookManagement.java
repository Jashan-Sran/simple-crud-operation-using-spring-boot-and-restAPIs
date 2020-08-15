package CRUD.crudOperation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import CRUD.crudOperation.entity.Book;

@Repository
@EnableJpaRepositories
public interface BookManagement extends JpaRepository<Book, Integer> {

}
