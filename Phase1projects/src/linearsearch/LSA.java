package linearsearch;

import java.util.Scanner;

public static length linearing(int arr[],int x) {

     int arrlength = arr.length;
    
    for (int i = 0; i < arrlength - 1; i++) {

        if (arr[i] == x) {

            return i;
        }
    
        else
            return -1;

        }
}
