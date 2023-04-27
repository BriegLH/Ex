package ex_intro;

import java.util.Arrays;

public class TriBulle1 {
	public static void triBulle1(int[] tab) {
		int n = tab.length;
		for (int i = n; i > 0; i--) {
			//Bulle.bulle(tab, i);
		}
	}
	
	public static void triBulleLignes (int[][] tab){
		for (int [] elem : tab) {
			TriBulle1.triBulle1(elem);
		}
	}

}
