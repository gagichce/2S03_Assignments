package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 55;
        aa = (99 * x) + (42 - y);
        while (i <= 0) {
            bb = (z * y) - 99;
        }
        i = (y * y) + 55;
        bb = (15 * z) + (x - 42);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 55;
        cc = (91 * y) + (y - x);
        while (i <= 0) {
            aa = z - 15;
        }
        return (aa + bb) + cc;
    }
}

