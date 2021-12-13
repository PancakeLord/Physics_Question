// Definition of class, Record is a sort of final class.
public record Vector(double x, double y) {

    // Definition of basic vector addition, returns a Vector of combined (x,y).
    public Vector plus(Vector vec) {
        double x = vec.x;
        double y = vec.y;
        return new Vector(this.x + x, this.y + y);
    }

    // Vector addition with added binary state.
    public Vector plus(Vector vec, String binState) {
        if (binState.equals("0")) return this;
        return this.plus(vec);
    }

    // Check whether vector is a 0 vector.
    public boolean isZero() {
        return x == 0 && y == 0;
    }

    public String toString() {
        return "Vector with values: " + "(" + x + ", " + y + ")";
    }
}
