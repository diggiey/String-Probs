public class exercises {
		public static void main(String[] args) {
		//	isAbecedarian("yolo");
		// isDupledromes("ssaabb");
		// isDupledromes("yolo");
			captainCrunch("ab");

		}

		public static boolean isAbecedarian(String a) {
			for (int i=0; i < a.length(); i++) {
				if (a.charAt(i) > a.charAt(i+1)) {
					System.out.println("False");
					return false;
				} else {
					System.out.println("True");
					return true;
				}
			}
			return true;
		}

		public static boolean isDupledromes(String a) {
			int lettersNeeded = 0;

			for (int i=0; i < a.length(); i = i + 2) {
				if (a.charAt(i) == a.charAt(i+1)) {
					lettersNeeded++;
				}
			}

			if (lettersNeeded == a.length() / 2) {
				System.out.println("True");
				return true;
			} else {
				System.out.println("False");
				return false;
			}
		}

		public static String captainCrunch(String x) {

			String crunchy = new String();
			char a = 'a';
			char z = 'z';

			for (int i=0; i < x.length(); i++) {
					if (x.charAt(i) + 13 > z) {
						crunchy = crunchy + String.valueOf((char)(a + (12 - (z - x.charAt(i)))));
					} else {
						crunchy = crunchy + String.valueOf((char)(x.charAt(i) + 13));
					}
			}

			System.out.println(crunchy);

			return crunchy;

		}

}