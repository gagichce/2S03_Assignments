using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Expression<T>
    {
        object value;

        public Expression(T value)
        {
            this.value = value;
        }
        public override string ToString()
        {
            return surrounds(this.value.ToString());
        }

        public string surrounds(string toSurround){
            Type myType = this.value.GetType();
            if (myType == typeof(String))
                return "\"" + toSurround + "\"";
            else if (myType == typeof(Char))
                return "'" + toSurround + "'";
            return toSurround;
        }
    }
}
