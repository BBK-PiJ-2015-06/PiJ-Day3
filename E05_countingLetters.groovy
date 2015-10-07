println "Please enter some text. Finish by pressing 'return'.";
String s = System.console().readLine();
print "Please enter a character to be searched in the above text: ";
String character = System.console().readLine();
int output = 0
for (int count = 0; count < s.length(); count++) {
	char c = s.charAt(count);
	if (c == character) {
		output = output + 1;
	}
}
println "There are " + output + " instances of the character " + "'" + character + "'" + " in the text."
