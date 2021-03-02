package com.senera.senerajokesapp.config;

import com.senera.senerajokesapp.model.JokeQutotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Senera Madushan
 * @comment
 */
@Configuration
public class JokeConfiguration {

    @Bean
    public JokeQutotes jokequtotes(){
        return new JokeQutotes();
    }
}
