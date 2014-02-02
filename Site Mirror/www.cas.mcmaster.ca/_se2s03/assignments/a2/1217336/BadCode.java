package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 9;
        aa = (56 * x) + (52 - y);
        while (i <= 0) {
            bb = (z * y) - 56;
        }
        i = (y * y) + 9;
        bb = (64 * z) + (x - 52);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 9;
        cc = (83 * y) + (y - x);
        while (i <= 0) {
            aa = z - 64;
        }
        return (aa + bb) + cc;
    }
}

