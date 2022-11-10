package com.example.restpractice.passEnc;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptPassword {
	 public static String encrypt(String rawPassword) {
		  try {
				MessageDigest md = MessageDigest.getInstance("SHA-256");
				byte[] messageDigest = md.digest(rawPassword.getBytes());
				BigInteger no = new BigInteger(1, messageDigest);
				String hashtext = no.toString(16);
				while (hashtext.length() < 32) {
					 hashtext = "0" + hashtext;
				}
				return hashtext;
		  } catch (NoSuchAlgorithmException e) {
				throw new RuntimeException(e);
		  }
	 }
}
