#include <iostream>
using namespace std;

void sort(int array[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                swap(array[j], array[j + 1]);
            }
        }
    }
}

void printArray(int array[], int n) {
    for (int i = 0; i < n; i++) {
        cout << array[i] << " ";
    }
    cout << endl;
}

int main() {
    int array[] = {5, 3, 8, 6, 2};    
    int n = sizeof(array) / sizeof(array[0]);
    
    sort(array, n);

    cout << "Sorted array: ";
    printArray(array, n);
    
    return 0;
}
