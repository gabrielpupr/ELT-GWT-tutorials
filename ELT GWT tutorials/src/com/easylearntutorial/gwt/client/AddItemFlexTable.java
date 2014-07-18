package com.easylearntutorial.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class AddItemFlexTable extends Composite {

	private static AddItemFlexTableUiBinder uiBinder = GWT
			.create(AddItemFlexTableUiBinder.class);

	interface AddItemFlexTableUiBinder extends
			UiBinder<Widget, AddItemFlexTable> {
	}
	
	
	
	public AddItemFlexTable() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	//TODO: Create UI to add new items
}
