import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class LiveScoreBean {
    private String scoreLine;
    private PropertyChangeSupport support;

    public LiveScoreBean() {
        support = new PropertyChangeSupport(this);
    }

    public void setScoreLine(String newScoreLine) {
        String oldScoreLine = this.scoreLine;
        this.scoreLine = newScoreLine;
        support.firePropertyChange("scoreLine", oldScoreLine, newScoreLine);
    }

    public String getScoreLine() {
        return scoreLine;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}
