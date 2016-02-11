using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace House_of_hyderabad
{
    public partial class l_main_mainu : Form
    {
        public l_main_mainu()
        {
            InitializeComponent();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            Login l = new Login();
            this.Hide();
            l.Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            l_add_purchase ap = new l_add_purchase();
            this.Hide();
            ap.Show();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            l_add_expense ae = new l_add_expense();
            this.Hide();
            ae.Show();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            l_add_order ad = new l_add_order();
            this.Hide();
            ad.Show();
        }
    }
}
