import java.io.*;

interface Stackoperation {
    public void push(int i);

    public void pop();
}

class Astack implements Stackoperation {
    int stack[] = new int[5];
    int top = -1;
    int i;

    public void push(int item) {
        if (top >= 4) {
            System.out.println("Overflow");
        } else {
            top = top + 1;
            stack[top] = item;
            System.out.print("Element pushed: " + stack[top]);
        }
    }

    public void pop() {
        if (top < 0)
            System.out.println("Underflow");
        else {
            System.out.print("Element popped: " + stack[top]);
            top = top - 1;
        }
    }

    public void display() {
        if (top < 0)
            System.out.println("No Element in stack");
        else {
            for (i = 0; i <= top; i++)
                System.out.println("Element:" + stack[i]);
        }
    }
}

class Teststack {
    public static void main(String args[]) throws IOException {
        int ch, c;
        int i;
        Astack s = new Astack();
        DataInputStream in = new DataInputStream(System.in);
        do {
            try {
                System.out.println("ARRAY STACK");
                System.out.println("1.Push 2.Pop 3.Display 4.Exit");
                System.out.print("Enter your Choice:");
                ch = Integer.parseInt(in.readLine());
                switch (ch) {
                    case 1:
                        System.out.print("Enter the value to push:");
                        i = Integer.parseInt(in.readLine());
                        s.push(i);
                        break;
                    case 2:
                        s.pop();
                        break;
                    case 3:
                        System.out.println("The elements are: ");
                        s.display();
                        break;
                    default:
                        break;
                }
            } catch (IOException e) {
                System.out.println("IO Error");
            }
            System.out.println("Please enter 0 to quit and 1 to continue ");
            c = Integer.parseInt(in.readLine());
        } while (c == 1);
    }
}