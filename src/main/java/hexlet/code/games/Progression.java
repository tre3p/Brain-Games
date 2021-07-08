package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final int COMPLEXITY = 1 + (int) (Math.random() * 30);
    private static final int LENGTH_OF_PROGRESSION = 10;
    private static final int MIN_STEP = 5;
    private static final int QUESTIONS_QUANTITY = 3;
    private static final int ANSWERS_QUANTITY = 2;

    public static String getRules() {
        return "What number is missing in the progression?";
    }

    public static void launchProgressionGame() {
        String[][] qaArray = new String[QUESTIONS_QUANTITY][ANSWERS_QUANTITY];
        for (int i = 0; i != QUESTIONS_QUANTITY; i++) {
            String[] progressionQA = generateQA((MIN_STEP + (int) (Math.random() * COMPLEXITY)),
                    (int) (Math.random() * MIN_STEP + (int) (Math.random() * COMPLEXITY)),
                    LENGTH_OF_PROGRESSION);
                qaArray[i][0] = progressionQA[0];
                qaArray[i][1] = progressionQA[1];
        }
        Engine.gameEngine(qaArray, getRules());
    }

    public static String[] generateQA(int complexity, int difference, int length) {
        String[] progressionAndAnswer = new String[2];
        String correctResult;
        StringBuilder sb = new StringBuilder();
        int temp = complexity;
        String result = "";
        String[] progression = new String[length];

        for (int i = 0; i < length; i++) {
            temp += difference;
            progression[i] = result.valueOf(temp);
        }

        int indexToDots = length - 1;
        int dotsIndex = (int) (Math.random() * indexToDots);
        correctResult = progression[dotsIndex];
        progression[dotsIndex] = "..";

        for (String value : progression) {
            sb.append(value + " ");
        }
        progressionAndAnswer[0] = sb.toString();
        progressionAndAnswer[1] = correctResult;
        return progressionAndAnswer;
    }
}
