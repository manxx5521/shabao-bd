package com.xiaoshabao.bill.bd.component.cacheLock;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

import com.xiaoshabao.bill.bd.dto.SQLContants;
import com.xiaoshabao.bill.bd.entity.Bill;

@Component
public class BillSqlBuilder {
private final static Set<String> billFields=new TreeSet<>();;
	
	{
		
		for(Field field:Bill.class.getDeclaredFields()) {
			billFields.add(field.getName());
		}
	}
	
	public static String updateBill(Map<String,Object> data) {
		SQL sql=new SQL() {{UPDATE(SQLContants.TableName.BILL);}};
		data.forEach((k,v)->{
			if(k!=null&&billFields.contains(k)) {
//				sql.SET(sets)
			}
		});
		return sql.toString();
	}
}
