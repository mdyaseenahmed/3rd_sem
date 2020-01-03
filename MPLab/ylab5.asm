;PROGRAM TO READ TWO STRINGS, STORE THEM IN LOCATIONS STR1 & STR2.CHECK WHETHER THEY ARE EQUAL OR NOT & DISPLAY APPROPRIATE MESSAGES. ALSO DISPLAY THE LENGTH OF THE STORED STRINGS.

.MODEL SMALL

DISP MACRO MSG
LEA DX,MSG
MOV AH,09H
INT 21H
ENDM


.DATA

LEN1 DW 0
LEN2 DW 0
SRC DB 10H DUP(0)
DEST DB 10H DUP(0)
MSG1 DB 0DH,0AH,"ENTER FIRST STRING $"
MSG2 DB 0DH,0AH,"ENTER SECOND STRING $"
MSG3 DB 0DH,0AH,"STRINGS ARE EQUAL $"
MSG4 DB 0DH,0AH,"STRINGS ARE NOT EQUAL $"
MSG5 DB 0DH,0AH,"LENGTH OF THE STRINGS IS $"
MSG6 DB 0DH,0AH,"LENGTH OF THE FIRST STRING $"
MSG7 DB 0DH,0AH,"LENGTH OF THE SECOND STRING $"

.CODE

       MOV AX,@DATA
       MOV DS,AX
       MOV ES,AX
       DISP MSG1
       MOV SI,00

BACK1:
        MOV AH,01H
        INT 21H
        CMP AL,0DH
        JE NEXT1
        MOV SRC[SI],AL
        INC SI
        INc LEN1
        JMP BACK1

NEXT1 :
        MOV SRC[SI],'$'
        DISP MSG2
        MOV SI,00

BACK2 :
        MOV AH,01H
        INT 21H
        CMP AL,0DH
        JE NEXT2
        MOV DEST[SI],AL
        INC SI
        INC LEN2
        JMP BACK2

NEXT2 :
        MOV DEST[SI],'$'
        MOV AL,LEN1
        CMP AL,LEN2
        JNE NOTEQUAL
        LEA SI,SRC
        LEA DI,DEST
        MOV CL,LEN1
        CLD

BACK3 :
        CMPSB
        JNE NOTEQUAL
        LOOP BACK3
        DISP MSG3
        DISP MSG5


        MOV AL,LEN1
        AAM
        ADD AX,3030H
        MOV BX,AX
        MOV DL,BH
        MOV AH,02H
        INT 21H


        MOV DL,BL
        MOV AH,02H
        INT 21H
        JMP LAST

NOTEQUAL :
        DISP MSG4
        DISP MSG6


        MOV AL,LEN1
        AAM
        ADD AX,3030H
        MOV BX,AX
        MOV DL,BH
        MOV AH,02H
        INT 21H

        MOV DL,BL
        MOV AH,02H
        INT 21H

        DISP MSG7

        MOV AL,LEN2
        AAM
        ADD AX,3030H
        MOV BX,AX
        MOV DL,BH
        MOV AH,02H
        INT 21H

        MOV DL,BL
        MOV AH,02H
        INT 21H

LAST :
        MOV AH,4CH
        INT 21H

END



