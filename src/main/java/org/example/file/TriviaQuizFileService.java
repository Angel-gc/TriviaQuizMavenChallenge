package org.example.file;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.trivia.TriviaQuiz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class TriviaQuizFileService {
    private static final String FILE_NAME = "quiz.json";
    private static TriviaQuizFileService INSTANCE;
    public FileTriviaQuiz getQuizFromFile() throws IOException {
        // TODO you want to read the JSON file, convert it to a FileTriviaQuiz and return that from this method

        FileTriviaQuiz quizContent = new ObjectMapper().readValue(new File(FILE_NAME), FileTriviaQuiz.class);

        return quizContent;
    }
    public static TriviaQuizFileService getInstance() {

        if(INSTANCE == null) {
            INSTANCE = new TriviaQuizFileService();
        }
        return INSTANCE;
    }
}
