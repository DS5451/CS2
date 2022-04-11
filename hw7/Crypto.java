package hw7;

import java.util.Random;

public class Crypto {
	private int[] ShuffleIndex;
	private static Random rn;
	
	public Crypto() {
		ShuffleIndex = new int[1000];
		
	}
	public String encrypt(String s) {
		ShuffleIndex = new int[s.length()];
		
		for(int i =0; i<s.length()-2; i++) {
			
		}
		return"";
		
	}
	public String decrypt(String s) {
		return"";
	}
	private static int limitedRand(int max) {
		return 0;
	}
	private void randomShuffle(int n) {
		
	}
	private void clear() {
		for (int i = 0; i<ShuffleIndex.length; i++) {
			ShuffleIndex[i]=0;
		}
		
	}
}

