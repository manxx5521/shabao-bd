package com.xiaoshabao.bill.bd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.xiaoshabao.base.mybatis.BaseMybatisApplicaiton;
@EnableCaching
@SpringBootApplication
public class BdApplication  extends BaseMybatisApplicaiton {
	
	public static void main(String[] args) {
		SpringApplication.run(BdApplication.class, args);
	}

}
