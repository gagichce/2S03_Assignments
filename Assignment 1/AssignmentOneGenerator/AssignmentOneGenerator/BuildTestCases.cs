using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentOneGenerator
{
    
    /// <summary>
    /// handles building output for the test case files
    /// </summary>
    class BuildTestCasesA1
    {
        Dictionary<string, Interval> Intervals;
        List<string> ArbNums;
        int minInt;
        int maxInt;
        public BuildTestCasesA1(Dictionary<string, Interval> Ints, List<string> Arbs, int min, int max)
        {
            maxInt = max;
            minInt = min;
            Intervals = Ints;
            ArbNums = Arbs;
        }

        /// <summary>
        /// since the return value of each test case is naturally arbitrary, as in the only important part is that some of the test cases return the same value. This links them together.
        /// </summary>
        /// <param name="minTestCases"></param>
        /// <returns></returns>
        public List<string> GenerateTestDataA1(int minTestCases)
        {
            List<string> A1TestOutput = new List<string>();
            Dictionary<int, int> counter = new Dictionary<int, int>();
            foreach (string thisInt in ArbNums)
            {
                counter.Add(int.Parse(thisInt), 0);
            }
            A1 tester = new A1();
            do
            {
                TestCaseA1 thisTestCase = Randomizer.RandomTestCaseA1(minInt, maxInt);
                int group = tester.test(thisTestCase, Intervals, ArbNums);
                if (counter[group] < 10)
                {
                    counter[group] += 1;
                    A1TestOutput.Add("\t\tassertEquals(\"cases(" + thisTestCase.V + "," + thisTestCase.U + "," + thisTestCase.W + ") must be " + group + "\", " + group + ", tester.cases(" + thisTestCase.V + "," + thisTestCase.U + "," + thisTestCase.W + "));");
                }
            } while (!Done(counter, minTestCases));
            return A1TestOutput;
        }
        /// <summary>
        /// little helper function to determine if enough test cases have been generated yet. 
        /// </summary>
        /// <param name="thisCounter">the number of test cases that have already been generated</param>
        /// <param name="minCases"> the minimum number of cases required for each return value</param>
        /// <returns></returns>
        bool Done(Dictionary<int, int> thisCounter, int minCases)
        {
            foreach (KeyValuePair<int, int> thisPair in thisCounter)
            {
                if (thisPair.Value < minCases)
                    return false;
            }
            return true;
        }
    }
    class BuildTestCasesA2
    {
        public List<string> GenerateTestDataA2(TestCaseA2 thisTestCase, int numTestCases, int max)
        {
            List<string> A2TestOutput = new List<string>();
            A2 tester = new A2();
            for (int i = 0; i < numTestCases; i++)
            {
                int value = tester.test(i, thisTestCase);
                A2TestOutput.Add("\t\tassertEquals(\"Rec(" + i + ") must be " + value + "\", " + value + ", tester.Rec(" + i + "));");
            }
            return A2TestOutput;
        }
    }
}
