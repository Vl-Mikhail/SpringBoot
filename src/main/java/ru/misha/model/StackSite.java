package ru.misha.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Определяет что модель используем в монго
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class StackSite {

    @Id
    private String id;
    private String site;
    private String title;
    private String description;

}
