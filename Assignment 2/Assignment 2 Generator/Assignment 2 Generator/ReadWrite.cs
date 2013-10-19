using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace Assignment_2_Generator
{
    class ReadWrite
    {
        private void ResetOut()
        {
            if (Directory.Exists("out\\"))
                Directory.Delete("out\\", true);
        }

        private void MakeStudentFolder(string student)
        {
            Directory.CreateDirectory("out\\" + student);
            Directory.CreateDirectory("out\\" + student + "\\se2s03");
        }

        public ReadWrite()
        {
            ResetOut();
        }
    }
}
