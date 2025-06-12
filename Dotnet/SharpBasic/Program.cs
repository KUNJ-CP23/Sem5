// See https://aka.ms/new-console-template for more information

Console.WriteLine("Hello, World!");

// 1. Print Name, Address, Contact Number, City
Console.WriteLine("Name: Kunj Ramoliya");
Console.WriteLine("Address: Example Street");
Console.WriteLine("Contact Number: 9876543210");
Console.WriteLine("City: Rajkot");

// 2. Get two numbers from user and print them
Console.Write("Enter first number: ");
int num1 = Convert.ToInt32(Console.ReadLine());
Console.Write("Enter second number: ");
int num2 = Convert.ToInt32(Console.ReadLine());
Console.WriteLine($"Two numbers are: {num1} and {num2}");

// 3. Input name and country, print "Hello from <country>"
Console.Write("Enter your name: ");
string name = Console.ReadLine();
Console.Write("Enter your country: ");
string country = Console.ReadLine();
Console.WriteLine($"Hello from {country}");

// 4. Calculate area in square feet
Console.Write("Enter length in feet: ");
double length = Convert.ToDouble(Console.ReadLine());
Console.Write("Enter width in feet: ");
double width = Convert.ToDouble(Console.ReadLine());
double area = length * width;
Console.WriteLine($"Area: {area} square feet");

// 5. Area of Square, Rectangle, Circle
Console.Write("Enter side of square: ");
double squareSide = Convert.ToDouble(Console.ReadLine());
Console.WriteLine($"Area of Square: {squareSide * squareSide}");

Console.Write("Enter length of rectangle: ");
double rectLength = Convert.ToDouble(Console.ReadLine());
Console.Write("Enter width of rectangle: ");
double rectWidth = Convert.ToDouble(Console.ReadLine());
Console.WriteLine($"Area of Rectangle: {rectLength * rectWidth}");

Console.Write("Enter radius of circle: ");
double radius = Convert.ToDouble(Console.ReadLine());
Console.WriteLine($"Area of Circle: {Math.PI * radius * radius}");

// 6. Celsius <-> Fahrenheit Conversion using function
double CelsiusToFahrenheit(double c) => (c * 9 / 5) + 32;
double FahrenheitToCelsius(double f) => (f - 32) * 5 / 9;

Console.Write("Enter temperature in Celsius: ");
double celsius = Convert.ToDouble(Console.ReadLine());
Console.WriteLine($"Fahrenheit: {CelsiusToFahrenheit(celsius)}");

Console.Write("Enter temperature in Fahrenheit: ");
double fahrenheit = Convert.ToDouble(Console.ReadLine());
Console.WriteLine($"Celsius: {FahrenheitToCelsius(fahrenheit)}");

// 7. Simple Interest using function
double SimpleInterest(double p, double r, double n) => (p * r * n) / 100;
Console.Write("Enter Principal: ");
double principal = Convert.ToDouble(Console.ReadLine());
Console.Write("Enter Rate: ");
double rate = Convert.ToDouble(Console.ReadLine());
Console.Write("Enter Time: ");
double time = Convert.ToDouble(Console.ReadLine());
Console.WriteLine($"Simple Interest: {SimpleInterest(principal, rate, time)}");

// 8. Simple Calculator (if-else & switch)
Console.Write("Enter first number: ");
double a = Convert.ToDouble(Console.ReadLine());
Console.Write("Enter second number: ");
double b = Convert.ToDouble(Console.ReadLine());
Console.Write("Enter operation (+, -, *, /): ");
string op = Console.ReadLine();

if (op == "+")
    Console.WriteLine($"Result: {a + b}");
else if (op == "-")
    Console.WriteLine($"Result: {a - b}");
else if (op == "*")
    Console.WriteLine($"Result: {a * b}");
else if (op == "/")
    Console.WriteLine(b != 0 ? $"Result: {a / b}" : "Cannot divide by zero");
else
    Console.WriteLine("Invalid operation");

switch (op)
{
    case "+":
        Console.WriteLine($"[Switch] Result: {a + b}");
        break;
    case "-":
        Console.WriteLine($"[Switch] Result: {a - b}");
        break;
    case "*":
        Console.WriteLine($"[Switch] Result: {a * b}");
        break;
    case "/":
        Console.WriteLine(b != 0 ? $"[Switch] Result: {a / b}" : "Cannot divide by zero");
        break;
    default:
        Console.WriteLine("[Switch] Invalid operation");
        break;
}

// 9. Swap without using third variable
Console.Write("Enter first number to swap: ");
int x = Convert.ToInt32(Console.ReadLine());
Console.Write("Enter second number to swap: ");
int y = Convert.ToInt32(Console.ReadLine());
x = x + y;
y = x - y;
x = x - y;
Console.WriteLine($"After swapping: x = {x}, y = {y}");

// 10. Maximum of 3 numbers using ternary operator
Console.Write("Enter first number: ");
int n1 = Convert.ToInt32(Console.ReadLine());
Console.Write("Enter second number: ");
int n2 = Convert.ToInt32(Console.ReadLine());
Console.Write("Enter third number: ");
int n3 = Convert.ToInt32(Console.ReadLine());
int max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
Console.WriteLine($"Maximum is: {max}");
