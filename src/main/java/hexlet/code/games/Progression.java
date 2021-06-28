package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final int COMPLEXITY = 1 + (int) (Math.random() * 30);
    private static final int LENGTH_OF_PROGRESSION = 10;
    private static final int MIN_STEP = 5;
    private static final int QUESTIONS_QUANTITY = 3;
    private static final int ANSWERS_QUANTITY = 2;

    public static String printRules() {
        return "What number is missing in the progression?";
    }

    public static void generateQuestionAndAnswer() {
        String[][] qa = new String[QUESTIONS_QUANTITY][ANSWERS_QUANTITY];
        int firstComplexityOfProgression = MIN_STEP + (int) (Math.random() * COMPLEXITY);
        int secondcomplexityOfProgression = MIN_STEP + (int) (Math.random() * COMPLEXITY);
        int thirdComplexityOfProgression = MIN_STEP + (int) (Math.random() * COMPLEXITY);
        int differenceOfProgression = (int) (Math.random() * MIN_STEP + (int) (Math.random() * COMPLEXITY));
        String[] firstProgressionAndAnswer = printProgression(firstComplexityOfProgression, differenceOfProgression,
                                            LENGTH_OF_PROGRESSION);
        String[] secondProgressionAndAnswer = printProgression(secondcomplexityOfProgression, differenceOfProgression,
                LENGTH_OF_PROGRESSION);
        String[] thirdProgressionAndAnswer = printProgression(thirdComplexityOfProgression, differenceOfProgression,
                LENGTH_OF_PROGRESSION);
        qa[0][0] = firstProgressionAndAnswer[0];
        qa[1][0] = secondProgressionAndAnswer[0];
        qa[2][0] = thirdProgressionAndAnswer[0];
        qa[0][1] = firstProgressionAndAnswer[1];
        qa[1][1] = secondProgressionAndAnswer[1];
        qa[2][1] = thirdProgressionAndAnswer[1];
        Engine.gameEngine(qa, printRules());
    }

    public static String[] printProgression(int complexity, int difference, int length) {
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

        int findIndexToDots = length - 1;
        int dotsIndex = (int) (Math.random() * findIndexToDots);
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
