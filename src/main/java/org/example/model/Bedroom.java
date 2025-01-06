package org.example.model;

public class Bedroom extends Room {
    private String name;
    private Bed bed;
    private Wardrobe wardrobe;

    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp, Carpet carpet, String name) {
        super(wall1, wall2, wall3, wall4, ceiling, lamp, carpet);
        this.name = name;

    }
}
