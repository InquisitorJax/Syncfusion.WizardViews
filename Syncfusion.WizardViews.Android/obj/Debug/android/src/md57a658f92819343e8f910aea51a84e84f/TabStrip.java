package md57a658f92819343e8f910aea51a84e84f;


public class TabStrip
	extends android.widget.LinearLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Com.Syncfusion.Rotator.TabStrip, Syncfusion.SfRotator.Android", TabStrip.class, __md_methods);
	}


	public TabStrip (android.content.Context p0)
	{
		super (p0);
		if (getClass () == TabStrip.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Rotator.TabStrip, Syncfusion.SfRotator.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public TabStrip (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == TabStrip.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Rotator.TabStrip, Syncfusion.SfRotator.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public TabStrip (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == TabStrip.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Rotator.TabStrip, Syncfusion.SfRotator.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public TabStrip (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == TabStrip.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Rotator.TabStrip, Syncfusion.SfRotator.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
