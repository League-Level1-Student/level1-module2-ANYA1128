package extra;

public class Person {
private String name;
private String superpower;


String getName(){
	return name;
	
}
String getsuperPower() {
	return superpower;
}
void setName(String name) {
	this.name = name;
}
void setsuperPower(String superPower) {
	this.superpower = superpower;
}
public String toString () {
return name + " has mad " + superpower + " skills.";	
}
}
