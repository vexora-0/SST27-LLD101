public class Rectangle implements Igeo {
    protected int w, h;

    public void setWidth(int w) {
        this.w = w;
    }

    public void setHeight(int h) {
        this.h = h;
    }

    public int area() {
        return w * h;
    }
}