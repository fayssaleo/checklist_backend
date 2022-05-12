package com.example.checklist.repository;

import com.example.checklist.model.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface entityRepository extends JpaRepository<Entity,Long> {
}
