import lt.itakademija.Document;

import java.util.List;

public class Doc implements Document {
    private String title;
    private List<String> lines;

    public Doc() {
    }

    public Doc(String title) {
        this.title = title;
    }

    public Doc(String title, List<String> lines) {
        this.title = title;
        this.lines = lines;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<String> getLines() {
        return lines;
    }
}
