package Central;

import java.util.Scanner;

public class Rectangulo {

    private double base;
    private double height;

    public Rectangulo(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setheight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getheight() {
        return height;
    }

    public Rectangulo() {
    }

    public void CreateRectangulo(){
        Scanner datobase = new Scanner(System.in);
        System.out.println("Enter de base of the rect");
        setBase(this.base = datobase.nextDouble());
        System.out.println("enter altura height of rect ");
        setheight(this.height = datobase.nextDouble());

        System.out.println("the base of the rectangulo se " + getBase());
        System.out.println("the height of the rectangulo se " + getheight());

    }


    public void CalSuperficie(){
        double superficie = this.base * this.height;
        System.out.println("the superficie of rectangulo's: " + superficie);
    }

    public void CalParaametro() {
        double parametro = (this.base * this.height) * 2;
        System.out.println("the parametro of rectanculo's: " +parametro);
    }

}
