using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Class : Statement
    {
        private List<Function> functions = new List<Function>();
        private List<Declaration> fieldVariables = new List<Declaration>();

        private string name;
        public Class(string name)
        {
            this.name = name;
        }
        public void addFunction(Function toAdd)
        {
            functions.Add(toAdd);
        }

        public void addDeclaration(Declaration myDec)
        {
            fieldVariables.Add(myDec);
        }
    }
}
