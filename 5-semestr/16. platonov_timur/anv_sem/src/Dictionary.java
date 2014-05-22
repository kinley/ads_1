/**
 * Словарь строк на основе DST-деревьев
 * Важное замечание: слова должны состоять из различных букв!
 */
public class Dictionary {
    DSTNode root;

    private static class DSTNode {
        char data;
        private DSTNode left;
        private DSTNode right;


        DSTNode() {
            this.data = '\0';
            this.left = null;
            this.right = null;
        }
    }

    public void insert(String string) {
        for (int i = 0; i < string.length(); i++) {
            insertChar(string.charAt(i));
        }
    }

    private void insertChar(char c) {
        if (root == null) {
            root = new DSTNode();
            root.data = c;
        }
        else {
            DSTNode buf = root;
            boolean added = false;

            while (!added) {
                if (c > buf.data) {
                    if (buf.right != null) {
                        buf = buf.right;
                    }
                    else {
                        buf.right = new DSTNode();
                        buf.right.data = c;
                        added = true;
                    }
                }
                else if (c < buf.data) {
                    if (buf.left != null) {
                        buf = buf.left;
                    }
                    else {
                        buf.left = new DSTNode();
                        buf.left.data = c;
                        added = true;
                    }
                }
                else {
                    return; // equal values not allowed
                }
            }
        }
    }

    public void delete(String string) {
        char c = string.charAt(0);
        if (root != null) {
            DSTNode buf = root;

            while (buf != null) {
                if (c > buf.data) {
                    buf = buf.right;
                } else if (c < buf.data) {
                    buf = buf.left;
                } else {
                    buf.data = '\0'; // HACK
                    return;
                }
            }
        }
    }

    public boolean isContained(String string) {
        boolean b = isContainedChar(string.charAt(0));
        for (int i = 1; i < string.length() && b; i++) {
            b = isContainedChar(string.charAt(i));
        }
        return b;
    }

    private boolean isContainedChar(char c) {
        if (root == null) {
            return false;
        } else {
            DSTNode buf = root;

            while (buf != null) {
                if (c > buf.data) {
                    buf = buf.right;
                } else if (c < buf.data) {
                    buf = buf.left;
                } else {
                    return true;
                }
            }
            return false;
        }
    }

    Dictionary() {
        this.root = null;
    }
}
