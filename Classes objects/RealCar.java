class Car{
    static int noOfWheels=4;
    String modelName;
    String regNum;
    String colour;
    
    public void start(){
        System.out.println("car started");
    }
    public void brake(){
        System.out.println("break applied");
    }
    public void printCarDetails(){
        System.out.println("Model name: "+modelName);
        System.out.println("Registration Number: "+regNum);
        System.out.println("Car Colour: "+colour);
        System.out.println("No. of wheels: "+noOfWheels);
    }
}
class RealCar{
    public static void main(String[]args){
        Car benz= new Car();
        benz.modelName="Benz S class";
        benz.regNum="KL 05 A 6666";
        benz.colour="black";
        benz.noOfWheels=4;
        benz.printCarDetails();
        System.out.println();
        Car tata= new Car();
        tata.modelName="Tata Nexon";
        tata.regNum="KL 05 A 2324";
        tata.colour="White";
        tata.noOfWheels=6;
        
        tata.printCarDetails();


    }
}