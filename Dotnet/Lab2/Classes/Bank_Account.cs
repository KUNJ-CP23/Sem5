using System;

namespace Lab2.Classes
{
    internal class Bank_Account
    {
        int Account_No;
        String Email;
        String User_Name;
        String Account_Type;
        double Account_Balance;

        public void GetAccountDetails()
        {
            Console.Write("Enter Account_No: ");
            Account_No = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter Email: ");
            Email = Console.ReadLine();
            Console.Write("Enter User_Name: ");
            User_Name = Console.ReadLine();
            Console.Write("Enter Account_Type: ");
            Account_Type = Console.ReadLine();
            Console.Write("Enter Account_Balance: ");
            Account_Balance = Convert.ToInt32(Console.ReadLine());
        }
        public void DisplayAccountDetails()
        {
            Console.WriteLine("Account_No: " + Account_No);
            Console.WriteLine("Email: " + Email);
            Console.WriteLine("User_Name: " + User_Name);
            Console.WriteLine("Account_Type: " + Account_Type);
            Console.WriteLine("Account_Balance: " + Account_Balance);
        }
    }
}
