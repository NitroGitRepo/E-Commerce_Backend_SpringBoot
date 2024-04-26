package com.ecommerce.productservice.repository;

import com.ecommerce.productservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>{

//    @Override
//    Optional<User> findById(Long aLong);
//
    Optional<User> findByName(String name);
//
//
//    Optional<User> findByEmail(String email);
//
//    List<User> findUserByNameEndingWith(String suffix);
//
//
//    @Override
//    <S extends User> S save(S entity);
}
