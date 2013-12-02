using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Expression
    {
        protected Type thisType;
        object value;
        protected string name;

        public Expression(object value)
        {
            this.value = value;
            this.name = "";
            this.thisType = this.value.GetType();
        }

        public Expression()
        {
            this.name = "";
        }

        public object getValue()
        {
            return this.value;
        }
        public override string ToString()
        {
            if (this.name == "")
                return surrounds(JavaHelper.javaTypes[this.value.GetType()]);
            else
                return this.name;
        }


        public string surrounds(string toSurround)
        {
            if (this.thisType == typeof(String))
                return "\"" + toSurround + "\"";
            else if (this.thisType == typeof(Char))
                return "'" + toSurround + "'";
            return toSurround;
        }

        public Type getType()
        {
            return this.thisType;
        }
    }
}
