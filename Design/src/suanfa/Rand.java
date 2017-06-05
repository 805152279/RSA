package suanfa;

import java.math.BigInteger;
import java.util.Random;

public class Rand {
	public BigInteger eee(String fn){
		Random r=new Random();
		   int a=r.nextInt(1000);
		   BigInteger j=new BigInteger(fn);
		   BigInteger aa=new BigInteger(String.valueOf(a));
			BigInteger th=new BigInteger("1000");
			BigInteger e=j.multiply(aa).divide(th);
			return e;		
	}
}
