/************************************************************************************************
C Program To Implement WORST Fit Algorithm in Memory Management.
*********************************************************************************************/

#include<stdio.h>
#include<conio.h>

void worst_fit(int memory[],int m,int process[],int p)
{
    int allocation[p];  //Stores the Block Number [Block-Id] Of The Memory Block Allocated to a Process.
    int i,j;
    for(i = 0;i < p;i++)
    {
        allocation[i] = -1; //Initially No is Assigned To any Process.
    }
    
    for(i = 0;i < p;i++)
    {
        int w = -1;
        for(j = 0;j < m;j++)
        {
            if(memory[j] >= process[i])
            {
                if(w == -1)
                    w = j;
                else if(memory[w] < memory[j])
                    w = j;
            }
        }
        
        //If we could find a Memory Block For The Current Process.
        if(w != -1)
        {
            allocation[i] = w;  //Allocates j Memory Block to Process[i]
            memory[w] -= process[i];    //Reduce Available Memory in this Block.  
        }
    }
    
    printf("\n\tProcess No.\tProcess Size\tBlock No.");
    printf("\t\n-----------------------------------------------------\n");
    for(i = 0;i < p;i++)
    {
        printf("\tP%d \t\t%d \t\t",i+1,process[i]);
        if(allocation[i] != -1)
            printf("%d\n",allocation[i] + 1);
        else
            printf("Not Allocated\n");
    }
}

int main()
{
    int p,m;
    int i,j;
    printf("\tWORST FIT MEMORY MANAGEMENT SCHEME\n");
    printf("-------------------------------------------------------\n");
    printf("Enter The Number Of Processes : ");
    scanf("%d",&p);
    int process[p];
    printf("-----------------------------------------------------\n");
    printf("Enter The Number Of Memory Blocks : ");
    scanf("%d",&m);
    int memory[m];
    printf("-----------------------------------------------------\n");
    for(i = 0;i < p;i++)
    {
        printf("Enter The Size Of Process - %d : ",i+1);
        scanf("%d",&process[i]);
    }
    printf("-----------------------------------------------------\n");
    for(i = 0;i < m;i++)
    {
        printf("Enter The Size Of Memory Block - %d : ",i+1);
        scanf("%d",&memory[i]);
    }
    printf("-----------------------------------------------------");
    worst_fit(memory,m,process,p);
    return 0;
}


/**************************************************************************************************************
----------------------
OUTPUT:
--------------------
WORST FIT MEMORY MANAGEMENT SCHEME                                                                                      
-------------------------------------------------------                                                                         
Enter The Number Of Processes : 4                                                                                               
-----------------------------------------------------                                                                           
Enter The Number Of Memory Blocks : 5                                                                                           
-----------------------------------------------------                                                                           
Enter The Size Of Process - 1 : 212                                                                                             
Enter The Size Of Process - 2 : 417                                                                                             
Enter The Size Of Process - 3 : 112                                                                                             
Enter The Size Of Process - 4 : 426                                                                                             
-----------------------------------------------------                                                                           
Enter The Size Of Memory Block - 1 : 100                                                                                        
Enter The Size Of Memory Block - 2 : 500                                                                                        
Enter The Size Of Memory Block - 3 : 200                                                                                        
Enter The Size Of Memory Block - 4 : 300                                                                                        
Enter The Size Of Memory Block - 5 : 600                                                                                        
-----------------------------------------------------                                                                           
        Process No.     Process Size    Block No.                                                                               
-----------------------------------------------------                                                                           
          P1              	212            	5                                                                                       
          P2              	417            	2                                                                                      
          P3              	112            	5                                                                                       
          P4              	426            	Not Allocated
          
**************************************************************************************************************/
