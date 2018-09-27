package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> pearls) {
		int counter = 0;
		for (boolean b : pearls) {
			if (b == true) {
				counter++;
			}
		}

		return counter;
	}

	public static double findTallest(List<Double> peeps) {
		double highest = 0.0;
		for (double d : peeps) {
			if (d > highest) {
				highest = d;
			}
		}

		return highest;
	}

	public static String findLongestWord(List<String> words) {
		String longest = "";
		int length = 0;

		for (String s : words) {
			if (s.length() > length) {
				longest = s;
				length = s.length();
			}
		}

		return longest;

	}

	public static boolean containsSOS(List<String> message) {
		for (String s : message) {
			if (s.equals("... --- ...")) {
				return true;
			}
		}

		return false;
	}

	public static List<Double> sortScores(List<Double> peeps) {
		List<Double> d = peeps;
		for (int i = 0; i < peeps.size(); i++) {
			for (int j = 0; j < peeps.size() - 1; j++) {
				if (peeps.get(j) > peeps.get(j + 1)) {
					double temp = peeps.get(j);
					peeps.set(j, peeps.get(j + 1));
					peeps.set(j + 1, temp);
				}
			}
		}

		return d;
	}

	public static List<String> sortDNA(List<String> seq) {
		List<String> s = seq;
		for (int i = 0; i < seq.size(); i++) {
			for (int j = 0; j < seq.size() - 1; j++) {
				if (seq.get(j).length() > seq.get(j + 1).length()) {
					String temp = seq.get(j);
					seq.set(j, seq.get(j + 1));
					seq.set(j + 1, temp);
				}
			}
		}

		return s;
	}

	public static List<String> sortWords(List<String> seq) {
		List<String> s = seq;
		for (int i = 0; i < seq.size(); i++) {
			for (int j = 0; j < seq.size() - 1; j++) {
				if (seq.get(j).compareTo(seq.get(j + 1)) > 0) {
					String temp = seq.get(j);
					seq.set(j, seq.get(j + 1));
					seq.set(j + 1, temp);
				}
			}
		}

		return s;
	}
}
