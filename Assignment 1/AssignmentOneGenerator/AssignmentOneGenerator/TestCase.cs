using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

//these two classes will model each test case generated for each solution.
namespace AssignmentOneGenerator
{
    class TestCaseA1
    {
        public int V;
        public int U;
        public int W;

        public TestCaseA1(int v, int u, int w)
        {
            V = v;
            U = u;
            W = w;
        }
    }

    class TestCaseA2
    {
        public int A0;
        public int A1;
        public int AN;
        public int X;
        public int Y;

        public TestCaseA2(int a0, int a1, int an, int x, int y)
        {
            A0 = a0;
            A1 = a1;
            AN = an;
            X = x;
            Y = y;
        }
    }
}
