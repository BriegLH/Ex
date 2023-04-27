package ex_intro;

public class Swap {
	public static int[] swap(int[] tab, int ind) {
		int mem = tab[ind];
		tab[ind] = tab[ind + 1];
		tab[ind + 1] = mem;
		return tab;
	}
	
	public static int [][] swap2(int[][] tab, int a, int b) {
		//System.out.println(tab[a][i]);
		int mem = tab[a][b];
		try {
			tab[a][b] = tab[a][b+1];
			tab[a][b+1] = mem;
			//System.out.println(tab[a][b]);
			//System.out.println(tab[a][b+1]);
		}
		catch (Exception e) {
			System.out.println("erreur d'indice");
			tab[a][b] = tab[a+1][0];
			tab[a+1][0] = mem;
			//System.out.println(tab[a][b]);
			//System.out.println(tab[a+1][0]);
		}
		return tab;
	}
}
