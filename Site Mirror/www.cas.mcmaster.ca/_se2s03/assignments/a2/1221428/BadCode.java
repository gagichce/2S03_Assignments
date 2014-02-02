package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 48;
        aa = (56 * x) + (75 - y);
        while (i <= 0) {
            bb = (z * y) - 56;
        }
        i = (y * y) + 48;
        bb = (76 * z) + (x - 75);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 48;
        cc = (89 * y) + (y - x);
        while (i <= 0) {
            aa = z - 76;
        }
        return (aa + bb) + cc;
    }
}

