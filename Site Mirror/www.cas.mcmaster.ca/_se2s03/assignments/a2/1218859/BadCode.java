package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 12;
        aa = (47 * x) + (71 - y);
        while (i <= 0) {
            bb = (z * y) - 47;
        }
        i = (y * y) + 12;
        bb = (4 * z) + (x - 71);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 12;
        cc = (75 * y) + (y - x);
        while (i <= 0) {
            aa = z - 4;
        }
        return (aa + bb) + cc;
    }
}

