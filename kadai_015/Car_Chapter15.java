package kadai_015;

public class Car_Chapter15 {
	
	private int gear = 1;
	private int speed = 10;
	
	public void gearChange(int afterGear) {
		speed = switch (afterGear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
		};
		int beforeGear =gear;
		gear = afterGear;
		System.out.println("ギア" + beforeGear + "から" + gear + "に切り替えました");
		}
	
	public void run () {
		System.out.println("速度は時速" + speed + "kmです");
		
	}

}
