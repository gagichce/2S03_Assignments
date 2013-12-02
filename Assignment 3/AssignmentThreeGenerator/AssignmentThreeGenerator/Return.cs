using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Return : Statement
    {
        Expression toReturn;

        public Return(Expression toReturn)
        {
            this.toReturn = toReturn;
        }

        public override string ToString()
        {
            return "return " + toReturn.ToString() + ";";
        }
    }
}
