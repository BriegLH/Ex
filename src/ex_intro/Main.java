package ex_intro;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ex 13
		// for (int elem : Gentab1.gentab1(10)) {
		// System.out.println(elem);
		// }

		// Ex 14
		// int [][] tab2test = Gentab2.gentab2(3,5);
		// System.out.println(Arrays.deepToString(tab2test));

		// int [] tab = {1,2,3};
		// for (int elem : Swap.swap(tab, 0)) {
		// System.out.println(elem);
		// }

		// Ex16

		//int[] tabBulle = { 2, 7, 0, 5, 3, 1, 9 };
		/*
		 * System.out.println(Arrays.toString(tabBulle)); Bulle.bulle(tabBulle, 4);
		 * System.out.println(Arrays.toString(tabBulle));
		 */

		// Ex 17
		/*
		System.out.println("avant : " + Arrays.toString(tabBulle));
		TriBulle1.triBulle1(tabBulle);
		System.out.println("après : " + Arrays.toString(tabBulle));
		*/
		/*
		int [][] tab2Test = Gentab2.gentab2(3, 5);
		System.out.println(Arrays.deepToString(tab2Test));
		TriBulle1.triBulleLignes(tab2Test);
		System.out.println(Arrays.deepToString(tab2Test));
		*/
		int [][] tab2Test = Gentab2.gentab2(2, 3);
		System.out.println(Arrays.deepToString(tab2Test));
		
		//System.out.println(Arrays.deepToString(tab2Test));
		//System.out.println(tab2Test.length*tab2Test[0].length-1);
		//System.out.println(tab2Test.length);
		//System.out.println(tab2Test[0].length-1);
		//TriBulleGlobal.lire(tab2Test, 4);
		//System.out.println(TriBulleGlobal.lire(tab2Test, 4));
		
		TriBulleGlobal.triBulleGlobal(tab2Test);
		System.out.println(Arrays.deepToString(tab2Test));
	}

}
