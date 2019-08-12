package vectorParOImpar;

public class Vector {
    private int vector;
    private double num;
    private int pos;
    private int neg;

    public Vector() {
        this.vector = 0;
        this.num = 0;
        this.pos = 0;
        this.neg = 0;
    }

    public Vector(int vector, double num, int pos, int neg) {
        this.vector = vector;
        this.num = num;
        this.pos = pos;
        this.neg = neg;
    }

    public int getVector() {
        return vector;
    }

    public void setVector(int vector) {
        this.vector = vector;
    }

    public double getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getNeg() {
        return neg;
    }

    public void setNeg(int neg) {
        this.neg = neg;
    }
}
