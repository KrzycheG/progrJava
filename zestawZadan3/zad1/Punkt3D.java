package zestawZadan3.zad1;

public class Punkt3D {

    int x;
    int y;
    int z;

    public Punkt3D() {

        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Punkt3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public  double distance() {

        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2));

    }

    public double taxiCabDistance(){

        return Math.abs(x) + Math.abs(y) + Math.abs(z);

    }

}
