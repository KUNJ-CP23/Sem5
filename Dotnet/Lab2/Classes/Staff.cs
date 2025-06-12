using System;

namespace Lab2.Classes
{
    public class Staff
    {
        String Name;
        String Department;
        String Designation;
        String Experience;
        int Salary;

        public void GetDetails()
        {
            Console.WriteLine("Enter Name: ");
            Name = Console.ReadLine();
            Console.WriteLine("Enter Department: ");
            Department = Console.ReadLine();
            Console.WriteLine("Enter Designation: ");
            Designation = Console.ReadLine();
            Console.WriteLine("Enter Experience: ");
            Experience = Console.ReadLine();
            Console.WriteLine("Enter Salary: ");
            Salary = Convert.ToInt32(Console.ReadLine());
        }
        public void DisplayNameAndSalaryOfHod()
        {
            if(Department == "HOD")
            {
                Console.WriteLine(Name);
                Console.WriteLine(Salary);
            }
        }
    }
}
