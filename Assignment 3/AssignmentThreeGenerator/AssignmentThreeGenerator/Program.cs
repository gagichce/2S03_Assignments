using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Reflection.Emit;
using System.Reflection;

namespace AssignmentThreeGenerator
{
    class myVal
    {
        public object value;

        public myVal(object value)
        {
            this.value = value;
        }
    }

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
            Variable myString = new Variable(typeof(string), "myString");

            Function myFunc = new Function(JavaHelper.AccessModifiers.Public, typeof(string), "makeStuffHappen");
            myFunc.setReturn(myString);
            //myFunc.addStatement(decs);
            List<myVal> myList = new List<myVal>();
            myList.Add(new myVal(3L));
            Console.WriteLine(myList[0].value);
            Console.WriteLine(myFunc.ToString());
            Console.ReadKey(true);
        }
    }
}
