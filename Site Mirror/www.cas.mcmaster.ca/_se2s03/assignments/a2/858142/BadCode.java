package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 85;
        aa = (69 * x) + (81 - y);
        while (i <= 0) {
            bb = (z * y) - 69;
        }
        i = (y * y) + 85;
        bb = (65 * z) + (x - 81);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 85;
        cc = (92 * y) + (y - x);
        while (i <= 0) {
            aa = z - 65;
        }
        return (aa + bb) + cc;
    }
}

