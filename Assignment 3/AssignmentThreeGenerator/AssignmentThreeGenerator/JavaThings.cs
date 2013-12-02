using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    static class JavaHelper
    {
        public enum AccessModifiers { Public = 1, Private };
        public static Dictionary<Type, string> javaTypes = new Dictionary<Type, string>() 
        {
            {typeof(String), "String"}, 
            {typeof(int), "Integer"},
            {typeof(char), "char"},
            {typeof(void), "void"}
        };

        public static string getAccessModifier(int accessType)
        {
            return (accessType == 0 ? "" : Enum.GetName(typeof(JavaHelper.AccessModifiers), accessType).ToLower() + " ");
        }
    }
}
