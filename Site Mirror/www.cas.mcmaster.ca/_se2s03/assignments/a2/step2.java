package se2s03;

public class a3 {
    
    public static int f3(int x, int y, int z) {
        int aa;
        int bb;
        int cc;
        
        int i = 87;
        
        i = (x * x) + 77;
        if (i > 0) {
            aa = (41 * x) + (44 - y);
        }
        else {
            bb = (z * y) - 41;
        }
        i = (y * y) + 77;
        if (i > 0) {
            bb = (64 * z) + (x - 44);
        }
        else {
            cc = (x * x) * z;
        }
        i = (z * z) + 77;
        if (i > 0) {
            cc = (48 * y) + (y - x);
        }
        else {
            aa = z - 64;
        }
        return (aa + bb) + cc;
    }
}

