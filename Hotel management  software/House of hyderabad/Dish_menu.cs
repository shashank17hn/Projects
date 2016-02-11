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
    public partial class Dish_menu : Form
    {
        public Dish_menu()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            add_dish ad = new add_dish();
            this.Hide();
            ad.Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            view_dishes vd = new view_dishes();
            this.Hide();
            vd.Show();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Main_Menu mm = new Main_Menu();
            this.Hide();
            mm.Show();
        }
    }
}
