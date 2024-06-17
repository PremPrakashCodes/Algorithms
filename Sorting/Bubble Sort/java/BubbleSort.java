
public class BubbleSort {

  static void sort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] array = { 5, 3, 8, 6, 2 };
    sort(array);
    System.out.println("Sorted array");
    for (int num : array) {
      System.out.print(num + " ");
    }
  }
}