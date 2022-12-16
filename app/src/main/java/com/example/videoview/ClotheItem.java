package com.example.OurCloset;

public class ClotheItem {

    private String name;
    private String locate;
    private int image;

    public ClotheItem(String name, String locate, int image) {
        this.name = name;
        this.locate = locate;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String locate) {
        this.locate = locate;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
