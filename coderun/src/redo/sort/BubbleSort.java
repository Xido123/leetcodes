package redo.sort;

public class BubbleSort {
  public int[] Bsort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          arr[i] = arr[i] ^ arr[j];
          arr[j] = arr[i] ^ arr[j];
          arr[i] = arr[i] ^ arr[j];
        }
      }
    }
    return new int[1];
    }
}
