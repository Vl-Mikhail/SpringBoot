package ru.misha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.misha.model.StackSite;
import ru.misha.persistence.StackSiteRepository;

import java.util.List;

@Service
public class StackService {

    @Autowired
    private StackSiteRepository repository;

    public void save(List<StackSite> list){
        repository.save(list);
    }

    public List<StackSite> findAll() {
        return repository.findAll();
    }
}
