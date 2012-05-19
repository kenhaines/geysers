package net.i2cat.geysers.web.web.client.widgets;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;

public class treeVrId extends Composite {

	public treeVrId() {
		
		FlowPanel flowPanel = new FlowPanel();
		initWidget(flowPanel);
		
		Tree tree = new Tree();
		flowPanel.add(tree);
		
		TreeItem trtmVrid = new TreeItem("VR-ID");
		tree.addItem(trtmVrid);
		
		TreeItem trtmCpu = new TreeItem("CPU");
		trtmVrid.addItem(trtmCpu);
		
		TreeItem trtmStorage = new TreeItem("Storage");
		trtmVrid.addItem(trtmStorage);
		
		TreeItem trtmMemory = new TreeItem("Memory");
		trtmVrid.addItem(trtmMemory);
		
		TreeItem trtmVirtualInterface = new TreeItem("Virtual Interface");
		trtmVrid.addItem(trtmVirtualInterface);
		
		TreeItem trtmConnectedTo = new TreeItem("connected to");
		trtmVirtualInterface.addItem(trtmConnectedTo);
		trtmVirtualInterface.setState(true);
		trtmVrid.setState(true);
	}

}
