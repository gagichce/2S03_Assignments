package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 70;
        aa = (38 * x) + (94 - y);
        while (i <= 0) {
            bb = (z * y) - 38;
        }
        i = (y * y) + 70;
        bb = (84 * z) + (x - 94);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 70;
        cc = (32 * y) + (y - x);
        while (i <= 0) {
            aa = z - 84;
        }
        return (aa + bb) + cc;
    }
}

