public class BinariThree {
    public static void main(String[] args) {
        Three three = new Three(21, new Three(7, null, null), new Three(8, null, null));
        System.out.println(" " + three.sum());
    }

    static class Three {
        int value;
        Three left;
        Three right;

        public Three(int value, Three left, Three right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Three(int value) {
            this.value = value;
        }

        public int sum() {
            int sum = value;
            if (left != null) {
                sum += left.sum();
            }
            if (right != null) {
                sum += right.sum();
            }
            return sum;
        }
    }
}


