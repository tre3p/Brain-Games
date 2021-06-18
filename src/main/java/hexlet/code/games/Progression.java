package hexlet.code.games;

public class Progression {
    private static String correctResult;
    public static void progressionGameRules() {
        System.out.println("What number is missing in the progression?");
    }

    public static String printProgression(int a, int d, int n) {
        StringBuilder sb = new StringBuilder();
        int temp = a;
        String result = "";
        String[] progression = new String[n];

        for (int i = 0; i < n; i++) {
            temp += d;
            progression[i] = result.valueOf(temp);
        }

        int findIndexToDots = n - 1;
        int dotsIndex = (int) (Math.random() * findIndexToDots);
        correctResult = progression[dotsIndex];
        progression[dotsIndex] = "..";

        for (String value : progression) {
            sb.append(value + " ");
        }

        System.out.print("Question: ");
        System.out.println(sb);
        return correctResult;
    }
}
