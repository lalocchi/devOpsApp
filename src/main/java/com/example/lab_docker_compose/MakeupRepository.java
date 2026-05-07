package com.example.lab_docker_compose;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MakeupRepository extends JpaRepository<Makeup,Long> {
}
