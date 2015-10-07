println "Please enter some text. Finish by pressing return.";
String s = System.console().readLine();
for (int count = 0; count < s.length(); count++) {
	char c = s.charAt(count);
	if (c == ' ') {
		println " ";
	} else {
		print c;
	}
}