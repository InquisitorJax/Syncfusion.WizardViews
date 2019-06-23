using Prism.Mvvm;
using System.Diagnostics;

namespace Syncfusion.WizardViews
{
	public class MainViewModel : BindableBase
    {

		private double _selectedIndex;

		public double SelectedIndex
		{
			get { return _selectedIndex; }
			set
			{
				SetProperty(ref _selectedIndex, value);
				Debug.WriteLine($"======> Selected Index Changed {value}");
			}
		}

	}
}
