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
    public partial class add_expenses : Form
    {
        public add_expenses()
        {
            InitializeComponent();
        }

        SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["House_of_hyderabadConnectionString"].ConnectionString);

        private void displayRecord()
        {
            DataTable dt = new DataTable();
            SqlDataAdapter da = new SqlDataAdapter("Select * from expenses ORDER BY Name ASC", con);
            da.Fill(dt);
            dataGridView1.DataSource = dt.DefaultView;
            double f = 0;
            f = dataGridView1.Rows.Count - 1;
            textBox9.Text = f.ToString();

        }

        private void button5_Click(object sender, EventArgs e) // BACk
        {
            expenses_menu em = new expenses_menu();
            this.Hide();
            em.Show();
        }

        private void add_expenses_Load(object sender, EventArgs e) //LOAD
        {
            displayRecord();
            button2.Enabled = false;
            button3.Enabled = false;
        }

        private void button1_Click(object sender, EventArgs e) // ADD
        {
            if (textBox1.Text == string.Empty)
            {
                MessageBox.Show("Please enter a value to Name!");
            }
            else if (textBox2.Text == string.Empty)
            {
                MessageBox.Show("Please enter a value to Particular!");
            }
            else if (!textBox3.Text.Any(char.IsDigit) || string.IsNullOrWhiteSpace(textBox3.Text))
            {
                MessageBox.Show("Please enter a Numeric value to Amount");
            }  
            else
            {

                con.Open();
                SqlCommand cmd = new SqlCommand("INSERT INTO Expenses(Name, Particular, Amount, Date) VALUES('" + textBox1.Text + "','" + textBox2.Text + "','" + textBox3.Text + "','" + this.dateTimePicker1.Text + "')", con);
                cmd.ExecuteNonQuery();

                con.Close();
                MessageBox.Show("Expense saved");
                displayRecord();

            }

        }

        private void button6_Click(object sender, EventArgs e)// NAME search
        {
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Expenses where Name like'%" + textBox7.Text + "%' ", con);
                da.Fill(dt);
                dataGridView1.DataSource = dt.DefaultView;
                double f = 0;
                f = dataGridView1.Rows.Count - 1;
                textBox9.Text = f.ToString();
            }
            catch
            {
                MessageBox.Show("Search not Found");
            }

        }

        private void button7_Click(object sender, EventArgs e) // date search
        {
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Expenses where Date like'%" + textBox10.Text + "%' ", con);
                da.Fill(dt);
                dataGridView1.DataSource = dt.DefaultView;
                double f = 0;
                f = dataGridView1.Rows.Count - 1;
                textBox9.Text = f.ToString();
            }
            catch
            {
                MessageBox.Show("Search not Found");
            }
        }

        private void button4_Click(object sender, EventArgs e) //view
        {
            displayRecord();
        }

        private void button2_Click(object sender, EventArgs e) //Update
        {
            try
            {

                con.Open();
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Expenses where id='" + textBox8.Text + "'", con);
                da.Fill(dt);
                // start the editing selected record
                dt.Rows[0].BeginEdit();
                if (textBox4.Text == string.Empty)
                {
                    MessageBox.Show("Please enter a value to Name!");
                    con.Close();
                }
                else
                {
                    dt.Rows[0][1] = textBox4.Text;
                    if (textBox5.Text == string.Empty)
                    {
                        MessageBox.Show("Please enter a value to Particular!");
                        con.Close();
                    }
                    else
                    {
                        dt.Rows[0][2] = textBox5.Text;
                        if (!textBox6.Text.Any(char.IsDigit) || string.IsNullOrWhiteSpace(textBox6.Text))
                        {
                            MessageBox.Show("Please enter a value to Amount!");
                            con.Close();
                        }
                        else
                        {
                            dt.Rows[0][3] = this.dateTimePicker2.Text;
                            dt.Rows[0][4] = textBox6.Text;
                            

                            // stop editing
                            dt.Rows[0].EndEdit();

                            // declare the command builder that allow saving records
                            SqlCommandBuilder cb = new SqlCommandBuilder(da);

                            //update the database
                            da.Update(dt);

                            // close connection
                            con.Close();

                            MessageBox.Show("Expenses Updated");
                            // call the mtd to display records
                            displayRecord();
                        }
                    }
                }
            }
            catch (Exception error)
            {
                MessageBox.Show(error.ToString());

            }
        }

        private void button3_Click(object sender, EventArgs e) //delete
        {
             DialogResult result2 = MessageBox.Show("Confirm Deletion","Important Query", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
             if (result2 == DialogResult.Yes)
             {
                 try
                 {
                     con.Open();
                     DataTable dt = new DataTable();
                     SqlDataAdapter da = new SqlDataAdapter("Delete from Expenses where id=" + textBox9.Text + "", con);
                     da.Fill(dt);

                     // declare the command builder that allow saving records
                     SqlCommandBuilder cb = new SqlCommandBuilder(da);

                     //update the database
                     da.Update(dt);

                     // close connection
                     con.Close();
                     MessageBox.Show("Expense Deleted");
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
                 MessageBox.Show(" Deletion Cancelled");
             }
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

            if (e.RowIndex >= 0)
            {
                DataGridViewRow row = this.dataGridView1.Rows[e.RowIndex];

                textBox4.Text = row.Cells["Name"].Value.ToString();
                textBox5.Text = row.Cells["Particular"].Value.ToString();
                textBox6.Text = row.Cells["Amount"].Value.ToString();
                textBox8.Text = row.Cells["id"].Value.ToString();


            }
            button2.Enabled = true;
            button3.Enabled = true;

        }
    }
}
