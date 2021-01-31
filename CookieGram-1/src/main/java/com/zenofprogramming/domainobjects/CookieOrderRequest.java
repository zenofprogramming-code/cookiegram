package com.zenofprogramming.domainobjects;

import java.io.Serializable;
//import lombok.*;

public class CookieOrderRequest implements Serializable{

	private static final long serialVersionUID = -5970479421109917185L;
	private int orderID;
	private String customerName;
	private String recipientName;
	
	
}
