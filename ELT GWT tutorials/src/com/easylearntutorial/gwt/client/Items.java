package com.easylearntutorial.gwt.client;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import com.easylearntutorial.gwt.client.*;
import com.google.gwt.user.client.ui.Image;


public class Items {
	private List<Item> ITEMS;
	public Items(){
		//default constructor
		this.ITEMS = Arrays.asList();
		
	}
	public void addItem(int itemNum, String name, String description, String type, int boxNum, Image image){
		ITEMS.add(new Item(name, description, type, itemNum, boxNum, image));
		
	}
	public void removeItem_byIndex(int index){
		ITEMS.remove(index);
	}
	private void removeItem_byItemID(int itemID){
		//TODO: If need complete this method
		//int index = ITEMS.get
	}
	public List<Item> getITEMS(){
		return this.ITEMS;//return full list
	}
	public void setITEMS(List<Item> items){
		this.ITEMS = items;
	}
	public void clear(){
		this.ITEMS.clear();
	}
	public boolean isEmpty(){
		return ITEMS.isEmpty();
	}
	public Item get(int index){ return this.ITEMS.get(index);}
	public int size(){ return this.ITEMS.size();}
public void setDummyItems(){
		//this function is used as dummy date for testing
		this.ITEMS = Arrays.asList(
			      new Item("USB Male/Female", "A USB cable", "cable", 0, 0, new Image("http://www.supercheats.com/guides/files/guid/super-smash-bros-brawl/crackerlauncher.jpg")),
			      new Item("Micro USB Male/Female", "A Micro USB cable", "cable", 1, 0, new Image("http://2.bp.blogspot.com/-6T5ShPcpc5A/T_EKrDhTWqI/AAAAAAAAAJw/7JxraW2Ahps/s1600/GWTP-GXT3-example.png")),
			      new Item("Mini USB Male/Female", "A Mini USB cable", "cable", 2, 0, new Image("http://www.supercheats.com/guides/files/guid/super-smash-bros-brawl/crackerlauncher.jpg")),
			      new Item("iPhone5 charger cable", "A iPhone5 Compatible cable, for charging", "cable", 3, 0, new Image("http://www.supercheats.com/guides/files/guid/super-smash-bros-brawl/crackerlauncher.jpg")),
			      new Item("iPhone5 charger cable", "A iPhone5 Compatible cable, for charging", "cable", 3, 0, new Image("http://www.supercheats.com/guides/files/guid/super-smash-bros-brawl/crackerlauncher.jpg")),
			      new Item("iPhone5 charger cable", "A iPhone5 Compatible cable, for charging", "cable", 3, 0, new Image("http://www.supercheats.com/guides/files/guid/super-smash-bros-brawl/crackerlauncher.jpg")),
			      new Item("iPhone5 charger cable", "A iPhone5 Compatible cable, for charging", "cable", 3, 0, new Image("http://www.supercheats.com/guides/files/guid/super-smash-bros-brawl/crackerlauncher.jpg")),
			      new Item("iPhone5 charger cable", "A iPhone5 Compatible cable, for charging", "cable", 3, 0, new Image("http://www.supercheats.com/guides/files/guid/super-smash-bros-brawl/crackerlauncher.jpg")),
			      new Item("iPhone5 charger cable", "A iPhone5 Compatible cable, for charging", "cable", 3, 0, new Image("http://www.supercheats.com/guides/files/guid/super-smash-bros-brawl/crackerlauncher.jpg")),
			      new Item("iPhone5 charger cable", "A iPhone5 Compatible cable, for charging", "cable", 3, 0, new Image("http://www.supercheats.com/guides/files/guid/super-smash-bros-brawl/crackerlauncher.jpg")),
			      new Item("iPhone5 charger cable", "A iPhone5 Compatible cable, for charging", "cable", 3, 0, new Image("http://www.supercheats.com/guides/files/guid/super-smash-bros-brawl/crackerlauncher.jpg")),
			      new Item("iPhone5 charger cable", "A iPhone5 Compatible cable, for charging", "cable", 3, 0, new Image("http://www.supercheats.com/guides/files/guid/super-smash-bros-brawl/crackerlauncher.jpg")),
			      new Item("iPhone5 charger cable", "A iPhone5 Compatible cable, for charging", "cable", 3, 0, new Image("http://www.supercheats.com/guides/files/guid/super-smash-bros-brawl/crackerlauncher.jpg")),
			      new Item("iPhone5 charger cable", "A iPhone5 Compatible cable, for charging", "cable", 3, 0, new Image("http://www.supercheats.com/guides/files/guid/super-smash-bros-brawl/crackerlauncher.jpg")),
			      new Item("USB M/M", "A USB cable with both ends Male", "cable", 4, 0, new Image("http://www.supercheats.com/guides/files/guid/super-smash-bros-brawl/crackerlauncher.jpg")));
			  
	}
	private int getItemIndexByItemID(int itemID){
		
		int index = 0;
		for(int i = 0; i<ITEMS.size();i++){
			if(ITEMS.get(i).getItemNum() == itemID){
				index = i;
				break;
			}
		}
		return index;
	}
	//ITEMS = Array.asList();
}
//private static final List<Item> ITEMS = Arrays.asList(
	//      new Item("USB Male/Female", "A USB cable", "cable", 0, 0, new Image("http://www.supercheats.com/guides/files/guid/super-smash-bros-brawl/crackerlauncher.jpg")),
	      