﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Net;

namespace Assignment_2_Generator
{
    class Program
    {
        static void Main(string[] args)
        {
            WebPageParse thisParser = new WebPageParse("http://www.cas.mcmaster.ca/~se2s03/assignments/a2/a2links.html");
            List<int> studentNumbers = thisParser.getStudentNumbers();
            thisParser.changeAddress("http://www.cas.mcmaster.ca/~se2s03/assignments/a2/");
            List<StudentSolution> studentSolutions = new List<StudentSolution>();
            foreach (int studentNumber in studentNumbers)
            {
                StudentSolution thisSolution = new StudentSolution(studentNumber, thisParser.getBadCode(studentNumber));
                thisSolution.step1 = Stepper.BadToOne(thisSolution.BadCode);
                thisSolution.step2 = Stepper.OneToTwo(thisSolution.step1);
                thisSolution.step3 = Stepper.TwoToThree(thisSolution.step2);
                studentSolutions.Add(thisSolution);
            }
        }
    }
}