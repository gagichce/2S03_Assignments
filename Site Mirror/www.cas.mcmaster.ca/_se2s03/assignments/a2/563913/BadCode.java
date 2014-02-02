package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 94;
        aa = (32 * x) + (27 - y);
        while (i <= 0) {
            bb = (z * y) - 32;
        }
        i = (y * y) + 94;
        bb = (57 * z) + (x - 27);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 94;
        cc = (56 * y) + (y - x);
        while (i <= 0) {
            aa = z - 57;
        }
        return (aa + bb) + cc;
    }
}

