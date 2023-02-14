package edu.easysoft.swrootservice.controller;

import edu.easysoft.swrootservice.entity.Root;
import edu.easysoft.swrootservice.response.PersonResponse;
import edu.easysoft.swrootservice.service.RootService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/root")
public class RootController {
    private RootService rootService;

    RootController(RootService rootService){
        this.rootService = rootService;
        System.out.println(this.getClass());
    }
    @GetMapping("/getRootPage")
    public ResponseEntity<Root> getRootPage(){
        return ResponseEntity.ok(rootService.getRoot());

    }
    @GetMapping("/getAllPeople/{id}")
    public ResponseEntity<PersonResponse> getAllPeople(@PathVariable long id){
        return ResponseEntity.ok(rootService.getPersonById(id));
    }
}
