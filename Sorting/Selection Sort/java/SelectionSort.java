
public class SelectionSort {

  public static void sort(int[] array) {

    for (int i = 0; i < array.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[min] > array[j]) {
          min = j;
        }
      }

      // swap
      int temp = array[min];
      array[min] = array[i];
      array[i] = temp;
    }
  }

  public static void main(String[] args) {
    int[] array = { 5, 3, 8, 6, 2 };
    sort(array);
    System.out.print("Sorted array: ");
    for (int num : array) {
      System.out.print(num + " ");
    }
  }
}
