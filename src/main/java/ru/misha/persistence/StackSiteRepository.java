package ru.misha.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.misha.model.StackSite;

import java.util.List;

/*
Гововорит о том что из данного класса необходимо создать бин
 */
@Repository
public interface StackSiteRepository extends MongoRepository<StackSite, String>{

    List<StackSite> findBySite(String site);

    //Содержит в себе методы по работе с монго
    //    @Autowired
    //    private MongoTemplate mongoTemplate;
    //
    //    public List<StackSite> findAll() {
    //        return mongoTemplate.findAll(StackSite.class);
    //    }

}
