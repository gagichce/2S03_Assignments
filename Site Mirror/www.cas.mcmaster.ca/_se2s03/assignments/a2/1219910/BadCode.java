package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 20;
        aa = (56 * x) + (35 - y);
        while (i <= 0) {
            bb = (z * y) - 56;
        }
        i = (y * y) + 20;
        bb = (79 * z) + (x - 35);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 20;
        cc = (69 * y) + (y - x);
        while (i <= 0) {
            aa = z - 79;
        }
        return (aa + bb) + cc;
    }
}

