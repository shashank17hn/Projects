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

    public partial class Tracer2 : Form
    {
        public Tracer2()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
        private byte XDirection = 0;
        private byte YDirection = 0;
        private ArrayList X = new ArrayList();
        private ArrayList Y = new ArrayList();
        private StringBuilder OCR = new StringBuilder();
        private byte History = 10;
        private int Range = 5;

        private void pictureBox1_MouseMove(object sender, MouseEventArgs e)
        {
          
            bool XDirChanged = false;
            bool YDirChanged = false;
            if (e.Button == MouseButtons.Left)
            {
                Graphics g = pictureBox1.CreateGraphics();
                g.DrawEllipse(new Pen(Color.Black), e.X, e.Y, 5, 5);
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
Graphics Gc=pictureBox1.CreateGraphics();
Gc.Clear(Color.White);
//Yorumlama;
string OCRText = textBox1.Text;
String value = OCRText;
Regex regexA1 = new Regex("241");
Match matchA1 = Regex.Match(value, "241");  // A
Regex regexA2 = new Regex("4123");
Match matchA2 = Regex.Match(value, "4123");  // A
Regex regexA3 = new Regex("3121");
Match matchA3 = Regex.Match(value, "3121");  // A
Regex regexA4 = new Regex("314231");
Match matchA4 = Regex.Match(value, "314231");  // A
Regex regexA5 = new Regex("412");
Match matchA5 = Regex.Match(value, "412");  // A
Regex regexB1 = new Regex("2434");
Match matchB1 = Regex.Match(value, "2434");  // B
Regex regexB2 = new Regex("3243");
Match matchB2 = Regex.Match(value, "3243");  // B
Regex regexB3 = new Regex("2431");
Match matchB3 = Regex.Match(value, "2431");  // B
Regex regexB4 = new Regex("4342");
Match matchB4 = Regex.Match(value, "4342");  // B
Regex regexB5 = new Regex("1434");
Match matchB5 = Regex.Match(value, "1434");  // B
Regex regexB6 = new Regex("4132");
Match matchB6 = Regex.Match(value, "4132");  // B
Regex regexc1 = new Regex("423");
Match matchc1 = Regex.Match(value, "423");  // c
Regex regexc2 = new Regex("413");
Match matchc2 = Regex.Match(value, "413");  // c

if (matchA1.Success)
{
    OCRText = "3123";
}

else if (matchA1.Success)
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


else if (matchB1.Success)
{
    OCRText = "2324324";
}


else if (matchB2.Success)
{
    OCRText = "2324324";
}


else if (matchB3.Success)
{
    OCRText = "2324324";
}


else if (matchB4.Success)
{
    OCRText = "2324324";
}


else if (matchB5.Success)
{
    OCRText = "2324324";
}


else if (matchB6.Success)
{
    OCRText = "2324324";
}

else if (matchc1.Success)
{
    OCRText = "423";
}

else if (matchc2.Success)
{
    OCRText = "423";
}
switch(OCRText)
{
//A
    case "3123":
        textBox2.Text += "A";
        break;
  
    case "314234132":
        goto case "3123";
    case "413243124":
        goto case "3123";
//B
case "2324324":
textBox2.Text+="B";
break;
//case "231243124":
//goto case "2324324";
//case "232434":
//goto case "2324324";
//C
case "423":
textBox2.Text+="C";
break;
case "243":
goto case "423";
//D
case "2324":
textBox2.Text+="D";
break;
case "2234":
goto case "2324";
//E
case "2333":
textBox2.Text+="E";
break;
//F
case "233":
textBox2.Text+="F";
break;
//G
case "42313":
textBox2.Text+="G";
break;
//H
case "223":
textBox2.Text+="H";
break;
case "232":
goto case "223";
//I
case "2":
textBox2.Text+="I";
break;
//J
case "241":
textBox2.Text+="J";
break;
//K
case "2423":
textBox2.Text+="K";
break;
case "2243":
goto case "2423";
//L
case "23":
textBox2.Text+="L";
break;
//M
case "22312":
textBox2.Text+="M";
break;
case "23212":
goto case "22312";
//N
case "2232":
textBox2.Text+="N";
break;
case "2322":
goto case "2232";
case "2321":
goto case "2232";
//O
case "42314":
textBox2.Text+="O";
break;
//P
case "22343":
textBox2.Text+="P";
break;
case "23243":
goto case "22343";
//R
case "223432":
textBox2.Text+="R";
break;
case "223423":
goto case "223432";
case "232432":
goto case "223432";
case "232423":
goto case "223432";
//S
case "4234":
textBox2.Text+="S";
break;
//T
case "32":
textBox2.Text+="T";
break;
//U
case "231":
textBox2.Text+="U";
break;
//V
case "2313":
textBox2.Text+="V";
break;
case "2331":
goto case "2313";
case "3213":
goto case "2313";
case "3231":
goto case "2313";
//Y
case "2312":
textBox2.Text+="Y";
break;
case "3212":
goto case "2312";
//Z
case "3423":
textBox2.Text+="Z";
break;
case "3243":
goto case "3423";
}
OCR.Remove(0,OCR.Length);
}

        private void button1_Click(object sender, EventArgs e)
        {
            button1.Enabled = false;
            button4.Enabled = false;
            AnalyseThis();
            pictureBox1.Dispose();
              

        }

        private void button2_Click(object sender, EventArgs e)
        {
            Tracer form = new Tracer();
            form.Show();
            this.Hide();
           
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Main main = new Main();
            main.Show();
            this.Hide();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            button1.Enabled = false;
            button4.Enabled = false;
            Graphics Gc = pictureBox1.CreateGraphics();
            Gc.Clear(Color.White);
            //Yorumlama;
            string OCRText = textBox1.Text;
            String value = OCRText;
            Regex regexA1 = new Regex("241");
            Match matchA1 = Regex.Match(value, "241");  // A
            Regex regexA2 = new Regex("4123");
            Match matchA2 = Regex.Match(value, "4123");  // A
            Regex regexA3 = new Regex("3121");
            Match matchA3 = Regex.Match(value, "3121");  // A
            Regex regexA4 = new Regex("314231");
            Match matchA4 = Regex.Match(value, "314231");  // A
            Regex regexA5 = new Regex("412");
            Match matchA5 = Regex.Match(value, "412");  // A
            Regex regexB1 = new Regex("2434");
            Match matchB1 = Regex.Match(value, "2434");  // B
            Regex regexB2 = new Regex("3243");
            Match matchB2 = Regex.Match(value, "3243");  // B
            Regex regexB3 = new Regex("2431");
            Match matchB3 = Regex.Match(value, "2431");  // B
            Regex regexB4 = new Regex("4342");
            Match matchB4 = Regex.Match(value, "4342");  // B
            Regex regexB5 = new Regex("1434");
            Match matchB5 = Regex.Match(value, "1434");  // B
            Regex regexB6 = new Regex("4132");
            Match matchB6 = Regex.Match(value, "4132");  // B
            Regex regexc1 = new Regex("423");
            Match matchc1 = Regex.Match(value, "423");  // c
            Regex regexc2 = new Regex("413");
            Match matchc2 = Regex.Match(value, "413");  // c

            if (matchA1.Success)
            {
                OCRText = "3123";
            }

            else if (matchA1.Success)
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


            else if (matchB1.Success)
            {
                OCRText = "2324324";
            }


            else if (matchB2.Success)
            {
                OCRText = "2324324";
            }


            else if (matchB3.Success)
            {
                OCRText = "2324324";
            }


            else if (matchB4.Success)
            {
                OCRText = "2324324";
            }


            else if (matchB5.Success)
            {
                OCRText = "2324324";
            }


            else if (matchB6.Success)
            {
                OCRText = "2324324";
            }

            else if (matchc1.Success)
            {
                OCRText = "423";
            }

            else if (matchc2.Success)
            {
                OCRText = "423";
            }
            switch (OCRText)
            {
                //A
                case "3123":
                    textBox2.Text += "A";
                    Image image1 = Image.FromFile(@"C:\Users\Shashank\Documents\Visual Studio 2010\Projects\WindowsFormsApplication2\WindowsFormsApplication2\Resources\AA.png");
                    pictureBox1.Image = image1;

                    break;

                case "314234132":
                    goto case "3123";
                case "413243124":
                    goto case "3123";

                //B
                case "2324324":
                    textBox2.Text += "B";
                    Image image2 = Image.FromFile(@"C:\Users\Shashank\Documents\Visual Studio 2010\Projects\WindowsFormsApplication2\WindowsFormsApplication2\Resources\BB.png");
                    pictureBox1.Image = image2;
                    break;
                //  case "231243124":
                //     goto case "2324324";
                // case "232434":
                //     goto case "2324324";
                //C
                case "423":
                    textBox2.Text += "C";
                    Image image3 = Image.FromFile(@"C:\Users\Shashank\Documents\Visual Studio 2010\Projects\WindowsFormsApplication2\WindowsFormsApplication2\Resources\CC.png");
                    pictureBox1.Image = image3;
                    break;
                case "243":
                    goto case "423";
            }
            OCR.Remove(0, OCR.Length);
        } 
    }
}
