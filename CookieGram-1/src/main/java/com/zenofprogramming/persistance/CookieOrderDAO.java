package com.zenofprogramming.persistance;


import java.util.List;

import com.zenofprogramming.domainobjects.CookieOrderRequest;

public interface CookieOrderDAO {
	void addOrder (CookieOrderRequest cookieOrder);
	List <CookieOrderRequest> getAllOrders ();
	CookieOrderRequest getCookieOrderByID (int orderID);
}
