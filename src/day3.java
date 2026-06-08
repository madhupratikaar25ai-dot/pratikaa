void main() {
    /*
    int n=5;
    //row loop
    for(int row=1;row<=n;row++){
        //column loop
        for(int column=1;column<=row;column++) {
            System.out.print(column);
        }
        System.out.println();
        }

     */


    int[] arr = {87, 32, 44, 89, 32};
    System.out.println(arr[0]);
    System.out.print("PAss mark:");
    for (int i = 0; i <= 4; i++) {
      int val = arr[i];
      if (val >= 40) {
          System.out.print(val+ ", ");
      }
    }
    System.out.print("\nFail mark: ");
    for (int i = 0; i <= 4; i++) {
        int val = arr[i];
        if (val < 40) {
            System.out.print(val +", " );
        }
    }
}

