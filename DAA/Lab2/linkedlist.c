// struct node *
// It converts a void * (generic pointer) into a pointer of type struct node *.
// Converts the void * returned by malloc() to (struct node *)

// malloc
// Takes the number of bytes to allocate as an argument.
// Returns a void * (a generic pointer).
// Dynamically allocates a block of memory during runtime.

// sizeof(struct node *)
// calculates how many bytes are needed.

#include <stdio.h>
#include <stdlib.h>

struct node
{
    int info;
    struct node *link;
};

struct node *first = NULL;

// Function to insert a node at the beginning
void insertAtFirst()
{
    struct node *newNode;

    newNode = (struct node *)malloc(sizeof(struct node));

    printf("Enter data you want to insert at first: ");
    scanf("%d", &newNode->info);

    newNode->link = first;
    first = newNode;
}
void insertAtEnd()
{
    struct node *newNode;
    newNode = (struct node *)malloc(sizeof(struct node));
    struct node *save;
    printf("Enter data you want to insert at end: ");
    scanf("%d", &newNode->info);

    newNode->link = NULL;
    save = first;
    while (save->link != NULL)
    {
        save = save->link;
    }
    save->link = newNode;
}

void deleteFromFirst()
{
    struct node *save;
    save = first;
    if (first == NULL)
    {
        printf("Linked List is Empty\n");
    }
    else
    {
        printf("Deleted Node is:%d", first->info);
        first = first->link;
        free(save);
    }
}
void deleteFromEnd()
{
    if (first == NULL)
    {
        printf("Linked List is Empty\n");
        return;
    }

    struct node *pred = first;
    struct node *save = first->link;

    if (first->link == NULL)
    {
        printf("Deleted Node is:%d\n", first->info);
        free(first);
        first = NULL;
        return;
    }

    while (save->link != NULL)
    {
        pred = save;
        save = save->link;
    }

    printf("Deleted Node is:%d\n", save->info);
    pred->link = NULL;
    free(save);
}

void deleteFromPosition()
{
    struct node *pred;
    struct node *save;

    if (first == NULL)
    {
        printf("List Is Empty\n");
        return;
    }
    int pos, i = 1;
    pred = first;

    printf("Enter on Which position You want to delete Node From List:");
    scanf("%d", &pos);

    if (pos == 1)
    {
        deleteFromFirst();
        printf("Node deleted from position 1\n");
        return;
    }
    if (pos <= 0)
    {
        printf("Invalid position!\n");
        return;
    }
    while (i < pos)
    {
        pred = pred->link;
        i++;
    }
    save = pred->link;
    pred->link = save->link;
    free(save);
}
void countNodes()
{
    int count = 0;

    if (first == NULL)
    {
        printf("List is Empty\n");
    }
    else
    {
        struct node *save;
        save = first;

        while (save != NULL)
        {
            count++;
            save = save->link;
        }
    }
    printf("Total Number of Nodes in List is:%d", count);
}

// Function to display the linked list
void display()
{
    struct node *save = first;
    printf("Linked List: ");
    while (save != 0)
    {
        printf("%d -> ", save->info);
        save = save->link;
    }
    printf("NULL\n");
}
void main()
{
    int choice;
    do
    {
        printf("\nMenu:\n");
        printf("1 For Insert Node at Beginning\n");
        printf("2 For Insert Node at End\n");
        printf("3 For Delete Node From First\n");
        printf("4 For Delete Node From End\n");
        printf("5 For Delete Node From Specified Position\n");
        printf("6 For Total Node of Linked List\n");
        printf("7 For Display\n");
        printf("0 For Exit\n");

        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            insertAtFirst();
            break;
        case 2:
            insertAtEnd();
            break;
        case 3:
            deleteFromFirst();
            break;
        case 4:
            deleteFromEnd();
            break;
        case 5:
            deleteFromPosition();
            break;
        case 6:
            countNodes();
            break;
        case 7:
            display();
            break;
        case 0:
            printf("Exiting\n");
            break;
        default:
            printf("Invalid choice. Try again.\n");
        }
    } while (choice != 0);
}