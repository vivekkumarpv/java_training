class NumberPattern{
    public static void main (String[]args){
        int line=5;
        for(int row=0;row<=line;row++){
            for (int col=0;col<row;col++){
                if((row%2==0 && col%2==0)||(row%2!=0 && col%2!=0)){
                    System.out.print(0+"\t");
                }else{
                    System.out.print(1+"\t");
                }
            }System.out.println();
        }
    }
}