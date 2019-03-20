package com.satellite.system.util;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class Param {
	
	/**
	 * 获取请求的参数
	 * @param request
	 * @return
	 */
	public static Map<String, String> getParam(HttpServletRequest request){
		Map<String, String> map = new HashMap<String, String>();
		Enumeration em = request.getParameterNames();
		 while (em.hasMoreElements()) {
		    String name = (String) em.nextElement();
		    String value = request.getParameter(name);
		    map.put(name, value);
		}
		return map;
	}

}
