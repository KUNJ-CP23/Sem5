using System;

namespace Lab2.Classes
{
    public class Candidate
    {
        int Id;
        String Name;
        int Age;
        double Weight;
        double Height;

        public void GetCandidateDetails()
        {
            Console.WriteLine("Enter id of c1: ");
            Id = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter name of c1: ");
            Name = Console.ReadLine();
            Console.WriteLine("Enter age of c1: ");
            Age = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter weight of c1: ");
            Weight = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Enter height of c1: ");
            Height= Convert.ToDouble(Console.ReadLine());

        }

        public void DisplayCandidateDetails()
        {
            Console.WriteLine("Id: " + Id);
            Console.WriteLine("Name: " + Name);
            Console.WriteLine("Age: " + Age);
            Console.WriteLine("Weight: " + Weight);
            Console.WriteLine("Height: " + Height);
        }
    }
}
