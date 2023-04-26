package ex_intro;

public class Swap {
	public static int[] swap(int[] tab, int ind) {
		int mem = tab[ind];
		tab[ind] = tab[ind+1];
		tab[ind+1] = mem;
		return tab;
	}
}
