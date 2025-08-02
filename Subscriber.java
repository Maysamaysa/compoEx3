public class Subscriber implements ScoreListener {

    @Override
    public void ScoreChange(ScoreEvent event) {
        // Handle the score update event
        System.out.println("Score updated: " + event.getScoreLine());
    }
    
}
