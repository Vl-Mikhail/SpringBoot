package ru.misha.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.misha.model.StackSite;
import ru.misha.service.StackService;

import java.util.List;

//Позволяет возращать json
@RestController
@RequestMapping("/api/stack")
public class Stack {

    @Autowired
    private StackService stackService;

    @RequestMapping
    public List<StackSite> getListSite(){
        return stackService.findAll();
    }

}
