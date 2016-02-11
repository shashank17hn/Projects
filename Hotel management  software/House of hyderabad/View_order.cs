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
using iTextSharp.text;
using iTextSharp.text.pdf;
using System.IO;

namespace House_of_hyderabad
{
    public partial class View_order : Form
    {
        public View_order()
        {
            InitializeComponent();
        }

        SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["House_of_hyderabadConnectionString"].ConnectionString);

        private void displayRecord()
        {
            DataTable dt = new DataTable();
            SqlDataAdapter da = new SqlDataAdapter("Select * from Sale_order", con);
            da.Fill(dt);
            dataGridView1.DataSource = dt.DefaultView;
            double f = 0;
            f = dataGridView1.Rows.Count - 1;
            textBox4.Text = f.ToString();
            double sum = 0;  double amt=0;

            try
            {
                for (int l = 0; l < dataGridView1.Rows.Count; ++l)
                {
                    sum += Convert.ToInt32(dataGridView1.Rows[l].Cells[6].Value);
                    amt += Convert.ToInt32(dataGridView1.Rows[l].Cells[7].Value);
                    textBox2.Text = sum.ToString();
                    textBox3.Text = amt.ToString();
                }
            }
            catch
            {
                MessageBox.Show("Some of your is Incomplete"); 
            }
        }

        private void displayRecord1()
        {
            DataTable dt = new DataTable();
            SqlDataAdapter da = new SqlDataAdapter("Select * from Order_dish where Order_No = '"+textBox5.Text +"'", con);
            da.Fill(dt);
            dataGridView2.DataSource = dt.DefaultView;
           
        }
        

        private void View_order_Load(object sender, EventArgs e) //load
        {
            displayRecord();
          

        }

