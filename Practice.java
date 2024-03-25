public class Practice {
    public static void main(String[] args) {
        int[] arr = {1,4,8,2,6,-1,7,12,57,21,0,-1};
        selectionSort(arr);
    


        for(int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + " ");
        }


        
}

public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i ++) {
        int value = arr[i];
        int j = i-1;
        while (j >= 0 && arr[j] > value) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = value; 
    }
}

private static int findMinIndex(int[] arr, int start) {
    int minIndex = start;
    for (int i = minIndex; i < arr.length; i ++) {
        if (arr[minIndex] > arr[i]) {
            minIndex = i;
        }
    }

    return minIndex;
}

public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length; i ++) {
        int minIndex = findMinIndex(arr, i);
        if (minIndex != i) {
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            
        }
    }
}



public static int[] mergeSort(int[] a1, int[] a2) {
    int[] a3 = new int[a1.length + a2.length];
    int a1c = 0;
    int a2c = 0;
    int a3c = 0;
    while(a1c < a1.length && a2c < a2.length) {
        if (a1[a1c] <= a2[a2c]) {
            a3[a3c] = a1[a1c];
            a1c ++;
        } else {
            a3[a3c] = a2[a2c];
            a2c++;
        }
        a3c ++;
    }
    if (a1c < a1.length) {
        while(a1c < a1.length) {
            a3[a3c] = a1[a1c];
            a3c++;
            a1c++;
        }
    } else if (a2c < a2.length) {
        while(a2c <a2.length) {
            a3[a3c] = a2[a2c];
            a3c ++;
            a2c ++;
        }
    }

    return a3;
}


























// //Want to sort with sorted pile and unsorted pile
// public static void insertionSort(int[] arr) {
//     //loop through each element starting at first unsorted element, which is 1
//     //Set variable as the value at arr[i] to use as comparison, and move each element over as I sort
//     //Let j = i-1, to look at element to left of value, and work way down 
//     for (int i = 1; i < arr.length; i ++) {
//         int value = arr[i];
//         int j = i-1;
//         while(j >= 0 && arr[j] > value) {
//             arr[j+1] = arr[j];
//             j--;
//         }
//         arr[j+1] = value;
//     }
// }

// public static int findMinIndex(int[] arr, int start) {
//     int minIndex = start;
//     for(int i = start; i < arr.length; i ++) {
//         if(arr[i] < arr[minIndex]) {
//             minIndex = i;
//         }
//     }
//     return minIndex; 
// }

// public static void selectionSort(int[] arr) {
//     for (int i = 0; i < arr.length; i ++) {
//         int minIndex = findMinIndex(arr, i);
//         if(minIndex != i) {
//             int temp = arr[minIndex];
//             arr[minIndex] = arr[i];
//             arr[i] = temp;
//         }
//     }
// }






















// public static void selectionSort(int[] arr) {
//     for(int i = 0; i < arr.length; i ++) {
//         int minIndex = findMinIndex(arr, i);
//         System.out.println("Min index: " + minIndex);
//         if (minIndex != i) {
//             int temp = arr[minIndex];
//             arr[minIndex] = arr[i];
//             arr[i] = temp; 
//         }
//     }
// }

// public static int findMinIndex(int[] arr, int start) {
//     int minIndex = start;
//     for (int i = start; i < arr.length; i ++) {
//         if(arr[i] < arr[minIndex]) {
//             minIndex = i;
//         }
//     }
//     return minIndex;
// }



public static int linearSearch(int[] arr, int target) {
    int index = -1;
    for (int i = 0; i < arr.length; i ++) {
        if (arr[i] == target) {
            index = i;
        }
    }
    return index;
}

public static int binarySearch(int[] arr, int target) {
    int index = -1;
    int hi = arr.length;
    int lo = 0;
    int mid = (hi+lo)/2;
    
    while(index < 0 && hi > lo) {
        if(arr[mid] == target) {
            index = mid;
        } else if (target > arr[mid]) {
            lo = mid+1;
        } else {
            hi = mid;
        }
        mid = (hi+lo)/2;
    }
    return index;
}
}