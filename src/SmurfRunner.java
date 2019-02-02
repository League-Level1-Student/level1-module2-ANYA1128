
public class SmurfRunner {
	public static void main(String[] args) {
		Smurf handySmurf = new Smurf("HandySmurf");
		handySmurf.eat();
		System.out.println(handySmurf.getName());
		Smurf papaSmurf = new Smurf("PapaSmurf");
		System.out.println(papaSmurf.getName());
		System.out.println(papaSmurf.getHatColor());
		System.out.println(papaSmurf.isGirlOrBoy());
		Smurf Smurfette = new Smurf("Smurfette");
		System.out.println(Smurfette.getName());
		System.out.println(Smurfette.getHatColor());
		System.out.println(Smurfette.isGirlOrBoy());

	}

}
