using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Variable : Value
    {
        protected string name;

        public Variable(Type type, string name, object myObject)
            : base(type, myObject)
        {
            this.name = name;
        }

        public Variable(Type type, string name)
            : base(type)
        {
            this.name = name;
        }

        public Type getType()
        {
            return this.type;
        }
        public string getName()
        {
            return this.name;
        }
    }
}
