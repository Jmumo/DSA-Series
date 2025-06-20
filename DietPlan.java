    public static int dietPoints(int[] calories, int k, int lower, int upper) {
       int sum = 0;
       int counter = 0;
       
       for (int i = 0; i < k ; i ++){
           sum+= calories[i];
       }
       if (sum > upper) counter ++;
       else if (sum < lower) counter --;
       
       for (int i = k; i < calories.length; i ++){
           sum += calories[i] - calories[i-k];
       if (sum > upper) counter ++;
       else if (sum < lower) counter --;
       }
       
       return counter;
    }
