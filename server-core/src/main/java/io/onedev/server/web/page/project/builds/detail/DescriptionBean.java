package io.onedev.server.web.page.project.builds.detail;

import java.io.Serializable;

import io.onedev.server.web.editable.annotation.Editable;
import io.onedev.server.web.editable.annotation.Markdown;
import io.onedev.server.web.editable.annotation.OmitName;

@Editable(name="Build Description")
public class DescriptionBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String value;

	@Editable
	@Markdown
	@OmitName
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
