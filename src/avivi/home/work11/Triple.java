package avivi.home.work11;

public class Triple<L,M,R> {
    private L left;
    private M meridian;
    private R right;

    public Triple(L left, M meridian, R right) {
        this.left = left;
        this.meridian = meridian;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public M getMeridian() {
        return meridian;
    }

    public R getRight() {
        return right;
    }

    public void setLeft(L left) {
        this.left = left;
    }

    public void setMeridian(M meridian) {
        this.meridian = meridian;
    }

    public void setRight(R right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return this.left.toString()+' ' + this.right.toString()+' ' + this.meridian.toString();
    }
}
