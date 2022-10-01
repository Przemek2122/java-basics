package pl.edu.wszib.lab1;

import pl.edu.wszib.lab1.myabstract.MyAbstractClass;

public class MyExtenderClass extends MyAbstractClass
{
    @Override
    protected void Abstract()
    {
        MyProtected();
    }
}
