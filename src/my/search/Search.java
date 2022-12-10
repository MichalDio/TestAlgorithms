package my.search;

import java.util.Arrays;

public class Search {

    public static void main(String[] args) {

        Search srch = new Search();
        int[] a = srch.fillArrayRandomly(10);
        int toSearch = a[2];

        System.out.println(Arrays.toString(a));


        //srch.linearSearch(a,a[100]);
        srch.binarySearch(a, toSearch);

        //System. out. println(139/7);


    }

    public int[] fillArrayRandomly(int a) {

        int aS[] = new int[a];

        for (int i = 0; i < aS.length; i++) {

            double r = Math.random();
            double r1 = Math.random();
            Double rd = new Double(r * a);
            Double rd1 = new Double(r1 * a);
            Double re = rd * rd1;
            int ri = re.intValue();
            //System. out. println(ri);
            aS[i] = ri;

        }

        Arrays.sort(aS);
        return aS;
    }

    public void linearSearch(int[] arr, int toSearch) {

        for (int i : arr) {
            //System.out.println(i);
            if (i == toSearch) {
                System.out.println("Nasel... " + i);
            }
        }

    }

    public void binarySearch(int[] arr, int toSearch) {
        System.out.println("hledam  " + toSearch);
        int pulka = 0;
        int top = arr.length;
        int bottom = 0;
        pulka = (top - bottom) / 2;
        System.out.println(pulka);
        int pVpulce = arr[pulka];

        while (toSearch != pVpulce) {
            System.out.println("-hodnota v pulce - pred zmenou" + pulka + " : " + pVpulce + "pro top: " + top + " a bottom: " + bottom);
            if (toSearch > pVpulce) {
                bottom = pulka - 1;
            } else {
                top = pulka + 1;
            }
            pulka = bottom + (top - bottom) / 2;

            pVpulce = arr[pulka];
            System.out.println("-hodnota v pulce - po zmene" + pulka + " : " + pVpulce + "pro top: " + top + " a bottom: " + bottom);

        }

    }
}



