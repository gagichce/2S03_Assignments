using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Add<T>
    {
        Expression<T> left;
        Expression<T> right;

        public override string ToString()
        {
            return left.ToString() + " + " + right.ToString();
        }
    }
}
