import java.util.*;
public class kthElement {
  int partition (int [] data, int start, int end){
    int pivotIndex = new Random().nextInt(data.length) + start;
    int temp = data[start];
    data[start] = data[pivotIndex];
    data[pivotIndex] = temp;
    int pivot = data[pivotIndex];
    start++;
    while (end >= start) {
      if (data[start] > pivot) {
        temp = data[pivotIndex];
        data[pivotIndex] = data[end];
        data[end] = temp;
        end--;
      }
      else if (data[start] < pivot) {
        temp = data[pivotIndex];
        data[pivotIndex] = data[start];
        data[start] = temp;
        start++; pivotIndex++;
      }
      else if (data[start] == pivot) {
        start++;
      }
    }
    return pivotIndex;
  }
}
