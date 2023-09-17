package HomeFigur;

public class main {
    public static void main(String[] args){
        double sumP = 0;
        double sumS = 0;
        Figura[] figura = new Figura[5];
        figura[0] = new Circle(3,0,0,0);
        figura[1] = new Triangle(0,3,4,5);
        figura[2] = new Rectangle(0,3,7,0);
        figura[3] = new Triangle(0,6,7,8);
        figura[4] = new Rectangle(0,9,9,0);

        for(int i=0; i<5;i++)
            sumP += figura[i].perimeter();
        System.out.println(" \n Сумма периметра всех фигур =" + sumP+ "\n");

        for(int i=0; i<5;i++)
            sumS += figura[i].square();
        System.out.println(" \nСумма площади всех фигур =" + sumS);
    }
}
