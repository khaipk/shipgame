package library;

import java.util.ArrayList;

public class FireShip {
private GameHelper helper = new GameHelper();
private ArrayList<Ship> shiplist = new ArrayList<Ship>();
private int shots=0;

private void setUp(){
	Ship one = new Ship();
	one.setName("Đại Đế");
	Ship two = new Ship();
	two.setName("Công Chúa");
	Ship three = new Ship();
	three.setName("Hoàng tử");
shiplist.add(one);shiplist.add(two);shiplist.add(three);

System.out.println("Hãy bắn nổ 3 chiến tàu: Đại Đế, Hoàng tử và Công chúa!");
System.out.println("Cố gắng hoàn thành với số lần bắn ít nhất!");
for (Ship ShipSet : shiplist) {
	ArrayList<String> newLocation = helper.placeShip(3);
	ShipSet.setLocateShip(newLocation);
}
}
private void startGame() {
	while (!shiplist.isEmpty()) {
		String userGuess = helper.getUserInput("Enter a guess");
				checkUserGuess(userGuess);
	}
	finishGame();
}
private void checkUserGuess(String userGuess) {
	shots++;
	String result = "miss";
	for (Ship shipToTest: shiplist) {
		result = shipToTest.check(userGuess);
		if (result.equals("hit")) {
		break;
		}
		if (result.equals("kill")) {
			shiplist.remove(shipToTest);
			break;
		}
	}
	System.out.println(result);
}
private void finishGame() {
	System.out.println("Đã bắn hết tàu địch!");
	System.out.println("Bạn đã dùng "+shots+" phát bắn.");
}
public static void main(String[] args) {
	FireShip game = new FireShip();
	game.setUp();
	game.startGame();
}
}
