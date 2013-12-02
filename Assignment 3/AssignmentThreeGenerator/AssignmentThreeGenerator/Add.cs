using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Add
    {
        Expression left;
        Expression right;

        public override string ToString()
        {
            return left.ToString() + " + " + right.ToString();
        }
    }
}
