import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {

        String[] questions = {
                "Who is leading the strawhat crew ?",
                "Who was the mentor of Aokiji (Kuzan) ?",
                "Who is the son of Kaido ?",
                "Who was apart of the Gol. D. Roger crew ?",
                "Who was the most feared cell guard inside of Impel Down ?"
        };

        String[][] options = {
                {"1. Nami", "2. Sanji", "3. Luffy", "4. Zoro"},
                {"1. Sengoku", "2. Garp", "3. Akainu", "4. White Beard"},
                {"1. King", "2. Kid", "3. Oden", "4. Yamato"},
                {"1. Big Mom", "2. Shanks", "3. Black Beard", "4. Marco"},
                {"1. Magellan", "2. Shiryu", "3. Kizaru", "4. Lucci"},
        };

        int[] answers = {3, 2, 4, 2, 2};
        int score = 0;
        int guess;

        Scanner input = new Scanner(System.in);

        System.out.println("ONE PIECE QUIZ GAME");
        System.out.println("-------------------");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.println("-------------------");
            System.out.print("Enter your guess : ");
            guess = input.nextInt();

            if (guess == answers[i]) {
                score++;
            }
        }

        System.out.println("-------------------");
        System.out.printf("Your final score is %d/5\n",score);

        if (score == 5) {
            System.out.println("Perfect ! You are a One Piece expert !");
        } else if (score >= 3 && score < 5) {
            System.out.println("You did great ! Maybe next time you'll do better !");
        } else if (score < 3 && score >= 1) {
            System.out.println("Not too bad !");
        } else {
            System.out.println("All wrong, Maybe you should give One Piece a try 🤔. ");
        }

        input.close();
    }
}
