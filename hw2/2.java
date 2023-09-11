public static int m2(double[] a) {
    int largest = 0;
    int i = 0; 
    while (i < a.length) {
        if (a[i] > a[largest]) {
            largest = i;
        }
        i++;
    }
    return largest;
}
