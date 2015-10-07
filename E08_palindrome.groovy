println "Please enter some text. Finish by pressing enter.";
String s = System.console().readLine();
int marker1 = 0;
int marker2 = s.length() - 1;
boolean finished = false;
boolean palindrome = true
while (!finished) {
	if (marker1 != marker2 && marker1 < marker2) {
		char c1 = s.charAt(marker1);
		char c2 = s.charAt(marker2);
		if (c1 != c2) {
			palindrome = false;
		}
	} else {
		finished = true;
	}
	marker1 = marker1 + 1;
	marker2 = marker2 - 1;
}
if (palindrome) {
	println "The text input IS a palindrome.";
} else {
	println "The text input IS NOT a palindrome.";
}