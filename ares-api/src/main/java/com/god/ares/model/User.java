package com.god.ares.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 8191935048604779466L;

	/**主键**/
	private Integer id;

	/**名字**/
	private String name;

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	@Override
	public String toString() {
		return "User [ id= "+id+
			",name= "+name+"]";
	}
}
