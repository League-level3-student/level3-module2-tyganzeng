import java.util.ArrayList;
import java.util.List;

public class Checkpoint {

	public static void main(String[] args) {
		List<Double> d = new ArrayList<Double>();
		d.add(1.3);
		d.add(0.5);
		d.add(6.4);
		d.add(3.2);
		d.add(2.1);
		List<Double> n = d;
		sortNormal(n);
		System.out.println(n);

		int[] ints = { 1, 2, 3, 4, 5, 7, 8, 9 };
		System.out.println(intSearch(ints, 6));
		System.out.println(intSearch(ints, 7));

		List<Double> b = d;
		sortBack(d);
		System.out.println(b);

		String[] strings = { "hello", "my", "name", "is", "tygan" };
		strings = sortWords(strings);
		for (String s : strings) {
			System.out.print(s + " ");
		}

		System.out.println(search(ints, 6, 0, ints.length));
		System.out.println(search(ints, 1, 0, ints.length));
	}

	public static List<Double> sortNormal(List<Double> peeps) {

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

	public static boolean intSearch(int[] ints, int x) {
		for (int i : ints) {
			if (i == x) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortBack(List<Double> peeps) {

		List<Double> d = peeps;
		for (int i = 0; i < peeps.size(); i++) {
			for (int j = 0; j < peeps.size() - 1; j++) {
				if (peeps.get(j) < peeps.get(j + 1)) {
					double temp = peeps.get(j);
					peeps.set(j, peeps.get(j + 1));
					peeps.set(j + 1, temp);
				}
			}
		}

		return d;
	}

	public static String[] sortWords(String[] seq) {
		String[] s = seq;
		for (int i = 0; i < seq.length; i++) {
			for (int j = 0; j < seq.length - 1; j++) {
				if (seq[j].compareTo(seq[j + 1]) > 0) {
					String temp = seq[j];
					seq[j] = seq[j + 1];
					seq[j + 1] = temp;

				}
			}
		}

		return s;
	}

	public static int search(int[] ints, int x, int bound1, int bound2) {
		if (bound2 >= bound1) {
			int mid = (bound1 + bound2) / 2;
			if (ints[mid] == x) {
				return mid;
			}

			if (ints[mid] > x) {
				return search(ints, x, bound1, mid - 1);
			}

			return search(ints, x, mid + 1, bound2);
		}
		return -1;

	}
}
