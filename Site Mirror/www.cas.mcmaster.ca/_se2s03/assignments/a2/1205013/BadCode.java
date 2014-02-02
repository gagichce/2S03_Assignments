package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 23;
        aa = (2 * x) + (91 - y);
        while (i <= 0) {
            bb = (z * y) - 2;
        }
        i = (y * y) + 23;
        bb = (82 * z) + (x - 91);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 23;
        cc = (93 * y) + (y - x);
        while (i <= 0) {
            aa = z - 82;
        }
        return (aa + bb) + cc;
    }
}

