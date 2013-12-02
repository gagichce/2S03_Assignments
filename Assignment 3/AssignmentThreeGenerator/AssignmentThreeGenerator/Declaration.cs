using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Declaration : Statement
    {
        JavaHelper.AccessModifiers accessType;
        private Variable toDeclare;
        Expression value;

        public Declaration(Variable toDeclare, Expression value, JavaHelper.AccessModifiers accessType)
        {
            this.value = value;
            this.toDeclare = toDeclare;
            this.accessType = accessType;
        }

        public Declaration(Variable toDeclare)
        {
            this.toDeclare = toDeclare;
            this.accessType = 0;
        }

        public Declaration(Variable toDeclare, Expression value)
        {
            this.value = value;
            this.toDeclare = toDeclare;
            this.accessType = 0;
        }

        public Variable getVariable()
        {
            return this.toDeclare;
        }

        public override string ToString()
        {
            if (value == null)
                return JavaHelper.getAccessModifier(accessType) + toDeclare.ToString();
            return toDeclare.ToString() + " = " + value.ToString();
        }
    }
}
