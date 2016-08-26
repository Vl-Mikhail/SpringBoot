package ru.misha.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Определяет что модель используем в монго
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Document
public class StackSite {

    @Id
    private String id;
    private String site;
    private String title;
    private String description;

    public StackSite() {
    }

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

    public void setId(String id) {
        this.id = id;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
