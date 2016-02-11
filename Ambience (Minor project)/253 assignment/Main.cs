using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Microsoft.Win32;
using System.Media;

namespace _253_assignment
{
    public partial class Main : Form
    {
        public Main()
        {
            InitializeComponent();
        }

        int reading = 0;
        int tier = 0;

        private void Label6_Click(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {
            
        }

        private void Main_Load(object sender, EventArgs e)
        {
            this.chart1.Series["Usage"].Points.AddXY("Day 1", 02);
           
            
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
            Settings setting = new Settings();
            setting.Show();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {

                
                aGauge1.Value += 1;
                reading += 1;
                label3.Text = aGauge1.Value.ToString();
                if (aGauge1.Value == 25)
                {
                    tier = 1;
                    label1.Text = tier.ToString();
                    this.chart1.Series["Usage"].Points.AddXY("Day 2", 20);
                    this.chart1.Series["Usage"].Points.AddXY("Day 3", 30);
                    this.chart1.Series["Usage"].Points.AddXY("Day 4", 50);

                    
                  
                }
                else if(aGauge1.Value ==50)
                {
                    tier = 2;
                    this.BackColor = Color.Yellow;
                    aGauge1.BackColor = Color.Yellow;
                    chart1.BackColor = Color.Yellow;
                    label1.Text = tier.ToString();
                    this.chart1.Series["Usage"].Points.AddXY("Day 5", 60);
                    this.chart1.Series["Usage"].Points.AddXY("Day 6", 30);
                    this.chart1.Series["Usage"].Points.AddXY("Day 7", 50);
                    using (var soundPlayer = new SoundPlayer(@"C:\Users\Shashank\Documents\Visual Studio 2013\Projects\253 assignment\low.wav"))
                    {
                        soundPlayer.Play(); // can also use soundPlayer.PlaySync()
                    }
                    
                }

                else if (aGauge1.Value == 80)
                {
                    tier = 3;
                    this.BackColor = Color.DarkRed;
                    aGauge1.BackColor = Color.DarkRed;
                    chart1.BackColor = Color.DarkRed;
                    label1.Text = tier.ToString();
                    this.chart1.Series["Usage"].Points.AddXY("Day 8", 10);
                    this.chart1.Series["Usage"].Points.AddXY("Day 9", 40);
                    this.chart1.Series["Usage"].Points.AddXY("Day 10", 90);
                    using (var soundPlayer = new SoundPlayer(@"C:\Users\Shashank\Documents\Visual Studio 2013\Projects\253 assignment\High.wav"))
                    {
                        soundPlayer.Play(); // can also use soundPlayer.PlaySync()
                    }
                }
           
           timer1.Interval = timer1.Interval + 10;
        }

        private void aGauge1_ValueInRangeChanged(object sender, ValueInRangeChangedEventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.Hide();
            Form1 form = new Form1();
            form.Show();


        }
    }
}
