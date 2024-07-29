package abstraction.interfaces;

public class PDF implements Document
{
    @Override
    public void show()
    {
        System.out.println("showing PDF content");
    }
}
