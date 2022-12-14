package br.unicap.edi.trees;

public class BinaryTree<T extends Comparable<T>> {

    private Node<T> raiz;

    public boolean isEmpty() {
        if (this.raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(T value) {
        if (this.isEmpty() == true) {
            this.raiz = new Node(value);
        } else {
            this.raiz.insertNode(value);
        }
    }

    public void emOrdem() {
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia");
        } else {
            this.percorrerEmOrdem(this.raiz);
        }
    }

    private void percorrerEmOrdem(Node<T> r) {
        if (r != null) {
            percorrerEmOrdem(r.getLeft());
            System.out.println(r.getInfo());
            percorrerEmOrdem(r.getRight());
        }
    }

    public T find (T value) {
        if (this.isEmpty() == true) {
            return null;
        }
        else {
            return raiz.findNode (value);
        }
    }

}
