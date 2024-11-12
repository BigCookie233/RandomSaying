package io.github.bigcookie233.saying.services;

import io.github.bigcookie233.saying.entities.Saying;
import io.github.bigcookie233.saying.repositories.SayingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class SayingService {
    private SayingRepository sayingRepository;
    private List<Saying> sayingList;

    public SayingService(SayingRepository sayingRepository) {
        this.sayingRepository = sayingRepository;
        this.reload();
    }

    public void reload() {
        this.sayingList = this.sayingRepository.findAll();
    }

    public Saying getRandom() {
        return this.sayingList.stream()
                .skip(new Random().nextInt(this.sayingList.size()))
                .findFirst()
                .orElse(null);
    }
}
