package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 95;
        aa = (65 * x) + (95 - y);
        while (i <= 0) {
            bb = (z * y) - 65;
        }
        i = (y * y) + 95;
        bb = (61 * z) + (x - 95);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 95;
        cc = (85 * y) + (y - x);
        while (i <= 0) {
            aa = z - 61;
        }
        return (aa + bb) + cc;
    }
}

