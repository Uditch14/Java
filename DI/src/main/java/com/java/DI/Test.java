package com.java.DI;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
@SuppressWarnings("deprecation")
public class Test {  
public static void main(String[] args) {  
    Resource r=new ClassPathResource("applicationContext.xml");  
	BeanFactory factory=new XmlBeanFactory(r);  
      
    Collection q=(Collection)factory.getBean("q");  
    q.displayInfo();  
      
}  
}
