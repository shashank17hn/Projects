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
    public partial class l_add_order2cs : Form
    {
        public l_add_order2cs()
        {
            InitializeComponent();
        }
        SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["House_of_hyderabadConnectionString"].ConnectionString);

        private void displayRecord()
        {
            DataTable dt = new DataTable();
            SqlDataAdapter da = new SqlDataAdapter("Select * from Dish ", con);
            da.Fill(dt);
            dataGridView1.DataSource = dt.DefaultView;
            con.Close();

        }

        private void displayRecord1()
        {
            DataTable dt = new DataTable();
            SqlDataAdapter da = new SqlDataAdapter("Select * from Order_dish where Order_No ='" + textBox2.Text + "'", con);
            da.Fill(dt);
            dataGridView2.DataSource = dt.DefaultView;
            con.Close();
        }

        private void displayRecord2()
        {
            con.Open();
            DataTable dt1 = new DataTable();
            SqlDataAdapter da = new SqlDataAdapter("Select * from Sale_order", con);
            da.Fill(dt1);

            DataRow thisRow = (DataRow)dt1.Rows[dt1.Rows.Count - 1];
            textBox2.Text = Convert.ToString(thisRow["Order_No"]);
            textBox3.Text = Convert.ToString(thisRow["Type"]);
            textBox9.Text = Convert.ToString(thisRow["Tax"]);
            textBox16.Text = Convert.ToString(thisRow["Date"]);
            textBox17.Text = Convert.ToString(thisRow["Time"]);
            textBox18.Text = Convert.ToString(thisRow["Refrences"]);
            con.Close();

        }

        private void l_add_order2cs_Load(object sender, EventArgs e)  //on load
        {
            displayRecord();
            displayRecord1();
            displayRecord2();
            button4.Enabled = false;
            
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            if (e.RowIndex >= 0)
            {
                DataGridViewRow row = this.dataGridView1.Rows[e.RowIndex];

                textBox4.Text = row.Cells["Dish_Name"].Value.ToString();
                textBox6.Text = row.Cells["Category"].Value.ToString();
                textBox7.Text = row.Cells["Quantity"].Value.ToString();
                textBox8.Text = row.Cells["Price"].Value.ToString();



            }
        }

        private void button1_Click(object sender, EventArgs e) //search
        {
            try
            {
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from Dish where Dish_Name like'%" + textBox1.Text + "%' ", con);
                da.Fill(dt);
                dataGridView1.DataSource = dt.DefaultView;

            }
            catch
            {
                MessageBox.Show("Search not Found");
            }
        }

        private void button2_Click(object sender, EventArgs e) // add
        {
            con.Open();
            SqlCommand cmd = new SqlCommand("INSERT INTO Order_dish(Dish_Name,Order_No, Category, Quantity , Price) VALUES('" + textBox4.Text + "','" + textBox2.Text + "','" + textBox6.Text + "','" + textBox7.Text + "','" + textBox8.Text + "')", con);
            cmd.ExecuteNonQuery();

            con.Close();
            displayRecord();
            displayRecord1();
            displayRecord2();

            double sum = 0; double tax; double amt;
            for (int l = 0; l < dataGridView2.Rows.Count; ++l)
            {
                sum += Convert.ToInt32(dataGridView2.Rows[l].Cells[5].Value);

                tax = Convert.ToInt32(textBox9.Text);

                amt = sum + ((sum * tax) / 100);

                textBox11.Text = sum.ToString();

                textBox10.Text = amt.ToString();

            }

            updateData();
            button4.Enabled = true;
            
        }
        private void updateData() // sales order table updated
        {
            try
            {

                con.Open();
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Select * from sale_order where Order_No='" + textBox2.Text + "'", con);
                da.Fill(dt);
                dt.Rows[0].BeginEdit();
                dt.Rows[0][5] = textBox9.Text;
                dt.Rows[0][6] = textBox11.Text;
                dt.Rows[0][7] = textBox10.Text;


                // stop editing
                dt.Rows[0].EndEdit();

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

        private void button3_Click(object sender, EventArgs e) //delete
        {
             try
            {
                con.Open();
                DataTable dt = new DataTable();
                SqlDataAdapter da = new SqlDataAdapter("Delete from Order_dish where id=" + textBox5.Text + "", con);
                da.Fill(dt);



                // declare the command builder that allow saving records
                SqlCommandBuilder cb = new SqlCommandBuilder(da);

                //update the database
                da.Update(dt);

                // close connection
                con.Close();
                
                // call the mtd to display records
                displayRecord();
                displayRecord1();
                displayRecord2();

                double sum = 0; double tax; double amt;
                for (int l = 0; l < dataGridView2.Rows.Count; ++l)
                {
                    sum += Convert.ToInt32(dataGridView2.Rows[l].Cells[5].Value);

                    tax = Convert.ToInt32(textBox9.Text);

                    amt = sum + ((sum * tax) / 100);

                    textBox11.Text = sum.ToString();

                    textBox10.Text = amt.ToString();

                }

                updateData();

            }
             catch (Exception error)
             {
                 MessageBox.Show(error.ToString());

             }
        }

        private void button5_Click(object sender, EventArgs e) //view
        {
            displayRecord();
            displayRecord1();
            displayRecord2();
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

                graphic.DrawString("\nReceipt \n" + textBox18.Text + "\nDate: " + textBox16.Text + " Time- " + textBox17.Text, new Font("Courier New", 10), new SolidBrush(Color.Black), startX, 110);

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

        private void button4_Click(object sender, EventArgs e) //print
        {
            PrintReceipt();
        }

        private void button6_Click(object sender, EventArgs e) // Main Menu
        {
            l_main_mainu mm = new l_main_mainu();
            this.Hide();
            mm.Show();
        }

        private void dataGridView2_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            if (e.RowIndex >= 0)
            {
                DataGridViewRow row = this.dataGridView2.Rows[e.RowIndex];


                textBox5.Text = row.Cells["id"].Value.ToString();

                textBox12.Text = row.Cells["Dish_Name"].Value.ToString();
                textBox13.Text = row.Cells["Category"].Value.ToString();
                textBox14.Text = row.Cells["Quantity"].Value.ToString();
                textBox15.Text = row.Cells["Price"].Value.ToString();




            }
        }

       

    }
}
