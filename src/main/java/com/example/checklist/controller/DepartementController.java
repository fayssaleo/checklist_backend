package com.example.checklist.controller;

import com.example.checklist.model.Entity;
import com.example.checklist.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departements")
public class DepartementController {
    @Autowired
    private EntityService entityService;

    @PostMapping("/add")
    public Optional<Entity> add(@RequestBody Entity entity){
        //  Optional<UserDao> userCreated=userService.userSave(user);
        return entityService.DepartementSave(entity);

    }

    @GetMapping("/")
    public List<Entity> findAll(){
        List<Entity> entities = entityService.findAll();
        return entities;
    }

    @PostMapping("/delete/{id}")
    public void DeleteId(@PathVariable("id") Long id){
        entityService.DeleteId(id);
    }

    @PutMapping("/update")
    public Entity UpdateDepartement(@RequestBody Entity entity){
        return entityService.UpdateDepartement(entity, entity.getId());
    }

    @GetMapping("/count")
    public Long countDepartement(){
        return entityService.countEntity();
    }
}
