package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 42;
        aa = (20 * x) + (43 - y);
        while (i <= 0) {
            bb = (z * y) - 20;
        }
        i = (y * y) + 42;
        bb = (89 * z) + (x - 43);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 42;
        cc = (18 * y) + (y - x);
        while (i <= 0) {
            aa = z - 89;
        }
        return (aa + bb) + cc;
    }
}

