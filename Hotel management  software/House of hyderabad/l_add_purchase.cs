using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Data.SqlClient;
using System.Configuration;

namespace House_of_hyderabad
{
    public partial class l_add_purchase : Form
    {
        public l_add_purchase()
        {
            InitializeComponent();
        }

        SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["House_of_hyderabadConnectionString"].ConnectionString);

        private void button2_Click(object sender, EventArgs e)
        {
            l_main_mainu mm = new l_main_mainu();
            this.Hide();
            mm.Show();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == string.Empty)
            {
                MessageBox.Show("Please enter a value to Name!");
            }
            else if (textBox2.Text == string.Empty)
            {
                MessageBox.Show("Please enter a value to Item!");
            }
            else if (textBox3.Text == string.Empty)
            {
                MessageBox.Show("Please enter a value to Quantity");
            }
            else if (!textBox4.Text.Any(char.IsDigit) || string.IsNullOrWhiteSpace(textBox4.Text))
            {
                MessageBox.Show("Please enter a Numeric value to Amount");
            }
            else
            {

                con.Open();
                SqlCommand cmd = new SqlCommand("INSERT INTO Purchase_stat(Name, Item, Quantity, Date, Amount) VALUES('" + textBox1.Text + "','" + textBox2.Text + "','" + textBox3.Text + "','" + this.dateTimePicker1.Text + "','"+textBox4.Text+"')", con);
                cmd.ExecuteNonQuery();

                con.Close();
                MessageBox.Show("Statemnet saved");
                l_main_mainu l = new l_main_mainu();
                this.Hide();
                l.Show();

            }
        }
    }
}
