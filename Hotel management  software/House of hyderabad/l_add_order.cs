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
    public partial class l_add_order : Form
    {
        public l_add_order()
        {
            InitializeComponent();
        }

        SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["House_of_hyderabadConnectionString"].ConnectionString);


        private void button1_Click(object sender, EventArgs e) //Main Menu
        {
            l_main_mainu sm = new l_main_mainu();
            this.Hide();
            sm.Show();
        }

        private void button2_Click(object sender, EventArgs e)  //save & add order 2
        {
            string Type = "";
            if (radioButton1.Checked)
            {
                Type = radioButton1.Text;
            }
            else if (radioButton2.Checked)
            {
                Type = radioButton2.Text;
            }
            else if (radioButton3.Checked)
            {
                Type = radioButton3.Text;
            }
            else if (radioButton4.Checked)
            {
                Type = radioButton4.Text;
            }
            else if (radioButton5.Checked)
            {
                Type = radioButton5.Text;
            }
            else if (radioButton6.Checked)
            {
                Type = radioButton6.Text;
            }
            else if (radioButton7.Checked)
            {
                Type = radioButton7.Text;
            }
            else if (radioButton8.Checked)
            {
                Type = radioButton8.Text;
            }
            else if (radioButton9.Checked)
            {
                Type = radioButton9.Text;
            }
            else if (radioButton10.Checked)
            {
                Type = radioButton10.Text;
            }
            else if (radioButton11.Checked)
            {
                Type = radioButton11.Text;
            }
            else if (radioButton12.Checked)
            {
                Type = radioButton12.Text;
            }


            if (!textBox2.Text.Any(char.IsDigit) || string.IsNullOrWhiteSpace(textBox2.Text))
            {
                MessageBox.Show("Please enter a Numeric value to Tax");
            }
            else
            {
                DialogResult result2 = MessageBox.Show("Confirm This Order", "Important Query", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
                if (result2 == DialogResult.Yes)
                {
                    con.Open();
                    SqlCommand cmd = new SqlCommand("INSERT INTO Sale_order (Type, Refrences, Date, Time, Tax) VALUES('" + Type + "','" + textBox1.Text + "','" + this.dateTimePicker1.Text + "','" + this.dateTimePicker2.Text + "','" + textBox2.Text + "')", con);
                    cmd.ExecuteNonQuery();

                    con.Close();

                    l_add_order2cs ad = new l_add_order2cs();
                    this.Hide();
                    ad.Show();
                }
                else
                {
                    MessageBox.Show("Order Cancelled");
                }
            }
        }
    }
}
