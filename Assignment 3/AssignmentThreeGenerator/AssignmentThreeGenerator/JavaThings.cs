using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    static class JavaHelper
    {
        //namespace issues
        public enum AccessModifiers { Default, Public, Private };
        public static Dictionary<Type, string> javaTypes = new Dictionary<Type, string>() 
        {
            {typeof(String), "String "}, 
            {typeof(int), "Integer "},
            {typeof(char), "char "},
            {typeof(void), "void "},
            {typeof(long[]), "long[] "}
        };

        public static string getFunctionAccessModifier(AccessModifiers accessType)
        {
            if (accessType != AccessModifiers.Default)
                return Enum.GetName(typeof(AccessModifiers), accessType).ToLower() + " ";
            return "";
        }
    }
}
