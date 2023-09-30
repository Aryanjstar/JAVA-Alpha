.data
out: .asciiz"\nc=:"
n1: .float 2.0 3.5 5.0 4.0 6.0
n2: .float 3.5 4.0 5.5 2.0 7.0
n3: .float 0.0
n4: .float 1.0
.text
square:
li.s $f6,0.5
div.s $f4,$f2,$f3
add.s $f5,$f4,$f3
mul.s $f3,$f5,$f6
sub $t1,$t1,1
beqz $t1,end
s.s $f3,0($t0)
jal square
end:
j gomain
end1:
syscall
main:
la $t0,n3
li $t2,0
li $t3,5
li $t7,0
loop:
li $t1,15
l.s $f3,n4($t7)
l.s $f0,n1($t2)
l.s $f1,n2($t2)
mul.s $f0,$f0,$f0
mul.s $f1,$f1,$f1
add.s $f2,$f0,$f1
jal square
gomain:
addi $t0,$t0,4
addi $t2,$t2,4
sub $t3,$t3,1
bnez $t3,loop
li $t3,5
la $t1,n3
print:
li $v0,4
la $a0,out
syscall
l.s $f12, ($t1)
li $v0, 2
syscall
sub $t3, $t3, 1
addi $t1, $t1, 4
bnez $t3, print
mov.s $f12,0
syscall