import java.util.Random;
import java.util.Arrays;

class Stats {
	
	public static void main(String[] args) {
		Random n = new Random();
		int [] a = new int [3 + (int)(Math.random()*7)];
		for (int i = 0; i < a.length; i++) {
			a [i] = -50 + (int)(Math.random()*100); 
		}
		Arrays.sort(a);
		System.out.println("Original Array\n");
		printArray(a);
		System.out.println();
		System.out.println("Test\n");
		System.out.println(upperQuartile(a));
	// 	printArray(a);
	}

	// public static int[] sort(int[] a) {
	// 	int [] b = new int [a.length];
	// 	int max = 0;
	// 	for (int j = 0; j < a.length; j++) {
	// 		for (int i = 0; i < a.length; i++) {
	// 			if (j == 0) {
	// 				b[0] = min(a);
	// 				max = b[0];
	// 			} else {
	// 				if (b[j-1] < a[j] && a[j] < max) {
	// 					b[j] = a[j];
	// 				}
	// 			}
	// 		}
	// 	}
	// 	return b;			
	// }

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static int max(int[] a) {
		int max = a[0];
		for (int i = 0; i< a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static int min(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	public static double mean(int[] a) {
		double mean = 0.0;
		for (int i = 0; i < a.length; i++) {
			mean = mean + a[i];
		}
		return (mean / (a.length));
	}

	public static double median(int[] a) {
		double median = 0.0;
		if (a.length % 2 == 0) {
			median = (((double)a[a.length/2] + (double)a[a.length/2 - 1]) / 2.0);
		} else {
			median = (a[a.length/2]);
		}
		return median;
	}

	public static double lowerQuartile(int[] a) {
		double median = 0.0;
		if (a.length % 2 == 0) {
			median = ((double)a[a.length/4] + (double)a[a.length/4 - 1]) / 2.0;
		} else {
			median = a[a.length/4];
		}
		return median;
	}

	public static double upperQuartile(int[] a) {
		double median = 0.0;
		if (a.length % 2 == 0) {
			median = ((double)a[a.length/4 + (a.length/2)] + (double)a[(a.length/4 - 1) + (a.length/2)]) / 2.0;
		} else {
			median = a[a.length/4 + (a.length/2)];
		}
		return median;
	}

}