<<COMMENT
Your task is to use for loops to display only odd natural numbers from  to .

Input Format
There is no input.

Constraints
-

Output Format
1
3
5
.
.
.
.
.
99  
COMMENT

for ((i=1;i<=99;i++))
    do 
        if (((i%2)!=0))
            then 
                echo "$i"
        fi
    done
