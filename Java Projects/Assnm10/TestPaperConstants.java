import java.util.List;

// Constants
class TestPaperConstants {
    static final int MIN_DIFFICULTY = 1;
    static final int MAX_DIFFICULTY = 5;
}
// Base class for questions
class Question {
    int points;
    int difficulty;
    int answerSpace;
    String questionText;
    public Question(int points, int difficulty, int answerSpace, String questionText) {
        this.answerSpace = answerSpace;
        this.questionText = questionText;
        this.points = points;
        this.difficulty = difficulty;
}
    @Override
    public String toString() {
        return String.format("%s\nPoints: %d\nDifficulty: %d\n", questionText, points, difficulty);
} }
// Objective Questions
class ObjectiveQuestion extends Question {
    String correctAnswer;
    public ObjectiveQuestion(int points, int difficulty, int answerSpace, String questionText, String correctAnswer) {
        super(points, difficulty, answerSpace, questionText);
        this.correctAnswer = correctAnswer;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("Correct Answer: %s\n", correctAnswer);
} }
// Fill in the Blank Questions
class FillInTheBlankQuestion extends Question {
    String correctAnswer;
    public FillInTheBlankQuestion(int points, int difficulty, int answerSpace, String questionText, String correctAnswer) {
        super(points, difficulty, answerSpace, questionText);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Fill in the blank: %s\n", correctAnswer);
} }
// Multiple Choice Questions
class MultipleChoiceQuestion extends Question {
    List<String> possibleAnswers;
    int correctAnswer;
    public MultipleChoiceQuestion(int points, int difficulty, int answerSpace, String questionText, List<String> possibleAnswers, int correctAnswer){
        super(points, difficulty, answerSpace, questionText);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
}
    @Override
    public String toString() {
        StringBuilder options = new StringBuilder();
        for (int i = 0; i < possibleAnswers.size(); i++) {
            options.append((char) ('A' + i)).append(".").append(possibleAnswers.get(i)).append("\n");
}
        return super.toString() + options + String.format("Correct Answer: %c\n",(char) ('A' + correctAnswer));
} }
// Test class
class Test {
    List<Question> questions;
    public Test(List<Question> questions) {
        this.questions = questions;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Question question : questions) {
            result.append(question.toString()).append("\n");
        }
        return result.toString();
    }
    public int getTotalPoints() {
        int totalPoints = 0;
        for (Question question : questions) {
            totalPoints += question.points;
        }
        return totalPoints;
    }
}


