package ru.misha.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.misha.model.SiteDto;
import ru.misha.model.SitesDto;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Component
public class StackExchangeClient {

    private RestTemplate restTemplate = new RestTemplate();

    public List<SiteDto> getSites() {
        String url = "https://api.stackexchange.com/2.2/sites?page=1&pagesize=9&filter=!Fn4IB7S7T4v-QOAVmFyqlc(HdV";

        try {
            SitesDto response = restTemplate.getForObject(new URI(url), SitesDto.class);
            return response.getItems();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
