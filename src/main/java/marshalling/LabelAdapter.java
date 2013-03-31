package marshalling;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.example.Label;

public class LabelAdapter extends XmlAdapter<CustomLabel, Label> {

	@Override
	public CustomLabel marshal(Label label) throws Exception {
		return new CustomLabel().setLabelName(label.getLabelName()).setLocale(
				label.getLocale());
	}

	@Override
	public Label unmarshal(CustomLabel cLabel) throws Exception {
		return new Label(cLabel.getLabelName(), cLabel.getLocale());
	}

}
