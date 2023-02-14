package edu.easysoft.swrootservice.service;

import edu.easysoft.swrootservice.entity.Root;
import edu.easysoft.swrootservice.response.PersonResponse;
import org.springframework.stereotype.Service;

@Service
public interface RootService {
    Root getRoot();

    private <T> T makeRequest(String url, Class<T> c1) {
        return null;
    }

    PersonResponse getPersonById(long id);
}
