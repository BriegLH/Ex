package ex_intro;

public class TriBulle1 {
	public static void triBulle1(int[] tab) {
		int n = tab.length;
		for (int i = n; i > 0; i--) {
			Bulle.bulle(tab, i);
		}
	}
}
