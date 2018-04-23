package de.steffenkroll;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.validation.validator.RangeValidator;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;
	private int test = 5;
	private String inputValue;
	private String message = "Jene Message";

	String inputVon = "1337Ihnalt";
	Form<?> form = new Form("form");

	PropertyModel<String> messageModel = new PropertyModel<>(this, "message");

	public HomePage(final PageParameters parameters) {
		super(parameters);
		add(new Label("version", this.getTest()));
		// TODO Add your page's components here
		add(new Label("nice", this.inputVon));

		add(new Label("msg", messageModel));

		System.out.println(message);

		form.add(new TextField<>("msgInput", messageModel));
	
		
//		form.add(new TextField<>("integerProperty", Integer.class).setRequired(true).add(new RangeValidator<>(1, Integer.MAX_VALUE)));


		add(form);
		
//		add(new BookmarkablePageLink<>("SecondPageLink",SecondPage.class));
		add(new BookmarkablePageLink<>("BaseLink", BasePage.class));
		 
		
		
		
//		add(new Button("inButton") {
//			public void onSubmit() {
//				sqrt(33);
//			}
//		});

		
		
		
	}

	int sqrt(int x) {

		return x=x*x;
	}

	void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public int getTest() {
		return this.test;
	}

	public void setTest(int test) {
		this.test = test;
	}

}
