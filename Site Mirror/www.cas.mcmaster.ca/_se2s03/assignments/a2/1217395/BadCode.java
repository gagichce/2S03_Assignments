package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 37;
        aa = (29 * x) + (98 - y);
        while (i <= 0) {
            bb = (z * y) - 29;
        }
        i = (y * y) + 37;
        bb = (10 * z) + (x - 98);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 37;
        cc = (96 * y) + (y - x);
        while (i <= 0) {
            aa = z - 10;
        }
        return (aa + bb) + cc;
    }
}

