public class Cylinder {
    private double r;
    private double h;

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public Cylinder() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    public void square (){
        System.out.println("S = " + 2 * Math.PI * (h + r));
    }
    public void volume (){
        System.out.println("V = " + Math.PI * r * r * h);
    }
}
