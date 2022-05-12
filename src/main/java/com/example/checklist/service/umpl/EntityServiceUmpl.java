package com.example.checklist.service.umpl;

import com.example.checklist.model.Entity;
import com.example.checklist.repository.entityRepository;
import com.example.checklist.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class EntityServiceUmpl implements EntityService {
    @Autowired
    private entityRepository entityRepository;

    @Override
    public Optional<Entity> DepartementSave(Entity entity) {

        Optional<Entity> entity0 = Optional.ofNullable(entityRepository.save(entity));
        return entity0;
    }

    @Override
    public List<Entity> findAll() {

        List<Entity> entity0 =  entityRepository.findAll();

        return entity0;
    }

    @Override
    public void DeleteId(Long id) {
        entityRepository.deleteById(id);
    }

    @Override
    public Entity UpdateDepartement(Entity entity, Long id) {
        return entityRepository.save(entity);
    }

    @Override
    public long countEntity() {
        return entityRepository.count();
    }
}
