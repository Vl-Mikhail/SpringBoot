package ru.misha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.misha.model.SiteDto;
import ru.misha.model.StackSite;
import ru.misha.persistence.StackSiteRepository;

import java.util.List;

@Service
public class StackService {

    @Autowired
    private StackSiteRepository repository;
    @Autowired
    private StackExchangeClient stackExchangeClient;

    public void save(List<StackSite> list){
        repository.save(list);
    }

    public List<SiteDto> findAll() {
        return stackExchangeClient.getSites();
    }


//        public List<StackSite> findAll() {
//        return stackExchangeClient.getSites().stream()
//                .map(this::stackSite)
//                .collect(collectingAndThen(toList(), ImmutableList::copyOf));
//    }
//
//    private StackSite stackSite(SiteDto input){
//        return new StackSite(
//                input.getSite_url().substring("http://".length(),input.getSite_url().length()-".com".length() ),
//                input.getFavicon_url(),
//                input.getName(),
//                input.getAudience()
//                );
//    }

//    public List<StackSite> findAll() {
//        return repository.findAll();
//    }

}
