package library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
private static final String alphabet = "abcdefg";
private int gridLengh = 7;
private int gridSize= 49;
private int [] grid = new int[gridSize];
private int shipCount = 0;

public String getUserInput(String prompt) {
	String inputLine=null;
	System.out.println(prompt +" ");
	try {BufferedReader is = new BufferedReader(
			new InputStreamReader(System.in));
	inputLine=is.readLine();
	if (inputLine.length() ==0) return null;}
		catch (IOException e) {
	
	}
	return inputLine.toLowerCase();
}
public ArrayList<String> placeShip(int size){
	ArrayList<String> alphaCells = new ArrayList<String>();
	String temp = null;
	int [] coords = new int[size];
	int attempts=0;
	boolean success= false;
	int location = 0;
	shipCount++;
	int incr=1;
	if ((shipCount%2)==1){
		incr = gridLengh;
	}
	while (!success & attempts++ <200) {
		location = (int)(Math.random()* gridSize);
		System.out.println(location);
		int x=0;
		success=true;
		while(success && x < size) {
			if(grid [location]==0){
				coords[x++] = location;
				location +=incr;
				if (location >= gridSize) {
					success= false;}
				if (x>0 && (location % gridLengh) ==0) {
					success= false;}
				}
			else {
				success = false;
			}
		}
	}
	int x=0;
	int row=0;
	int colum=0;
	while (x<size) {
		grid[coords[x]]=1;
		row = (int)(coords[x]/gridLengh);
		temp=String.valueOf(alphabet.charAt(colum));
		alphaCells.add(temp.concat(Integer.toString(row)));
		x++;
	}
	return alphaCells;
}
}
