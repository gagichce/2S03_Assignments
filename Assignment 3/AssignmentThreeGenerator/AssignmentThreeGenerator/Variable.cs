using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Variable
    {
        Type thisType;
        string name;

        public Variable(string name, Type thisType)
        {
            this.name = name;
            this.thisType = thisType;
        }

        public override string ToString()
        {
            return JavaHelper.javaTypes[thisType] + " " + this.name;
        }
    }
}
