println "Please enter text representing a mathematical operation: ";
String s = System.console().readLine();
int l = s.length();
for (int count = 0; count < l; count++) {
	char c = charAt(count);
	if (c == '+' || c == '-' || c == '*' || c == '/' || c == ' ') {
		if (c != ' ') {
			char operand = c;
		}
	}
}
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