package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 4;
        aa = (2 * x) + (3 - y);
        while (i <= 0) {
            bb = (z * y) - 2;
        }
        i = (y * y) + 4;
        bb = (51 * z) + (x - 3);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 4;
        cc = (76 * y) + (y - x);
        while (i <= 0) {
            aa = z - 51;
        }
        return (aa + bb) + cc;
    }
}

