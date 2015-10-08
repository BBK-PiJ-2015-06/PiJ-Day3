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
Rectangle myRectangle = new Rectangle();
myRectangle.upLeft = point1;
myRectangle.downRight = point2;
double area = Math.abs(myRectangle.downRight.x - myRectangle.upLeft.x)*Math.abs(myRectangle.downRight.y - myRectangle.upLeft.y);
double perimeter = 2*(Math.abs(myRectangle.downRight.x - myRectangle.upLeft.x) + Math.abs(myRectangle.downRight.y - myRectangle.upLeft.y));
println "Area: " + area;
println "Perimeter: " + perimeter;
class Point {
	double x;
	double y;
}
class Rectangle {
	Point upLeft;
	Point downRight;
}