using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Return : Statement
    {
        Variable value;

        public Return(Variable value)
        {
            this.value = value;
        }

        public override string ToString()
        {
            return "return " + value.getName() + ";";
        }
    }
}
