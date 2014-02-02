package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 51;
        aa = (83 * x) + (38 - y);
        while (i <= 0) {
            bb = (z * y) - 83;
        }
        i = (y * y) + 51;
        bb = (38 * z) + (x - 38);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 51;
        cc = (10 * y) + (y - x);
        while (i <= 0) {
            aa = z - 38;
        }
        return (aa + bb) + cc;
    }
}

