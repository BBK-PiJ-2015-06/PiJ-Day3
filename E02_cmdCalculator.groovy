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
		break;
	} else {
		numbers = numbers + c;
	}
}
String firstnum = numbers.substring(0,gap);
String secondnum = numbers.substring(gap);
double num1 = Double.parseDouble(firstnum);
double num2 = Double.parseDouble(secondnum);
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
println num1 + " " + operand + " " + num2 + " = " + output;