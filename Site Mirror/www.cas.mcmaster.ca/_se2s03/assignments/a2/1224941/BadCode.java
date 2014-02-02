package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 20;
        aa = (29 * x) + (90 - y);
        while (i <= 0) {
            bb = (z * y) - 29;
        }
        i = (y * y) + 20;
        bb = (60 * z) + (x - 90);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 20;
        cc = (56 * y) + (y - x);
        while (i <= 0) {
            aa = z - 60;
        }
        return (aa + bb) + cc;
    }
}

