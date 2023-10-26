class MixedPattern{
    public static void main (String[]args){
        int line=4;
        for(int row=0;row<=line;row++){
            for (int col=0;col<=row;col++){
                if(row%2==0){
                    System.out.print("*\t");
                }else{
                    System.out.print("#\t");
                }
                
            }System.out.println();
        }
    }
}