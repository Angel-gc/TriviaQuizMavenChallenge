package org.example.file;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.trivia.TriviaQuestion;
import org.example.trivia.TriviaQuiz;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileTriviaQuizAdaptor implements TriviaQuiz {
    // TODO - make a FileTriviaQuiz "fit" the TriviaQuiz interface using the Adaptor pattern.
    // Basically you just have to complete this class

    private FileTriviaQuiz fileTriviaQuiz;

    private int score = 0;
    public FileTriviaQuizAdaptor(FileTriviaQuiz fileTriviaQuiz) {
        this.fileTriviaQuiz = fileTriviaQuiz;
    }

    @Override
    public boolean hasNextQuestion() throws IOException {
        // TODO
       return fileTriviaQuiz.getQuestions().size() > 0;
    }

    @Override
    public TriviaQuestion getNextQuestion() throws IOException {
        // TODO
        return new FileQuestionAdaptor(fileTriviaQuiz.getQuestions().remove(0));
    }
    @Override
    public void addPoints(int points) {
        // TODO
        this.score += points;
    }

    @Override
    public int getTotalScore() {
        // TODO
        return this.score;
    }
}
