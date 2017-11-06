package com.TPFinalGroupAssign.TheatreSystem.Services.Impl;

import TheatreSystem.Domain.Documentary;
import TheatreSystem.Repositories.DocumentaryRepository;
import TheatreSystem.Services.DocumentaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class DocumentaryServiceImpl implements DocumentaryService {

    @Autowired
    private DocumentaryRepository repository;

    @Override
    public Documentary create(Documentary entity) {
        return repository.save(entity) ;
    }

    @Override
    public Documentary readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Documentary> readAll() {
        Iterable<Documentary> docs = repository.findAll();
        Set DocumentarySet = new HashSet();
        for(Documentary doc:docs){
            DocumentarySet.add(doc);
        }
        return DocumentarySet;
    }

    @Override
    public Documentary update(Documentary entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Admin entity) {
        repository.delete(entity);
    }

}
