package projetofinal.form;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

import projetofinal.model.Status;

public class FormProcessosUpd {

	@NotNull
	@Enumerated(EnumType.STRING)
	private Status status;


	public Status getStatus() {
		return status;
	}

	
	public void setStatus(Status status) {
		this.status = status;
	}

}
