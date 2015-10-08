print "Please enter a number, including commas and decimal points if necessary: ";
String s = System.console().readLine();
String num = s;
boolean negative = false;
count = 0
if (s.substring(0,1) == "-") {
	negative = true;
	num = s.substring(1,2);
	count = 2
} else {
	num = s.substring(0,1);
	count = 1
}
int decimalpos = s.length()
for (count; count < s.length(); count++) {
	char c = s.charAt(count);
	if (c != ',') {
		if (c == '.') {
			decimalpos = count;
		} else {
			num = num + c;
		} 
	}
}
int number = Integer.parseInt(num);
if (number%2 == 1) {
	number = (((number - 1) / 2) * 10) + 5;	
} else {
	number = number / 2;
}
String output = Integer.toString(number) 
int outputlength = output.length()
println output
println outputlength
println decimalpos
