package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 83;
        aa = (9 * x) + (10 - y);
        while (i <= 0) {
            bb = (z * y) - 9;
        }
        i = (y * y) + 83;
        bb = (86 * z) + (x - 10);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 83;
        cc = (76 * y) + (y - x);
        while (i <= 0) {
            aa = z - 86;
        }
        return (aa + bb) + cc;
    }
}

