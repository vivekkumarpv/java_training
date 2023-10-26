class Pattern{
    public static void main (String[]args){
        int line=5;
        for(int row=0;row<=line;row++){
            for (int col=0;col<=row;col++){
                System.out.print("$\t");
            }System.out.println();
        }
    }
}