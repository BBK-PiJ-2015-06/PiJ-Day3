print "Please write a text: ";
String text = System.console().readLine();
boolean finished = false;
String lettersUsed = " ";
while (!finished) {
	print "Which letter would you like to count now?: ";
	String s = System.console().readLine();
	int letterCount = 0
	char c = s.charAt(0);
	for (int count = 0; count < lettersUsed.length(); count++) {
		char cTest = lettersUsed.charAt(count);
		if (c == cTest) {
			finished = true;
			count = lettersUsed.length();
		}
	}
	//tests whether letter input from user has been used before
	//and terminates the program if this is the case
	
	if (finished) {
		break;
	} else {
		for (int count = 0; count < text.length(); count++) {
			char cText = text.charAt(count);
			if (c == cText) {
				letterCount++;
			}
		}
	println "There are " + letterCount + " of these in your text."
	}
	lettersUsed = lettersUsed + s;
}
println "Repeated character. Exiting the program...";
println "Thank you for using this program. Goodbye!"