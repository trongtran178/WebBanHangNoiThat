package com.noithatchatluong.utils;

import org.mindrot.jbcrypt.BCrypt;

public class BCryptUtils {
	public static String hashPassword(String password) {
		String hash = BCrypt.hashpw(password, BCrypt.gensalt(12));
		return hash;
	}

	public static boolean checkPassword(String password, String hashed) {
		return BCrypt.checkpw(password, hashed);
	}
}
