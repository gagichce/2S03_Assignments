using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentOneGenerator
{
    class A1
    {
        public int test(TestCaseA1 thisCase, Dictionary<string, Interval> Intervals, List<string> ArbNums)
        {
            //not the prettyest thing, but had to be done. my fault for not keep them as ints.
            //I thought it would be better for printing later. I was wrong.
            List<int> tempList = new List<int>();
            foreach (string thisNum in ArbNums)
            {
                tempList.Add(int.Parse(thisNum));
            }
            int v = thisCase.V;
            int u = thisCase.U;
            int w = thisCase.W;
            if (v <= Intervals["V"].L)
            {
                if (u <= Intervals["U2"].L)
                {
                    if (w <= Intervals["W3"].L)
                        return tempList[0];
                    return tempList[1];
                }
                if (w <= Intervals["W2"].L)
                    return tempList[2];
                return tempList[3];
            }
            if (w <= Intervals["W1"].L)
            {
                if (u <= Intervals["U3"].L)
                    return tempList[4];
                return tempList[5];
            }
            if (u <= Intervals["U1"].L)
                return tempList[6];
            return tempList[7];
        }
    }
}
