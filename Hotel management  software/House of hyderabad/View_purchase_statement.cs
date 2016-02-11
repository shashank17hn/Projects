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
using System.IO;
using iTextSharp.text.pdf;

namespace House_of_hyderabad
{
    public partial class View_purchase_statement : Form
    {
        public View_purchase_statement()
        {
            InitializeComponent();
        }

        SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["House_of_hyderabadConnectionString"].ConnectionString);

        private void displayRecord()
        {
            DataTable dt = new DataTable();
            SqlDataAdapter da = new SqlDataAdapter("Select * from Purchase_stat", con);
            da.Fill(dt);
            dataGridView1.DataSource = dt.DefaultView;
            double f = 0;
            f = dataGridView1.Rows.Count - 1;
            textBox4.Text = f.ToString();
            double sum = 0;
            for (int i = 0; i < dataGridView1.Rows.Count; ++i)
            {
                sum += Convert.ToInt32(dataGridView1.Rows[i].Cells[5].Value);

            }
            textBox2.Text = sum.ToString();
        }
        private void button1_Click(object sender, EventArgs e)
        {
            Purchase_menu pm = new Purchase_menu();
            this.Hide();
            pm.Show();
        }

       

        private void button2_Click(object sender, EventArgs e) //view
        {
            displayRecord();
        }

        private void View_purchase_statement_Load(object sender, EventArgs e) // load
        {
            displayRecord();
        }

        private void button8_Click(object sender, EventArgs e) // name search
        {
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Purchase_stat where Name like'%" + textBox3.Text + "%' ", con);
                da.Fill(dt);
                dataGridView1.DataSource = dt.DefaultView;
                double f = 0;
                f = dataGridView1.Rows.Count - 1;
                textBox4.Text = f.ToString();
                double sum = 0;
                for (int i = 0; i < dataGridView1.Rows.Count; ++i)
                {
                    sum += Convert.ToInt32(dataGridView1.Rows[i].Cells[5].Value);

                }
                textBox2.Text = sum.ToString();
            }
            catch
            {
                MessageBox.Show("Search not Found");
            }
        }

        private void button5_Click(object sender, EventArgs e) // date serach
        {
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Purchase_stat where Date like'%" + textBox1.Text + "%' ", con);
                da.Fill(dt);
                dataGridView1.DataSource = dt.DefaultView;
                double f = 0;
                f = dataGridView1.Rows.Count - 1;
                textBox4.Text = f.ToString();
                double sum = 0;
                for (int i = 0; i < dataGridView1.Rows.Count; ++i)
                {
                    sum += Convert.ToInt32(dataGridView1.Rows[i].Cells[5].Value);

                }
                textBox2.Text = sum.ToString();
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
                Document doc = new Document(iTextSharp.text.PageSize.A4);
                string path = Environment.GetFolderPath(Environment.SpecialFolder.MyDocuments);
                PdfWriter wri = PdfWriter.GetInstance(doc, new FileStream(path + "\\PURCHASE STATEMENT.pdf", FileMode.Create));
                doc.Open();


                Paragraph paragraph = new Paragraph("HOUSE  OF  HYDERABAD \n GOLE  BAZAR,  JABALPUR  (M.P.)\n  MOB. 9827682081 , 9907223573\n SHOP  0761 - 4081155  \n PURCHASE STATEMENT \n \n ");
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
