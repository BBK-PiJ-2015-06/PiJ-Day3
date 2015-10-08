//Creates points 1 and 2 objects
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

//Creates object rectangle1.
Rectangle rectangle1 = new Rectangle();
rectangle1.upLeft = point1;
rectangle1.downRight = point2;

//Creates points 3 and 4 objects
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

//Creates object rectangle2.
Rectangle rectangle2 = new Rectangle();
rectangle2.upLeft = point3;
rectangle2.downRight = point4;

//Creates additional point object.
Point point5 = new Point();
print "Please input x coordinate of Point 5: ";
s = System.console().readLine();
point5.x = Double.parseDouble(s);
print "Please input y coordinate of Point 5: ";
s = System.console().readLine();
point5.y = Double.parseDouble(s);

//Tests whether Point 5 is inside rectangle1.
boolean insideRectangle1 = true;
if (point5.x < rectangle1.upLeft.x && point5.x < rectangle1.downRight.x) {
	insideRectangle1 = false;
}
if (point5.x > rectangle1.upLeft.x && point5.x > rectangle1.downRight.x) {
	insideRectangle1 = false;
}
if (point5.y < rectangle1.upLeft.y && point5.y < rectangle1.downRight.y) {
	insideRectangle1 = false;
}
if (point5.y > rectangle1.upLeft.y && point5.y > rectangle1.downRight.y) {
	insideRectangle1 = false;
}

//Tests whether Point 5 is inside rectangle2.
boolean insideRectangle2 = true;
if (point5.x < rectangle2.upLeft.x && point5.x < rectangle2.downRight.x) {
	insideRectangle2 = false;
}
if (point5.x > rectangle2.upLeft.x && point5.x > rectangle2.downRight.x) {
	insideRectangle2 = false;
}
if (point5.y < rectangle2.upLeft.y && point5.y < rectangle2.downRight.y) {
	insideRectangle2 = false;
}
if (point5.y > rectangle2.upLeft.y && point5.y > rectangle2.downRight.y) {
	insideRectangle2 = false;
}

if (insideRectangle1 && insideRectangle2) {
	println "Point 5 is inside BOTH rectangles.";
} else if (insideRectangle1 && !insideRectangle2) {
	println "Point 5 is ONLY inside Rectangle 1.";
} else if (!insideRectangle1 && insideRectangle2) {
	println "Point 5 is ONLY inside Rectangle 2.";
} else {
	println "Point 5 is OUTSIDE BOTH rectangles.";
}

class Point {
	int x;
	int y;
}
class Rectangle {
	Point upLeft;
	Point downRight;
}