package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 94;
        aa = (83 * x) + (18 - y);
        while (i <= 0) {
            bb = (z * y) - 83;
        }
        i = (y * y) + 94;
        bb = (7 * z) + (x - 18);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 94;
        cc = (49 * y) + (y - x);
        while (i <= 0) {
            aa = z - 7;
        }
        return (aa + bb) + cc;
    }
}

