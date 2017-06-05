package suanfa;

import java.math.BigInteger;
import java.util.Random;

public class Sushu {

	public BigInteger jisuan(){
		Random rnd=new Random();
		return (BigInteger.probablePrime(1024, rnd));
		
	}
	
	public BigInteger multiply (String a,String b){    
        BigInteger bigX = new BigInteger(a);   
        BigInteger bigY = new BigInteger(b);   	           
        BigInteger bigXY = bigX.multiply(bigY);   	  
        return bigXY;
    }

	public BigInteger multiply(BigInteger a, BigInteger b) {
		BigInteger bigX=a;
		BigInteger bigY=b;		
		BigInteger bigXY = bigX.multiply(bigY);   	  
	        return bigXY;
	}
}
