using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Net;
using System.Threading.Tasks;
using System.Text.RegularExpressions;

namespace Assignment_2_Generator
{
    class WebPageParse
    {
        private string address;
        private string pageContents;
        public WebPageParse(string address)
        {
            this.address = address;
            
            using (var client = new WebClient())
            {
                pageContents = client.DownloadString(address);  
            }
        }
        public List<int> getStudentNumbers()
        {
            List<int> thisIntList = new List<int>();
            Regex thisRegex = new Regex(@"(\"")(\d+)");
            foreach (Match element in thisRegex.Matches(pageContents))
            {
                thisIntList.Add(int.Parse(element.Groups[2].Value));
            }
            return thisIntList;
        }

        public void changeAddress(string newAddress)
        {
            this.address = newAddress;
        }
        public string getBadCode(int studentNumber)
        {
            using (var client = new WebClient())
            {
                return client.DownloadString(address + studentNumber + "\\BadCode.java");
            }
        }
        
    }
}
