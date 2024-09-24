package com.example.pocketdrummer;

public class Item {
    private String name;
    private int iconResource;
    private int soundResource;
    private String description;

    public Item(String name, int iconResource, int soundResource, String description) {
        this.name = name;
        this.iconResource = iconResource;
        this.soundResource = soundResource;
        this.description = description;
    }

    public Item(String name, int iconResource, String description) {
        this.name = name;
        this.iconResource = iconResource;
        this.soundResource = soundResource;
        this.description = description;
    }

    public Item(String name, int iconResource, int soundResource) {
        this.name = name;
        this.iconResource = iconResource;
        this.soundResource = soundResource;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getIconResource() {
        return iconResource;
    }

    public int getSoundResource() {
        return soundResource;
    }

    public String getDescription() {
        return description;
    }
}
