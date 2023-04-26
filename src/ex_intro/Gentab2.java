package ex_intro;

public class Gentab2 {
	public static int[][] gentab2(int nb1, int nb2) {
		int[][] tab2 = new int[nb1][nb2];
		for (int i = 0; i < nb1; i++) {
			for (int j = 0; j < nb2; j++) {
				tab2[i][j] = (int) (Math.random() * 100);
			}
		}
		return tab2;
	}
}
