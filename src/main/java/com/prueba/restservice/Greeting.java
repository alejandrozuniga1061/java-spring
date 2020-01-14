package com.prueba.restservice;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Clase prueba swagger")
public class Greeting {
	private final long id;
	
	@ApiModelProperty(notes = "Contenido", required=true)
	//Se ve reflejado en Models de swagger
	private final String content;
	
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
