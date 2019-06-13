package avivi.home.work11;

public class Pair<L,R> {
    private L left;
    private R right;

    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }

    public void setLeft(L left) {
        this.left = left;
    }

    public void setRight(R right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return this.left.toString()+' ' + this.right.toString();
    }

//    @Override
//    public String toString() {
//        String r = "Type: "+ this.getTypeVariableL()+ "; Value: "+this.left.toString();
//        r+= " Type: "+ this.getTypeVariableR()+ "; Value: "+this.right.toString();
//
//        return r;
//    }
//
//    private String getTypeVariableL() {
//        String result = "";
//
//        if (this.left instanceof Integer) {
//            result = "Integer";
//        } else if (this.left instanceof String) {
//            result = "String";
//        }
//
//        return result;
//    }
//
//    private String getTypeVariableR() {
//        String result = "";
//
//        if (this.right instanceof Integer) {
//            result = "Integer";
//        } else if (this.right instanceof String) {
//            result = "String";
//        }
//
//        return result;
//    }
}
