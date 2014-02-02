package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 76;
        aa = (38 * x) + (21 - y);
        while (i <= 0) {
            bb = (z * y) - 38;
        }
        i = (y * y) + 76;
        bb = (91 * z) + (x - 21);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 76;
        cc = (91 * y) + (y - x);
        while (i <= 0) {
            aa = z - 91;
        }
        return (aa + bb) + cc;
    }
}

