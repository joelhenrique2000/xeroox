package xeroox.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class Hash {
	public static String gerarHash() {
		  try {
			  Random gerador = new Random();
			  String s=""+gerador.nextInt(100);
			  MessageDigest m = MessageDigest.getInstance("MD5");
			  
			    m.update( s.getBytes(), 0 , s.length() );
			              
			    byte[] digest = m.digest();
			          
			    String hexa = new BigInteger(1,digest).toString(16);
			    
			    return hexa.substring(0, 2) + hexa.substring(3, 5) + hexa.substring(10, 12);
			  
		  } catch (NoSuchAlgorithmException e) {
			  return null;
		  }
		}
}
