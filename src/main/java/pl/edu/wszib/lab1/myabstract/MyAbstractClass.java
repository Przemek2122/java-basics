package pl.edu.wszib.lab1.myabstract;

public abstract class MyAbstractClass {
    protected String myProtectedField;

    protected void MyProtected()
    {
        System.out.println("myProtectedField = " + myProtectedField);
    }

    protected abstract void Abstract();

}
