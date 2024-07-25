package main.model;

// represents a face of a die, which has a number
public class Face {
    private int number;

    public Face(int number) {
        setNumber(number);
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
