package com.easylearntutorial.gwt.client;

import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PopupPanel;


public class ImagePopUp extends PopupPanel{

	  private final FlowPanel container = new FlowPanel();
	  private Image ajaxImage = new Image("http://2.bp.blogspot.com/-6T5ShPcpc5A/T_EKrDhTWqI/AAAAAAAAAJw/7JxraW2Ahps/s1600/GWTP-GXT3-example.png");
	
	  //MyPopUp Default Constructor:  
	  public ImagePopUp() {
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
	    public ImagePopUp(Image img) {
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
	    	this.ajaxImage.addClickHandler(new ClickHandler() {
				public void onClick(final ClickEvent event) {
					hide();
				}
		      });
	    	this.container.clear();
	        final Grid grid = new Grid(1, 2); 
	        grid.setWidget(0,0, ajaxImage);
	        //grid.setText(0, 1, "Loading...");   
	        this.container.add(grid);
	        //this.container.add(this.ajaxImage);
	    	add(this.container); 
	    	
	    }
	   
	    
	  }