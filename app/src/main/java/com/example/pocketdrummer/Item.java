package com.example.pocketdrummer;

public class Item {
    private String name;
    private int iconResource;
    private String description;

    public Item(String name, int iconResource, String description) {
        this.name = name;
        this.iconResource = iconResource;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getIconResource() {
        return iconResource;
    }

    public String getDescription() {
        return description;
    }
}
