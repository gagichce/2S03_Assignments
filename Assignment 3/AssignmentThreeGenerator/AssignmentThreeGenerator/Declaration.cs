using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Declaration : Statement
    {
        //sigh, namespace issues... whenever they are printed the must be set to lower case, sigh\
        int accessType;
        Variable toDeclare;
        Expression value;

        public Declaration(Variable toDeclare, Expression value, int type)
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
                return JavaHelper.getAccessModifier(accessType) + toDeclare.ToString();
            return toDeclare.ToString() + " = " + value.ToString();
        }
    }
}
