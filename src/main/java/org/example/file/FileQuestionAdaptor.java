package org.example.file;

import org.example.trivia.TriviaQuestion;


public class FileQuestionAdaptor implements TriviaQuestion {
    private FileQuestion fileQuestion;

    public FileQuestionAdaptor(FileQuestion fileQuestion) {
        this.fileQuestion = fileQuestion;
    }

    @Override
    public int getQuestionDifficulty() {
        return 1;
    }

    @Override
    public void askQuestion() {
        System.out.println(fileQuestion.getPrompt());
    }

    @Override
    public boolean isRight(String userAnswer) {
        return fileQuestion.getAnswer().toString().equals((userAnswer));
    }
}
