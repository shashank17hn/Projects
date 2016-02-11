using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Collections;
using System.Text.RegularExpressions;

namespace WindowsFormsApplication2
{
    public partial class Detect : Form
    {
        public Detect()
        {
            InitializeComponent();
        }

        private byte XDirection = 0;
        private byte YDirection = 0;
        private ArrayList X = new ArrayList();
        private ArrayList Y = new ArrayList();
        private StringBuilder OCR = new StringBuilder();
        private byte History = 10;
        private int Range = 5;
        public int Flag = 0;
       
        private void Detect_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            AnalyseThis();
        }

        private void pictureBox1_MouseMove(object sender, MouseEventArgs e)
        {
            bool XDirChanged = false;
            bool YDirChanged = false;
            if (e.Button == MouseButtons.Left)
            {
                Graphics g = pictureBox1.CreateGraphics();
                g.DrawEllipse(new Pen(Color.Red), e.X, e.Y, 5, 5);




                X.Add(e.X);
                Y.Add(e.Y);



                if (X.Count > History)
                {



                    if (XDirection == 0)
                    {
                        if ((e.X - (int)X[X.Count - History]) > Range)
                        {
                            XDirection = 3;
                            XDirChanged = true;


                        }
                        else if (((int)X[X.Count - History] - e.X) > Range)
                        {
                            XDirection = 4;
                            XDirChanged = true;

                        }



                    }
                    else
                    {
                        if ((e.X - (int)X[X.Count - History]) > Range && XDirection == 4)
                        {
                            XDirection = 3;
                            XDirChanged = true;

                        }
                        else if (((int)X[X.Count - History] - e.X) > Range && XDirection == 3)
                        {
                            XDirection = 4;
                            XDirChanged = true;

                        }


                    }
                }


                if (Y.Count > History)
                {

                    if (YDirection == 0)
                    {
                        if ((e.Y - (int)Y[Y.Count - History]) > Range)
                        {
                            YDirection = 2;
                            YDirChanged = true;

                        }
                        else if (((int)Y[Y.Count - History] - e.Y) > Range)
                        {
                            YDirection = 1;
                            YDirChanged = true;

                        }


                    }
                    else
                    {
                        if ((e.Y - (int)Y[Y.Count - History]) > Range && YDirection == 1)
                        {
                            YDirection = 2;
                            YDirChanged = true;

                        }
                        else if (((int)Y[Y.Count - History] - e.Y) > Range && YDirection == 2)
                        {
                            YDirection = 1;
                            YDirChanged = true;

                        }

                    }
                }
                if (XDirChanged && XDirection != 0)
                    OCR.Append(XDirection);
                if (YDirChanged && YDirection != 0)
                    OCR.Append(YDirection);

                textBox1.Text = OCR.ToString();


            }
        }
        private void AnalyseThis()
        {
            button1.Enabled = false;
            Graphics Gc = pictureBox1.CreateGraphics();
            Gc.Clear(Color.White);
            //Yorumlama;
            string OCRText = OCR.ToString();
            String value = OCRText;
            Regex regexA1 = new Regex("241");
            Match matchA1 = Regex.Match(value, "241");  // A
            Regex regexA2 = new Regex("4123");
            Match matchA2 = Regex.Match(value, "4123");
            Regex regexA3 = new Regex("3121");
            Match matchA3 = Regex.Match(value, "3121");  // A
            Regex regexA4 = new Regex("314231");
            Match matchA4 = Regex.Match(value, "314231");  // A
            Regex regexA5 = new Regex("412");
            Match matchA5 = Regex.Match(value, "412");  // A

            Regex regexB5 = new Regex("1434");
            Match matchB5 = Regex.Match(value, "1434");  // B

            if (matchA1.Success)
            {
                OCRText = "3123";
            }
              // A
            else if (matchA2.Success)
            {
                OCRText = "3123";
            }
            

            else if (matchA3.Success)
            {
                OCRText = "3123";
            }

           

            else if (matchA4.Success)
            {
                OCRText = "3123";
            }
           

            else if (matchA5.Success)
            {
                OCRText = "3123";
            }




            else if (matchB5.Success)
            {
                OCRText = "2324324";
            }

            else
            {
                 DialogResult result1 = MessageBox.Show("Wrong Password. Try Again !","Important Query", MessageBoxButtons.OK, MessageBoxIcon.Question);
                 
                    if (result1 == DialogResult.OK)
                    {

                        Detect2 form = new Detect2();
                        form.Show();
                        this.Hide();
                    }
                
            }

            switch (OCRText)
            {
                //A
                case "3123":
 DialogResult result2 = MessageBox.Show("Congratulation ! System Unlocked","Important Query", MessageBoxButtons.OK, MessageBoxIcon.Question);
 if (result2 == DialogResult.OK)
 {
     Main main = new Main();
 main.Show();
     this.Hide();

 }
                    break;
               
                case "314234132":
                    goto case "3123";
                case "413243124":
                    goto case "3123";

            }
            OCR.Remove(0, OCR.Length);
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            Detect2 form = new Detect2();
            form.Show();
            this.Hide();
        }
    }
}
