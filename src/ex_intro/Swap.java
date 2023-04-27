package ex_intro;

public class Swap {
	public static void swap(int[][] tab, int i) {
		int mem = TriBulleGlobal.lire(tab, i);
		TriBulleGlobal.ecrire(tab, i, TriBulleGlobal.lire(tab, i+1));
		TriBulleGlobal.ecrire(tab, i+1, mem);
	}
}
