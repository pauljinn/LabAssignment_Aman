package com.cg.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.config.SpringConfig;
import com.cg.domain.SBU;

public class EmpClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println(ctx);
		SBU sbu = ctx.getBean(SBU.class);
		System.out.println(sbu);

	}

}
