println "Please enter some text. Finish by pressing enter.";
String s1 = System.console().readLine();
char c = s1.charAt(0)
boolean b = Character.isLetter(c);
String s2 = " "
if (b) {
	char LowCase = Character.toLowerCase(c);
	s2 = LowCase;
}
//assumes first input will always be a letter,
//otherwise an additional for() loop is required.

for (int count = 1; count < s1.length(); count++) {
	c = s1.charAt(count);
	b = Character.isLetter(c);
	if (b) {
		LowCase = Character.toLowerCase(c);
		s2 = s2 + LowCase;
	}	
}
println s2;
println " ";
int marker1 = 0;
int marker2 = s2.length() - 1;
boolean finished = false;
boolean palindrome = true
while (!finished) {
	if (marker1 != marker2 && marker1 < marker2) {
		char c1 = s2.charAt(marker1);
		char c2 = s2.charAt(marker2);
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
	println "The text input IS a relxed palindrome.";
} else {
	println "The text input IS NOT a relaxed palindrome.";
}