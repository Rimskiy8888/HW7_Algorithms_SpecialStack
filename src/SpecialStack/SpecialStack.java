package SpecialStack;

public class SpecialStack {

        private int[] specialStack = new int[7];
        private int size = 0;

        private int data = 0;
        public int size() {
            return size;
        }

        public boolean empty() {
            return size == 0;
        }

        public void push(int data) {

            if (size == specialStack.length) {
                System.out.println("Cтек переполнен!");
                return;
            }
            specialStack[size++] = data;
        }

        public int pop() {

            if (size == 0) {
                System.out.println("Стек пуст!");
                return 0;
            }
            int data1 = specialStack[--size];
            specialStack[size] = 0 ;
            return data1;
        }

        public int peek() {
            if (size == 0) {
                System.out.println(("Стек пуст!"));
                return 0;
            }
            return specialStack[size - 1];
        }

//        public int search(int data) {
//            for (int i = 0; i < size; i++) {
//                if (specialStack[i].equals(data)) {
//                    return size - i;
//                }
//            }
//            return -1;
//        }

        public int getMin(){

            for(int i = 1; i <= specialStack.length;i++){
                if(size == 0 ){
                    return 0;
                }
                  data = specialStack[0];
                if (specialStack[i] <= data) {
                    data = specialStack[i];
                    return data;

                }
                return data;
            }
                return data;
            }



        @Override
        public String toString() {
            if (empty()) {
                return "[]";
            }
            StringBuilder builder = new StringBuilder("[");
            for (int i = 0; i < size; i++) {
                builder.append(specialStack[i]).append(", ");
            }
            builder.setLength(builder.length() - 2);
            builder.append("]");
            return builder.toString();
        }
}

