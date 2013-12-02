using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Assignment<T> : Statement
    {
        Variable<T> toAssign;
        Expression<T> value;

        public Assignment(Variable<T> toAssign, Expression<T> value)
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
