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
using PdfSharp.Drawing;

namespace House_of_hyderabad
{
    public partial class view_dishes : Form
    {
        public view_dishes()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Dish_menu dm = new Dish_menu();
            this.Hide();
            dm.Show();
        }


        SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["House_of_hyderabadConnectionString"].ConnectionString);

        private void displayRecord()
        {
            DataTable dt = new DataTable();
            SqlDataAdapter da = new SqlDataAdapter("Select Dish_Name,Category,Quantity,Price from Dish ", con);
            da.Fill(dt);
            dataGridView1.DataSource = dt.DefaultView;
            double f = 0;
            f = dataGridView1.Rows.Count - 1;
            textBox1.Text = f.ToString();

        }

        private void view_dishes_Load(object sender, EventArgs e) // load
        {
            displayRecord();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select Dish_Name,Category,Quantity,Price from Dish where Dish_Name like'%" + textBox2.Text + "%' ", con);
                da.Fill(dt);
                dataGridView1.DataSource = dt.DefaultView;
                double f = 0;
                f = dataGridView1.Rows.Count - 1;
                textBox1.Text = f.ToString();
            }
            catch
            {
                MessageBox.Show("Search not Found");
            }
        }

        private void button4_Click(object sender, EventArgs e)
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
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select Dish_Name,Category,Quantity,Price from Dish where Quantity ='" + Quantity +"' and Category= '"+category +"'", con);
                da.Fill(dt);
                dataGridView1.DataSource = dt.DefaultView;
                double f = 0;
                f = dataGridView1.Rows.Count - 1;
                textBox1.Text = f.ToString();
            }
            catch
            {
                MessageBox.Show("Search not Found");
            }

        }

        private void button2_Click(object sender, EventArgs e) // view
        {
            displayRecord();
        }

        private void button7_Click(object sender, EventArgs e) //pdf
        {
            try
            {
                Document doc = new Document(iTextSharp.text.PageSize.A4);
                string path = Environment.GetFolderPath(Environment.SpecialFolder.MyDocuments);
                PdfWriter wri = PdfWriter.GetInstance(doc, new FileStream( path +"\\DISHES.pdf", FileMode.Create));
                doc.Open();


                Paragraph paragraph = new Paragraph("HOUSE  OF  HYDERABAD \n GOLE  BAZAR,  JABALPUR  (M.P.)\n  MOB. 9827682081 , 9907223573\n SHOP  0761 - 4081155  \n DISHES \n \n " );
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
                Paragraph par = new Paragraph("No Of Dishes :" +textBox1.Text);
                par.Alignment = Element.ALIGN_RIGHT;

                doc.Add(par);
                doc.Close();
                MessageBox.Show(" pdf created");
            }
            catch (Exception error)
            {
                MessageBox.Show(error.ToString());

            }
        }

       

       
    }
}
