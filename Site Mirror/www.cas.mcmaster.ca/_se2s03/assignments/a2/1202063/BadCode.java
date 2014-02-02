package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 6;
        aa = (65 * x) + (34 - y);
        while (i <= 0) {
            bb = (z * y) - 65;
        }
        i = (y * y) + 6;
        bb = (10 * z) + (x - 34);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 6;
        cc = (94 * y) + (y - x);
        while (i <= 0) {
            aa = z - 10;
        }
        return (aa + bb) + cc;
    }
}

