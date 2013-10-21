//Colin Gagich
//1224692
//October 5th 2013
//Assignment 1, Generator - Bonus
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentOneGenerator
{
    class Program
    {
        static void Main(string[] args)
        {
            const int maxInt = 100;
            const int minInt = -100;
            ReadWrite.ResetOut();
            foreach (string student in ReadWrite.GetStudentNumbers())
            {
                ReadWrite.MakeStudentFolder(student);
                ReadWrite.CreateSolutionA1(BuildIntervals.BuildInterval(minInt, maxInt), student, minInt, maxInt);
                ReadWrite.CreateSolutionA2(student, 31, 5);
            }
        }
    }
}
