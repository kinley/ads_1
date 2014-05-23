/**
 * Словарь строк на основе HashMap и DST-деревьев
 */
public class Dictionary {
    private SymbolTable names; // таблица имя-ключ(положительное целое число)
    private int currentTablePosition; // номер следующего добавляемого в names имени
    DSTNode root; // корень DST

    public Dictionary() {
        this.names = new SymbolTable();
        this.currentTablePosition = 1;
        this.root = null;
    }

    private static class DSTNode {
        int data; // ключ текущего узла
        private DSTNode left;
        private DSTNode right;


        public DSTNode() {
            // Имена людей будут кодироваться только положительными натуральными числами
            // 0 означает, что либо имя "выкинуто" из дерева, либо имени вовсе и не было
            this.data = 0;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * Добавление ключа в DST
     */
    private void insertPositionToDST(int pos) {
        if (root == null) {
            root = new DSTNode();
            root.data = pos;
        }
        else {
            DSTNode buf = root;
            boolean added = false;

            while (!added) {
                if (pos > buf.data) {
                    if (buf.right != null) {
                        buf = buf.right;
                    }
                    else {
                        buf.right = new DSTNode();
                        buf.right.data = pos;
                        added = true;
                    }
                }
                else if (pos < buf.data) {
                    if (buf.left != null) {
                        buf = buf.left;
                    }
                    else {
                        buf.left = new DSTNode();
                        buf.left.data = pos;
                        added = true;
                    }
                }
                else {
                    return; // equal values not allowed
                }
            }
        }
    }

    /**
     * Добавление имени в Dictionary
     * (добавление имени в names, связывание имени с ключом и добавление ключа в DST)
     */
    public void insert(String name) {
        names.insert(name, currentTablePosition);
        insertPositionToDST(currentTablePosition++);
    }

    /**
     * "Удаление" элемента из DST
     */
    public void delete(String name) {
        if (names.getValue(name) != 0) {
            int pos = names.getValue(name);

            if (root != null) {
                DSTNode buf = root;
                while (buf != null) {
                    if (pos > buf.data) {
                        buf = buf.right;
                    }
                    else if (pos < buf.data) {
                        buf = buf.left;
                    }
                    else {
                        // TODO
                        // HACK
                        // Элемент не удаляется из names, не удаляется из DST
                        buf.data = 0;
                        return;
                    }
                }
            }
        }
    }

    /**
     * Содержится ли данное имя в Dictionary
     */
    public boolean isContained(String name) {
        return names.getValue(name) != 0 && isContainedPositionInDST(names.getValue(name));
    }

    /**
     * Содержится ли данный ключ в DST
     */
    private boolean isContainedPositionInDST(int pos) {
        if (root == null) {
            return false;
        } else {
            DSTNode buf = root;

            while (buf != null) {
                if (pos > buf.data) {
                    buf = buf.right;
                } else if (pos < buf.data) {
                    buf = buf.left;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
}
