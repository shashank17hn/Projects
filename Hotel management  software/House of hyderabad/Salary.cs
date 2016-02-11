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
    public partial class Salary : Form
    {
        public Salary()
        {
            InitializeComponent();
        }

        SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["House_of_hyderabadConnectionString"].ConnectionString);

        private void displayRecord1()
        {
            DataTable dt = new DataTable();
            SqlDataAdapter da = new SqlDataAdapter("Select * from Staff_profile ORDER BY Name ASC", con);
            da.Fill(dt);
            dataGridView1.DataSource = dt.DefaultView;
        }

        private void displayRecord2()
        {
            DataTable dt = new DataTable();
            SqlDataAdapter da = new SqlDataAdapter("Select * from Salary_stat", con);
            da.Fill(dt);
            dataGridView2.DataSource = dt.DefaultView;
            double f = 0;
            f = dataGridView2.Rows.Count - 1;
            textBox7.Text = f.ToString();
        }
        private void button3_Click(object sender, EventArgs e)
        {
            staff_profile sp = new staff_profile();
            this.Hide();
            sp.Show();
        }

        private void Salary_Load(object sender, EventArgs e) // on load
        {
            displayRecord1();
            displayRecord2();
            button5.Enabled = false;
            button6.Enabled = false;
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e) // profile content click
        {
            if (e.RowIndex >= 0)
            {
                DataGridViewRow row = this.dataGridView1.Rows[e.RowIndex];

                textBox1.Text = row.Cells["Name"].Value.ToString();
                textBox2.Text = row.Cells["Designation"].Value.ToString();
                textBox5.Text = row.Cells["id"].Value.ToString();


            }
        }

        private void button4_Click(object sender, EventArgs e) // name search
        {
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Staff_profile where Name like'%" + textBox6.Text + "%' ", con);
                da.Fill(dt);
                dataGridView1.DataSource = dt.DefaultView;
               
            }
            catch
            {
                MessageBox.Show("Search not Found");
            }

        }

        private void button7_Click(object sender, EventArgs e)
        {
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Staff_profile where Designation like'%" + textBox13.Text + "%' ", con);
                da.Fill(dt);
                dataGridView1.DataSource = dt.DefaultView;
                
            }
            catch
            {
                MessageBox.Show("Search not Found");
            }
        }

        private void button1_Click(object sender, EventArgs e) // add
        {
            if (!textBox3.Text.Any(char.IsDigit) || string.IsNullOrWhiteSpace(textBox3.Text))
            {
                MessageBox.Show("Please enter a Numeric value to Advance!");
            }
            else if (!textBox4.Text.Any(char.IsDigit) || string.IsNullOrWhiteSpace(textBox4.Text))
            {
                MessageBox.Show("Please enter a Numeric value to Balance!");
            }
            else if (textBox8.Text == string.Empty)
            {
                MessageBox.Show("Please enter a value to leave");
            }
            else
            {
                float value1 = Convert.ToSingle(textBox3.Text);
                float value2 = Convert.ToSingle(textBox4.Text);
                float value3 = value1 + value2;

                con.Open();
                SqlCommand cmd = new SqlCommand("INSERT INTO Salary_stat(Name, Designation, Date, Leave,Advance,Balance,Total_Salary) VALUES('" + textBox1.Text + "','" + textBox2.Text + "','" + this.dateTimePicker1.Text + "','" + textBox8.Text + "','" + textBox3.Text + "','" + textBox4.Text + "','"+ value3 +"')", con);
                cmd.ExecuteNonQuery();

                con.Close();
                MessageBox.Show("Salary Statement Saved");
                displayRecord2();

            }

        }

        private void button2_Click(object sender, EventArgs e) //reload
        {
            displayRecord1();
            displayRecord2();
        }

        private void button5_Click(object sender, EventArgs e) //Update
        {
            try
            {

                con.Open();
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Salary_stat where id='" + textBox11.Text + "'", con);
                da.Fill(dt);
                // start the editing selected record
                dt.Rows[0].BeginEdit();
                if (!textBox9.Text.Any(char.IsDigit) || string.IsNullOrWhiteSpace(textBox9.Text))
                {
                    MessageBox.Show("Please enter a numeric value to Advance!");
                    con.Close();
                }
                else
                {
                    dt.Rows[0][5] = textBox9.Text;
                    if (!textBox10.Text.Any(char.IsDigit) || string.IsNullOrWhiteSpace(textBox10.Text))
                    {
                        MessageBox.Show("Please enter a numeric value to Balance!");
                        con.Close();
                    }
                    else
                    {
                        dt.Rows[0][6] = textBox10.Text;
                        if (textBox12.Text == string.Empty)
                        {
                            MessageBox.Show("Please enter a value to Leave!");
                            con.Close();
                        }
                        else
                        {
                                dt.Rows[0][4] = textBox12.Text;
                                 dt.Rows[0][3] = this.dateTimePicker2.Text;
                                 float value1 = Convert.ToSingle(textBox9.Text);
                                 float value2 = Convert.ToSingle(textBox10.Text);
                                 float value3 = value1 + value2;
                                 dt.Rows[0][7] = value3;
                                // stop editing
                                dt.Rows[0].EndEdit();

                                // declare the command builder that allow saving records
                                SqlCommandBuilder cb = new SqlCommandBuilder(da);

                                //update the database
                                da.Update(dt);

                                // close connection
                                con.Close();

                                MessageBox.Show("Salary Statment Updated");
                                // call the mtd to display records
                                displayRecord2();
                            }
                        }
                    }
                



            }
            catch (Exception error)
            {
                MessageBox.Show(error.ToString());

            }

        }

        private void button6_Click(object sender, EventArgs e) // delete
        {
            DialogResult result2 = MessageBox.Show("Confirm Deletion","Important Query", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
            if (result2 == DialogResult.Yes)
            {


                try
                {
                    con.Open();
                    DataTable dt = new DataTable();
                    SqlDataAdapter da = new SqlDataAdapter("Delete from Salary_stat where id=" + textBox11.Text + "", con);
                    da.Fill(dt);

                    // declare the command builder that allow saving records
                    SqlCommandBuilder cb = new SqlCommandBuilder(da);

                    //update the database
                    da.Update(dt);

                    // close connection
                    con.Close();
                    MessageBox.Show("Salary Statement Deleted");
                    // call the mtd to display records
                    displayRecord2();
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

        private void dataGridView2_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            if (e.RowIndex >= 0)
            {
                DataGridViewRow row = this.dataGridView2.Rows[e.RowIndex];

                textBox9.Text = row.Cells["Advance"].Value.ToString();
                textBox10.Text = row.Cells["Balance"].Value.ToString();
                textBox12.Text = row.Cells["Leave"].Value.ToString();
                textBox11.Text = row.Cells["id"].Value.ToString();


            }
            button5.Enabled = true;
            button6.Enabled = true;

        }

       
        
    }
}
