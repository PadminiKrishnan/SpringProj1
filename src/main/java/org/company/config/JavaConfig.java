package org.company.config;

import org.company.Animal;
import org.company.AnimalNoise;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:config2.xml")
public class JavaConfig {


    @Bean
    public AnimalNoise animalNoise(Animal animal){
        return new AnimalNoise(animal);
    }
}
