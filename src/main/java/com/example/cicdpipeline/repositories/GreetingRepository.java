package com.example.cicdpipeline.repositories;

import com.example.cicdpipeline.models.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting,Long> {
}
