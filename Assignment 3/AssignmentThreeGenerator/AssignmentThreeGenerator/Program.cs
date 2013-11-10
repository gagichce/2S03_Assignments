using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Reflection.Emit;
using System.Reflection;

namespace AssignmentThreeGenerator
{
    class Program
    {
        List<object> myList = new List<object>();
        public static object[] myArray = new object[] { 4, "adas" };
        static void Main(string[] args)
        {
            Type magicType = Type.GetType("Tuple");
            ConstructorInfo magicConstructor = magicType.GetConstructor(Type.EmptyTypes);
            object magicClassObject = magicConstructor.Invoke(new object[] { });

            MethodInfo magicMethod = magicType.GetMethod("Create");
            object magicValue = magicMethod.Invoke(magicClassObject, new object[] { 100 });

            Console.WriteLine("MethodInfo.Invoke() Example\n");
            Console.WriteLine("MagicClass.ItsMagic() returned: {0}", magicValue);
        }

        static public object generateMatrix(Type Typed, int flat, int dimension)
        {
            

            var Tuplssda = Tuple.Create(3);
            return new object();
        }
    }
}
