public class Solution {
  
  // use this method as a prototype for your answers...
  void soln1() {
    for (int i = 100; i>=5; i = i-5 ){
      System.out.println(i);
    }
  }
  
  void soln2() {
    for (int i = 100; i>=5; i = i-5 ){
    }
  }
  
  void soln3() {
    int sum = 0;
   for(int i = 9; i<=17; i++){
     sum+= i;
   }
    System.out.println(sum);
  }
  
  void soln4() {

    int[] array = {9, 5, 6, 3, 8 ,2, 4};
    int small = array[0];

    for ( int i = 0; i < array.length; i++){
      if(array[i] < small){
      small = array[i];
      }
    }
    System.out.println(small);
  }
  
  void soln5() {

    int[] array = {9, 5, 6, 3, 8 ,2, 4};
    int large = array[0];

    for ( int i = 0; i < array.length; i++){
      if(array[i] > large){
        large = array[i];
      }
    }
    System.out.println(large);

  }
  
  void soln6() {
  boolean[] array = {false, false, false, true, false};

  for (int i = 0; i <= array.length; i++){
    if(array[i]){
      System.out.println("index of " + i +" is true");
      break;
    }
  }

  }
  
  void soln7() {
    boolean[] array = {false, false, false, true, false};
    int i = 0;
    while(!array[i]){
      i++;
    }
    System.out.println("index of " + i +" is true");
  }
  
  void soln8() {

    int[] array = {9, 5, 6, 3, 8, 2, 4};

    for (int i = 0; i < array.length; i++ ){
      array[i] += 5;
    }

  }
  
  void soln9() {
    double[] array = {0.5, 1.4, 6.7, 123.4 -34.6};
    for (int i = 0; i < array.length; i++ ){
      array[i] /= 1.3;
    }

  }
  
  void soln10() {
    double[] array = {1.3, 5.4, 6.1, 1.0, 9.2};

    for (int i = 0; i < array.length; i++ ){
      array[i] = Math.pow(array[i], 3) - (array[i]/3);
    }

  }
  
  void soln11() {
    int[][] array = new int[4][6];
    for (int i = 0; i < 4; i++){
      for(int j = 0; j < 6; j++){
        array[i][j] = 0;
      }
    }
  }
  
  void soln12() {
    int[][] array = new int[4][6];
    for (int i = 0; i < 4; i++){
      for(int j = 0; j < 6; j++){
        array[i][j] = i*j*5;
      }
    }
  }
  
  void soln13() {
    boolean[][] boolArray = new boolean[5][5];

    for (int i = 1; i <= 5 ; i++){
      for(int j = 1; j <= 5; j++){
        if(( (j*i)%2 == 0)){
          boolArray[i][j] = true;
          System.out.println(true);
        }
        else boolArray[i][j] = false;
        System.out.println(false);
      }
    }

  }
  
  void double soln14(double value1, double value2
  ) {
  // and put your cod

    double output = Math.pow(value1,value2);
    return output;
  }
  
  void boolean soln15() {
  // and put your code here.
    boolean output = false;


    return
  }
  
  void soln16() {
  // and put your code here.

    if(Balance <= 1.0){
      System.out.println("Paid off");
    } else {
      System.out.format("%.2f", Balance);;
    }

  }
  
  void soln17() {
  // and put your code here.
    double temp = thermo.getTemp();
    boolean onOff = false;

    if (temp <72.0){
      onOff = true; //turn on
    } else if (temp > 72){
      onOff= false; //turn off
    }

  }
  
  void soln18() {
  // and put your code here.
    double[] array = new double[10];

    for (int i = 0; i < array.length; i++){
      if(array[i] > 3.14){
        System.out.println("At index " + i " ," + array[i] + " is greater than PI.");
      }
    }


  }
  
  void soln19() {
  // and put your code here.


  }
  
  void soln20() {
  // and put your code here.

  }
  
  void soln21() {

    String output = "";

    for (int i = 1; i <= 5; i++){
      for(int j = 1; j <= 5; j++){
        output += j*i;
      }
    }


  }
  
  void soln22() {
  // and put your code here.
    double hypotenuse;
    double width = 3;
    double length = 3;

    hypotenuse = Math.sqrt(Math.pow(width, 2) + Math.pow(length,2));

  }
  
}
