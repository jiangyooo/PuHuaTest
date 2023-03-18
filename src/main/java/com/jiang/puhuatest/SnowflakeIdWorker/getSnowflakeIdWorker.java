package com.jiang.puhuatest.SnowflakeIdWorker;

import org.springframework.beans.factory.annotation.Autowired;

public class getSnowflakeIdWorker {
    @Autowired
    SnowflakeIdWorker snowflakeIdWorker;

    public static void main(String[] args) {
        SnowflakeIdWorker instance = new SnowflakeIdWorker(0,0);
       Long id = instance.nextId();
        System.out.println(id);
    }
}
