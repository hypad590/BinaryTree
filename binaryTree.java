class ObjectTree {
    private static int IDnum = 8;
    private char Level;
    private int Number;
    private int[] ID;
    ObjectTree FirstRef;
    ObjectTree SecondRef;

    private void getId() {
        ID = new int[IDnum];
        for (int i = 0; i < IDnum; i++) {
            ID[i] = (int) (Math.random() * 10);
        }
    }

    private void showID() {
        for (int i = 0; i < IDnum; i++) {
            System.out.println("|" + ID[i]);
            ;
        }
        System.out.println("|");
    }

    void Show() {
        System.out.println("Object`s level: \t" + Level);
        System.out.println("Number on level: \t" + Number);
        System.out.println("ID of your object: \t");
        showID();
    }

    ObjectTree(int k, char L, int n) {
        System.out.println("\tYou created a new obj");
        Level = L;
        Number = n;
        getId();
        Show();
        if (k == 1) {
            FirstRef = null;
            SecondRef = null;
        } else {
            FirstRef = new ObjectTree(k - 1, (char) (L + 1), 2 * n - 1);
            SecondRef = new ObjectTree(k - 1, (char) (L + 1), 2 * n);
        }
    }
}

class binaryTree {
    public static void main(String[] args) {
        ObjectTree tree = new ObjectTree(4, 'A', 1);
        System.out.println("\tChecking objectTree");
        tree.FirstRef.SecondRef.FirstRef.Show();
    }
}
