package org.example.trivia;

import java.io.IOException;

public interface TriviaQuiz {
    boolean hasNextQuestion() throws IOException;
    TriviaQuestion getNextQuestion() throws IOException;
    void addPoints(int points);
    int getTotalScore();
}
