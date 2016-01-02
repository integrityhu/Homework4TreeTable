package hu.infokristaly.homework.treetable.front;

import hu.infokristaly.homework.treetable.back.SubzoneDatasetView;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

@ManagedBean(name = "combinedBean")
@ViewScoped
@SuppressWarnings("serial")
public class CombinedBean implements Serializable {
	
	private TreeNode subzones = new DefaultTreeNode("root", null);

	@PostConstruct
	private void load() {
		DefaultTreeNode subzone1 = new DefaultTreeNode(new SubzoneDatasetView(1, "sub1","Node","SUPER"), subzones);
		DefaultTreeNode subsubzone11 = new DefaultTreeNode(new SubzoneDatasetView(1, "sub1","subNode","SUPER"), subzone1);
		DefaultTreeNode subsubzone12 = new DefaultTreeNode(new SubzoneDatasetView(1, "sub1","subNode","SUPER"), subzone1);
		DefaultTreeNode subzone2 = new DefaultTreeNode(new SubzoneDatasetView(2, "sub2","Node","SUPER"), subzones);
		DefaultTreeNode subsubzone21 = new DefaultTreeNode(new SubzoneDatasetView(2, "sub2","subNode","SUPER"), subzone2);
	}

	public TreeNode getSubzones() {
		return subzones;
	}

	public void setSubzones(TreeNode subzones) {
		this.subzones = subzones;
	}
}
