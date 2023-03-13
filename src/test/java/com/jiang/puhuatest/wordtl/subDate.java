package com.jiang.puhuatest.wordtl;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Objects;

/**
 * @Author JiangBing
 * @Email 15333079013@163.com
 * @Date 2023/1/12 16:22
 */
public class subDate {
	@Test
	void subDate(){
		String date= "05/01/2022-11/11/2022" ;
		System.out.println(date.substring(0,10));
		System.out.println(date.substring(0,2));
		System.out.println(date.substring(3,5));
		System.out.println(date.substring(6,10));
		
		System.out.println(date.substring(11,21));
		System.out.println(date.substring(11,13));
		System.out.println(date.substring(14,16));
		System.out.println(date.substring(17,21));
		String S001 = "S001";
		String type = "type";

	}
	
}
