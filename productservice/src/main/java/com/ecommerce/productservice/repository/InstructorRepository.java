package com.ecommerce.productservice.repository;

import com.ecommerce.productservice.models.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {

    @Override
    Optional<Instructor> findById(Long aLong);

    Optional<Instructor> findByEmailContains(String s);

    List<Instructor> findByName(String s);

    <S extends Instructor> S save(S entity);
}
