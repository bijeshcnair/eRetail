package com.eRetail.pojo;
import org.springframework.data.annotation.Id;

/**
 * Pojo class for item
 * @author biju
 *
 */
public class Item {
	@Id
	private String itemID;

	private float longi;
	private float lati;

	private float cost;

	private String currency;
	private String type;
	private String subType;

	private String phone;

	private Object miscObject;//preferably a json object
	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public float getLongi() {
		return longi;
	}

	public void setLongi(float longi) {
		this.longi = longi;
	}

	public float getLati() {
		return lati;
	}

	public void setLati(float lati) {
		this.lati = lati;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Object getMiscObject() {
		return miscObject;
	}

	public void setMiscObject(Object miscObject) {
		this.miscObject = miscObject;
	}

	public Item(float longi, float lati, float cost, String currency,
			String type, String subType, String phone, Object miscObject) {
		super();
		this.longi = longi;
		this.lati = lati;
		this.cost = cost;
		this.currency = currency;
		this.type = type;
		this.subType = subType;
		this.phone = phone;

		this.miscObject = miscObject;
	}
	
	






}
