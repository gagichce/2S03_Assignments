using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace AssignmentOneGenerator
{
    /// <summary>
    /// class that handles everything IO. Also handles some of the combining and parsing (ugly)
    /// </summary>
    static class ReadWrite
    {
        public static List<string> GetStudentNumbers()
        {
            List<string> theseStudents = new List<string>();
            string[] lines = System.IO.File.ReadAllLines(@"students.txt");
            foreach (string line in lines)
            {
                theseStudents.Add(line);
            }
            return theseStudents;
        }

        public static void ResetOut()
        {
            if (Directory.Exists("out\\"))
                Directory.Delete("out\\", true);
        }

        public static void MakeStudentFolder(string student)
        {
            Directory.CreateDirectory("out\\" + student);
            Directory.CreateDirectory("out\\" + student + "\\se2s03");
        }
        public static void CreateSolutionA1(Dictionary<string, Interval> Intervals, string student, int min, int max)
        {
            List<string> ArbNums = Randomizer.PickEight(1, 15);
            string[] file = File.ReadAllLines(@"se2s03\\A1.java");

            //ugly? yes. 
            file[5] = file[5].Replace("[[VL]]", Intervals["V"].L.ToString());
            file[6] = file[6].Replace("[[U2L]]", Intervals["U2"].L.ToString());
            file[7] = file[7].Replace("[[W3L]]", Intervals["W3"].L.ToString());
            file[8] = file[8].Replace("[[0]]", ArbNums[0]);
            file[9] = file[9].Replace("[[1]]", ArbNums[1]);
            file[11] = file[11].Replace("[[W2L]]", Intervals["W2"].L.ToString());
            file[12] = file[12].Replace("[[2]]", ArbNums[2]);
            file[13] = file[13].Replace("[[3]]", ArbNums[3]);
            file[15] = file[15].Replace("[[W1L]]", Intervals["W1"].L.ToString());
            file[16] = file[16].Replace("[[U3L]]", Intervals["U3"].L.ToString());
            file[17] = file[17].Replace("[[4]]", ArbNums[4]);
            file[18] = file[18].Replace("[[5]]", ArbNums[5]);
            file[20] = file[20].Replace("[[U1L]]", Intervals["U1"].L.ToString());
            file[21] = file[21].Replace("[[6]]", ArbNums[6]);
            file[22] = file[22].Replace("[[7]]", ArbNums[7]);

            //add student number to top
            file[0] = "//Student Number: " + student;
            StreamWriter myStreamer = new StreamWriter("out\\" + student + "\\se2s03\\A1.java");
            foreach (string line in file)
            {
                myStreamer.WriteLine(line);
            }
            myStreamer.Close();

            file = File.ReadAllLines(@"A1Test.java");

            BuildTestCasesA1 theseTestCases = new BuildTestCasesA1(Intervals, ArbNums, min, max);

            List<string> listToWrite = new List<string>();
            listToWrite.Add("//Student Number: " + student);
            for (int i = 0; i < 19; i++)
            {
                listToWrite.Add(file[i]);
            }
            //the 3 is the minimum number of test cases to be generated. 
            //3 was chosen because in the original problem each return value had 3 or more test cases for its interval.
            listToWrite.AddRange(theseTestCases.GenerateTestDataA1(3));
            listToWrite.Add("\t}\n}");
            File.WriteAllLines("out\\" + student + "\\A1Test.java", listToWrite);
        }

        //DISCLAIMER, since the nature of this problem is expotential, 
        //it is almost too easy to get really large numbers really fast.
        //in truth, you do not need 30+ test cases to figure out a sequence, 
        //5 and maybe 10 at most is more than you would need.
        //So what I am saying is that it is more than possible, infact VERY possible that the 30th or so value in the sequence is an overflowed value.
        public static void CreateSolutionA2(string student, int numTestCases, int max)
        {
            string[] file = File.ReadAllLines(@"se2s03\\A2.java");
            TestCaseA2 thisTestCase = Randomizer.RandomTestCaseA2(max);

            file[4] = file[4].Replace("[[0]]", thisTestCase.A0.ToString());
            file[4] = file[4].Replace("[[1]]", thisTestCase.A1.ToString());
            file[4] = file[4].Replace("[[2]]", thisTestCase.AN.ToString());
            file[5] = file[5].Replace("[[3]]", thisTestCase.X.ToString());
            file[5] = file[5].Replace("[[4]]", thisTestCase.Y.ToString());

            File.WriteAllLines("out\\" + student + "\\se2s03\\A2.java", (new string[] { "//Student Number: " + student }).Union(file));

            BuildTestCasesA2 thisBuilder = new BuildTestCasesA2();
            List<string> outBuffer = new List<string>();
            file = File.ReadAllLines(@"A2Test.java");
            outBuffer.Add("//Student Number: " + student);
            for (int i = 0; i < 17; i++)
            {
                outBuffer.Add(file[i]);
            }

            //this one works differently, in the original test cases there were 31 test cases. 
            //I suspect this is because it involves 2^n mathematically and if n is any larger than 30 people would start running into overflow issues.
            //I suspect this because I did myself. haha.
            outBuffer.AddRange(thisBuilder.GenerateTestDataA2(thisTestCase, numTestCases, max));
            outBuffer.Add("\t}\n}");
            outBuffer.Add(thisTestCase.A0 + " " + thisTestCase.A1 + " " + thisTestCase.AN + " " + thisTestCase.X + " " + thisTestCase.Y);
            File.WriteAllLines("out\\" + student + "\\A2Test.java", outBuffer);
        }
    }
}
