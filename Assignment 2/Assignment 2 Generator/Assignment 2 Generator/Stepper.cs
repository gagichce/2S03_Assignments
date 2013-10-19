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
            thisRegex = new Regex(@"\n.+(i;)");
            step2 = thisRegex.Replace(step2, "");
            return step2;
        }

        public static string ThreeToFour(string step3)
        {
            Regex thisRegex = new Regex(@"(aa|bb|cc)\s=\s([(].+?[)])");
            foreach (Match thisMatch in thisRegex.Matches(step3))
            {
                Regex secondRegex = new Regex(@"(\(|[+]\s)(" + thisMatch.Groups[1].Value + @")(\s|\)|;)");
                Match matchInMatch = secondRegex.Match(step3);
                step3 = secondRegex.Replace(step3, isNotBracket(matchInMatch.Groups[1].Value) + thisMatch.Groups[2].Value + isNotBracket(matchInMatch.Groups[3].Value));
                step3 = (new Regex(@"\s{2,}(" + thisMatch.Groups[1].Value + ").+")).Replace(step3, "");
            }
            return step3;
        }

        private static string isNotBracket(string hasBracket)
        {
            return (hasBracket == ")" || hasBracket == "(") ? "" : hasBracket;
        }
    }
}
