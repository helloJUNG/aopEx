package org.zziggu.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Component
@Aspect
@Log4j
public class LogAdvice {

	
	@Before("execution(* org.zziggu.service.SampleService*.*(String,String)) && args(str1,str2)")
	public void logBefore(String str1, String str2) {
		
		log.info("=============================");
		log.info("=============================");
		log.info("=============================");
		log.info("=============================");
		log.info("=============================");
		
		
	}
	
	@After("execution(* org.zziggu.service.SampleService*.*(..))")
	public void logAfter() {
		
		log.info("///////////////////////////");
		log.info("///////////////////////////");
		log.info("///////////////////////////");
		log.info("///////////////////////////");
		log.info("///////////////////////////");
		
	}
}
