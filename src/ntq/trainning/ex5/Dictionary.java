package ntq.trainning.ex5;

import java.util.HashMap;
import java.util.Map;

public class Dictionary<K1, K2, V> {
	private Map<String, V> map;

	public Dictionary() {
		map = new HashMap<String, V>();
	}
	
	public void put(K1 k1, K2 k2, V v) {
		map.put((k1.hashCode()+ " " + k2.hashCode()), v);
	}
	
	public V get(K1 k1, K2 k2) {
		return map.get(k1.hashCode() + " " + k2.hashCode());
	}
	
	public boolean containsKeys(K1 k1, K2 k2) {
		return map.containsKey(k1.hashCode() + " " + k2.hashCode());
	}
}
