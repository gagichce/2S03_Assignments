using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentOneGenerator
{
    class Interval
    {
        public int L;
        public int U;

        public void setL(int par1)
        {
            this.L = par1;
            this.U = this.L + 1;
        }
        public void setU(int par1)
        {
            this.U = par1;
            this.L = this.U - 1;
        }

        public Interval(int par1)
        {
            setL(par1);
        }
    }
}
