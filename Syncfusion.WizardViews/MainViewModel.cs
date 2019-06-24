using Prism.Mvvm;
using System.Diagnostics;

namespace Syncfusion.WizardViews
{
	public class MainViewModel : BindableBase
    {

		public MainViewModel()
		{
			SelectedIndex = 1;
		}

		private double _selectedIndex;

		public double SelectedIndex
		{
			get { return _selectedIndex; }
			set { SetProperty(ref _selectedIndex, value); }
		}

	}
}
