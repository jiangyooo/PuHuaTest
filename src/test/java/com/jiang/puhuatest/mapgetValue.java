package com.jiang.puhuatest;

import org.junit.Test;

import java.util.*;

/**
 * @Author JiangBing
 * @Email 15333079013@163.com
 * @Date 2023/3/6 10:53
 */
public class mapgetValue {
//	@Test
//	public void maptest() {
//		Map map = new HashMap();
//		map.put("key1", "value1");
//		map.put("key2", "value2");
//		List list = new ArrayList();
//		list.add(map);
//		for (Map m : list)
//			for (String k : m.keySet()) {
//				System.out.println(k + " : " + m.get(k));
//			}
//		Map map = new HashMap();
//		map.put("key1", "value1");
//		map.put("key2", "value2");
//		List list = new ArrayList();
//		list.add(map);
//		for (Object m : list) {
//			for (Map.Entry e : m) {
//				e.getValue();
//			}
//
//		}
//	}
	@Test
	void uuid(){
		System.out.println(new UUID(1,1));
	}
}