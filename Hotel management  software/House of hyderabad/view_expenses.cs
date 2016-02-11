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

using iTextSharp.text.pdf;
using System.IO;
using iTextSharp.text;

namespace House_of_hyderabad
{
    public partial class view_expenses : Form
    {
        public view_expenses()
        {
            InitializeComponent();
        }

        SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["House_of_hyderabadConnectionString"].ConnectionString);

        private void displayRecord()
        {
            DataTable dt = new DataTable();
            SqlDataAdapter da = new SqlDataAdapter("Select * from expenses ", con);
            da.Fill(dt);
            dataGridView1.DataSource = dt.DefaultView;
            double f = 0;
            f = dataGridView1.Rows.Count - 1;
            textBox4.Text = f.ToString();
            double sum = 0;
            for (int i = 0; i < dataGridView1.Rows.Count; ++i)
            {
                sum += Convert.ToInt32(dataGridView1.Rows[i].Cells[4].Value);
            }
            textBox2.Text = sum.ToString();

        }

        private void button1_Click(object sender, EventArgs e)
        {
            expenses_menu em = new expenses_menu();
            this.Hide();
            em.Show();
        }

        private void button2_Click(object sender, EventArgs e) // view
        {
            displayRecord();
        }

        private void view_expenses_Load(object sender, EventArgs e) // load
        {
            displayRecord();
        }

        private void button3_Click(object sender, EventArgs e) //name search
        {
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Expenses where Name like'%" + textBox1.Text + "%' ", con);
                da.Fill(dt);
                dataGridView1.DataSource = dt.DefaultView;
                double f = 0;
                f = dataGridView1.Rows.Count - 1;
                textBox4.Text = f.ToString();
                double sum = 0;
                for (int i = 0; i < dataGridView1.Rows.Count; ++i)
                {
                    sum += Convert.ToInt32(dataGridView1.Rows[i].Cells[4].Value);


                }
                textBox2.Text = sum.ToString();
            }
            catch
            {
                MessageBox.Show("Search not Found");
            }
        }

        private void button4_Click(object sender, EventArgs e)// date search
        {
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Expenses where Date like'%" + textBox3.Text + "%' ", con);
                da.Fill(dt);
                dataGridView1.DataSource = dt.DefaultView;
                double f = 0;
                f = dataGridView1.Rows.Count - 1;
                textBox4.Text = f.ToString();
                double sum = 0;
                for (int i = 0; i < dataGridView1.Rows.Count; ++i)
                {
                    sum += Convert.ToInt32(dataGridView1.Rows[i].Cells[4].Value);
                }
                textBox2.Text = sum.ToString();
            }
            catch
            {
                MessageBox.Show("Search not Found");
            }
        }

      

       

        private void button7_Click(object sender, EventArgs e) //pdf
        {
            try
            {
                Document doc = new Document(iTextSharp.text.PageSize.A4);
                string path = Environment.GetFolderPath(Environment.SpecialFolder.MyDocuments);
                PdfWriter wri = PdfWriter.GetInstance(doc, new FileStream(path + "\\MICSELLANEOUS EXPENSES.pdf", FileMode.Create));
                doc.Open();


                Paragraph paragraph = new Paragraph("HOUSE  OF  HYDERABAD \n GOLE  BAZAR,  JABALPUR  (M.P.)\n  MOB. 9827682081 , 9907223573\n SHOP  0761 - 4081155  \n MICSELLANEOUS EXPENSES \n \n ");
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
               
                Paragraph par = new Paragraph("Statements : " + textBox4.Text);
                par.Alignment = Element.ALIGN_LEFT;
                doc.Add(par);

                Paragraph par1 = new Paragraph("Total : " + textBox2.Text);
                par1.Alignment = Element.ALIGN_RIGHT;
                doc.Add(par1);
                doc.Close();
                MessageBox.Show(" PDF Created");
            }
            catch (Exception error)
            {
                MessageBox.Show(error.ToString());

            }
        }

       
    }
}
