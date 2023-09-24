package HomeWork9;

class Dog{
    private Dog(){
    }
    public void eat(String food){
        if(food.equals("meat")){
            System.out.println("love meat");
        }else {
            System.out.println("no eat grass");
        }
    }
public void voice(){
        System.out.println("Gav Gav");
}
public static Dog createDog(){
        return new Dog();
}
    }
