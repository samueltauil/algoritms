package org.recursive;

import com.sun.corba.se.impl.orb.ParserTable;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: samueltauil
 * Date: 12/20/13
 * Time: 12:30 PM
 */
public class BinaryTreeTest {

    @Test
    public void testCentral() throws Exception {

        BinaryTree bt = new BinaryTree();
        BinaryTree.Node node1 = new BinaryTree.Node(new Integer(1));
        BinaryTree.Node node2 = new BinaryTree.Node(new Integer(2));
        BinaryTree.Node node3 = new BinaryTree.Node(new Integer(3));
        BinaryTree.Node node4 = new BinaryTree.Node(new Integer(4));
        BinaryTree.Node node5 = new BinaryTree.Node(new Integer(5));
        BinaryTree.Node node6 = new BinaryTree.Node(new Integer(6));
        BinaryTree.Node node7 = new BinaryTree.Node(new Integer(7));

        bt.root = node5;
        bt.root.left = node3;
        bt.root.right = node7;

        node3.left = node2;
        node3.right = node4;

        node2.left = node1;

        node7.left = node6;

        bt.central(bt.root);

        System.out.println(bt.root.toString());
    }

}
