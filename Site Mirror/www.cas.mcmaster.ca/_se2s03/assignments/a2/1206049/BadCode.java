package se2s03;

public class BadCode {
    public static int i;
    public static int aa;
    public static int bb;
    public static int cc;
    
    public static int f5(int x, int y, int z) {
        i = (x * x) + 78;
        aa = (38 * x) + (19 - y);
        while (i <= 0) {
            bb = (z * y) - 38;
        }
        i = (y * y) + 78;
        bb = (98 * z) + (x - 19);
        while (i <= 0) {
            cc = (x * x) * z;
        }
        i = (z * z) + 78;
        cc = (71 * y) + (y - x);
        while (i <= 0) {
            aa = z - 98;
        }
        return (aa + bb) + cc;
    }
}

