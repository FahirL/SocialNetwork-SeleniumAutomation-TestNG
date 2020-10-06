package main;

import java.util.Random;

public class RandomData {
	public static String getSaltString() {
        String SALTCHARS = "abcdefghijklmnoprstvuz";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

}
