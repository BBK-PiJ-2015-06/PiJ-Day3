//Specifies x and y coordinates of points1 & 2.
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

//Specifies points of myRectangle.
Rectangle myRectangle = new Rectangle();
myRectangle.upLeft = point1;
myRectangle.downRight = point2;

// Specifies x and y coordinates of point3.
Point point3 = new Point();
print "Please input x coordinate of Point 3: ";
s = System.console().readLine();
point3.x = Double.parseDouble(s);
print "Please input x coordinate of Point 3: ";
s = System.console().readLine();
point3.x = Double.parseDouble(s);

//Tests whether point3 is inside myRectangle.
boolean inside = true;
if (point3.x < myRectangle.upLeft.x && point3.x < myRectangle.downRight.x) {
	inside = false;
}
if (point3.x > myRectangle.upLeft.x && point3.x > myRectangle.downRight.x) {
	inside = false;
}
if (point3.y < myRectangle.upLeft.y && point3.x < myRectangle.downRight.y) {
	inside = false;
}
if (point3.x < myRectangle.upLeft.x && point3.x < myRectangle.downRight.x) {
	inside = false;
}

//Produces output depending on boolean outcome.
if (inside) {
	println "Point 3 is inside the rectangle defined by Point1 and Point 2.";
} else {
	println "Point 3 is not inside the rectangle defined by Point 1 and Point 2.";
}

class Point {
	double x;
	double y;
}
class Rectangle {
	Point upLeft;
	Point downRight;
}