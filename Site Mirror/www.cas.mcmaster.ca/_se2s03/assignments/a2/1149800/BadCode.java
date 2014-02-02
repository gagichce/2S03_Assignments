package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 97;
        aa = (45 * x) + (50 - y);
        while (i <= 0) {
            bb = (z * y) - 45;
        }
        i = (y * y) + 97;
        bb = (34 * z) + (x - 50);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 97;
        cc = (93 * y) + (y - x);
        while (i <= 0) {
            aa = z - 34;
        }
        return (aa + bb) + cc;
    }
}

