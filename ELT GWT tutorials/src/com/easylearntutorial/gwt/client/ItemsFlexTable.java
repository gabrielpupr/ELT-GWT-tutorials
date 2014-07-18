package com.easylearntutorial.gwt.client;

import java.util.Arrays;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.LoadEvent;
import com.google.gwt.event.dom.client.LoadHandler;
import com.google.gwt.http.client.URL;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.Widget;
public class ItemsFlexTable extends Composite {
	
	private static MyFlexTableUiBinder uiBinder = GWT
			.create(MyFlexTableUiBinder.class);
	
	private FlexTable fTable = new FlexTable();
	private int numOfColumns = 0;
	private int numOfRows = 0;
	public Items ITEMS = new Items();
	
	

	  /**
	   * A simple data type that represents a contact.
	   */
	 /* private static class Item {
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
	  }*/

	  /**
	   * The list of data to display.
	   */
	 /* private static final List<Item> ITEMS = Arrays.asList(
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
	  */
	  /**
	   * image PopUp 
	   * 
	   * **/
		
		
	  /*private static class MyPopup extends PopupPanel{

		  private final FlowPanel container = new FlowPanel();
		  private Image ajaxImage = new Image("http://2.bp.blogspot.com/-6T5ShPcpc5A/T_EKrDhTWqI/AAAAAAAAAJw/7JxraW2Ahps/s1600/GWTP-GXT3-example.png");
		  
		  //MyPopUp Default Constructor:  
		  public MyPopup() {
		      // PopupPanel's constructor takes 'auto-hide' as its boolean parameter.
		      // If this is set, the panel closes itself automatically when the user
		      // clicks outside of it.
		      super(true);

		      // PopupPanel is a SimplePanel, so you have to set it's widget property to
		      // whatever you want its contents to be.
		      
		      enableGlass();
		    }
		  public void enableGlass(){
			  //Activate Glass background, as seen on Facebook when clicking an image:
		      setGlassEnabled(true);
		      //Create Glass CSS Style:
			  Style glassStyle = getGlassElement().getStyle();
		      glassStyle.setProperty("width", "100%");
		      glassStyle.setProperty("height", "100%");
		      glassStyle.setProperty("backgroundColor", "#000");
		      glassStyle.setProperty("opacity", "0.75");
		      glassStyle.setProperty("mozOpacity", "0.75");
		      glassStyle.setProperty("filter", " alpha(opacity=75)");
		  }
		    //MyPopup Constructor
		    public MyPopup(Image img) {
			      // PopupPanel's constructor takes 'auto-hide' as its boolean parameter.
			      // If this is set, the panel closes itself automatically when the user
			      // clicks outside of it.
			      super(true);
			      setImage(img);
			      // PopupPanel is a SimplePanel, so you have to set it's widget property to
			      // whatever you want its contents to be.
			      
			              
			      enableGlass();
			    }
		    public void setImage(Image image){
		    	this.ajaxImage = image;
		    	this.container.clear();
		        final Grid grid = new Grid(1, 2); 
		        grid.setWidget(0, 0, ajaxImage);
		        //grid.setText(0, 1, "Loading...");   
		        this.container.add(grid);
		        add(this.container); 
		    	
		    }
		    
		  }*/
	interface MyFlexTableUiBinder extends UiBinder<Widget, ItemsFlexTable> {
		
	}
	
	public ItemsFlexTable() {
		initWidget(uiBinder.createAndBindUi(this));
		setColumns();
		ITEMS.setDummyItems();//for testing
		for(int i = 0; i < ITEMS.size(); i++)
			addItemRow(numOfRows);
		//TODO: Get items from Database
		//new Item("USB Male/Female", "A USB cable", "cable", 0, 0, new Image("http://www.supercheats.com/guides/files/guid/super-smash-bros-brawl/crackerlauncher.jpg")),
	}
	public FlexTable getFlexTable(){
		return fTable;
	}
	private void addColumn(String text){
		//Used to simplify the code writing
		
		fTable.setText(0, numOfColumns, text);
		numOfColumns++;
	}
	private void setColumns(){
		//fTable.addCell(0);
		fTable.insertRow(0);
		
		fTable.getRowFormatter().setStyleName(0,".FlexTable-Header");
		
		fTable.setCellPadding(10);
		fTable.setBorderWidth(1);
		fTable.setTitle("itemTable");
		addColumn("Item#");
		addColumn("Name");
		addColumn("Description");
		addColumn("Type");
		addColumn("Box#");
		addColumn("Image");
		numOfRows++;
		
	}
	private void addItemRow(int rNum){
		Item item = ITEMS.get(rNum-1);
		//fTable.setText(rNum,0,Integer.toString(item.getItemNum()));
		fTable.setWidget(rNum, 0, new CheckBox(Integer.toString(item.getItemNum())));
		fTable.setText(rNum,1,  item.getName());
		fTable.setText(rNum,2, item.getDescription());
		fTable.setText(rNum,3, item.getType());
		
		fTable.setText(rNum,4,Integer.toString(item.getBoxNum()));
		fTable.addCell(rNum);
		
		Image small_icon = item.getImage();//new Image("http://www.supercheats.com/guides/files/guid/super-smash-bros-brawl/crackerlauncher.jpg");
		final Image image2 = new Image(small_icon.getUrl());
		small_icon.setWidth("42px");
		small_icon.setHeight("42px");
		
		small_icon.addClickHandler(new ClickHandler() {
			public void onClick(final ClickEvent event) {
		        // Create the new popup.
		    	  final ImagePopUp popup = new ImagePopUp(image2);
		    	  //final MyPopup popup = tpopup;
		        // Position the popup 1/3rd of the way down and across the screen, and
		        // show the popup. Since the position calculation is based on the
		        // offsetWidth and offsetHeight of the popup, you have to use the
		        // setPopupPositionAndShow(callback) method. The alternative would
		        // be to call show(), calculate the left and top positions, and
		        // call setPopupPosition(left, top). This would have the ugly side
		        // effect of the popup jumping from its original position to its
		        // new position.
		    	  popup.center();
		       /* popup.setPopupPositionAndShow(new PopupPanel.PositionCallback() {
		          public void setPosition(int offsetWidth, int offsetHeight) {
		            int left = (Window.getClientWidth() - offsetWidth) / 3 ;
		            //(Window.getClientHeight() - offsetHeight) / 3 +
		            //TODO: Fix position to exact mouse click position.
		            int top = (event.getClientY());//event.getClientY() - offsetHeight/3;
		           
		            System.out.println("top = " + top);
		            System.out.println("event.getScreenY() = " + event.getScreenY());
		            System.out.println("event.getClientY() = " + event.getClientY());
		            System.out.println("Window.getClientHeight() = " + Window.getClientHeight());
		            System.out.println("event.getY() = " + event.getY());
		            
		            popup.setPopupPosition(left, top);
		          }*/
		          
		          //popup.setPopupPosition(offsetWidth2, offsetHeight2);
		        //});
			}
	    });
		fTable.setWidget(rNum,5, small_icon);
		numOfRows++;
	}
	

}


