using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;
using System.IO.Compression;

namespace Assignment_2_Generator
{
    class ReadWrite
    {
        private void ResetOut()
        {
            if (Directory.Exists("out\\"))
                Directory.Delete("out\\", true);
            Directory.CreateDirectory("out\\");
        }

        private void MakeStudentFolder(int student)
        {
            Directory.CreateDirectory("out\\" + student);
        }

        public ReadWrite()
        {
            ResetOut();
        }

        public void WriteStudentSolution(StudentSolution thisStudentSolution)
        {
            MakeStudentFolder(thisStudentSolution.studentNumber);
            File.WriteAllLines("out\\" + thisStudentSolution.studentNumber + "\\step1.java", thisStudentSolution.step1.Split('\n'));
            File.WriteAllLines("out\\" + thisStudentSolution.studentNumber + "\\step2.java", thisStudentSolution.step2.Split('\n'));
            File.WriteAllLines("out\\" + thisStudentSolution.studentNumber + "\\step3.java", thisStudentSolution.step3.Split('\n'));
            File.WriteAllLines("out\\" + thisStudentSolution.studentNumber + "\\step4.java", thisStudentSolution.step4.Split('\n'));
            ZipFile.CreateFromDirectory("out\\" + thisStudentSolution.studentNumber,  "out\\a2_" + thisStudentSolution.studentNumber + ".zip");
            File.Move("out\\a2_" + thisStudentSolution.studentNumber + ".zip", "out\\" + thisStudentSolution.studentNumber + "\\a2_" + thisStudentSolution.studentNumber + ".zip");
        }
    }
}
