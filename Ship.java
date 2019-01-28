package library;

import java.util.ArrayList;

public class Ship {
private ArrayList<String> locateShip = new ArrayList<>();
private String name;
public void setName(String string) {
	name = string;
}
public void setLocateShip(ArrayList<String> loc)
{ locateShip = loc;	}
public String check(String userInput)
{String result = "miss";
int index = locateShip.indexOf(userInput);
if (index >=0) {
	locateShip.remove(index);
	if (locateShip.isEmpty())
		return "kill";
	else return "hit";
}
return result;
}
}
