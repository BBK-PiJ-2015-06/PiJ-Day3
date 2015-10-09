println "Please type below a short line of text:";
String s1 = System.console().readLine();
println "Please type below a longer line of text within which the first line needs to be found:";
String s2 = System.console().readLine();
int count = 0;
for (int s2Count = 0; s2Count < s2.length(); s2Count++) {
	boolean found = true;
	for (int s1Count = 0; s1Count < s1.length(); s1Count++) {
		char c2 = s2.charAt(s1Count + s2Count);
		char c1 = s1.charAt(s1Count);
		if (c2 != c1) {
			found = false;
			s1Count = s1.length();
		}
	}
	if (found) {
		count = count + 1;
	}
}
println "Number of times first line appears in second line: " + count
