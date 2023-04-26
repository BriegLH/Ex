package ex_intro;

public class Bulle {
	public static void bulle(int [] tab, int n) {
		int max = Integer.MIN_VALUE;
		int indice = 0;
		for (int i = 0;i<n;i++) {
			if (tab[i] > max) {
				max = tab[i];
				indice = i;
			}
		}

		for (int i = indice;i<n-1;i++) {
			Swap.swap(tab, i);
		}
	}
}
