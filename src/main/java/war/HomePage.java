package war;

import java.io.Serializable;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.SubmitLink;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

/**
 * Homepage
 */
public class HomePage extends WebPage {
	public TextField firstField;
	public TextField secondField;
	public Label result;
	public Button button;
	
	private Integer first;
	private Integer second;

	/**
	 * Constructor that is invoked when page is invoked without a session.
	 * 
	 * @param parameters
	 *            Page parameters
	 */

	@SuppressWarnings("serial")
	public HomePage() {

		Form form = new Form("form");
		add(form);
		firstField = new TextField("first", new PropertyModel(this, "first"));
		form.add(firstField);
		secondField = new TextField("second", new PropertyModel(this, "second"));
		form.add(secondField);

		result = new Label("result", new Model(""));
		form.add(result);
		form.add(new Button("button") {

			@Override
			public void onSubmit() {
				result.setModelObject(first+second);
				
			}
		});
		

	}
}
