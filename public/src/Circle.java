import java.util.Scanner;

public class Circle {
    double rediusInMn;

    Circle(double rediusInMn){
        this.rediusInMn = rediusInMn;
    }
    double getCircumference(){
        return 2*rediusInMn*Math.PI;
    }

    double getArea (){
        return  Math.PI*Math.pow(rediusInMn,2);
    }

    @Override
    public String toString() {
        return "Circle props : Redius in mm :"+rediusInMn
                +" ,  Circumference in mm :"+getCircumference()
                +" , areain mn " + getArea();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to circular world :");
        System.out.println("please inter a redius ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.print(circle.getArea());
    }
}
