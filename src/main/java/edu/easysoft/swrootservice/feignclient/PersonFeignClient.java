package edu.easysoft.swrootservice.feignclient;

import edu.easysoft.swrootservice.response.PersonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.net.URI;

@FeignClient(value = "api-gateway")
public interface PersonFeignClient {
    @GetMapping("person-service/api/person/getById/{id}")
    public PersonResponse getById(@PathVariable long id);
}
