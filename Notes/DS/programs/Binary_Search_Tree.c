#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

struct B_S_tree 
{
    int data;
    struct B_S_tree *left;
    struct B_S_tree *right;
};

typedef struct B_S_tree *NODE;

NODE get_node()
{
    NODE p;
    p = (NODE)malloc(sizeof(struct B_S_tree));
    if(p!=NULL)
        return p;
    else
        printf("\nNo Memory.!");
}

NODE insert(NODE root,int item)
{
    NODE p;
    p = get_node();
    p->data = item;
    p->left = NULL;
    p->right = NULL;
    if(root == NULL)
    {
        printf("\nInserted Successfully.!");
        return p;
    }
    else if(item < root->data)
        root->left = insert(root->left,item);
    else if(item > root->data)    
        root->right = insert(root->right,item);
    return root;
}

void inorder(NODE root)
{
    if(root == NULL)
    {
        return;
    }
    else
    {
        inorder(root->left);
        printf("%d\t",root->data);
        inorder(root->right);   
    }
}

void preorder(NODE root)
{
    if(root == NULL)
    {
        return;
    }
    else
    {
        printf("%d\t",root->data);
        preorder(root->left);
        preorder(root->right);
    }
}

void postorder(NODE root)
{
    if(root == NULL)
    {
        return ;
    }
    else
    {
        postorder(root->left);
        postorder(root->right);
        printf("%d\t",root->data);
    }
}

int main()
{
    int choice,item;
    NODE root = NULL;
    clrscr();	
    printf("\n-------------------------------------");
    printf("\nImplementation Of Binary Search Tree");
    printf("\n-------------------------------------");
    do
    {
        printf("\nThe Choices Are : ");
        printf("\n1.Create The Binary Search Tree.");
        printf("\n2.Inorder Traversal Of BST.");
        printf("\n3.Preorder Traversal Of BST.");
        printf("\n4.Postorder Traversal Of BST.");
        printf("\n5.Exit\nEnter Your Choice : ");
        scanf("%d",&choice);
        
        switch(choice)
        {
            case 1: printf("\nEnter The Element To Be Inserted :  ");
                    scanf("%d",&item);
                    root = insert(root,item);
                    break;
                    
            case 2: if(root == NULL)	     
                    {
	                    printf("\nTree is Empty.!");
                    }
	                else
	                {
                        printf("\nThe Inorder Traversal Of The Tree is : "); 
                        inorder(root);
	                }
                    break;
                    
            case 3: if(root == NULL)	     
                    {
	                    printf("\nTree is Empty.!");
                    }
                    else
                    {
                        printf("\nThe PreOrder Traversal Of The Tree is : ");
	                    preorder(root);
                    }
                     break;
                    
            case 4: if(root == NULL)	     
	                printf("\nTree is Empty.!");                    
                    else
                    {
                        printf("\nThe PostOrder Traversal Of The Tree is : ");        
	                    postorder(root);
                    }
                    break;
                    
            case 5: exit(0);
                    break;
                    
            default: printf("\nInvalid Choice..!");        
        }
    }while(choice!=5);
    return 0;
}
