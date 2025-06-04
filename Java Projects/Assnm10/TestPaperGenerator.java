import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class TestPaperGenerator {
    public static void main(String[] args) {
        // Generate a test
        Test test = generateTest();
        // Print the test
        System.out.println("Test:");
        System.out.println(test);
        // Print the answer key
        System.out.println("Answer Key:");
        System.out.println(generateAnswerKey(test));
}
    private static Test generateTest() {
        List<Question> questions = new ArrayList<>();
        Random random = new Random();
        questions.add(new ObjectiveQuestion(10,random.nextInt(TestPaperConstants.MAX_DIFFICULTY - TestPaperConstants.MIN_DIFFICULTY + 1)
                + TestPaperConstants.MIN_DIFFICULTY, 5, "What is the capital of France?", "Paris"));
        questions.add(new FillInTheBlankQuestion(8,random.nextInt(TestPaperConstants.MAX_DIFFICULTY - TestPaperConstants.MIN_DIFFICULTY + 1)
                + TestPaperConstants.MIN_DIFFICULTY, 3, "______ was the 16th US President.", "Abraham Lincoln"));
        List<String> mcqOptions = List.of("Peter Griffin", "Scooby Doo", "Spongebob Squarepants", "Eric Cartman");
        questions.add(new MultipleChoiceQuestion(12,random.nextInt(TestPaperConstants.MAX_DIFFICULTY - TestPaperConstants.MIN_DIFFICULTY + 1)
                + TestPaperConstants.MIN_DIFFICULTY, 1, "Who lives in a pineapple under the sea?", mcqOptions, 2));
        return new Test(questions);
    }
    private static String generateAnswerKey(Test test) {
        StringBuilder answerKey = new StringBuilder();
        for (Question question : test.questions) {
            if (question instanceof ObjectiveQuestion) {
                answerKey.append(String.format("%s\nCorrect Answer: %s\n", question.questionText, ((ObjectiveQuestion) question).correctAnswer));
            } else if (question instanceof FillInTheBlankQuestion) {
                answerKey.append(String.format("%s\nCorrect Answer: %s\n", question.questionText, ((FillInTheBlankQuestion) question).correctAnswer));
            } else if (question instanceof MultipleChoiceQuestion) {
                answerKey.append(question.toString().replace("Correct Answer", "Correct Answer"));
            }
}
        return answerKey.toString();
    }
}
