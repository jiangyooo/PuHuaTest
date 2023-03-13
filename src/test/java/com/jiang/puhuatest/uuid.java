package com.jiang.puhuatest;

import org.junit.jupiter.api.Test;
import sun.security.provider.MD5;

import java.util.UUID;

/**
 * @Author JiangBing
 * @Email 15333079013@163.com
 * @Date 2023/3/6 14:32
 */
public class uuid {
	@Test
	void uuid() {
		System.out.println(new UUID(2410,0731));
	}
	@Test
	void md5(){
		System.out.println(new MD5().toString());
	}
}
