package org.developerworld.commons.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Map 工具类
 * @author Roy Huang
 * @version 20101215
 *
 */
public class MapUtils extends org.apache.commons.collections.MapUtils{

	/**
	 * 创建一个与原来的map key、value反转的新MAP
	 * @param <K>
	 * @param <V>
	 * @param map
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static <K,V> Map<V,K> reversalKeyValue(Map<K,V> map) throws InstantiationException, IllegalAccessException{
		Map<V,K> rst=map.getClass().newInstance();
		Iterator<Entry<K,V>> i=map.entrySet().iterator();
		while(i.hasNext()){
			Entry<K,V> e=i.next();
			rst.put(e.getValue(), e.getKey());
		}
		return rst;
	}
}
