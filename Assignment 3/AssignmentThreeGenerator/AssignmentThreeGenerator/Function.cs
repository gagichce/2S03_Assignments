using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Function : Statement
    {
        JavaHelper.AccessModifiers accessType;
        Type returnType;
        Return functionReturn;
        string name;
        private List<Declaration> myDecs = new List<Declaration>();
        private List<Statement> body = new List<Statement>();

        public Function(Type returnType, JavaHelper.AccessModifiers accessModifer, string name)
        {
            this.name = name;
            this.returnType = returnType;
            this.accessType = accessModifer;
        }

        public void setReturn(Expression myExpression)
        {
            if (returnType != typeof(void))
            {
                functionReturn = new Return(myExpression);
            }
        }

        public void addStatement(Statement myStatment)
        {
            body.Add(myStatment);
        }

        public override string ToString()
        {
            return buildFunctionParameters() + buildFunctionBody();
        }

        private string buildFunctionParameters()
        {
            string myString = "";
            myString += JavaHelper.getFunctionAccessModifier(accessType) + JavaHelper.javaTypes[returnType] + name + "(";
            foreach (Declaration myDeclaration in myDecs)
            {
                myString += myDeclaration.ToString() + (myDeclaration.Equals(myDecs[myDecs.Count - 1]) ? "" : ", ");
            }
            myString += ")\n";
            return myString;
        }

        private string buildFunctionBody()
        {
            string myString = "{\n";
            foreach (Statement myStat in body)
            {
                myString += myStat.ToString() + ";\n";
            }
            if (returnType != typeof(void))
            {
                myString += functionReturn.ToString() + "\n";
            }
            return myString + "}";
        }
    }
}
