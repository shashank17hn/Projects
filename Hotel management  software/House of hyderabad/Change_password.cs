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
    public partial class Change_password : Form
    {
        public Change_password()
        {
            InitializeComponent();
        }


        SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["House_of_hyderabadConnectionString"].ConnectionString);


        private void displayRecordLocal()
        {
            DataTable dt = new DataTable();
            SqlDataAdapter da = new SqlDataAdapter("Select * from local_login", con);
            da.Fill(dt);
            dataGridView1.DataSource = dt.DefaultView;

        }

        private void displayRecordAdmin()
        {
            DataTable dt = new DataTable();
            SqlDataAdapter da = new SqlDataAdapter("Select * from Admin_login where id = 1", con);
            da.Fill(dt);
            dataGridView2.DataSource = dt.DefaultView;

        }

        private void button3_Click(object sender, EventArgs e) //back
        {
            Main_Menu mm = new Main_Menu();
            this.Hide();
            mm.Show();
        }

        private void button1_Click(object sender, EventArgs e) // update local
        {
            try
            {
                con.Open();
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from local_login where id='" + textBox5.Text + "'", con);
                da.Fill(dt);
                // start the editing selected record
                dt.Rows[0].BeginEdit();

                if (textBox1.Text == string.Empty)
                {
                    MessageBox.Show("Please enter a value to Username!");
                    con.Close();
                }
                else
                {
                    dt.Rows[0][1] = textBox1.Text;

                    if (textBox2.Text == string.Empty)
                    {
                        MessageBox.Show("Please enter a value to Password!");
                        con.Close();
                    }
                    else
                    {
                        dt.Rows[0][2] = textBox2.Text;


                        // stop editing
                        dt.Rows[0].EndEdit();

                        // declare the command builder that allow saving records
                        SqlCommandBuilder cb = new SqlCommandBuilder(da);

                        //update the database
                        da.Update(dt);

                        // close connection
                        con.Close();
                        MessageBox.Show(" Username and Password updated ");

                        // call the mtd to display records
                        displayRecordLocal();
                    }
                }

            }
            catch (Exception error)
            {
                MessageBox.Show(error.ToString());

            }
        }

        private void button2_Click(object sender, EventArgs e) // update admin
        {
            try
            {
                con.Open();
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Admin_login where id='" + textBox6.Text + "'", con);
                da.Fill(dt);
                // start the editing selected record
                dt.Rows[0].BeginEdit();

                if (textBox3.Text == string.Empty)
                {
                    MessageBox.Show("Please enter a value to Username!");
                    con.Close();
                }
                else
                {
                    dt.Rows[0][1] = textBox3.Text;

                    if (textBox4.Text == string.Empty)
                    {
                        MessageBox.Show("Please enter a value to Password!");
                        con.Close();
                    }
                    else
                    {
                        dt.Rows[0][2] = textBox4.Text;


                        // stop editing
                        dt.Rows[0].EndEdit();

                        // declare the command builder that allow saving records
                        SqlCommandBuilder cb = new SqlCommandBuilder(da);

                        //update the database
                        da.Update(dt);

                        // close connection
                        con.Close();
                        MessageBox.Show(" Username and Password updated ");

                        // call the mtd to display records
                        displayRecordAdmin();
                    }
                }

            }
            catch (Exception error)
            {
                MessageBox.Show(error.ToString());

            }

        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e) // local
        {
            if (e.RowIndex >= 0)
            {
                DataGridViewRow row = this.dataGridView1.Rows[e.RowIndex];

                textBox1.Text = row.Cells["username"].Value.ToString();
                textBox2.Text = row.Cells["password"].Value.ToString();
                textBox5.Text = row.Cells["id"].Value.ToString();
            }
        }

        private void dataGridView2_CellContentClick(object sender, DataGridViewCellEventArgs e) // admin
        {
            if (e.RowIndex >= 0)
            {
                DataGridViewRow row = this.dataGridView2.Rows[e.RowIndex];

                textBox3.Text = row.Cells["username"].Value.ToString();
                textBox4.Text = row.Cells["password"].Value.ToString();
                textBox6.Text = row.Cells["id"].Value.ToString();
            }
        }

        private void Change_password_Load(object sender, EventArgs e) // load
        {
            displayRecordAdmin();
            displayRecordLocal();
        }
    }
}
