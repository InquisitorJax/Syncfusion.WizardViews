using Prism.Commands;
using Prism.Mvvm;
using System;
using System.Diagnostics;
using System.Windows.Input;

namespace Syncfusion.WizardViews
{
	public class MainViewModel : BindableBase
	{

		public MainViewModel()
		{
			GoNextCommand = new DelegateCommand(GoNext);
			GoPreviousCommand = new DelegateCommand(GoPrevious);
		}

		private void GoPrevious()
		{
			if (SelectedIndex > 0)
			{
				SelectedIndex--;
			}
		}

		private void GoNext()
		{
			if (SelectedIndex <= 1)
			{
				SelectedIndex++;
			}
		}

		private double _selectedIndex;

		public double SelectedIndex
		{
			get { return _selectedIndex; }
			set { SetProperty(ref _selectedIndex, value); }
		}

		public ICommand GoNextCommand { get; }

		public ICommand GoPreviousCommand { get; set; }

	}
}
