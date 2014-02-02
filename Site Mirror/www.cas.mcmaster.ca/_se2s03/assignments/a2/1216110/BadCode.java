package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 58;
        aa = (65 * x) + (47 - y);
        while (i <= 0) {
            bb = (z * y) - 65;
        }
        i = (y * y) + 58;
        bb = (19 * z) + (x - 47);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 58;
        cc = (34 * y) + (y - x);
        while (i <= 0) {
            aa = z - 19;
        }
        return (aa + bb) + cc;
    }
}

