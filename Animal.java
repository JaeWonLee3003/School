package diagram;

public class Animal extends Creature{
   
	public Animal(int x,int y,int age) {
		super(x,y,age);
	}
	@Override
	public void attack() {
		System.out.println("¡º¸öÅë ¹ÚÄ¡±â!¡»");
	}
}
