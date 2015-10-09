println "Please enter text representing a mathematical operation: ";
String s = System.console().readLine();
int l = s.length();
int gap = s.length();
String numbers = s.substring(0,1);
char operand = '0';
for (int count = 1; count < l; count++) {
	char c = s.charAt(count);
	if (c == '+' || c == '-' || c == '*' || c == '/') {
		operand = c;
		gap = count
	} else {
		numbers = numbers + c;
	}
}
//separates out the operand and string of numbers (and spaces).

String num1gaps = numbers.substring(0,gap);
String num2gaps = numbers.substring(gap); 
//splits the string of numbers into two strings at the point where the operand was located.

String strnum1 = "0";
String strnum2 = "0";
for (int count = 0; count < num1gaps.length(); count++) {
	char c = num1gaps.charAt(count);
	if (c != ' ') {
		strnum1 = strnum1 + c;
	}
}
for (int count = 0; count < num2gaps.length(); count++) {
	char c = num2gaps.charAt(count);
	if (c != ' ') {
		strnum2 = strnum2 + c;
	}
}
//removes the " " gaps from each string.

double num1 = Double.parseDouble(strnum1);
double num2 = Double.parseDouble(strnum2);
double output = 0;
switch (operand) {
case '+':
	output = num1 + num2;
	break;
case '-':
	output = num1 - num2;
	break;
case '*':
	output = num1 * num2;
	break;
case '/':
	output = num1 / num2;
	break;
default:
	break;
}
//converts each string into a double variable and performs the operand on the two numbers.

int outputApprox = (int)output;
if (Math.abs(outputApprox - output) < 10E-6 ) {
	println num1 + " " + operand + " " + num2 + " = " + outputApprox;
} else {
	println num1 + " " + operand + " " + num2 + " = " + output;
}
//adjusts the output of the program (double or integer)depending on the accuracy required of the result.