
public class SeaCreatureRuynner {
public static void main(String[] args) {
	// 1. In a Runner class, make a SeaCreature called “Spongebob”. 
	//Use the methods below to make him eat, and laugh.
		// 2. Make Patrick and Squidward and print their name, 
	//have them eat, and make them laugh.
	SeaCreature Spongebob = new SeaCreature("spongebob");
	System.out.println(Spongebob.getName());
	Spongebob.eat();
	Spongebob.laugh();
	SeaCreature Patrick = new SeaCreature("patrick");
	System.out.println(Patrick.getName());
	Patrick.eat();
	Patrick.laugh();
	SeaCreature Squidward = new SeaCreature("squidward");
	System.out.println(Squidward.getName());
	Squidward.eat();
	Squidward.laugh();
	
	
}

}

