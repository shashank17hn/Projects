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
    public partial class Purchase_menu : Form
    {
        public Purchase_menu()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Add_Purchase_Statement ap = new Add_Purchase_Statement();
            this.Hide();
            ap.Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            View_purchase_statement vp = new View_purchase_statement();
            this.Hide();
            vp.Show();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Main_Menu pm = new Main_Menu();
            this.Hide();
            pm.Show();
        }
    }
}
