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
    public partial class Sales_menu : Form
    {
        public Sales_menu()
        {
            InitializeComponent();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            Main_Menu mm = new Main_Menu();
            this.Hide();
            mm.Show();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Add_order ad = new Add_order();
            this.Hide();
            ad.Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            View_order vo = new View_order();
            this.Hide();
            vo.Show();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Past_bills pb = new Past_bills();
            this.Hide();
            pb.Show();

        }
    }
}
