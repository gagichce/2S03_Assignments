package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 46;
        aa = (83 * x) + (71 - y);
        while (i <= 0) {
            bb = (z * y) - 83;
        }
        i = (y * y) + 46;
        bb = (54 * z) + (x - 71);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 46;
        cc = (12 * y) + (y - x);
        while (i <= 0) {
            aa = z - 54;
        }
        return (aa + bb) + cc;
    }
}

