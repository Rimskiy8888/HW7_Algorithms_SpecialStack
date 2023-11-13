package SpecialStack;

public class Main {

    public static void main(String[] args) {
        SpecialStack specialStack = new SpecialStack();

        System.out.println("Stack size :" + specialStack.size());
        System.out.println("Is stack empty? :" + specialStack.empty());
        System.out.println(specialStack);
        specialStack.pop();

        specialStack.push(18);
        specialStack.push(19);
        specialStack.push(29);
        specialStack.push(15);
        specialStack.push(16);


        System.out.println("Размер стека :" + specialStack.size());
        System.out.println("Пустой ли стек? -  " + specialStack.empty());
        System.out.println(specialStack);

        System.out.println("Минимальное число : " + specialStack.getMin());

        specialStack.pop();
        specialStack.pop();

        System.out.println("Размер стека :" + specialStack.size());
        System.out.println("Пустой ли стек? -  " + specialStack.empty());
        System.out.println(specialStack);

        System.out.println("Минимальное число : " + specialStack.getMin());

    }
}
