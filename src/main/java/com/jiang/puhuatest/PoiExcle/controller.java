package com.jiang.puhuatest.PoiExcle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author JiangBing
 * @email 15333079013@163.com
 * @date 2023/3/10 15:32
 */
@RestController
@RequestMapping(value = "/test")
public class controller {
	@Autowired
    com.jiang.puhuatest.PoiExcle.excleDownload excleDownload;
	@GetMapping(value = "download")
	public Object download(HttpServletRequest request, HttpServletResponse response) {
		return excleDownload.excled(response, request);
	}
}
