//Specifies points 1 and 2
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
print "Please input y coordinate of Point 2: ";
s = System.console().readLine();
point2.y = Double.parseDouble(s);

//Specifies points of rectangle1.
Rectangle rectangle1 = new Rectangle();
rectangle1.upLeft = point1;
rectangle1.downRight = point2;

//Specifies points 3 and 4
Point point3 = new Point();
print "Please input x coordinate of Point 3: ";
s = System.console().readLine();
point3.x = Double.parseDouble(s);
print "Please input y coordinate of Point 3: ";
s = System.console().readLine();
point3.y = Double.parseDouble(s);
Point point4 = new Point();
print "Please input x coordinate of Point 4: ";
s = System.console().readLine();
point4.x = Double.parseDouble(s);
print "Please input y coordinate of Point 4: ";
s = System.console().readLine();
point4.y = Double.parseDouble(s);

//Specifies points of rectangle2.
Rectangle rectangle2 = new Rectangle();
rectangle2.upLeft = point3;
rectangle2.downRight = point4;

class Point {
	int x;
	int y;
}

class Rectangle {
	Point upLeft;
	Point downRight;
}