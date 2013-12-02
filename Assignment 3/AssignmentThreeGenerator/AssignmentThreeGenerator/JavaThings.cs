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
        public enum AccessModifiers { Public , Private };
        public static Dictionary<Type, string> javaTypes = new Dictionary<Type, string>() 
        {
            {typeof(String), "String "}, 
            {typeof(int), "Integer "},
            {typeof(char), "char "},
            {typeof(void), "void "},
            {typeof(long[]), "long[] "}
        };

        public static string getAccessModifier(AccessModifiers accessType)
        {
            return (accessType == 0 ? "" : Enum.GetName(typeof(AccessModifiers), accessType).ToLower() + " ");
        }
        public static string getFunctionAccessModifier(AccessModifiers accessType)
        {
            return Enum.GetName(typeof(AccessModifiers), accessType).ToLower() + " ";
        }
    }
}
