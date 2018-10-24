package org.zziggu.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zziggu.service.SampleService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleServiceTests {

	@Setter(onMethod_=@Autowired)
	private SampleService service;
	
	@Test
	public void testMulti() {
		
		
		String str ="굿";
		
		service.addMulti(str);
		
	}
	
	@Test
	public void test() throws Exception {
		
		log.info(service.getClass().getName());
		log.info("RESULT: " + service.doAdd("123", "100"));
	}
}
