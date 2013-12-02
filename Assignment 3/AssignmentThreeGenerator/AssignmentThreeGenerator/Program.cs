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

            Variable myString = new Variable("this", typeof(int));
            Expression something = new Expression(new long[] {});
            Declaration decs = new Declaration(myString, something);
            Function myFunc = new Function(typeof(long[]), JavaHelper.AccessModifiers.Public, "makeStuffHappen");
            myFunc.setReturn(myString);
            myFunc.addStatement(decs);
            Console.WriteLine(myFunc.ToString());
            Console.ReadKey(true);
        }
    }
}
