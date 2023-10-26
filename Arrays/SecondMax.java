class SecondMax{
    public static void main (String[]args){
        int [] numbers={5,8,2,1,9};
        int max1=numbers[0];
        for(int num:numbers){
            if(num>max1){
                max1=num;
            }
        }
        int max2=numbers[0];
        for (int num:numbers){
            if(num>max2 && num<max1){
                max2=num;
            }
        }

        System.out.println("Second Highest number in the array is "+max2);
    }
}