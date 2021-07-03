package com.rudrasiva86;

import jakarta.ejb.Stateless;

// if annotation is not present then this will not be included in the CDI 
// unless the bean-discovery-mode is changed to "all" in beans.xml file
@Stateless
public class HelloService {

	public String sayHello() {
		return "Hello CDI";
	}
}
