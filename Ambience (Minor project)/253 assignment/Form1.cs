using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _253_assignment
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Button3_Click(object sender, EventArgs e)
        {
            this.Hide();
            Main main1 = new Main();
            main1.Show();


        }

        private void Button1_Click(object sender, EventArgs e)
        {
            if(TextBox1.Text == "abcd")
            {
                if(TextBox2.Text== "1234")
                {
                    this.Hide();
                    Main main1 = new Main();
                    main1.Show();
                }

                else
                {
                    MessageBox.Show("Invalid Username and Password");
                }
            }
            else
            {
                MessageBox.Show("Invalid Username and Password");
            }
            }

        private void LinkLabel1_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            this.Hide();
            Paswword_recovery pwd = new Paswword_recovery();
            pwd.Show();
        }

        private void Button2_Click(object sender, EventArgs e)
        {
            this.Hide();
            Register reg = new Register();
            reg.Show();
        }
        }
    }

