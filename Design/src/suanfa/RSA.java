package suanfa;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
public class RSA{
  
	BigInteger n;
	BigInteger fn;
	BigInteger e1 ;
	BigInteger d;

public String encrypt(String clearText) {

	
String secretText = new String();
try {
clearText = URLEncoder.encode(clearText,"GBK"); 
byte text[]=clearText.getBytes("GBK");//将字符串转换成byte类型数组，实质是各个字符的二进制形式

BigInteger mm=new BigInteger(text);//二进制串转换为一个大整数
clearText = mm.toString();
BigInteger e = e1;
byte[] ptext = clearText.getBytes("UTF8"); // 获取明文的大整数
BigInteger m = new BigInteger(ptext);

BigInteger c = m.modPow(e, n);

secretText = c.toString();
} catch (UnsupportedEncodingException ex) {
Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
}
return secretText;
}

public void setN(BigInteger n) {
	this.n = n;
}

public void setFn(BigInteger fn) {
	this.fn = fn;
}

public BigInteger n1(String s1,String s2){
	Sushu obj=new Sushu();	
	n=obj.multiply(s1, s2);
	return n;
}	

public BigInteger n2(String s1,String s2){
	Sushu obj=new Sushu();	
	BigInteger a=new BigInteger(s1);
	BigInteger b=new BigInteger(s2);
	fn=obj.multiply(a.subtract(BigInteger.ONE),b.subtract(BigInteger.ONE));
	return fn;
}

public BigInteger ee(String str){
	BigInteger a=new BigInteger(str);
	Rand ran=new Rand();
	e1= ran.eee(String.valueOf(a));
	while(true){
		BigInteger g=fn.gcd(e1);
		int t=g.compareTo(BigInteger.ONE);
		if(t==0){	
			break;			
		}
		else{
			e1= e1.add(new BigInteger("1"));
			
		}
		
	}
	Niyuan tt=new Niyuan();
	d=tt.extendEuclid(a,e1);
	return e1;	
}

public BigInteger getE1() {
	return e1;
}

public void setE1(BigInteger e1) {
	this.e1 = e1;
}

public BigInteger getD() {
	return d;
}

public String decrypt(String secretText) {
	
	
	
StringBuffer clearTextBuffer = new StringBuffer();


BigInteger c = new BigInteger(secretText);
BigInteger m = c.modPow(d, n);// 解密明文
byte[] mt = m.toByteArray();// 计算明文对应的字符串并输出

for (int i = 0; i < mt.length; i++) {
clearTextBuffer.append((char) mt[i]);
}
String temp = clearTextBuffer.toString();//temp为明文的字符串形式
BigInteger b = new BigInteger(temp);//b为明文的BigInteger类型
byte[] mt1=b.toByteArray();

try {
String clearText = (new String(mt1,"GBK"));
clearText=URLDecoder.decode(clearText,"GBK"); 
return clearText;
} catch (UnsupportedEncodingException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

return null;
}

public void setD(BigInteger d) {
	this.d = d;
}


}