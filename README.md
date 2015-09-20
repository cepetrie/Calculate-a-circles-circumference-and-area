# Calculate-a-circles-circumference-and-area

Console:

Welcome to the Circle Tester

Enter radius:  3
Circumference: 18.85
Area:          28.27

Continue? (y/n): y

Enter radius:  6
Circumference: 37.7
Area:          113.1

Continue? (y/n): n

Goodbye. You created 2 Circle object(s).

Operation:

The application prompts the user to enter the radius of a circle.

If the user enters invalid data, the application displays an appropriate error message and prompts the user again until the user enters valid data.

When the user enters a valid radius, the application calculates and displays the circumference and area of the circle to the nearest 2 decimal places.

The application prompts the user to continue.

When the user chooses not to continue, the application displays a goodbye message that indicates the number of Circle objects that were created by the application.

Specifications:
Create a class named Circle to store the data about this circle. This class should contain these constructors and methods:
public Circle(double radius)
public double getCircumference()
public String getFormattedCircumference()
public double getArea()
public String getFormattedArea()
private String formatNumber(double x)
public static int getObjectCount()

The formulas for calculating circumference and area are:
circumference = 2 * pi * radius
area = pi * radius2

For the value of pi, use the PI constant of the java.lang.Math class (Math.PI )

Create a class named CircleApp that gets the user input, creates a Circle object, and displays the circumference and area.

Create a class named Validator  use its static methods to validate the data in this application.

