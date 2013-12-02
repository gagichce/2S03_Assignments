using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Assignment : Statement
    {
        Variable toAssign;
        Expression value;

        public Assignment(Variable toAssign, Expression value)
        {
            this.toAssign = toAssign;
            this.value = value;
        }

        public override string ToString()
        {
            return toAssign.ToString() + " = " + value.ToString() + ";";
        }
    }
}
