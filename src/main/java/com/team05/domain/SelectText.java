package com.team05.domain;

/**
 * Created by dllo on 18/3/1.
 */
public class SelectText {
    private String text;

    public SelectText() {
    }

    public SelectText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Text{" +
                "text='" + text + '\'' +
                '}';
    }
}
