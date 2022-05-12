package com.example.checklist.service;

import com.example.checklist.model.Entity;

import java.util.List;
import java.util.Optional;

public interface EntityService {
    public Optional<Entity> DepartementSave (Entity entity);
    public List<Entity> findAll();
    public void DeleteId(Long id);
    public Entity UpdateDepartement(Entity entity, Long id);
    public long countEntity();
}
