package com.example.springAOPv2.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class EmployeeAspect {

	@Before("execution(* com.example.springAOPv2.service.MyService.CallMe())")
	public void BeforeAspect() {
		System.out.println("Executing Advice");
	}
}
