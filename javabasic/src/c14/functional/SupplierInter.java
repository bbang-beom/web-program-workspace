package c14.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

// Supplier<T>: T get();
public class SupplierInter {
	public List<Integer> makeIntList(Supplier<Integer> s, int n) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) list.add(s.get());
		return list;
	}
	public static void main(String[] args) {
		SupplierInter si = new SupplierInter();
		Supplier<Integer> spr = () -> {
			Random rand = new Random();
			return rand.nextInt(50);
		};
		List<Integer> list = si.makeIntList(spr, 10);
		System.out.println(list);
	}
}
