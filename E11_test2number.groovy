println "Please enter a number, including commas and decimal points if necessary: ";
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
int decimalpos = s.length();
int commacount = 0;
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
int decimalplaces = s.length() - decimalpos
if (decimalplaces > 0) {
	decimalplaces = decimalplaces - 1;
}
int number = Integer.parseInt(num);
if (number%2 == 0) {
	number = number / 2;
} else {
	number = (((number - 1)/2) * 10) + 5;
	decimalplaces ++;
}
double output = number;
for (decimalplaces; decimalplaces > 0; decimalplaces = decimalplaces - 1) {
	output = output / 10;
}
println output
