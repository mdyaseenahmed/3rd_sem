;Design & Develop an Assembly Language Program To Sort a Given set of 'n' 16-bit Numbers in Ascending Order. Adopt Bubble Sort Algorithm To Sort Given Numbers.

.MODEL SMALL

.DATA
A DB 08,02,03,01,04,07
N EQU($-A)

.CODE

MOV AX,@DATA
MOV DS,AX
MOV CL,N
DEC CL

OUTERLOOP:MOV CH,CL
          MOV SI,00

INNERLOOP:MOV AL,A[SI]
          INC SI
          CMP AL,A[SI]
          JB NOXG
          XCHG AL,A[SI]
          MOV A[SI-1],AL

NOXG: DEC CH
      JNZ INNERLOOP
      DEC CL
      JNZ OUTERLOOP
      MOV AH,4CH
      INT 21H

END
      



