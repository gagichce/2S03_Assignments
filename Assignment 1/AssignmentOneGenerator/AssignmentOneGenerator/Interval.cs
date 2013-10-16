using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentOneGenerator
{
    /// <summary>
    /// Represents a 'breakpoint' in the code. Intervals are usually used for making a sorting based decision, where a decision is made based on the upper/lower value
    /// </summary>
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
