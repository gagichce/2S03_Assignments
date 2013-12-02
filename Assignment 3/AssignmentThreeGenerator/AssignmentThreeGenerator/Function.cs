using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Function : Statement
    {
        int accessType;
        Type returnType;
        Return functionReturn;
        string name;
        List<Declaration> myDecs = new List<Declaration>();
        List<Statement> body = new List<Statement>();

        public Function(Type returnType, int accessType, string name)
        {
            this.name = name;
            this.returnType = returnType;
            this.accessType = accessType;
        }

        public void setReturn(Expression myExpression)
        {
            functionReturn = new Return(myExpression);
        }

        public void addStatement(Statement myStatment)
        {
            body.Add(myStatment);
        }

        public override string ToString()
        {
            return "";
        }

        private string buildFunctionDefinition()
        {
            string myString = "";
            myString += JavaHelper.getAccessModifier(accessType) + " " + name + "(";
            foreach (Declaration myDeclaration in myDecs)
            {
                myString += myDeclaration.ToString() + (myDeclaration.Equals(myDecs[myDecs.Count - 1])? "" : ",");
            }
            myString += ")\n";
            return myString;
        }
    }
}
