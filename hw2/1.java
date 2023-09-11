public static int m1(int[] a) {
    int sum = 0;
    int i = 0;	
    while (i < a.length)  {
        if (a[i] > i && a[i] % 9 == 0) {
            sum += a[i];
        }
        i++;
    }
    return sum;
}