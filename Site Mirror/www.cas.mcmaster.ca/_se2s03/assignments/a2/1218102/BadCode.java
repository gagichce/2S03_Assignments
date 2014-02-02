package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 39;
        aa = (83 * x) + (41 - y);
        while (i <= 0) {
            bb = (z * y) - 83;
        }
        i = (y * y) + 39;
        bb = (30 * z) + (x - 41);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 39;
        cc = (46 * y) + (y - x);
        while (i <= 0) {
            aa = z - 30;
        }
        return (aa + bb) + cc;
    }
}

