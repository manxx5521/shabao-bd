package com.xiaoshabao.bill.bd.mapper;

import static org.junit.Assert.fail;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@MybatisTest
@FixMethodOrder(value = MethodSorters.NAME_ASCENDING)
public class DynamicSqlMapperTest {

	@Test
	public void testInsertSQL() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateSQL() {
		fail("Not yet implemented");
	}

}
