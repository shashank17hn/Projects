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
    public partial class View_Profile : Form
    {
        public View_Profile()
        {
            InitializeComponent();
        }

        SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["House_of_hyderabadConnectionString"].ConnectionString);

        private void displayRecord()
        {
            DataTable dt = new DataTable();
            SqlDataAdapter da = new SqlDataAdapter("Select * from Staff_profile", con);
            da.Fill(dt);
            dataGridView1.DataSource = dt.DefaultView;
            double f = 0;
            f = dataGridView1.Rows.Count - 1;
            textBox1.Text = f.ToString();

        }
        private void button1_Click(object sender, EventArgs e)
        {
            staff_profile sp = new staff_profile();
            this.Hide();
            sp.Show();
        }

       
        private void button2_Click(object sender, EventArgs e)  // view
        {
            displayRecord();
        }

        private void button4_Click(object sender, EventArgs e)  // NAME SEARCH
        {
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Staff_profile where Name like'%" + textBox2.Text + "%' ", con);
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

        private void button7_Click(object sender, EventArgs e) //PDF
        {
            try
            {
                Document doc = new Document(iTextSharp.text.PageSize.A4);
                string path = Environment.GetFolderPath(Environment.SpecialFolder.MyDocuments);
                PdfWriter wri = PdfWriter.GetInstance(doc, new FileStream(path + "\\STAFF PROFILE.pdf", FileMode.Create));
                doc.Open();


                Paragraph paragraph = new Paragraph("HOUSE  OF  HYDERABAD \n GOLE  BAZAR,  JABALPUR  (M.P.)\n  MOB. 9827682081 , 9907223573\n SHOP  0761 - 4081155  \n STAFF PROFILE \n \n ");
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

                Paragraph par = new Paragraph("No. Staff Profiles :"+textBox1.Text);
                par.Alignment = Element.ALIGN_LEFT;
                doc.Add(par);
                doc.Close();
                MessageBox.Show(" PDF Created");
            }
            catch (Exception error)
            {
                MessageBox.Show(error.ToString());

            }
        }

        private void button3_Click(object sender, EventArgs e) //DATE SEARCH
        {
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Staff_profile where Designation like'%" + textBox3.Text + "%' ", con);
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

        private void View_Profile_Load(object sender, EventArgs e)
        {
            displayRecord();
        }
    }
}
