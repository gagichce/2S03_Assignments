using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Text.RegularExpressions;

namespace Assignment_2_Generator
{
    static class Stepper
    {
        public static string BadToOne(string BadCode)
        {
            Regex thisRegex = new Regex(@"(public)(\s\w*\s\w*\s\w*;)");
            foreach(Match thisMatch in thisRegex.Matches(BadCode))
            {
                BadCode = thisRegex.Replace(BadCode, "private" + thisMatch.Groups[2].Value, 1);
            }
            return BadCode;
        }

        public static string OneToTwo(string step1)
        {
            return (new Regex(@"(while)")).Replace(step1, "if");
        }
        public static string TwoToThree(string step2)
        {
            Regex thisRegex = new Regex(@"\s+if(.+\n.+\n.+\n)");
            step2 = thisRegex.Replace(step2, "\n");
            thisRegex = new Regex(@"\s+i\s.+\n");
            step2 = thisRegex.Replace(step2, "\n");
            return step2;
        }

        public static string ThreeToFour()
        {
            return "";
        }
    }
}
