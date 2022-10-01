package pl.edu.wszib.lab1;

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
    }
}
