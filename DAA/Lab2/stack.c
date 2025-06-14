#include <stdio.h>
#define MAX 100

int stack[MAX];
int top = -1;

//push
void push(int val) {
    if (top == MAX - 1) {
        printf("Stack Overflow\n");
    } else {
        top++;
        stack[top] = val;
        printf("%d pushed to stack\n", val);
    }
}

//pop
void pop() {
    if (top == -1) {
        printf("Stack Underflow\n");
    } else {
        printf("Popped element: %d\n", stack[top]);
        top--;
    }
}

//display
void display() {
    if (top == -1) {
        printf("Stack is empty\n");
    } else {
        printf("Stack elements:\n");
        for (int i = top; i >= 0; i--) {
            printf("%d ", stack[i]);
        }
    }
}

// peep
void peep(int pos) {
    int index = top - pos + 1;
    if (index < 0 || pos <= 0) {
        printf("Invalid position (Stack Underflow)\n");
    } else {
        printf("Element at position %d from top is: %d\n", pos, stack[index]);
    }
}

// CHANGE Operation
void change(int pos, int val) {
    int index = top - pos + 1;
    if (index < 0 || pos <= 0) {
        printf("Invalid position (Stack Underflow)\n");
    } else {
        stack[index] = val;
        printf("Element at position %d changed to %d\n", pos, val);
    }
}

int main() {
    int choice, val, pos;

    while (1) {
        printf("\n--- Stack Operations Menu ---\n");
        printf("1. PUSH\n2. POP\n3. DISPLAY\n4. PEEP\n5. CHANGE\n6. EXIT\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to PUSH: ");
                scanf("%d", &val);
                push(val);
                break;

            case 2:
                pop();
                break;

            case 3:
                display();
                break;

            case 4:
                printf("Enter position from top to PEEP: ");
                scanf("%d", &pos);
                peep(pos);
                break;

            case 5:
                printf("Enter position from top to CHANGE: ");
                scanf("%d", &pos);
                printf("Enter new value: ");
                scanf("%d", &val);
                change(pos, val);
                break;

            case 6:
                printf("Exiting\n");
                return 0;

            default:
                printf("Invalid choice. Try again.\n");
        }
    }

    return 0;
}
