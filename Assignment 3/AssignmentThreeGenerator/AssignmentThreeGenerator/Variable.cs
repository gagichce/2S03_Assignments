using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Variable<T>
    {
        Type thisType;
        string name;

        private Dictionary<Type, string> javaTypes = new Dictionary<Type, string>() 
        {
            {typeof(String), "String"}, 
            {typeof(int), "Integer"},
            {typeof(char), "char"}
        };

        public Variable(string name)
        {
            this.name = name;
            this.thisType = typeof(T);
        }

        public override string ToString()
        {
            return javaTypes[thisType] + " " + this.name;
        }
    }
}
