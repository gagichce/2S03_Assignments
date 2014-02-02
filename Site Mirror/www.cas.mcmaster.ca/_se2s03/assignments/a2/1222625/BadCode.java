package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 45;
        aa = (20 * x) + (7 - y);
        while (i <= 0) {
            bb = (z * y) - 20;
        }
        i = (y * y) + 45;
        bb = (12 * z) + (x - 7);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 45;
        cc = (3 * y) + (y - x);
        while (i <= 0) {
            aa = z - 12;
        }
        return (aa + bb) + cc;
    }
}

