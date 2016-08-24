package ru.misha.service;

import org.springframework.stereotype.Service;
import ru.misha.model.StackSite;

import java.util.ArrayList;
import java.util.List;

@Service
public class StackService {

    private static List<StackSite> items = new ArrayList<>();
    static {
        items.add(new StackSite("1","jp", "Title JP", "Description new JP"));
        items.add(new StackSite("1","RUS", "Title RUS", "Description new RUS"));
        items.add(new StackSite("1","ukr", "Title ukr", "Description new ukr"));
        items.add(new StackSite("1","usa", "Title usa", "Description new usa"));
    }

    public List<StackSite> findAll() {
        return items;
    }
}
