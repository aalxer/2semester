package testen;

public class Figur {
    private String name;
    private String status;
    private char color; //w,b
    private int x;
    private int y;

    public Figur(String name, String status, char color, int x, int y) {
        this.name = name;
        this.status = status;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
