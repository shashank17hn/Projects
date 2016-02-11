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
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
        }

       
        private void button1_Click(object sender, EventArgs e)
        {
            try
            {

                SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["House_of_hyderabadConnectionString"].ConnectionString);
                con.Open();
                SqlDataAdapter sda = new SqlDataAdapter("Select Count(*) From local_login where username='" + textBox1.Text + "'and password='" + textBox2.Text + "'", con);
                DataTable dt = new DataTable();
                sda.Fill(dt);
                if (dt.Rows[0][0].ToString() == "1")
                {
                    this.Hide();
                    l_main_mainu frm = new l_main_mainu();
                    frm.Show();
                }
                else
                {
                    MessageBox.Show("Please check user Username and Password");

                }
            }
            catch (Exception error)
            {
                MessageBox.Show(error.ToString());

            }

        }

        private void button2_Click(object sender, EventArgs e)
        {
            try
            {

                SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["House_of_hyderabadConnectionString"].ConnectionString);
                con.Open();
                SqlDataAdapter sda = new SqlDataAdapter("Select Count(*) From Admin_login where username='" + textBox3.Text + "'and password='" + textBox4.Text + "'", con);
                DataTable dt = new DataTable();
                sda.Fill(dt);
                if (dt.Rows[0][0].ToString() == "1")
                {
                    this.Hide();
                    Main_Menu frm = new Main_Menu();
                    frm.Show();
                }
                else
                {
                    MessageBox.Show("Please check user loginid and password");

                }
            }
            catch (Exception error)
            {
                MessageBox.Show(error.ToString());

            }
        }
    }
}
