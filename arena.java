import java.util.Scanner;

public class arena {
    public static void main(String[] args) {
        Subscriber subscriber = new Subscriber(1);
        Subscriber subscriber2 = new Subscriber(2);

        ScoreSource scoreSource = new ScoreSource();
        scoreSource.addScoreListener(subscriber);
        scoreSource.addScoreListener(subscriber2);

        Scanner scanner = new Scanner(System.in);
        while(score != ""){
            scoreSource.setScoreLine(scanner.nextLine());
            score = scanner.nextLine();
        }
    }
}
