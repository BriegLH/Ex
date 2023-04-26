package ex_intro;

public class Gentab1 {
	public static int[] gentab1 (int nbCases) {
		int[] tab = new int[nbCases];
		for (int i = 0; i<nbCases;i++) {
			tab[i] = (int)(Math.random() * 100);
		}
		return tab;
	}
}
