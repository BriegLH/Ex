package ex_intro;

public class TriBulleGlobal {
	
	public static void triBulleGlobal (int[][] tab) {
		for (int i = tab.length*tab[0].length-1; i > 0; i--) {
			Bulle.bulle(tab, i);
		}
	}
	
	public static int lire (int [][] tab, int i) {
		return tab[i/tab[0].length][i%tab[0].length];
	}
	
	public static void ecrire (int [][] tab, int i, int val) {
		tab[i/tab[0].length][i%tab[0].length] = val;
	}

}
