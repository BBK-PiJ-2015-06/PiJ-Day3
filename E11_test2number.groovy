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

// Takes input from user (see above) and outputs string of numbers.
// Removes the commas and decimal point.
// Makes a note using decimalpos as to where the decimal point was located.
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

// Works out how many decimal places there should be in the final output.
// Also converts num into an integer and divides by 2.
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

// Testing for negative number and adjusting output accordingly.
if (negative) {
	output = output * -1;
}
println output
