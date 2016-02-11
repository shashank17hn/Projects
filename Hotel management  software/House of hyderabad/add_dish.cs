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
    public partial class add_dish : Form
    {
        public add_dish()
        {
            InitializeComponent();
        }

        SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["House_of_hyderabadConnectionString"].ConnectionString);

        private void displayRecord()
        {
            DataTable dt = new DataTable();
            SqlDataAdapter da = new SqlDataAdapter("Select * from Dish ORDER BY Dish_Name ASC", con);
            da.Fill(dt);
            dataGridView1.DataSource = dt.DefaultView;
            double f = 0;
            f = dataGridView1.Rows.Count - 1;
            textBox3.Text = f.ToString();

        }
        
        
        
        private void button3_Click(object sender, EventArgs e)
        {
            Dish_menu dm = new Dish_menu();
            this.Hide();
            dm.Show();
        }

        private void button1_Click(object sender, EventArgs e) // SAve
        {
            string Quantity = "";
            if (radioButton1.Checked)
            {
                Quantity = radioButton1.Text;
            }
            else
            {
                Quantity = radioButton2.Text;
            }
            
            
            string category = "";
            if (radioButton5.Checked)
            {
                category = radioButton5.Text;
            }
            else 
            {
                category = radioButton6.Text;
            }
            
           if (textBox1.Text == string.Empty)
            {
                MessageBox.Show("Please enter a value to Dish Name!");
            }
            else if (!textBox4.Text.Any(char.IsDigit) || string.IsNullOrWhiteSpace(textBox4.Text))
            {
                MessageBox.Show("Please enter a Numeric value to Price");
            }
            else
            {
               
                con.Open();
                SqlCommand cmd = new SqlCommand("INSERT INTO Dish(Dish_Name, Category, Quantity, Price) VALUES('" + textBox1.Text + "','" + category + "','" + Quantity + "','" + textBox4.Text + "')", con);
                cmd.ExecuteNonQuery();

                con.Close();
                MessageBox.Show("Dish saved");
                displayRecord();

            }

        }

        private void button2_Click(object sender, EventArgs e) //View
        {
            displayRecord();

        }

        private void button6_Click(object sender, EventArgs e) // Search
        {
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Dish where Dish_Name like'%" + textBox2.Text + "%' ", con);
                da.Fill(dt);
                dataGridView1.DataSource = dt.DefaultView;
                double f = 0;
                f = dataGridView1.Rows.Count - 1;
                textBox3.Text = f.ToString();
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
                SqlDataAdapter da = new SqlDataAdapter("Select * from Dish where id='" + textBox9.Text + "'", con);
                da.Fill(dt);
                // start the editing selected record
                dt.Rows[0].BeginEdit();
                if (textBox5.Text == string.Empty)
                {
                    MessageBox.Show("Please enter a value to Dish Name!");
                    con.Close();
                }
                else
                {
                    dt.Rows[0][1] = textBox5.Text;
                    if (!textBox8.Text.Any(char.IsDigit) || string.IsNullOrWhiteSpace(textBox8.Text))
                    {
                        MessageBox.Show("Please enter a value to Price!");
                        con.Close();
                    }
                    else
                    {
                        dt.Rows[0][4] = textBox8.Text;
                        if (radioButton7.Checked)
                        {
                            dt.Rows[0][2] = radioButton7.Text;
                        }
                        else
                        {
                            dt.Rows[0][2] = radioButton8.Text;
                        }
                        if (radioButton3.Checked)
                        {
                            dt.Rows[0][3] = radioButton3.Text;
                        }
                        else
                        {
                            dt.Rows[0][3] = radioButton4.Text;
                        }


                        // stop editing
                        dt.Rows[0].EndEdit();

                        // declare the command builder that allow saving records
                        SqlCommandBuilder cb = new SqlCommandBuilder(da);

                        //update the database
                        da.Update(dt);

                        // close connection
                        con.Close();

                        MessageBox.Show("Dish Updated");
                        // call the mtd to display records
                        displayRecord();
                    }
                }
            }
           catch (Exception error)
            {
                MessageBox.Show(error.ToString());

           }
        }

        private void button5_Click(object sender, EventArgs e) //delete
        {

            DialogResult result2 = MessageBox.Show("Confirm Deletion","Important Query", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
            if (result2 == DialogResult.Yes)
            {

                try
                {
                    con.Open();
                    DataTable dt = new DataTable();
                    SqlDataAdapter da = new SqlDataAdapter("Delete from Dish where id=" + textBox9.Text + "", con);
                    da.Fill(dt);

                    // declare the command builder that allow saving records
                    SqlCommandBuilder cb = new SqlCommandBuilder(da);

                    //update the database
                    da.Update(dt);

                    // close connection
                    con.Close();
                    MessageBox.Show("Dish Deleted");
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

                textBox5.Text = row.Cells["Dish_Name"].Value.ToString();
                textBox8.Text = row.Cells["Price"].Value.ToString();
                textBox9.Text = row.Cells["id"].Value.ToString();
                

            }
            button4.Enabled = true;
            button5.Enabled = true;
        }

        private void add_dish_Load(object sender, EventArgs e)
        {
            displayRecord();
            button4.Enabled = false;
            button5.Enabled = false;
        }
    }
}
