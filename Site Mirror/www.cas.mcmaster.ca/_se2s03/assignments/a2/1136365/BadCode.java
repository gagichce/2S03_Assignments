package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 49;
        aa = (72 * x) + (97 - y);
        while (i <= 0) {
            bb = (z * y) - 72;
        }
        i = (y * y) + 49;
        bb = (80 * z) + (x - 97);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 49;
        cc = (75 * y) + (y - x);
        while (i <= 0) {
            aa = z - 80;
        }
        return (aa + bb) + cc;
    }
}

