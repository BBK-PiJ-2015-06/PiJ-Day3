Point point1 = new Point();
print "Please input x coordinate of Point 1: ";
String s = System.console().readLine();
point1.x = Double.parseDouble(s);
print "Please input y coordinate of Point 1: ";
s = System.console().readLine();
point1.y = Double.parseDouble(s);
Point point2 = new Point();
print "Please input x coordinate of Point 2: ";
s = System.console().readLine();
point2.x = Double.parseDouble(s);
print "Please input y coordinate of Point 1: ";
s = System.console().readLine();
point2.y = Double.parseDouble(s);



class Point {
	double x;
	double y;
}

class Rectangle {
	Point upLeft;
	Point downRight;
}