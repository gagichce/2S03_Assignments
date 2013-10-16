using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentOneGenerator
{
    /// <summary>
    /// reproduces solution A2 and generates it return value. This is for building the test case file.
    /// </summary>
    class A2
    {
        public int test(int n, TestCaseA2 thisCase)
        {
            int a0 = thisCase.A0, a1 = thisCase.A1, an = thisCase.AN;
            int x = thisCase.X, y = thisCase.Y;

            if (n == 0) return a0;
            if (n == 1) return a1;

            for (int i = 2; i <= n; i++)
            {
                an = x * a0 + y * a1;
                a0 = a1;
                a1 = an;
            }
            return an;
        }
    }
}
