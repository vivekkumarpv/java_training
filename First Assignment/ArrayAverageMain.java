class ArrayAverageMain{
    public static void main(String[]args){
        ArrayAverage obj=new ArrayAverage();
        //int [] arr= new int[10000];
        //arr=obj.getArrayValues();
        String result=obj.findAverage(obj.getArrayValues());
        System.out.println(result);
    }
}