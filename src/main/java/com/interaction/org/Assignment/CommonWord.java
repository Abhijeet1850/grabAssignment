package com.interaction.org.Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonWord {

	List<String> list1 = new ArrayList<>();
	List<String> list2 = new ArrayList<>();

	public List<String> getList1() {
		return list1;
	}

	public void setList1(List<String> list1) {
		this.list1 = list1;
	}

	public List<String> getList2() {
		return list2;
	}

	public void setList2(List<String> list2) {
		this.list2 = list2;
	}

	public CommonWord() {

	}

	public CommonWord(List<String> list1, List<String> list2) {
		super();
		this.list1 = list1;
		this.list2 = list2;
	}

	public Set<String> logic1() {
		Set<String> result = new HashSet<>();
		for (int i = 0; i < list1.size(); i++) {
			if (list2.contains(list1.get(i)))
				result.add(list1.get(i));
		}

		return result;
	}

	public Set<String> bruteForceLogic() {
		Set<String> result = new HashSet<>();
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list1.get(i).equals(list2.get(j))) {
					result.add(list1.get(i));
					break;
				}
			}
		}
		return result;
	}

	public Set<String> logicUsingHashSet() {
		Set<String> result = new HashSet<>(list1);
		Set<String> set2 = new HashSet<>(list2);
		result.retainAll(set2);
		return result;
	}

	public Set<String> logicUsingStream() {
		Set<String> result = list1.stream().distinct().filter(list2::contains).collect(Collectors.toSet());
		return result;
	}

}
