package PoiExcle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author JiangBing
 * @email 15333079013@163.com
 * @date 2023/3/10 15:55
 */
public interface excleDownload {
	public Object excled(HttpServletResponse response, HttpServletRequest request);
}
