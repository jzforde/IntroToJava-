package intro;

public class ProjectorTester
{
	public static void main(String[] args)
	{
	 LightBulb b = new LightBulb(100, "Sylvania");
	 Projector p = new Projector("ViewSonic", b, 110, "1080p");
	 p.printSpecs();
	 }
}
