package arraypractice;

/**
 *
 * @author jfiore
 */
public class ArrayPractice {
  /* sets every item in A[] to initialValue */
  public static void initialize(int A[], int initialValue) {
    for(int i=0; i<A.length; i++){
      A[i] = initialValue;
    }
    return;
  }

  /* returns the average of the items in A
   * Be careful: A[] is an array of int and the method returns
   * double. What do we do to handle this? */
  public static double average(int A[]) {
    double sum = 0;
    double average = 0;
    for(int i=0; i<A.length; i++){
      sum += (double)A[i];
    }
    average = sum/A.length;

    return average;
  }

  /* returns the number of times that x appears in A[] */
  public static int numOccurrences(int A[], int x) {
    int counter = 0;
    for(int i=0; i<A.length; i++){
      if(A[i] == x){
        counter++;
      }
    }
    return counter;
  }


  /* returns the index of the first occurrence of
   * x in A[] or -1 if x doesn't exist in A[] */
  public static int find(int A[], int x) {
    for(int i=0; i<A.length; i++){
      if(A[i] == x){
        return i;
      }
    }
    return -1;
  }

  /* returns the index of the last occurrence of
   * x in A[] or -1 if x doesn't exist in A[] */
  public static int findLast(int A[], int x) {
    for(int i=0; i<A.length; i++){
      if(A[A.length-i-1] == x){
        return A.length-i-1;
      }
    }
    return -1;
  }

  /* returns the largest item found in A */
  public static int largest(int A[]) {
    int largest = A[0];
    for(int i=1; i<A.length; i++){
      if(A[i] > largest){
        largest = A[i];
      }
    }
    return largest;
  }

  /* returns the index of the largest item found in A */
  public static int indexOfLargest(int A[]) {
    int largest = A[0];
    int index = 0;
    for(int i=1; i<A.length; i++){
      if(A[i] > largest){
        largest = A[i];
        index = i;
      }
    }
    return index;
  }

  /* returns true if x is odd or false otherwise
   * add a JUnit test to test this method in the
   * file ArrayPracticeTest.java  */
  public static boolean isOdd(int x) {
    if(x%2 == 1)
      return true;
    return false;
  }
  
  /* returns the index of the largest odd number
   * in A[] or -1 if A[] contains no odd numbers
   *
   * include a call to your isOdd(int) method in
   * your solution */
  public static int indexOfLargestOdd(int A[]) {
    int largest = 0;
    int index = -1;
    for(int i=0; i<A.length; i++){
      if(isOdd(A[i]) == true){
        if(A[i] > largest){
          largest = A[i];
          index = i;
        }
      }
    }
    return index;
  }

  /* inserts n in-to A[] at A[index] shifting all */
  /* the previous items one place to the right. For example */
  /* if A is  */
  /*   |---+---+---+---+---+---+---+---+---+---| */
  /*   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | */
  /*   |---+---+---+---+---+---+---+---+---+---| */
  /*   | 5 | 7 | 6 | 9 | 4 | 3 | 0 | 0 | 0 | 0 | */
  /*   |---+---+---+---+---+---+---+---+---+---| */

  /*   and we call insert(A, 15, 1), A then becomes */

  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*   | 0 |  1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | */
  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*   | 5 | 15 | 7 | 6 | 9 | 4 | 3 | 0 | 0 | 0 | */
  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*  the element in A[] that's in the right-most */
  /*    position is removed.                      */
  /*                                              */
  /*  if index < 0 or index >= A.length-1, the method */
  /*                                    does nothing */
  public static void insert(int A[], int n, int index) {
    for(int i=A.length -2; i > index; i--){
      A[i] = A[i-1];
    }
    A[index] = n;
    return;
  }

  /* returns a new array consisting of all of the
   * elements of A[] followed by all of the
   * elements of B[]. For example, if 
   A[] is: {10,20,30} and 
   B[] is: {5, 9, 38}, the method returns the
   array : {10,20,30,5,9,38} */
  public static int[] copyAll(int A[], int B[]) {
    int arr[] = new int[A.length+B.length];
    for(int i=0; i<A.length; i++){
      arr[i] = A[i];
    }
    for(int i=0; i<B.length; i++){
      arr[i+A.length] = B[i];
    }
    return arr;
  }

  /* exchanges the elements found at A[i] and A[j].
   * Does nothing if i or j is invalid
   *
   * Add a JUnit test to test this method to the
   * file ArrayPracticeTest.java */
  public static void swap(int []A, int i, int j) {
    int temp;
    if(i < A.length-1 || j < A.length-1){
      temp = A[i];
      A[i] = A[j];
      A[j] = temp;
    }
  }
  
  /* reverses the order of the elements in A[].
   * For example, if A[] is:
   {10,20,30,40,50}, after the method, A[] would
   be {50,40,30,20,10}
   * 
   * use your swap() method in your solution
   *
   * Note that this method sorts the array "in place", i.e.,
   * the original array is changed. No new array is created.
   */
  public static void reverse(int A[]) {
      for(int i=0; i<A.length/2+1; i++){
        swap(A, i, A.length-1-i);
      }
      for(int i=0; i<A.length; i++){
        System.out.println(A[i]);
      }
    return;
  }
  
  /* returns the specified column from [][]A as a single-dimensional
   * array, or null if colNum is invalid.
   *
   * for example, if A is
   * |---+----+----+----+----|
   * |   |  0 |  1 |  2 |  3 |
   * |---+----+----+----+----|
   * | 0 | 10 | 20 | 30 | 40 |
   * | 1 | 11 | 21 | 31 | 41 |
   * | 2 | 12 | 22 | 32 | 42 |
   * |---+----+----+----+----|
   *
   * and colNum is 1, the array returned is:
   *
   * |----+----+----|
   * |  0 |  1 |  2 |
   * |----+----+----|
   * | 20 | 21 | 22 |
   * |----+----+----|
   *
   * Extra credit: add a JUnit test for this method
   * to the file ArrayPracticeTest.java
   */
  public static int[] getCol(int [][]A, int colNum) {
    return null;
  }
}
