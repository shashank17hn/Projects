using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace WindowsFormsApplication2
{
    public partial class Main : Form
    {
        public Main()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Tracer trace = new Tracer();
            trace.Show();
            this.Hide();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Detect detect = new Detect();
            detect.Show();
            this.Hide();
        }
    }
}
