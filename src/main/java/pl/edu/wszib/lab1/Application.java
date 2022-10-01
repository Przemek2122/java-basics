package pl.edu.wszib.lab1;

import pl.edu.wszib.koktajl.KoktajlTruskawkowy;

public class Application
{
    public static void main(String[] args)
    {
        System.out.println("main");

        MyFirstClass firstClass = new MyFirstClass();

        firstClass.run1();
        firstClass.run2();

        firstClass.firstField2 = "FFFF";

        System.out.println(firstClass.firstField2);

        MyExtenderClass myExtenderClass = new MyExtenderClass();

        myExtenderClass.Abstract();

        KoktajlTruskawkowy koktajlTruskawkowy = new KoktajlTruskawkowy();

        koktajlTruskawkowy.Smak();
    }
}
