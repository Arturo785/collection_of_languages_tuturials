package beans;

public class Rectangle {

    private int base;
    private int height;

    public Rectangle(){}

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea(){
        return base * height;
    }
}
