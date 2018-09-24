package models;

import java.io.Serializable;

/**
 * This is a JavaBean that represents a Note object
 * @author 672762
 */
public class Note implements Serializable {
    
    private String title;
    private String content;

    public Note() {
    }

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Note{" + "title=" + title + ", content=" + content + '}';
    }
}
