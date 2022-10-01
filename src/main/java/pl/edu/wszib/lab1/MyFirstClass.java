package pl.edu.wszib.lab1;

public class MyFirstClass implements MyFirstInterface, MySecondInterface
{
    private String firstField;
    String firstField2;

    @Override
    public void run1()
    {
        System.out.println("firstField = " + firstField);
    }

    @Override
    public void run2()
    {
        System.out.println("run2");
    }
}
