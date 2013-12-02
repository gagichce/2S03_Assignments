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
        static void Main(string[] args)
        {
            //Type magicType = Type.GetType("Tuple");
            //ConstructorInfo magicConstructor = magicType.GetConstructor(Type.EmptyTypes);
            //object magicClassObject = magicConstructor.Invoke(new object[] { });

            //MethodInfo magicMethod = magicType.GetMethod("Create");
            //object magicValue = magicMethod.Invoke(magicClassObject, new object[] { 100 });

            //Console.WriteLine("MethodInfo.Invoke() Example\n");
            //Console.WriteLine("MagicClass.ItsMagic() returned: {0}", magicValue);
            Variable<int> myString = new Variable<int>("this");
            Expression<int> something = new Expression<int>(15);
            Declaration<int> decs = new Declaration<int>(myString, null, 2);
            Console.WriteLine(decs.ToString());
            Console.ReadKey(true);
        }
    }
}
