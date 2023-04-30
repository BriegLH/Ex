package ex_intro;

public class Carre {
	public static int estcarre(int[][] tab) {
		if (tab.length == tab[0].length)
			return 1;
		else
			return 0;
	}
	
	public static int estcarremagique(int[][] tab) {
		if (Carre.estcarre(tab) != 1)
			return 0;
		else {
			for (int i = 0;i<tab.length*tab[0].length-1;i++) {
				int som = 0;
				som+=tab[i/tab.length][i%tab[0].length];
			}
		
			return 0;
		}
	}
}
