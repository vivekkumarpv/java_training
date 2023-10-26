class MaxOfArray{
    public static void main (String[]args){
        int [] numbers={5,8,2,1,9};
        int max=numbers[0];
        for(int num:numbers){
            if(num>max){
                max=num;
            }
        }System.out.println("Highest number in the array is "+max);
    }
}