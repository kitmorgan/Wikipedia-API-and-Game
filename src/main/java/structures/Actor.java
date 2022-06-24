package structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Actor {
    Map<Page, Double> guesses = new HashMap<>();
    Page answer;

    public Actor(Page answer){
        this.answer = answer;
    }

    public void makeGuess(Page guess){
        guesses.put(guess, Scorer.scoreGuess(guess, answer));
    }
}
