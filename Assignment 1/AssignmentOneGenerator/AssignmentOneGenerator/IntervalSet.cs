using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AssignmentOneGenerator
{
    static class MiddleInterval
    {
        /// <summary>
        /// Returns intervals somewhere in the middle of given interval
        /// </summary>
        /// <param name="par1"></param>
        /// <param name="par2"></param>
        /// 
        //good ol' randy is the best
        static Random randy = new Random();
        public static Interval GetInterval(int minInt, int maxInt)
        {
            minInt -= 1;
            maxInt -= 1;
            
            int pseudoMiddle;
            //I abstracted the problem into "intervals" the main interval seemed to revolve roughly around the center of the min/max integers in the set
            int average = (int)(minInt + maxInt) / 2;
            int difference = Math.Abs(minInt) + Math.Abs(maxInt);
            //some arbitrary point, close to the center. in this case ~+-20%
            pseudoMiddle = randy.Next((int)(average - difference * 0.1), (int)(average + difference * 0.1));
            Interval V = new Interval(pseudoMiddle);
            return V;
        }
    }

    /// <summary>
    /// builds a set of randomly generated intervals, where the next interval is based on the previous.
    /// </summary>
    class BuildIntervals
    {
        public static Dictionary<string, Interval> BuildInterval(int min, int max)
        {
            Dictionary<string, Interval> Intervals = new Dictionary<string, Interval>();
            Intervals.Add("V", MiddleInterval.GetInterval(min, max));
            Intervals.Add("U2", MiddleInterval.GetInterval(min, max));
            Intervals.Add("U1", MiddleInterval.GetInterval(min, Intervals["U2"].L));
            Intervals.Add("U3", MiddleInterval.GetInterval(Intervals["U2"].U, max));
            Intervals.Add("W2", MiddleInterval.GetInterval(min, max));
            Intervals.Add("W1", MiddleInterval.GetInterval(min, Intervals["W2"].L));
            Intervals.Add("W3", MiddleInterval.GetInterval(Intervals["W2"].U, max));
            return Intervals;
        }
    }
}
