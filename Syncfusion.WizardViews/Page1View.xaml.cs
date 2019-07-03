using System;
using System.Diagnostics;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace Syncfusion.WizardViews
{
	[XamlCompilation(XamlCompilationOptions.Compile)]
	public partial class Page1View : ContentView
	{
		public Page1View()
		{
			InitializeComponent();
		}

		private void TapGestureRecognizer_Tapped(object sender, EventArgs e)
		{
			Debug.WriteLine("========================> Tapped TWICE!!");
		}
	}
}