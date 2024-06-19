

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.io.File;
// --- <<IS-END-IMPORTS>> ---

public final class TestTemplate

{
	// ---( internal utility methods )---

	final static TestTemplate _instance = new TestTemplate();

	static TestTemplate _newInstance() { return new TestTemplate(); }

	static TestTemplate _cast(Object o) { return (TestTemplate)o; }

	// ---( server methods )---




	public static final void getTemplateFile (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getTemplateFile)>> ---
		// @sigtype java 3.5
		// [i] field:0:required filename
		// [o] object:0:required templateFile
		IDataCursor pc = pipeline.getCursor();
		String filename = IDataUtil.getString(pc, "filename");
		File templateFile = new File(filename);
		if (templateFile.exists()) {
		   IDataUtil.put(pc, "templateFile", templateFile);
		}
		// --- <<IS-END>> ---

                
	}

	// --- <<IS-START-SHARED>> ---
	
	// --- <<IS-END-SHARED>> ---
}

