#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

void listTraverse(struct Node *position)
{
    struct Node *head=position;
    if(head==NULL)
        return;
    do
    {
        printf("Element - %d \n",head->data);
        head=head->next;
    }while(head!=position);
    printf("\n\n");
}

void insert_at_end(struct Node *head, int data)
{
    struct Node *position=head;
    struct Node *nnode=(struct Node *) malloc(sizeof(struct Node));
    nnode->data=data;
    position=position->next;
    while(position->next!=head)
        position=position->next;
    nnode->next=head;
    position->next=nnode;
}

struct Node * insert_at_first(struct Node *initial, int data)
{
    struct Node *position=initial;
    struct Node *nnode=(struct Node *) malloc(sizeof(struct Node));
    nnode->data=data;
    position=position->next;
    while(position->next!=initial)
        position=position->next;
    nnode->next=initial;
    position->next=nnode;
    return nnode;
};

void deletion_at_end(struct Node *head)
{
    struct Node *ptail=head;
    struct Node *initial=head;
    ptail=initial->next;
    while(ptail->next!=head)
    {
        initial=initial->next;
        ptail=ptail->next;
    }
    initial->next=head;
    free(ptail);
    return;
}

struct Node * deletion_at_first(struct Node *head)
{
    struct Node *pos_first=head;
    struct Node *discard_first=head;
    struct Node *travel=head;
    travel=head->next;
    pos_first=head->next;
    while(travel->next!=head)
        travel=travel->next;
    travel->next=pos_first;
    free(discard_first);
    return pos_first;

};
main()
{
    struct Node *first;
    struct Node *second;
    struct Node *third;
    struct Node *fourth;
    struct Node *fifth;

    first=(struct Node *)malloc(sizeof(struct Node));
    second=(struct Node *)malloc(sizeof(struct Node));
    third=(struct Node *)malloc(sizeof(struct Node));
    fourth=(struct Node *)malloc(sizeof(struct Node));
    fifth=(struct Node *)malloc(sizeof(struct Node));

    first->data=850;
    first->next=second;

    second->data=950;
    second->next=third;

    third->data=1050;
    third->next=fourth;

    fourth->data=1150;
    fourth->next=fifth;

    fifth->data=1250;
    fifth->next=first;

    listTraverse(first);
    insert_at_end(first,100);
    //insert_at_end(first,101);
    deletion_at_end(first);
    //deletion_at_end(first);
    //deletion_at_end(first);
    first=deletion_at_first(first);
    first=insert_at_first(first,100);
    //first=insert_at_first(first,101);

    listTraverse(first);
}
