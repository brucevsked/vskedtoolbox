package com.vsked.test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;

import com.vsked.util.PortScanner;

public class PortScannerTest {
	
	private static Logger log = Logger.getLogger(PortScannerTest.class);
	
	@Before
	public void initLog4j(){
        try {
        	String configFile=PortScannerTest.class.getResource("/").toString();
        	configFile=configFile.replace("file:/", "");
        	configFile=configFile.replace("test-classes/", "classes/"); //for maven+junit+log4j
        	configFile+="properties/log4j.properties";
        	PropertyConfigurator.configure(configFile);  
        } catch (Exception ex) {  
            System.err.println("Cannot Initialize log4j");
        } 
	}
	
	@Test
	public void isOpen(){
		PortScanner portScanner=new PortScanner();
		int port=3389;
		String s="";
		for(int i=1;i<255;i++){
			s="192.168.1."+i;
			System.out.println(s);
			/*
			boolean isPortOpen=portScanner.isOpen(s, port);
			if(isPortOpen){
				log.debug(s);
			}
			*/
		}
	}
	
}
