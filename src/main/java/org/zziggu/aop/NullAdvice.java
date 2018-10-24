package org.zziggu.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Component
@Aspect
@Log4j
public class NullAdvice {

	@Around("execution(* org.zziggu.service.SampleService*.*(..))")
	public Object checkNull(ProceedingJoinPoint pjp) {

		log.info("check null.....");
		log.info("check null.....");
		log.info("check null.....");
		log.info("check null.....");

		Object result = null;

		Object[] params = pjp.getArgs();

		try {

			for (Object object : params) {
				if (object == null) {
					throw new Exception("NULL");
				}
			}
			result = pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
