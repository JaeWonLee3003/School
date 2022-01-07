package diagram;

public class Creature {
	private int x;
	private int y;
	private int age;
	
	// getter, setter
    public int getX() {
    	return x;
    }
    public int getY() {
    	return y;
    }
    public int getage() {
    	return age;
    }
    public int setX(int x) {
    	this.x = x;
    }
    public int setY(int y) {
    	this.y = y;
    }
    public int setage(int age) {
    	this.age = age;
    }
    // 생성자
    
	// 필요 메서드
	public void age() {
		age++;
	}
	public abstract void attack(); 
	public void move(int x) {
		this.x += x;
	}
}
 