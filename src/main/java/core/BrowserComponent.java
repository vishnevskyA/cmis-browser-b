package core;

import org.primefaces.event.NodeExpandEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import javax.faces.application.FacesMessage;
import javax.faces.component.FacesComponent;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIComponentBase;
import javax.faces.component.UINamingContainer;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vladimir.ovcharov
 * Date: 7/2/13
 * Time: 3:17 PM
 * To change this template use File | Settings | File Templates.
 */
@FacesComponent("browserComponent")
public class BrowserComponent extends UIComponentBase implements NamingContainer {
    private TreeNode root;
    private List<BrowserItem> browserItemsList;

    public BrowserComponent() {
        browserItemsList = Service.getItems();
        makeTree(browserItemsList);
    }

    @Override
    public String getFamily() {
        return UINamingContainer.COMPONENT_FAMILY;
    }

    public void onNodeExpand(NodeExpandEvent event) {
        System.out.println("Expanded");

    }

    @Override
    public void encodeBegin(FacesContext arg0) throws IOException {
        super.encodeBegin(arg0);
    }

    private void makeTree(List<BrowserItem> list) {
        root = new DefaultTreeNode("Root", null);
        TreeNode node0 = new DefaultTreeNode(list.get(0), root);
        TreeNode node1 = new DefaultTreeNode(list.get(1), root);
        TreeNode node2 = new DefaultTreeNode(list.get(2), root);
        TreeNode node3 = new DefaultTreeNode(list.get(3), node0);
        TreeNode node4 = new DefaultTreeNode(list.get(4), node0);
        TreeNode node5 = new DefaultTreeNode(list.get(5), node1);
        TreeNode node6 = new DefaultTreeNode(list.get(6), node5);
        TreeNode node7 = new DefaultTreeNode(list.get(7), node3);
        TreeNode node8 = new DefaultTreeNode(list.get(8), node7);
        TreeNode node9 = new DefaultTreeNode(list.get(9), node3);
    }

    public TreeNode getRoot() {
        return root;
    }

    public List<BrowserItem> getBrowserItemsList() {
        return browserItemsList;
    }
}