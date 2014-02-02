package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 92;
        aa = (65 * x) + (81 - y);
        while (i <= 0) {
            bb = (z * y) - 65;
        }
        i = (y * y) + 92;
        bb = (52 * z) + (x - 81);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 92;
        cc = (95 * y) + (y - x);
        while (i <= 0) {
            aa = z - 52;
        }
        return (aa + bb) + cc;
    }
}

