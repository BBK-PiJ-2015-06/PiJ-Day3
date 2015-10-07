print "Please enter some text. Finish by pressing enter: ";
String s = System.console().readLine();
int length = s.length();
String sMirror = s.substring(length-1);
for (int count = length - 2; count >= 0; count = count - 1) {
	c = s.charAt(count);
	sMirror = sMirror + c;
}
println s + sMirror