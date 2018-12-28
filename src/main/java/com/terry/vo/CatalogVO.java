package com.terry.vo;

import com.terry.entity.Catalog;

public class CatalogVO {
	private String username;
	private Catalog catalog;
	
	public  CatalogVO() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}
}
