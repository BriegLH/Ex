package ex_intro;

public class Bulle {
	public static void bulle(int[][] tab, int n) {
		for (int i = 0;i<n;i++) {
			if (TriBulleGlobal.lire(tab, i) > TriBulleGlobal.lire(tab, i+1))
				Swap.swap(tab, i);
		}
	}
}
