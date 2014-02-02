package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 5;
        aa = (65 * x) + (23 - y);
        while (i <= 0) {
            bb = (z * y) - 65;
        }
        i = (y * y) + 5;
        bb = (34 * z) + (x - 23);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 5;
        cc = (23 * y) + (y - x);
        while (i <= 0) {
            aa = z - 34;
        }
        return (aa + bb) + cc;
    }
}

