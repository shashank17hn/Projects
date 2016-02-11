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
    public partial class expenses_menu : Form
    {
        public expenses_menu()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            add_expenses ae = new add_expenses();
            this.Hide();
            ae.Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            view_expenses ve = new view_expenses();
            this.Hide();
            ve.Show();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Main_Menu mm = new Main_Menu();
            this.Hide();
            mm.Show();
        }
    }
}
