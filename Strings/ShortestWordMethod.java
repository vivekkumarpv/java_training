class ShortestWordMethod{
    static String shortestWord(String[]arr){
        String shortest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()<shortest.length()){
                    shortest=arr[i];
            }
        }return shortest;
    }
    public static void main(String[]args){
        String[] words1={"Car","Bike","Cycle"};
        String[] words2={"MsD","Virat","Sachim"};
        String[] words3={"Cricket","Football","Golf"};
        String shortest1= shortestWord(words1);
        String shortest2= shortestWord(words2);
        String shortest3= shortestWord(words3);
        System.out.println("Shortest word in first array "+shortest1);
        System.out.println("Shortest word in second array "+shortest2);
        System.out.println("Shortest word in third array "+shortest3);
    }
}