package com.docker.test.docker_test_repo.repository;


import com.docker.test.docker_test_repo.entity.Calc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalcRepository extends JpaRepository<Calc, Integer> {

}
