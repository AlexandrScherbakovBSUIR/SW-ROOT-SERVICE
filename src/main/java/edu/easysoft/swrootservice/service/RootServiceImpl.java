package edu.easysoft.swrootservice.service;

import edu.easysoft.swrootservice.entity.Root;
import edu.easysoft.swrootservice.feignclient.PersonFeignClient;
import edu.easysoft.swrootservice.response.PersonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class RootServiceImpl implements RootService{
    @Autowired
    PersonFeignClient personFeignClient;
    public Root getRoot(){
        return makeRequest("https://swapi.dev/api/", Root.class);
    }

    public PersonResponse getPersonById(long id) {

        return personFeignClient.getById(id);
    }

    private <T> T makeRequest(String url, Class<T> c1){
        return WebClient.create()
                .get()
                .uri(url)
                .headers(httpHeaders ->{
                        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
                })
                .retrieve()
                .bodyToMono(c1)
                .block();
    }


}
