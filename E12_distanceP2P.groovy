Point point1 = new Point();
print "Please input x coordinate for Point 1: ";
String s = System.console().readLine();
point1.x = Double.parseDouble(s);
print "Please input y coordinate for Point 1: ";
s = System.console().readLine();
point1.y = Double.parseDouble(s);
println "Point 1: " + point1.x + ", " + point1.y

Point point2 = new Point();
print "Please input x coordinate for Point 2: ";
s = System.console().readLine();
point2.x = Double.parseDouble(s);
print "Please input y coordinate for Point 2: ";
s = System.console().readLine();
point2.y = Double.parseDouble(s);
println "Point 2: " + point2.x + ", " + point2.y

Point point3 = new Point();
print "Please input x coordinate for Point 3: ";
s = System.console().readLine();
point3.x = Double.parseDouble(s);
print "Please input y coordinate for Point 3: ";
s = System.console().readLine();
point3.y = Double.parseDouble(s);
println "Point 3: " + point3.x + ", " + point3.y

class Point {
	double x;
	double y;
}