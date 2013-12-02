using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Variable : Expression
    {

        public Variable(string name, Type thisType)
        {
            base.name = name;
            base.thisType = thisType;
        }

        public Variable(string name, Type thisType, object value)
            : base(value)
        {
            base.thisType = thisType;
            base.name = name;
        }

        public override string ToString()
        {
            return ((base.getValue() == null) ? JavaHelper.javaTypes[base.thisType] : "") + this.name;
        }
    }
}
