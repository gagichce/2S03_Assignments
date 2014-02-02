package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 69;
        aa = (83 * x) + (85 - y);
        while (i <= 0) {
            bb = (z * y) - 83;
        }
        i = (y * y) + 69;
        bb = (43 * z) + (x - 85);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 69;
        cc = (84 * y) + (y - x);
        while (i <= 0) {
            aa = z - 43;
        }
        return (aa + bb) + cc;
    }
}

