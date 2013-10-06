
package se2s03;

public class A1 {
    public int cases(int v, int u, int w) {
    	if (v <=[[VL]]){
    		if (u <=[[U2L]]){
    			if(w <= [[W3L]])
        			return [[0]];
        		return [[1]];
        	}
    		if (w <=[[W2L]])
    			return [[2]];
    		return [[3]];
    	}
    	if ( w <=[[W1L]]){
    		if (u<=[[U3L]])
    			return [[4]];
    		return [[5]];	
		}
    	if(u <=[[U1L]])
			return [[6]];
		return [[7]];
    } 
}