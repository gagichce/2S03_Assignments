package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 41;
        aa = (27 * x) + (96 - y);
        while (i <= 0) {
            bb = (z * y) - 27;
        }
        i = (y * y) + 41;
        bb = (41 * z) + (x - 96);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 41;
        cc = (88 * y) + (y - x);
        while (i <= 0) {
            aa = z - 41;
        }
        return (aa + bb) + cc;
    }
}

