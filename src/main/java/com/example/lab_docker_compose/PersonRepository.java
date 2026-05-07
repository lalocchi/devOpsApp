package com.example.lab_docker_compose;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository <Person,Long> {
}
