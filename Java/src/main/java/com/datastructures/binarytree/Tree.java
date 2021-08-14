package com.datastructures.binarytree;

public class Tree {
    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }

    public void traverseInOrder(){
        if(root!=null){
            root.traverseInOrder();
        }
    }

    public void traversePreOrder(){
        if(root!=null){
            root.traversePreOrder();
        }
    }

    public TreeNode get(int value){
        if(root!=null){
            return root.get(value);
        }
        return null;
    }

    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.min();
        }
    }

    public int max(){
            if(root==null){
                return Integer.MAX_VALUE;
            }else {
                return root.max();
            }
        }

    public void delete(int value){
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subTreeNode, int value){
        if(subTreeNode==null){
            return subTreeNode;
        }
        if(value< subTreeNode.getData()){
            subTreeNode.setLeftChild(delete(subTreeNode.getLeftChild(),value));
        }
        else if (value>subTreeNode.getData()){
            subTreeNode.setRightChild(delete(subTreeNode.getRightChild(), value));
        }
        else {
            if(subTreeNode.getLeftChild()==null){
                return subTreeNode.getRightChild();
            } else if (subTreeNode.getRightChild()==null){
                return subTreeNode.getLeftChild();
            }

            subTreeNode.setData(subTreeNode.getRightChild().min());

            subTreeNode.setRightChild(delete(subTreeNode.getRightChild(), subTreeNode.getData()));
        }


        return subTreeNode;
    }

}
