class Mammals
{
	public void mammals()
	{
		System.out.println("I AM A MAMMAL");		
	}

}

class MarineAnimal extends Mammals
{
	public void MarineAnimal()
	{
		System.out.println("I AM A MARINE ANIMAL");
	}
}

class BlueWhale extends MarineAnimal
{
	public void bluewhale()
	{
		System.out.println("I BELONG TO BOTH CLASSES : MARINE AS WELL AS ANIMALS");
		
	}
}
public class Mammal
{
	public static void main(String[] args)
	{
		Mammals mm = new Mammals();
		MarineAnimal ma = new MarineAnimal();
		BlueWhale bw = new BlueWhale();
		
		mm.mammals();
		ma.MarineAnimal();
		bw.bluewhale();
	}
}