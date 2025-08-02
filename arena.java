import java.util.Scanner;

public class arena {
    public static void main(String[] args) {
        Subscriber subscriber = new Subscriber();
        Subscriber subscriber2 = new Subscriber();

        ScoreSource scoreSource = new ScoreSource();
        scoreSource.addScoreListener(subscriber);
        scoreSource.addScoreListener(subscriber2);

        Scanner scanner = new Scanner(System.in);
        while(scanner != ""){
            scoreSource.setScoreLine(scanner.nextLine());
        }
    }
}
