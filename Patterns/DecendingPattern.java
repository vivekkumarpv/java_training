class DecendingPattern{
    // write a program to print a pattern
    //5 4 3 2 1
    //5 4 3 2
    //5 4 3
    //5 4
    //5
    public static void main(String[]args){
        int line=5;
        for(int row=5;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }System.out.println();
        }
    }
}