package assignment;

// Implement of Global Edit Distance
public class GlobalEdit {
	private int m = 1;
	private int i = -1;
	private int r = -1;
	private int d = -1;
	public int distance(String str1, String str2) {
		int length1 = str1.length();
		int length2 = str2.length();
		int j,k;
		int a[][] = new int[length2+1][length1+1];
		a[0][0] = 0;
		for (k = 1; k < length1 + 1; k++) {
			a[0][k] = k * d;
		}
		for (j = 1; j < length2 + 1; j++) {
			a[j][0] = j * i;
		}
		for (j = 1; j < length2 + 1; j++) {
			for (k = 1; k < length1 + 1; k++) {
				a[j][k] = max(a[j][k-1] + d, a[j-1][k] + i, a[j-1][k-1] + equal(str1.charAt(k-1), str2.charAt(j-1)));
			}
		}
		return a[length2][length1];
	}
	
	public int equal(char c1, char c2) {
		if (c1 == c2) {
			return m;
		}
		else return r;
	}
	
	public int max(int i1, int i2, int i3) {
		int x = i1>i2?i1:i2;
		return x>i3?x:i3;
	}
}
