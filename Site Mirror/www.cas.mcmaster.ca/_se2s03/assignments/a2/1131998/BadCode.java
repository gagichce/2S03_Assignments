package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 80;
        aa = (72 * x) + (57 - y);
        while (i <= 0) {
            bb = (z * y) - 72;
        }
        i = (y * y) + 80;
        bb = (75 * z) + (x - 57);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 80;
        cc = (97 * y) + (y - x);
        while (i <= 0) {
            aa = z - 75;
        }
        return (aa + bb) + cc;
    }
}

