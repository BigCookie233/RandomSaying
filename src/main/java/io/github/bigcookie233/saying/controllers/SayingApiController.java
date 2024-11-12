package io.github.bigcookie233.saying.controllers;

import io.github.bigcookie233.saying.entities.Saying;
import io.github.bigcookie233.saying.repositories.SayingRepository;
import io.github.bigcookie233.saying.services.SayingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayingApiController {
    @Autowired
    private SayingRepository sayingRepository;
    @Autowired
    private SayingService sayingService;

    @GetMapping("api/random")
    public Saying randomSaying() {
        return this.sayingService.getRandom();
    }
}
