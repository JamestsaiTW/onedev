package com.pmease.gitplex.web.component.editsave;

import java.io.Serializable;

import org.apache.wicket.ajax.AjaxRequestTarget;

public interface CancelListener extends Serializable {
	void onCancel(AjaxRequestTarget target);
}
