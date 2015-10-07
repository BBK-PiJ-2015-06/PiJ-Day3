println "Please enter some text. Finish by pressing 'return'.";
String s = System.console().readLine();
int output = 0
for (int count = 0; count < s.length(); count++) {
	char c = s.charAt(count);
	if (c == 'e') {
		output = output + 1;
	}
}
println output
