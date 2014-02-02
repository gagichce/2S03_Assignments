package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 72;
        aa = (74 * x) + (70 - y);
        while (i <= 0) {
            bb = (z * y) - 74;
        }
        i = (y * y) + 72;
        bb = (48 * z) + (x - 70);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 72;
        cc = (66 * y) + (y - x);
        while (i <= 0) {
            aa = z - 48;
        }
        return (aa + bb) + cc;
    }
}

