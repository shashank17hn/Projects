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
using System.Drawing.Printing;

namespace House_of_hyderabad
{
    public partial class Past_bills : Form
    {
        public Past_bills()
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
           
        }

        private void displayRecord1()
        {
            DataTable dt = new DataTable();
            SqlDataAdapter da = new SqlDataAdapter("Select * from Order_dish where Order_No = '" + textBox2.Text + "'", con);
            da.Fill(dt);
            dataGridView2.DataSource = dt.DefaultView;

        }
        private void Past_bills_Load(object sender, EventArgs e)
        {
            displayRecord();
            button5.Enabled = false;
        }

        private void button1_Click(object sender, EventArgs e) // name search
        {
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Sale_order where Order_No like'%" + textBox1.Text + "%' ", con);
                da.Fill(dt);
                dataGridView1.DataSource = dt.DefaultView;
            }
            catch
            {
                MessageBox.Show("Search not Found");
            }


        }

        private void button2_Click(object sender, EventArgs e) //date serach
        {

            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Sale_order where Date like'%" + textBox4.Text + "%' ", con);
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
                SqlDataAdapter da = new SqlDataAdapter("Select * from Sale_order where Order_No like'%" + textBox6.Text + "%' ", con);
                da.Fill(dt);
                dataGridView1.DataSource = dt.DefaultView;
              
            }
            catch
            {
                MessageBox.Show("Search not Found");
            }
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            if (e.RowIndex >= 0)
            {
                DataGridViewRow row = this.dataGridView1.Rows[e.RowIndex];
                textBox2.Text = row.Cells["Order_No"].Value.ToString();
                textBox3.Text = row.Cells["Type"].Value.ToString();
                textBox9.Text = row.Cells["Tax"].Value.ToString();
                textBox11.Text = row.Cells["Amount"].Value.ToString();
                textBox10.Text = row.Cells["Total"].Value.ToString();
                textBox5.Text = row.Cells["Date"].Value.ToString();
                textBox7.Text = row.Cells["Time"].Value.ToString();
                textBox8.Text = row.Cells["Refrences"].Value.ToString();


                displayRecord1();
            }
            button5.Enabled = true;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            displayRecord();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            Sales_menu sm = new Sales_menu();
            this.Hide();
            sm.Show();
        }

        private void button5_Click(object sender, EventArgs e)
        {

            PrintReceipt();

        }

        private void PrintReceipt() //print
        {
            PrintDialog printdialog = new PrintDialog();

            PrintDocument printDocument = new PrintDocument();

            printdialog.Document = printDocument;

            printDocument.PrintPage += new PrintPageEventHandler(printDocument_PrintPage);

            DialogResult result = printdialog.ShowDialog();

            if (result == DialogResult.OK)
            {
                printDocument.Print();
            }
        }

        void printDocument_PrintPage(object sender, PrintPageEventArgs e) //print data
        {


            Graphics graphic = e.Graphics;

            Font font = new Font("Courier New", 12);

            float fontHeight = font.GetHeight();

            int startX = 10;
            int startY = 10;




            int width = 0;
            int height = 0;
            int i = 0;
            StringFormat str = new StringFormat();
            str.Alignment = StringAlignment.Near;
            str.LineAlignment = StringAlignment.Center;
            str.Trimming = StringTrimming.EllipsisCharacter;
            Pen p = new Pen(Color.Black, 2.5f);

            try
            {
                graphic.DrawString("HOUSE  OF  HYDERABAD \nGOLE  BAZAR,  JABALPUR  (M.P.)\nMOB. 9827682081 , 9907223573\nSHOP  0761 - 4081155 \n_____________________________", new Font("Courier New", 15), new SolidBrush(Color.Black), startX, startY);

                graphic.DrawString("\nReceipt \n" + textBox8.Text + "\nDate: " + textBox5.Text + " Time- " + textBox7.Text, new Font("Courier New", 10), new SolidBrush(Color.Black), startX, 110);

                //Sr.No 1
                e.Graphics.FillRectangle(Brushes.LightGray, new Rectangle(10, 180, dataGridView2.Columns[1].Width, dataGridView2.Rows[0].Height));
                // e.Graphics.DrawRectangle(Pens.Black, 10, 180, dataGridView2.Columns[1].Width, dataGridView2.Rows[0].Height);
                e.Graphics.DrawString(dataGridView2.Columns[1].HeaderText, new Font("Courier New", 12), Brushes.Black, new RectangleF(10, 180, dataGridView2.Columns[1].Width, dataGridView2.Rows[0].Height), str);

                // Description2

                e.Graphics.FillRectangle(Brushes.LightGray, new Rectangle(10 + dataGridView2.Columns[1].Width, 180, dataGridView2.Columns[2].Width + 30, dataGridView2.Rows[1].Height));
                //  e.Graphics.DrawRectangle(Pens.Black, 10 + dataGridView2.Columns[1].Width, 180, dataGridView2.Columns[2].Width + 30, dataGridView2.Rows[1].Height);
                e.Graphics.DrawString(dataGridView2.Columns[2].HeaderText, new Font("Courier New", 12), Brushes.Black, new RectangleF(10 + dataGridView2.Columns[1].Width, 180, dataGridView2.Columns[2].Width + 30, dataGridView2.Rows[1].Height), str);

                //ItemNo3

                e.Graphics.FillRectangle(Brushes.LightGray, new Rectangle(40 + dataGridView2.Columns[1].Width + dataGridView2.Columns[2].Width, 180, dataGridView2.Columns[3].Width, dataGridView2.Rows[0].Height));
                //  e.Graphics.DrawRectangle(Pens.Black, 40 + dataGridView2.Columns[1].Width + dataGridView2.Columns[2].Width, 100, dataGridView2.Columns[3].Width, dataGridView2.Rows[0].Height);
                e.Graphics.DrawString(dataGridView2.Columns[3].HeaderText, new Font("Courier New", 12), Brushes.Black, new RectangleF(40 + dataGridView2.Columns[1].Width + dataGridView2.Columns[2].Width, 180, dataGridView2.Columns[3].Width, dataGridView2.Rows[0].Height), str);

                //Quantity4

                e.Graphics.FillRectangle(Brushes.LightGray, new Rectangle(40 + dataGridView2.Columns[1].Width + dataGridView2.Columns[2].Width + dataGridView2.Columns[3].Width, 180, dataGridView2.Columns[4].Width, dataGridView2.Rows[0].Height));
                //  e.Graphics.DrawRectangle(Pens.Black, 40 + dataGridView2.Columns[1].Width + dataGridView2.Columns[2].Width + dataGridView2.Columns[3].Width, 180, dataGridView2.Columns[4].Width, dataGridView2.Rows[0].Height);
                e.Graphics.DrawString(dataGridView2.Columns[4].HeaderText, new Font("Courier New", 12), Brushes.Black, new RectangleF(40 + dataGridView2.Columns[1].Width + dataGridView2.Columns[2].Width + dataGridView2.Columns[3].Width, 180, dataGridView2.Columns[4].Width, dataGridView2.Rows[0].Height), str);

                //Unit5

                e.Graphics.FillRectangle(Brushes.LightGray, new Rectangle(40 + dataGridView2.Columns[1].Width + dataGridView2.Columns[2].Width + dataGridView2.Columns[3].Width + dataGridView2.Columns[4].Width, 180, 10 + dataGridView2.Columns[5].Width, dataGridView2.Rows[0].Height));
                //   e.Graphics.DrawRectangle(Pens.Black, 40 + dataGridView2.Columns[1].Width + dataGridView2.Columns[2].Width + dataGridView2.Columns[3].Width + dataGridView2.Columns[4].Width, 180, 10 + dataGridView2.Columns[5].Width, dataGridView2.Rows[0].Height);
                e.Graphics.DrawString(dataGridView2.Columns[5].HeaderText, new Font("Courier New", 12), Brushes.Black, new RectangleF(40 + dataGridView2.Columns[1].Width + dataGridView2.Columns[2].Width + dataGridView2.Columns[3].Width + dataGridView2.Columns[4].Width, 180, 10 + dataGridView2.Columns[5].Width, dataGridView2.Rows[0].Height), str);


                width = 100 + dataGridView2.Columns[1].Width;
                height = 180;
                //variable i is declared at class level to preserve the value of i if e.hasmorepages is true
            }
            catch
            {
                MessageBox.Show("Table is Empty");
            }

            try
            {
                while (i < dataGridView2.Rows.Count)
                {
                    if (height > e.MarginBounds.Height)
                    {
                        height = 100;
                        width = 300;
                        e.HasMorePages = true;
                        return;
                    }

                    if (dataGridView2.Rows[i].Cells[0].Value.ToString() == null)
                    {
                        MessageBox.Show("Table is Empty");
                    }
                    else
                    {
                        height += dataGridView2.Rows[i].Height;
                        dataGridView2.Rows[0].Height = 50;



                        //  e.Graphics.DrawRectangle(Pens.Black, 10, height, dataGridView2.Columns[1].Width, dataGridView2.Rows[1].Height);
                        e.Graphics.DrawString(dataGridView2.Rows[i].Cells[1].Value.ToString(), new Font("Courier New", 8), Brushes.Black, new RectangleF(10, height, dataGridView2.Columns[1].Width, dataGridView2.Rows[0].Height), str);

                        //Description
                        //  e.Graphics.DrawRectangle(Pens.Black, 10 + dataGridView2.Columns[2].Width, height, dataGridView2.Columns[2].Width + 30, dataGridView2.Rows[1].Height);
                        e.Graphics.DrawString(dataGridView2.Rows[i].Cells[2].Value.ToString(), new Font("Courier New", 8), Brushes.Black, new RectangleF(10 + dataGridView2.Columns[1].Width, height, dataGridView2.Columns[2].Width + 30, dataGridView2.Rows[1].Height), str);

                        //ItemNo
                        //  e.Graphics.DrawRectangle(Pens.Black, 40 + dataGridView2.Columns[1].Width + dataGridView2.Columns[2].Width, height, dataGridView2.Columns[3].Width, dataGridView2.Rows[0].Height);
                        e.Graphics.DrawString(dataGridView2.Rows[i].Cells[3].Value.ToString(), new Font("Courier New", 8), Brushes.Black, new RectangleF(40 + dataGridView2.Columns[1].Width + dataGridView2.Columns[2].Width, height, dataGridView2.Columns[3].Width, dataGridView2.Rows[0].Height), str);

                        //Quantity
                        //  e.Graphics.DrawRectangle(Pens.Black, 40 + dataGridView2.Columns[1].Width + dataGridView2.Columns[2].Width + dataGridView2.Columns[3].Width, height, dataGridView2.Columns[4].Width, dataGridView2.Rows[0].Height);
                        e.Graphics.DrawString(dataGridView2.Rows[i].Cells[4].Value.ToString(), new Font("Courier New", 8), Brushes.Black, new RectangleF(40 + dataGridView2.Columns[1].Width + dataGridView2.Columns[2].Width + dataGridView2.Columns[3].Width, height, dataGridView2.Columns[4].Width, dataGridView2.Rows[0].Height), str);

                        //Units

                        //   e.Graphics.DrawRectangle(Pens.Black, 40 + dataGridView2.Columns[1].Width + dataGridView2.Columns[2].Width + dataGridView2.Columns[3].Width + dataGridView2.Columns[4].Width, height, 10 + dataGridView2.Columns[5].Width, dataGridView2.Rows[0].Height);
                        e.Graphics.DrawString(dataGridView2.Rows[i].Cells[5].Value.ToString(), new Font("Courier New", 8), Brushes.Black, new RectangleF(40 + dataGridView2.Columns[1].Width + dataGridView2.Columns[2].Width + dataGridView2.Columns[3].Width + dataGridView2.Columns[4].Width, height, 10 + dataGridView2.Columns[5].Width, dataGridView2.Rows[0].Height), str);



                        width += dataGridView2.Columns[1].Width;
                        i++;

                    }

                }



            }
            catch (Exception)
            {

                // MessageBox.Show("Table is Empty");
            }

            int height1 = height + 30;
            int width3 = 500;
            int height2 = height1 + 30;
            int height3 = height2 + 30;
            graphic.DrawString("________________________\nAmount : " + textBox11.Text, new Font("Courier New", 10), new SolidBrush(Color.Black), width3, height1);
            graphic.DrawString("Tax : " + textBox9.Text + " % \n________________________\n", new Font("Courier New", 10), new SolidBrush(Color.Black), width3, height2);

            graphic.DrawString("Total : " + textBox10.Text, new Font("Courier New", 10), new SolidBrush(Color.Black), width3, height3);





        }
    
    
    }
}
