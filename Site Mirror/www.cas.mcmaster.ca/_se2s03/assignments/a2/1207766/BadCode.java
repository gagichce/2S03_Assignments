package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 45;
        aa = (56 * x) + (95 - y);
        while (i <= 0) {
            bb = (z * y) - 56;
        }
        i = (y * y) + 45;
        bb = (1 * z) + (x - 95);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 45;
        cc = (12 * y) + (y - x);
        while (i <= 0) {
            aa = z - 1;
        }
        return (aa + bb) + cc;
    }
}

