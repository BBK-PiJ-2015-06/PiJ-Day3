Point point1 = new Point();
print "Please input x coordinate for Point 1: ";
String s = System.console().readLine();
point1.x = Double.parseDouble(s);
print "Please input y coordinate for Point 1: ";
s = System.console().readLine();
point1.y = Double.parseDouble(s);
println point1.x + ", " + point1.y


class Point {
	double x;
	double y;
}