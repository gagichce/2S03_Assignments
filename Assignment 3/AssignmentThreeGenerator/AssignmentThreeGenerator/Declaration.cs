using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Declaration : Variable
    {
        JavaHelper.AccessModifiers accessType;

        public Declaration(JavaHelper.AccessModifiers accessType, string name, Type type)
            : base(type, name)
        {
            this.accessType = accessType;
        }

        public Declaration(string name, Type type)
            : base(type, name)
        {
            this.accessType = JavaHelper.AccessModifiers.Default;
        }

        public Declaration(Variable myVariable)
            :base(myVariable.getType(), myVariable.getName())
        {
            this.accessType = JavaHelper.AccessModifiers.Default;
        }
        public Declaration(JavaHelper.AccessModifiers accessType, string name, Type type, object value)
            : base(type, name, value)
        {
            this.accessType = accessType;
        }

        public Variable getVariable()
        {
            return new Variable(base.type, base.name, base.getValue());
        }

        public override string ToString()
        {
            string accessor = "";
            if (JavaHelper.AccessModifiers.Default != accessType)
                accessor = Enum.GetName(typeof(JavaHelper.AccessModifiers), accessType).ToLower() + " ";
            string type = "";
            type += JavaHelper.javaTypes[this.type] + " ";
            string assignment = "";
            if (base.getValue() != null)
            {
                assignment = " = " + base.getValue();
            }
            return accessor + type + base.name + assignment + ";";
        }

        public string ToFunctionString()
        {
            return JavaHelper.javaTypes[this.type] + " " + base.name;
        }
    }
}
