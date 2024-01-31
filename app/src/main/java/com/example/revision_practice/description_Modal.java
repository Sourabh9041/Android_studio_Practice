package com.example.revision_practice;

public class description_Modal {

    int character_image;
    String character_name;

    String character_Description;

    public int getCharacter_image() {
        return character_image;
    }

    public void setCharacter_image(int character_image) {
        this.character_image = character_image;
    }

    public String getCharacter_name() {
        return character_name;
    }

    public void setCharacter_name(String character_name) {
        this.character_name = character_name;
    }

    public String getCharacter_Description() {
        return character_Description;
    }

    public void setCharacter_Description(String character_Description) {
        this.character_Description = character_Description;
    }

    public description_Modal(int character_image, String character_name, String character_Description) {
        this.character_image = character_image;
        this.character_name = character_name;
        this.character_Description = character_Description;
    }
}
