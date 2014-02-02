package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 81;
        aa = (2 * x) + (60 - y);
        while (i <= 0) {
            bb = (z * y) - 2;
        }
        i = (y * y) + 81;
        bb = (55 * z) + (x - 60);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 81;
        cc = (45 * y) + (y - x);
        while (i <= 0) {
            aa = z - 55;
        }
        return (aa + bb) + cc;
    }
}

