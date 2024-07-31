package main.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private List<Face> faces;

    public Dice() {
        faces = new ArrayList<>();
    }

    // REQUIRES: faces > 0
    // 
    public int rollDice() {
        // https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = ThreadLocalRandom.current().nextInt(1, faces.size() + 1);
        return getFace(randomNum).getNumber();
    }

    // EFFECTS: add a face with given number into faces list, at given array index
    public void addFace(int index) {

    }

    public void removeFace() {

    }

    // EFFECTS: returns the face in faces list with position faceNum - 1
    // REQUIRES: 1 =< faceNum <= faces.length();
    public Face getFace(int faceNum) {
        return faces.get(faceNum - 1);
    }
}