        private void button1_Click(object sender, EventArgs e) // name search
        {
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Sale_order where Order_No like'%" + textBox1.Text + "%' ", con);
                da.Fill(dt);
                dataGridView1.DataSource = dt.DefaultView;
                double f = 0;
                f = dataGridView1.Rows.Count - 1;
                textBox4.Text = f.ToString();
                double sum = 0; double amt = 0;
                for (int l = 0; l < dataGridView1.Rows.Count; ++l)
                {
                    sum += Convert.ToInt32(dataGridView1.Rows[l].Cells[6].Value);
                    amt += Convert.ToInt32(dataGridView1.Rows[l].Cells[7].Value);
                    textBox2.Text = sum.ToString();
                    textBox3.Text = amt.ToString();
                }
            }
            catch
            {
                MessageBox.Show("Some of your is Incomplete"); 
            }
        }

        private void button2_Click(object sender, EventArgs e) // date serach
        {
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Sale_order where Date like'%" + textBox7.Text + "%' ", con); 
                da.Fill(dt);
                dataGridView1.DataSource = dt.DefaultView;
                double f = 0;
                f = dataGridView1.Rows.Count - 1;
                textBox4.Text = f.ToString();
                double sum = 0; double amt = 0;
                for (int l = 0; l < dataGridView1.Rows.Count; ++l)
                {
                    sum += Convert.ToInt32(dataGridView1.Rows[l].Cells[6].Value);
                    amt += Convert.ToInt32(dataGridView1.Rows[l].Cells[7].Value);
                    textBox2.Text = sum.ToString();
                    textBox3.Text = amt.ToString();
                }
            }
            catch
            {
                MessageBox.Show("Some of your contents are Incomplete"); 
            }

        }

        private void button3_Click(object sender, EventArgs e) // view all
        {
            displayRecord();
           
        }


        private void deleteorder()
        {
            try
            {
                con.Open();
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Delete from Order_dish where Order_No=" + textBox5.Text + "", con);
                da.Fill(dt);

                // declare the command builder that allow saving records
                SqlCommandBuilder cb = new SqlCommandBuilder(da);

                //update the database
                da.Update(dt);

                // close connection
                con.Close();
               
            }
            catch (Exception error)
            {
                MessageBox.Show(error.ToString());

            }
        }
        

        private void button6_Click(object sender, EventArgs e) //delete
        {
            DialogResult result2 = MessageBox.Show("Confirm Deletion","Important Query", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
            if (result2 == DialogResult.Yes)
            {

                try
                {
                    con.Open();
                    DataTable dt = new DataTable();
                    SqlDataAdapter da = new SqlDataAdapter("Delete from Sale_order where Order_No=" + textBox5.Text + "", con);
                    da.Fill(dt);

                    // declare the command builder that allow saving records
                    SqlCommandBuilder cb = new SqlCommandBuilder(da);

                    //update the database
                    da.Update(dt);

                    // close connection
                    con.Close();
                    deleteorder();
                    MessageBox.Show("Order Deleted");
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

        private void button4_Click(object sender, EventArgs e)
        {
            Sales_menu sm = new Sales_menu();
            this.Hide();
            sm.Show();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            try
            {
                Document doc = new Document(iTextSharp.text.PageSize.A4);
                string path = Environment.GetFolderPath(Environment.SpecialFolder.MyDocuments);
                PdfWriter wri = PdfWriter.GetInstance(doc, new FileStream(path + "\\SALES STATEMENT.pdf", FileMode.Create));
                doc.Open();


                Paragraph paragraph = new Paragraph("HOUSE  OF  HYDERABAD \n GOLE  BAZAR,  JABALPUR  (M.P.)\n  MOB. 9827682081 , 9907223573\n SHOP  0761 - 4081155  \n SALES STATEMENT \n \n ");
                paragraph.Alignment = Element.ALIGN_CENTER;

                doc.Add(paragraph);


                PdfPTable table = new PdfPTable(dataGridView1.Columns.Count);
                for (int j = 0; j < dataGridView1.Columns.Count; j++)
                {
                    table.AddCell(new Phrase(dataGridView1.Columns[j].HeaderText));
                }
                table.HeaderRows = 1;
                for (int i = 0; i < dataGridView1.Rows.Count; i++)
                {
                    for (int k = 0; k < dataGridView1.Columns.Count; k++)
                    {
                        if (dataGridView1[k, i].Value != null)
                        {
                            table.AddCell(new Phrase(dataGridView1[k, i].Value.ToString()));
                        }
                    }
                }


                doc.Add(table);

                Paragraph par1 = new Paragraph("Total Orders :" + textBox4.Text);
                par1.Alignment = Element.ALIGN_LEFT;
                doc.Add(par1);


                Paragraph par = new Paragraph("Total Orders :"+textBox4.Text+"\nAmount :" +textBox2.Text+ "\nTotal : "+ textBox3.Text);
                par.Alignment = Element.ALIGN_RIGHT;
                doc.Add(par);
                doc.Close();
                MessageBox.Show(" PDF Created");
            }
            catch (Exception error)
            {
                MessageBox.Show(error.ToString());

            }
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            if (e.RowIndex >= 0)
            {
                DataGridViewRow row = this.dataGridView1.Rows[e.RowIndex];
                textBox5.Text = row.Cells["Order_No"].Value.ToString();
                displayRecord1();
            }
        }

        private void button7_Click(object sender, EventArgs e)
        {
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Sale_order where Type like'%" + textBox6.Text + "%' ", con);
                da.Fill(dt);
                dataGridView1.DataSource = dt.DefaultView;
                double f = 0;
                f = dataGridView1.Rows.Count - 1;
                textBox4.Text = f.ToString();
                double sum = 0; double amt = 0;
                for (int l = 0; l < dataGridView1.Rows.Count; ++l)
                {
                    sum += Convert.ToInt32(dataGridView1.Rows[l].Cells[6].Value);
                    amt += Convert.ToInt32(dataGridView1.Rows[l].Cells[7].Value);
                    textBox2.Text = sum.ToString();
                    textBox3.Text = amt.ToString();
                }
            }
            catch
            {
                MessageBox.Show("Search not Found");
            }
        }

        private void dataGridView2_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        
        
    }
}
