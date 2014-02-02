package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 81;
        aa = (85 * x) + (50 - y);
        while (i <= 0) {
            bb = (z * y) - 85;
        }
        i = (y * y) + 81;
        bb = (12 * z) + (x - 50);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 81;
        cc = (11 * y) + (y - x);
        while (i <= 0) {
            aa = z - 12;
        }
        return (aa + bb) + cc;
    }
}

