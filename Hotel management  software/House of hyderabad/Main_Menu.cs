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
    public partial class Main_Menu : Form
    {
        public Main_Menu()
        {
            InitializeComponent();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            Purchase_menu pm = new Purchase_menu();
            this.Hide();
            pm.Show();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            staff_profile sp = new staff_profile();
            this.Hide();
            sp.Show();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Change_password cp = new Change_password();
            this.Hide();
            cp.Show();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            Login l = new Login();
            this.Hide();
            l.Show();

        }

        private void button2_Click(object sender, EventArgs e)
        {
            Sales_menu sm = new Sales_menu();
            this.Hide();
            sm.Show();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            Dish_menu dm = new Dish_menu();
            this.Hide();
            dm.Show();
        }

        private void button7_Click(object sender, EventArgs e)
        {
            expenses_menu em = new expenses_menu();
            this.Hide();
            em.Show();
        }
    }
}
