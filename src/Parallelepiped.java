public class Parallelepiped {
    private double h;
    private double l;
    private double w;

    public Parallelepiped(double h, double l, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }

    public Parallelepiped() {
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public String square() {
        double s = 2 * ((h * l) + (l * w) + (h * w));
        return "S="+ s + " = 2 * ((" + h + " * " + l + ") + " + "(" + l + " * " + w + ") + " + "(" + h + " * " + w + "))";
    }
    public void volume(){
        System.out.println("V = " + l * w * h + " = " + l + " * " + w + " * " + h);
    }
}
