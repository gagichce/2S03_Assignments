using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Return : Statement
    {
        Type returnType;
        Expression toReturn;

        public Return(Expression toReturn)
        {
            this.toReturn = toReturn;
            this.returnType = toReturn.getType();
        }

        public override string ToString()
        {
            return "return " + toReturn.ToString() + ";";
        }
    }
}
