import java.util.Scanner;

public class arena {
    public static void main(String[] args) {
        LiveScoreBean scoreBean = new LiveScoreBean();

        //2 subscribers
        Subscriber sub1 = new Subscriber("Sub1");
        Subscriber sub2 = new Subscriber("Sub2");

        scoreBean.addPropertyChangeListener(sub1);
        scoreBean.addPropertyChangeListener(sub2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input :(enter to end)");

        while (true) {
            System.out.print("result : ");
            String input = scanner.nextLine();
            if (input.trim().isEmpty()) {
                break;
            }
            scoreBean.setScoreLine(input);
        }

        scanner.close();
        System.out.println("End of match updates.");
    }
}
