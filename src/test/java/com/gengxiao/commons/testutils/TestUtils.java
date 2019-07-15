package com.gengxiao.commons.testutils;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.gengxiao.common.utils.AssertUtil;
import com.gengxiao.common.utils.MyException;

public class TestUtils {
	
	//����AssertUtil.isTrue()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���

	public void test01(){
		try {
			AssertUtil.isTrue(false,"���봫��true");
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//����AssertUtil.isFalse()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���

	public void test02(){
		try {
			AssertUtil.isFalse(true,"���봫��false");
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

	//����AssertUtil.notNull()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���
	public void test03() throws MyException{
		AssertUtil.notNull(null,"������Ϊnull");
	}
	
	//����AssertUtil.isNull()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���

	public void test04() throws MyException{
		AssertUtil.isNull(new Object(),"����ֻ��Ϊnull");
	}
	
	//��List�������AssertUtil.notEmpty()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���
	
	public void test05(){
		List<Object> list = new ArrayList<>();
		list.add("xii");
		
		
		try {
			AssertUtil.notEmpty(list,"���ϻ򼯺��ж��󲻿�Ϊ��");
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	//��Map�������AssertUtil.notEmpty()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���
	
	public void test06() throws MyException{
		Map map = new HashMap();
		map.put("ss","xx");
	
		
		AssertUtil.notEmpty(map,"�����ֵ����Ϊ��");
	}
	
	//��String�������AssertUtil.hasText()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���
	@Test
	public void test07() throws MyException{
	
		String str = " s ";
		
		AssertUtil.hasText(str,"���ܴ���ն������ַ���");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
