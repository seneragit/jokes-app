package com.senera.senerajokesapp.service;


import com.senera.senerajokesapp.model.JokeQutotes;
import org.springframework.stereotype.Service;

/**
 * @author Senera Madushan
 * @comment
 */
@Service
public class JokeServiceImpl implements JokeService {

    private final JokeQutotes jokeQutotes;


    public JokeServiceImpl(JokeQutotes jokeQutotes) {
        this.jokeQutotes = jokeQutotes;
    }

    @Override
    public String getJoke() {
        return jokeQutotes.getRandomQuote();
    }
}
