package suanfa;

import java.math.BigInteger;

public class Niyuan {

	public BigInteger extendEuclid(BigInteger a, BigInteger e1){  //e1为mod后面的数
	      
	     
		BigInteger ee=a;
	    BigInteger x1=new BigInteger("1");
	    BigInteger x2=new BigInteger("0");
	    BigInteger x3=a;
	    BigInteger y1=new BigInteger("0");
	    BigInteger y2=new BigInteger("1");
	    BigInteger y3=e1;
	    BigInteger D=new BigInteger("0");
	    BigInteger q=new BigInteger("0");
	    BigInteger t1=new BigInteger("1");
	    BigInteger t2=new BigInteger("1");
	    BigInteger t3=new BigInteger("1");
	  
	    while(true){  
	    	int t=y3.compareTo(BigInteger.ONE);
	 	    int u=y3.compareTo(BigInteger.ZERO);
	        if(t==0){  
	            D = y2;  
	            break;  
	        }  
	        if(u == 0){  
	            D = y2;  
	            break;  
	        }  
	        q=x3.divide(y3);
	        t1 = x1.subtract(q.multiply(y1)) ;  
	        t2 = x2.subtract(q.multiply(y2));  
	        t3 = x3.subtract(q.multiply(y3));  
	          
	        x1 = y1;  
	        x2 = y2;  
	        x3 = y3;  
	          
	        y1 = t1;  
	        y2 = t2;  
	        y3 = t3;  
	    }  
	    int o=D.compareTo(BigInteger.ZERO);
	    return o<0?(ee.add(D)):D;  
	}
		
	
	public int extendEuclid1(int e, int modValue){  
	      
	    int D = 0;  
	    int x1, x2, x3, y1, y2, y3, t1, t2, t3;  
	      
	    x1 = y2 = 1;  
	    x2 = y1= 0;  
	    x3 = e;  
	    y3 = modValue;  
	      
	    int q = 0;  
	    while(true){  
	        if(y3 == 1){  
	            D = y2;  
	            break;  
	        }  
	        if(y3 == 0){  
	            D = y2;  
	            break;  
	        }  
	    
	        q = x3 / y3;  
	          
	        t1 = x1 - q*y1;  
	        t2 = x2 - q*y2;  
	        t3 = x3 - q*y3;  
	          
	        x1 = y1;  
	        x2 = y2;  
	        x3 = y3;  
	          
	        y1 = t1;  
	        y2 = t2;  
	        y3 = t3;  
	    }  
	    return D<0?e+D:D;  
	}
	
}
