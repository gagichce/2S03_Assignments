using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentOneGenerator
{
    /// <summary>
    /// Handles all things to be randomized. 
    /// </summary>
    static class Randomizer
    {
        //make sure your random objects are static! otherwise your randoms will be static (bad news, maybe even slightly ironic)
        static Random randy = new Random();
        public static List<string> PickEight(int min, int max)
        {
            List<string> outlist = new List<string>();
            Random randy = new Random();
            do
            {
                int tempRand = randy.Next(min, max);
                if (!outlist.Contains(tempRand.ToString()))
                {
                    outlist.Add(tempRand.ToString());
                }
            } while (outlist.Count < 8);
            return outlist;
        }
        public static TestCaseA1 RandomTestCaseA1(int min, int max)
        {

            return new TestCaseA1(randy.Next(min + 1, max - 1), randy.Next(min + 1, max - 1), randy.Next(min + 1, max - 1));
        }
        public static TestCaseA2 RandomTestCaseA2(int max)
        {
            //made a1 and y negative because they are in the original problem.
            return new TestCaseA2(randy.Next(0, max), -randy.Next(0, max), randy.Next(max), randy.Next(1, max), -randy.Next(1, max));
        }
    }
}
