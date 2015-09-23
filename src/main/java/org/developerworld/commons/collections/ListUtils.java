package org.developerworld.commons.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合工具类
 * 
 * @author Roy
 * @version 20110930
 */
public class ListUtils extends org.apache.commons.collections.ListUtils {

	/**
	 * 获取在指定集合中不存在的另一集合数据
	 * 
	 * @param source
	 * @param comparison
	 */
	public static List notExist(List source, List comparison) {
		List rst = new ArrayList(comparison);
		rst.removeAll(source);
		return rst;
	}

	/**
	 * 获取唯一的列表
	 * 
	 * @param source
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static List getUniqueList(List source)
			throws InstantiationException, IllegalAccessException {
		List rst = null;
		if (source != null) {
			rst = source.getClass().newInstance();
			for (int i = 0; i < source.size(); i++) {
				Object e = source.get(i);
				if (!rst.contains(e))
					rst.add(e);
			}
		}
		return rst;
	}
}
