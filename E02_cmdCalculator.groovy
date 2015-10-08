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
	} else if (c == ' ') {
		numbers = numbers + c;
	} else {
		numbers = numbers + c;
	}
}
String num1gaps = numbers.substring(0,gap);
String num2gaps = numbers.substring(gap); 
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
int outputApprox = Integer.parseInt(output);
if (outputApprox == output) {
	output = outputApprox;
}
println num1 + " " + operand + " " + num2 + " = " + output;