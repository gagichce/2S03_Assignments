package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 50;
        aa = (83 * x) + (46 - y);
        while (i <= 0) {
            bb = (z * y) - 83;
        }
        i = (y * y) + 50;
        bb = (76 * z) + (x - 46);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 50;
        cc = (82 * y) + (y - x);
        while (i <= 0) {
            aa = z - 76;
        }
        return (aa + bb) + cc;
    }
}

