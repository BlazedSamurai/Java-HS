public class Koala extends Animal
{
    private String breed;

    public Koala(String name, char gender, int yob, String breed)
    {
        super(name, gender, yob);
        this.breed = breed;
    }

    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public void eat()
    {
        System.out.println("Nom Nom");
    }

    public void talk()
    {
        System.out.println("YEET");
    }

    public void chase()
    {
        System.out.println(super.getName() + " is chasing ala bamboo");
    }

    @Override
    public String toString()
    {
        return super.toString() + "\tbreed: " + breed;
    }
}
