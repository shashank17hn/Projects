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
    public partial class Add_staff_profile : Form
    {
        public Add_staff_profile()
        {
            InitializeComponent();
        }

        SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["House_of_hyderabadConnectionString"].ConnectionString);

        private void displayRecord()
        {
            DataTable dt = new DataTable();
            SqlDataAdapter da = new SqlDataAdapter("Select * from Staff_profile ORDER BY Name ASC", con);
            da.Fill(dt);
            dataGridView1.DataSource = dt.DefaultView;
            double f = 0;
            f = dataGridView1.Rows.Count - 1;
            textBox10.Text = f.ToString();

        }

        private void button3_Click(object sender, EventArgs e)  // back
        {
            staff_profile sp= new staff_profile();
            this.Hide();
            sp.Show();

        }

        private void Add_staff_profile_Load(object sender, EventArgs e)
        {
            displayRecord();
            button4.Enabled = false;
            button5.Enabled = false;
        }

        private void button2_Click(object sender, EventArgs e)// view
        {
            displayRecord();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == string.Empty)
            {
                MessageBox.Show("Please enter a value to Name!");
            }
            else if (textBox2.Text == string.Empty)
            {
                MessageBox.Show("Please enter a value to Designation!");
            }
            else if (!textBox3.Text.Any(char.IsDigit) || string.IsNullOrWhiteSpace(textBox3.Text))
            {
                MessageBox.Show("Please enter a Numeric value to Contact");
            }
            else if (textBox4.Text == string.Empty)
            {
                MessageBox.Show("Please enter a value to Address!");
            }
            else
            {
                try
                {
                    con.Open();
                    SqlCommand cmd = new SqlCommand("INSERT INTO Staff_profile(Name, Designation, Contact, Address) VALUES('" + textBox1.Text + "','" + textBox2.Text + "','" + textBox3.Text + "','" + textBox4.Text + "')", con);
                    cmd.ExecuteNonQuery();

                    con.Close();
                    MessageBox.Show("Profile Saved");
                    displayRecord();
                }
                catch
                {
                    MessageBox.Show("Check All the Informantion");
                }
            }
        }

        private void button6_Click(object sender, EventArgs e) // name search
        {
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Staff_profile where Name like'%" + textBox11.Text + "%' ", con);
                da.Fill(dt);
                dataGridView1.DataSource = dt.DefaultView;
                double f = 0;
                f = dataGridView1.Rows.Count - 1;
                textBox10.Text = f.ToString();
            }
            catch
            {
                MessageBox.Show("Search not Found");
            }
        }

        private void button7_Click(object sender, EventArgs e) //designation search
        {
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Staff_profile where Designation like'%" + textBox12.Text + "%' ", con);
                da.Fill(dt);
                dataGridView1.DataSource = dt.DefaultView;
                double f = 0;
                f = dataGridView1.Rows.Count - 1;
                textBox10.Text = f.ToString();
            }
            catch
            {
                MessageBox.Show("Search not Found");
            }
        }

        private void button4_Click(object sender, EventArgs e) //update
        {
            try
            {

                con.Open();
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Staff_profile where id='" + textBox9.Text + "'", con);
                da.Fill(dt);
                // start the editing selected record
                dt.Rows[0].BeginEdit();
                if (textBox5.Text == string.Empty)
                {
                    MessageBox.Show("Please enter a value to Name!");
                    con.Close();
                }
                else
                {
                    dt.Rows[0][1] = textBox5.Text;
                    if (textBox6.Text == string.Empty)
                    {
                        MessageBox.Show("Please enter a value to Designation!");
                        con.Close();
                    }
                    else
                    {
                        dt.Rows[0][2] = textBox6.Text;
                        if (!textBox7.Text.Any(char.IsDigit) || string.IsNullOrWhiteSpace(textBox7.Text))
                        {
                            MessageBox.Show("Please enter a value to Contact!");
                            con.Close();
                        }
                        else
                        {
                            dt.Rows[0][3] = textBox7.Text;
                            if (textBox8.Text == string.Empty)
                            {
                                MessageBox.Show("Please enter a value to Address!");
                                con.Close();
                            }
                            else
                            {
                                dt.Rows[0][4] = textBox8.Text;
                                // stop editing
                                dt.Rows[0].EndEdit();

                                // declare the command builder that allow saving records
                                SqlCommandBuilder cb = new SqlCommandBuilder(da);

                                //update the database
                                da.Update(dt);

                                // close connection
                                con.Close();

                                MessageBox.Show("Profile Updated");
                                // call the mtd to display records
                                displayRecord();
                            }
                        }
                    }
                }

               
             
            }
            catch (Exception error)
            {
                MessageBox.Show(error.ToString());

            }
        }

        private void button5_Click(object sender, EventArgs e) // delete
        {
             DialogResult result2 = MessageBox.Show("Confirm Deletion","Important Query", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
             if (result2 == DialogResult.Yes)
             {

                 try
                 {
                     con.Open();
                     DataTable dt = new DataTable();
                     SqlDataAdapter da = new SqlDataAdapter("Delete from Staff_profile where id=" + textBox9.Text + "", con);
                     da.Fill(dt);

                     // declare the command builder that allow saving records
                     SqlCommandBuilder cb = new SqlCommandBuilder(da);

                     //update the database
                     da.Update(dt);

                     // close connection
                     con.Close();
                     MessageBox.Show("Profile Deleted");
                     // call the mtd to display records
                     displayRecord();
                 }
                 catch (Exception error)
                 {
                     MessageBox.Show(error.ToString());

                 }
             }
             else
             {
                 MessageBox.Show("Deletion Cancelled");
             }
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e) 
        {

            if (e.RowIndex >= 0)
            {
                DataGridViewRow row = this.dataGridView1.Rows[e.RowIndex];

                textBox5.Text = row.Cells["Name"].Value.ToString();
                textBox6.Text = row.Cells["Designation"].Value.ToString();
                textBox7.Text = row.Cells["Contact"].Value.ToString();
                textBox8.Text = row.Cells["Address"].Value.ToString();
                textBox9.Text = row.Cells["id"].Value.ToString();


            }
            button4.Enabled = true;
            button5.Enabled = true;
        }
    }
}
