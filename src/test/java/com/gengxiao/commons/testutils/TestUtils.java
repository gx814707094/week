package com.gengxiao.commons.testutils;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.gengxiao.common.utils.AssertUtil;
import com.gengxiao.common.utils.MyException;

public class TestUtils {
	
	//测试AssertUtil.isTrue()方法，通过断言测一次（2分），不能通过断言测一次（2分）。

	public void test01(){
		try {
			AssertUtil.isTrue(false,"必须传入true");
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//测试AssertUtil.isFalse()方法，通过断言测一次（2分），不能通过断言测一次（2分）。

	public void test02(){
		try {
			AssertUtil.isFalse(true,"必须传入false");
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

	//测试AssertUtil.notNull()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	public void test03() throws MyException{
		AssertUtil.notNull(null,"对象不能为null");
	}
	
	//测试AssertUtil.isNull()方法，通过断言测一次（2分），不能通过断言测一次（2分）。

	public void test04() throws MyException{
		AssertUtil.isNull(new Object(),"对象只能为null");
	}
	
	//用List对象测试AssertUtil.notEmpty()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	
	public void test05(){
		List<Object> list = new ArrayList<>();
		list.add("xii");
		
		
		try {
			AssertUtil.notEmpty(list,"集合或集合中对象不可为空");
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	//用Map对象测试AssertUtil.notEmpty()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	
	public void test06() throws MyException{
		Map map = new HashMap();
		map.put("ss","xx");
	
		
		AssertUtil.notEmpty(map,"对象或值不能为空");
	}
	
	//用String对象测试AssertUtil.hasText()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void test07() throws MyException{
	
		String str = " s ";
		
		AssertUtil.hasText(str,"不能传入空对象或空字符串");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
