//Colin Gagich
//1224692
//October 5th 2013

//Alternate (Bonus) Solution to A1
package se2s03;

public class A1 {
    public int cases(int v, int u, int w) {
    	return (v <=3) ? ((u<=-5) ? ((w <=12) ? 7: 9) : ((w <=4) ? 10:1)) : ((w <=2) ? ((u<=9)?6:3) : ((u <=-6) ? 5:2));
    } 
}