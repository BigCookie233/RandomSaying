package io.github.bigcookie233.saying.repositories;

import io.github.bigcookie233.saying.entities.Saying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface SayingRepository extends JpaRepository<Saying, UUID> {
//    @Query(value = "SELECT * FROM saying ORDER BY RAND() LIMIT 1", nativeQuery = true)
//    Saying findRandomSaying();
    Saying findByUuid(UUID uuid);
}
