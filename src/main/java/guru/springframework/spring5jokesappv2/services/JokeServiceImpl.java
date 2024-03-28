package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokesService {

    private ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
