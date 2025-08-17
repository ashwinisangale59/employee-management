package aarrays;

public class CommonElementsTwoArrays {
	public static void main(String[] args) {
		// 20.Find common elements in two arrays
		int[] a = { 12, 23, 44, 66, 76 };
		int[] b = { 12, 90, 44, 88, 76 };
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}
}
