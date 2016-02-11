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
    public partial class staff_profile : Form
    {
        public staff_profile()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Add_staff_profile asd = new Add_staff_profile();
            this.Hide();
            asd.Show();

        }

        private void button3_Click(object sender, EventArgs e)
        {
            View_Profile vp = new View_Profile();
            this.Hide();
            vp.Show();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            Salary s = new Salary();
            this.Hide();
            s.Show();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            view_salary_statement vs = new view_salary_statement();
            this.Hide();
            vs.Show();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            Main_Menu mm = new Main_Menu();
            this.Hide();
            mm.Show();
        }
    }
}
