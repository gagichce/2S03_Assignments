package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 8;
        aa = (74 * x) + (99 - y);
        while (i <= 0) {
            bb = (z * y) - 74;
        }
        i = (y * y) + 8;
        bb = (84 * z) + (x - 99);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 8;
        cc = (56 * y) + (y - x);
        while (i <= 0) {
            aa = z - 84;
        }
        return (aa + bb) + cc;
    }
}

