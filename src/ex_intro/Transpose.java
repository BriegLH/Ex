package ex_intro;

public class Transpose {
	public static int[][] transpose (int[][] tab){
		int[][] tr = new int[tab[0].length][tab.length];
		for (int i = 0;i<tab[0].length;i++) {
			for (int j = 0;j<tab.length;j++){
				tr[i][j] = tab[j][i];
			}
		}
		return tr;
	}
}
