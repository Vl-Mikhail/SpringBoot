package ru.misha.model;

public class StackSite {

    private final String id;
    private final String site;
    private final String title;
    private final String description;

    public StackSite(String id, String site, String title, String description) {
        this.id = id;
        this.site = site;
        this.title = title;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getSite() {
        return site;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
