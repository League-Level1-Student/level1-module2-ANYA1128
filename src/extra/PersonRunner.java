package extra;

public class PersonRunner {

public static void main(String[] args) {
	Person daisy = new Person();
	Person lincoln = new Person();
	Person me = new Person();
	daisy.setsuperPower("earthquake");
	lincoln.setsuperPower("electric");
	me.setsuperPower("flight");
	System.out.println(daisy.toString());
	System.out.println(lincoln.toString());
	System.out.println(me.toString());
	
}


}
