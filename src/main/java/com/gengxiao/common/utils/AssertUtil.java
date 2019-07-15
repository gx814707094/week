package com.gengxiao.common.utils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AssertUtil {
	/*
	 * //����1������Ϊ�棬���Ϊ�٣����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	 * */
	
	public static void isTrue(boolean condition, String message) throws MyException{
		
		if(condition == true){
			System.out.println("Ϊ��");
		}else{
			throw new MyException(message);
		}
	}
	
	/*
	 * //����2������Ϊ�٣����Ϊ�棬���׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	 * 
	 * */
	public static void isFalse(boolean condition, String message) throws MyException{
		if(condition == false){
			System.out.println("Ϊ��");
		}else{
			throw new MyException(message);
		}
	}
	
	//����3�����Զ���Ϊ�գ����Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void notNull(Object obj, String message) throws MyException{
		if(obj == null){
			throw new MyException(message);
		}else{
			System.out.println("����Գɹ�");
		}
	}
	
	//����4�����Զ������գ������Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void isNull(Object obj, String message) throws MyException{
		if(obj != null){
			throw new MyException(message);
		}else{
			System.out.println("����Ϊ�� ��ȷ");
		}
		
	}
	
	
	
	//����5�����Լ��ϲ�Ϊ�գ������ܿգ��Լ��������1��Ԫ�ء����Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void notEmpty(Collection<?> coll, String message) throws MyException{
		
		if(coll == null){
			throw new MyException(message);
		}else{
			
			Iterator<?> it = coll.iterator();
			while(it.hasNext()){
				if(it.next() == null){
					throw new MyException(message);
				}
			}
			
			System.out.println("���ϴ�����ȷ");
		}
		
	}
	
	
	
	
	
	//����6������Map���ϲ�Ϊ�գ������ܿգ��Լ��������1��Ԫ�ء����Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void notEmpty(Map<?,?> map, String message) throws MyException{
		if(map == null){
			throw new MyException(message);
		}else{
			Set<?> keySet = map.keySet();
			for (Object obj: keySet) {
				if(map.get(obj) == null){
					throw new MyException(message);

				}
			}
			System.out.println("map���ϴ�����ȷ");
		}
	
	}	
	
	
	//����7�������ַ���������ֵ��ȥ���ո�Ȼ���ж��ַ��������Ƿ����0�����ûֵ�����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void hasText(String condition, String message) throws MyException{
		if(condition.trim().length() == 0 ){
			throw new MyException(message);
		}else{
			System.out.println("������ȷ");
		}
	}
	
	
	//����8������ֵ�������0�����С�ڻ����0�����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void greaterThanZero(BigDecimal value, String message){
		
		
	}
	
	
	
	
	
	
	
	
	
}
