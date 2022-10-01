package pl.edu.wszib.koktajl;

public abstract class Koktajl implements Jadalne, Pitne
{
    @Override
    public void Jedz()
    {
        Pij();
    }
}
