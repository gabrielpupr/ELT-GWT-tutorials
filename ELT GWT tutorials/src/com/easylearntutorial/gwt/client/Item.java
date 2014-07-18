package com.easylearntutorial.gwt.client;

import com.google.gwt.user.client.ui.Image;

/**
 * A simple data type that represents a contact.
 */
public class Item {
  private final String name;
  private final String description;
  private final String type;
  private final int itemNum;
  private final int boxNum;
  private final Image image;

  public Item(String name, String description, String type, int itemNum, int boxNum, Image image) {
    this.name = name;
    this.description = description;
    this.type = type;
    this.itemNum = itemNum;
    this.boxNum = boxNum;
    this.image = image;
  }
  
  public String getName(){
		  return this.name;
	  }
  public String getDescription(){
		  return this.description;
	  }
  public String getType(){
		  return this.type;
	  }
  public int getItemNum(){
		  return this.itemNum;
	  }
  public int getBoxNum(){
		  return this.boxNum;
	  }
  public Image getImage(){
		  return this.image;
	  }
}
