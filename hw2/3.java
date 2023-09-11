public static int m3(double[] a, double x) {
    int count = 0;
    int i = 0;	
    while (i < a.length) {
        if (a[i] == x) {
            count++;
        }
	i++;
    }
    return count;
}