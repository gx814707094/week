package com.gengxiao.common.utils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AssertUtil {
	/*
	 * //方法1：断言为真，如果为假，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * */
	
	public static void isTrue(boolean condition, String message) throws MyException{
		
		if(condition == true){
			System.out.println("为真");
		}else{
			throw new MyException(message);
		}
	}
	
	/*
	 * //方法2：断言为假，如果为真，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * 
	 * */
	public static void isFalse(boolean condition, String message) throws MyException{
		if(condition == false){
			System.out.println("为假");
		}else{
			throw new MyException(message);
		}
	}
	
	//方法3：断言对象不为空，如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	public static void notNull(Object obj, String message) throws MyException{
		if(obj == null){
			throw new MyException(message);
		}else{
			System.out.println("传入对成功");
		}
	}
	
	//方法4：断言对象必须空，如果不为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	public static void isNull(Object obj, String message) throws MyException{
		if(obj != null){
			throw new MyException(message);
		}else{
			System.out.println("对象为空 正确");
		}
		
	}
	
	
	
	//方法5：断言集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
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
			
			System.out.println("集合传入正确");
		}
		
	}
	
	
	
	
	
	//方法6：断言Map集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
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
			System.out.println("map集合传入正确");
		}
	
	}	
	
	
	//方法7：断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，如果没值，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	public static void hasText(String condition, String message) throws MyException{
		if(condition.trim().length() == 0 ){
			throw new MyException(message);
		}else{
			System.out.println("传入正确");
		}
	}
	
	
	//方法8：断言值必须大于0，如果小于或等于0，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	public static void greaterThanZero(BigDecimal value, String message){
		
		
	}
	
	
	
	
	
	
	
	
	
}
