package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 60;
        aa = (45 * x) + (63 - y);
        while (i <= 0) {
            bb = (z * y) - 45;
        }
        i = (y * y) + 60;
        bb = (45 * z) + (x - 63);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 60;
        cc = (7 * y) + (y - x);
        while (i <= 0) {
            aa = z - 45;
        }
        return (aa + bb) + cc;
    }
}

