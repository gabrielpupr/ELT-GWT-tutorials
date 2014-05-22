package com.easylearntutorial.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {

	;
	//private Label msg = new Label("Hello, world3!");
	//private Button btn = new Button("click me");
	private LittleForm form = new LittleForm();
	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		//RootPanel.get().add(msg);
		//RootPanel.get().add(btn);
		form.setText("hey!");;
		RootPanel.get().add(form);
		
	}

}
