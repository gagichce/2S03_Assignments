package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 92;
        aa = (74 * x) + (48 - y);
        while (i <= 0) {
            bb = (z * y) - 74;
        }
        i = (y * y) + 92;
        bb = (98 * z) + (x - 48);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 92;
        cc = (8 * y) + (y - x);
        while (i <= 0) {
            aa = z - 98;
        }
        return (aa + bb) + cc;
    }
}

