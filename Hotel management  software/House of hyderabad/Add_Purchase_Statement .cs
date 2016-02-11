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
    public partial class Add_Purchase_Statement : Form
    {
        public Add_Purchase_Statement()
        {
            InitializeComponent();
        }

        SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["House_of_hyderabadConnectionString"].ConnectionString);

        private void displayRecord()
        {
            DataTable dt = new DataTable();
            SqlDataAdapter da = new SqlDataAdapter("Select * from Purchase_stat ORDER BY Name ASC", con);
            da.Fill(dt);
            dataGridView1.DataSource = dt.DefaultView;
            double f = 0;
            f = dataGridView1.Rows.Count - 1;
            textBox9.Text = f.ToString();

        }
        private void button5_Click(object sender, EventArgs e) // back
        {
            Purchase_menu pm = new Purchase_menu();
            this.Hide();
            pm.Show();
        }

        private void Add_Purchase_Statement_Load(object sender, EventArgs e)
        {
            displayRecord();
            button2.Enabled = false;
            button3.Enabled = false;

        }

        private void button1_Click(object sender, EventArgs e) //add
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
            else if (!textBox10.Text.Any(char.IsDigit) || string.IsNullOrWhiteSpace(textBox10.Text))
            {
                MessageBox.Show("Please enter a Numeric value to Amount");
            }

            else
            {

                con.Open();
                SqlCommand cmd = new SqlCommand("INSERT INTO Purchase_stat(Name, Item, Quantity, Date,Amount) VALUES('" + textBox1.Text + "','" + textBox2.Text + "','" + textBox3.Text + "','" + this.dateTimePicker1.Text + "','"+textBox10.Text+"')", con);
                cmd.ExecuteNonQuery();

                con.Close();
                MessageBox.Show("Statemnet saved");
                displayRecord();

            }
        }

        private void button4_Click(object sender, EventArgs e) // view
        {
            displayRecord();

        }

        private void button6_Click(object sender, EventArgs e) // name serach
        {
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Purchase_stat where Name like'%" + textBox7.Text + "%' ", con);
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
                SqlDataAdapter da = new SqlDataAdapter("Select * from Purchase_stat where Date like'%" + textBox12.Text + "%' ", con);
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

        private void button2_Click(object sender, EventArgs e)//update
        {
            try
            {


                con.Open();
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Purchase_stat where id='" + textBox8.Text + "'", con);
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
                        MessageBox.Show("Please enter a value to Item!");
                        con.Close();
                    }
                    else
                    {
                        dt.Rows[0][2] = textBox5.Text;
                        if (textBox6.Text == string.Empty)
                        {
                            MessageBox.Show("Please enter a value to Quantity!");
                            con.Close();
                        }
                        else
                        {
                            dt.Rows[0][3] = textBox6.Text;
                            if (!textBox11.Text.Any(char.IsDigit) || string.IsNullOrWhiteSpace(textBox11.Text))
                            {
                                MessageBox.Show("Please enter a Numeric value to Amount");
                            }
                            else
                            {
                                dt.Rows[0][4] = this.dateTimePicker2.Text;
                                dt.Rows[0][5] = textBox11.Text;




                                // stop editing
                                dt.Rows[0].EndEdit();

                                // declare the command builder that allow saving records
                                SqlCommandBuilder cb = new SqlCommandBuilder(da);

                                //update the database
                                da.Update(dt);

                                // close connection
                                con.Close();

                                MessageBox.Show("Statement Updated");
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

        private void button3_Click(object sender, EventArgs e) //delete
        {
             DialogResult result2 = MessageBox.Show("Confirm Deletion","Important Query", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
             if (result2 == DialogResult.Yes)
             {

                 try
                 {
                     con.Open();
                     DataTable dt = new DataTable();
                     SqlDataAdapter da = new SqlDataAdapter("Delete from Purchase_stat where id=" + textBox9.Text + "", con);
                     da.Fill(dt);

                     // declare the command builder that allow saving records
                     SqlCommandBuilder cb = new SqlCommandBuilder(da);

                     //update the database
                     da.Update(dt);

                     // close connection
                     con.Close();
                     MessageBox.Show("Statement Deleted");
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

                textBox4.Text = row.Cells["Name"].Value.ToString();
                textBox5.Text = row.Cells["Item"].Value.ToString();
                textBox6.Text = row.Cells["Quantity"].Value.ToString();
                textBox11.Text = row.Cells["Amount"].Value.ToString();
                textBox8.Text = row.Cells["id"].Value.ToString();
                
            }
            button2.Enabled = true;
            button3.Enabled = true;

        }
    }
}
