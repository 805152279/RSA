package suanfa;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;

public class test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
BigInteger a=new BigInteger("34952755414331878600499895477582873767");
//BigInteger b=new BigInteger("23552028988536636119548577502347950907");
//BigInteger c=new BigInteger("142084371602975116262194697063345015316");
System.out.println(String.valueOf(a));
try {
	String clearText = URLEncoder.encode("�㶼�����Ļ����Ļ��ٶȹ�����ذ�","GBK");
	
	System.out.println(clearText.length());
	System.out.println(clearText);
} catch (UnsupportedEncodingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


}}
