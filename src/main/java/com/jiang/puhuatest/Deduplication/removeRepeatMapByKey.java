package com.jiang.puhuatest.Deduplication;//package com.example.Deduplication;
//
//import java.util.*;
//
///**
// * @Author JiangBing
// * @Email 15333079013@163.com
// * @Date 2023/2/16 14:32
// */
//public class removeRepeatMapByKey {
//	public static void main(String[] args) {
//		//把list中的数据转换成msp,去掉同一id值多余数据，保留查找到第一个id值对应的数据
//		List<Map<String, Object>> listMap = new ArrayList<>();
//		Map<String, Map> msp = new HashMap<>();
//		for (int i = list.size() - 1; i >= 0; i--) {
//			Map map = list.get(i);
//			String id = (String) map.get(mapKey);
//			map.remove(mapKey);
//			msp.put(id, map);
//		}
//		//把msp再转换成list,就会得到根据某一字段去掉重复的数据的List<Map>
//		Set<String> mspKey = msp.keySet();
//		for (String key : mspKey) {
//			Map newMap = msp.get(key);
//			newMap.put(mapKey, key);
//			listMap.add(newMap);
//		}
//		return listMap;
//	}
//	}
//}
