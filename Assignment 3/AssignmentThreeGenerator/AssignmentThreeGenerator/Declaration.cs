using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Declaration<T> : Statement
    {
        //sigh, namespace issues... whenever they are printed the must be set to lower case, sigh
        enum AccessModifiers {Public = 1, Private};
        int accessType;
        Variable<T> toDeclare;
        Expression<T> value;

        public Declaration(Variable<T> toDeclare, Expression<T> value, int type)
        {
            this.value = value;
            this.toDeclare = toDeclare;
            this.accessType = type;
        }

        //public Declaration(Variable<T> toDeclare, Expression<T> value, )
        //{
        //    this.value = value;
        //    this.toDeclare = toDeclare;
        //}

        public string ToString()
        {
            if (value == null)
                return (accessType == 0 ? "" :Enum.GetName(typeof(AccessModifiers), accessType).ToLower() + " ") + toDeclare.ToString() + ";";
            return toDeclare.ToString() + " = " + value.ToString() + ";" ;
        }
    }
}
