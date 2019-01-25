package com.yaning.model;

/**
 * @author    Yaning Liu
 *
 * @filename  Product.java
 *
 * @date      2019-01-24
 *
 */

public class Product {
	private int id;
	private String name;
	private int quality;
	private int warehouse_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public int getWarehouse_id() {
		return warehouse_id;
	}
	public void setWarehouse_id(int warehouse_id) {
		this.warehouse_id = warehouse_id;
	}
	
}
