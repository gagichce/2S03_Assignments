//Colin Gagich
//1224692
//October 5th 2013

//Alternate (Bonus) Solution to A1
package se2s03;

public class A1 {
    public int cases(int v, int u, int w) {
    	if (v <=3){
    		if (u <=-5){
    			if(w <= 12)
        			return 7;
        		return 9;
        	}
    		if (w <=4)
    			return 10;
    		return 1;
    	}
    	if ( w <=2){
    		if (u<=9)
    			return 6;
    		return 3;	
		}
    	if(u <=-6)
			return 5;
		return 2;
    } 
}