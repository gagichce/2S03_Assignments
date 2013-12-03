using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentThreeGenerator
{
    class Value
    {
        private object value;
        protected Type type;

        public Value(Type type, object value)
        {
            this.type = type;
            this.value = value;
        }

        public Value(Type type) 
        {
            this.type = type;
        }

        public object getValue()
        {
            return this.value;
        }
    }
}
