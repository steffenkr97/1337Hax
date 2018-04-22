package de.steffenkroll;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	private int test = 5;
	
	private String message= "Jene Message";

	String inputVon="1337Ihnalt";
	
	public HomePage(final PageParameters parameters) {
		super(parameters);
		add(new Label("version", this.getTest()));
		// TODO Add your page's components here
		add (new Label("nice", this.inputVon));

		
		PropertyModel<String> messageModel = new PropertyModel<>(this, "message");
		
		add(new Label("msg",messageModel));
		
		Form<?> form = new Form("form");
		form.add(new TextField<>("msgInput",messageModel));
		
		
		add(form);
	}

	int sqrt(int x) {

		return x=x*x;
	}
	
	
	
	
	void setMessage(String message) {
		this.message=message;
	}
	
	String getMessage() {
		return this.message;
	}

	public int getTest() {
		return this.test;
	}
	public void setTest(int test) {
		this.test=test;
	}
	
	
}
