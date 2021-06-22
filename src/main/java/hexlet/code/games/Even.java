package hexlet.code.games;

public class Even {
    private static final int RANDOM_RANGE = 1 + (int) (Math.random() * 100);
    public static String getRules() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }

    public static String[] printQuestion() {
        String[] qa = generateQuestionAndAnswer();
        System.out.println("Question: " + qa[0]);
        return qa;
    }

    public static String[] generateQuestionAndAnswer() {
        String correctResult;
        String[] questionAndAnswer = new String[2];
        int digit = (int) (Math.random() * RANDOM_RANGE);
        questionAndAnswer[0] = String.valueOf(digit);
        correctResult = digit % 2 == 0 ? "yes" : "no";
        questionAndAnswer[1] = correctResult;
        return questionAndAnswer;
    }
}
