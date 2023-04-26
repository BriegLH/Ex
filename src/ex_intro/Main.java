package ex_intro;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ex 13
		//for (int elem : Gentab1.gentab1(10)) {
		//	System.out.println(elem);
		//}
		
		//Ex 14
		//int [][] tab2test = Gentab2.gentab2(3,5);
		//System.out.println(Arrays.deepToString(tab2test));
		
		//int [] tab = {1,2,3};
		//for (int elem : Swap.swap(tab, 0)) {
		//	System.out.println(elem);
		//}
		
		//Ex16
		
		int[] tabBulle = {2,7,0,5,3,1,9};
		/*
		System.out.println(Arrays.toString(tabBulle));
		Bulle.bulle(tabBulle, 4);
		System.out.println(Arrays.toString(tabBulle));
		*/
		
		//Ex 17
		
		System.out.println(Arrays.toString(tabBulle));
		TriBulle1.triBulle1(tabBulle);
		System.out.println(Arrays.toString(tabBulle));
		
	}

}
