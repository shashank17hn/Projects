using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _253_assignment
{
    public partial class Paswword_recovery : Form
    {
        public Paswword_recovery()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Password recovery link has been sent to your email");

            Form1 form1 = new Form1();
            form1.Show();
        this.Hide();

        }

        private void button2_Click(object sender, EventArgs e)
        {
                Form1 form = new Form1();
            form.Show();
        this.Hide();
        
        }
    }
}
