package ru.misha.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.misha.model.StackSite;
import ru.misha.service.StackService;

import java.util.ArrayList;
import java.util.List;

//Позволяет возращать json
@RestController
@RequestMapping("/api/stack")
public class StackController {

    @Autowired
    private StackService stackService;

    private static List<StackSite> items = new ArrayList<>();

    static {
        items.add(new StackSite("a","jp", "Title JP", "Description new JP"));
        items.add(new StackSite("b","RUS", "Title RUS", "Description new RUS"));
        items.add(new StackSite("c","ukr", "Title ukr", "Description new ukr"));
        items.add(new StackSite("d","usa", "Title usa", "Description new usa"));
    }

    @CrossOrigin
    @RequestMapping
    public List<StackSite> getListSite(){
        return stackService.findAll();
    }

}
