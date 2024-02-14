package com.task2;

//. WAP to find the duplicate and unique words in a string
public class findDuplicateWordString {
	static void findDuplicateAnduniqueWord(String st) {
		String s[] = st.split("\\s");
		int count;
		boolean status;
		for (int i = 0; i < s.length; i++) {
			count = 1;
			status = false;
			for (int j = i - 1; j >= 0; j--) {
				if (s[i].equalsIgnoreCase(s[j])) {
					status = true;
					break;
				}
			}
			if (!status) {
				for (int k = i + 1; k < s.length; k++) {
					if (s[i].equalsIgnoreCase(s[k])) {
						count++;
					}

				}
				if (count > 1) {
					System.out.println("Duplicate word:" + s[i]);
					break;
				}
				if(count==1) {
					System.out.println("Unique word is:"+s[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		String str = "a big fish is swmming in big river";
		findDuplicateAnduniqueWord(str);
	}

}
