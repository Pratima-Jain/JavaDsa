# Java Notes

## 1. Data Structure

Data Structure is a mechanism to store data in a computer so that it can be used efficiently.

**Store → Manage → Organize → Use it efficiently**

### Types of Data Structure

### i) Linear DS

1. **Array** – elements are stored in contiguous block of memory.
2. **Linked List** – elements are connected through reference.
3. **Stack** – LIFO
4. **Queue** – FIFO

### ii) Non-Linear DS

1. **Tree** – elements are stored in hierarchical order.
2. **Graph** – elements are stored in nodes connected through edges.

---

# 2. Operators

## Arithmetic Operators

* `+`
* `-`
* `*`
* `/`
* `%`

### Examples

```java
Sop(18/5)       // 3.6
Sop(18.0/5)     // 3.6
Sop(double(18)/5)  // 3.6

Sop(8/10)       // 0
Sop(328/10)     // 32

Sop(80%7)       // 3   Remainder
Sop(328%10)     // 8
Sop(7%10)       // 7
```

### Important Points

* To remove a last digit of num divide by `10`.
* To get the last digit of num take mod with `10`.
* To keep num in range of `0 to n`, take mod with `n`.

---

# 3. Assignment Operator

`=` is used as assignment operator.

In case of assignment operator, operation is performed from **right to left**.

### Example

```java
int h = 328;
h = h / 10;

Sop(h);
```

### Swap with 3rd variable

```java
int a = 40, b = 60;

int temp = a;
a = b;
b = temp;
```

### Swap without `+` or `-`

```java
a = a * b;
b = a / b;
a = a / b;
```

### Swap without `+`, `-`, `*`, `/`

```java
a = a ^ b;
b = a ^ b;
a = a ^ b;
```

---

# 4. Ternary / Conditional Operator

```java
a = 320;
b = 320;

int big = a > b ? a : b;

Sop("Big is " + big);
```

---

# 5. Ternary Operator — Find Maximum and Minimum

```java
a = 37;
b = 40;
c = 30;

int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

int min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);

int SecondMax = a + b + c - max - min;

Sop(SecondMax);
```
# Compound Assignment Operator

a) `+=`

b) `-=`

c) `*=`

d) `/=`

e) `%=`

---

# Relational Operator

a) `>`

b) `>=`

c) `<`

d) `<=`

e) `==`

f) `!=`

---

# Logical Operator

### a) Logical AND (`&&`)

→ will not execute second operand if first one is false.

### b) Logical OR (`||`)

→ will not execute second operand if first one is true.

### c) Logical NOT (`!`)

→ `true` → `false`

→ `false` → `true`

---

# Ternary / Conditional Operator

**Syntax:**

```java
op1 : op2 ? op3
```

---

# Assignment

Do questions from sheet.

**Conditionals Statement**

**Question 8**

---

# Loop

## Entry Control Loop

* `while` loop
* `for` loop

## Exit Control Loop

* `do-while`

---

# While Loop

### Syntax:

```java
while(Condition){

    // loop body

}
```

---

# For Loop

### Syntax:

```java
for(initialization; Condition; increment/decrement){

    // loop body

}
```

---

# Do-While Loop

### Syntax:

```java
do{

    // loop body;

    increment/decrement

}while(Condition);
```

---

**Question 2 to 23 → While Loop Programming**



# TIME, SPACE, COMPLEXITY

**TIME, SPACE, COMPLEXITY** is the measurement to identify in what time and in how much space the given problem can be solved.

An algorithm which takes less time and space to solve a problem is considered the better algorithm.

---

## Symbols and Notations

1. **Big O** → worst time / maximum time

2. **Big Theta (θ)** → normal time / average time

3. **Big Omega (Ω)** → best time / minimum time

---

##  Complexity

1. `O(3)` → `O(1)` // fixed term always to complete the loop

2. `O(n)` → `O(n)`

3. `O(n+3)` → `O()`

4. `O(n²)` → `O(n²)`

5. `O(n cube)` → `O()`

6. `O(3n² + 5n + 3)` → `O(n²)`

7. `O(n/3)` or `O(n/2)` → `O(n)`

8. `O(√n)` → `O(√n)`

9. `O(log n)` → `O(log n)`

---

### Scenario 1: SWAP

Swap a and b

```java
temp = a;

a = b;

b = temp;
```

`O(time) = O(3) = O(1)`

`O(space) = O(1)`

---

### Scenario 2: ADD

Add numbers from 1 to 10

```java
sum = 0;

for(i = 1; i <= n; i++){

    sum += i;

}
```

`O(time) = O(n+2) = O(n)`

`O(space) = O(2) = O(1)` // space is constant until array is used

---

### Scenario 3: Algorithm

```java
n = ?;

for(int i = 1; i <= n; i++){

    // statement1

    // statement2

}

//statement3

for(int i = 1; i <= n; i++){

    // statement1

}

// statement1

// statement2
```

`O(time) = O(3n+4) = O(n)`

`O(space) = O(1)`

---

### Scenario 4: Algorithm

```java
n = ?;

for(int i = 1; i <= n; i++){

    for(int i = 1; i <= n; i++){

        // statement1

    }

}
```

`O(time) = O(n²)`

`O(space) = O(1)`

---

### Scenario 5: Algorithm

```java
n = ?;

for(int i = 1; i <= n; i++){

    for(int i = 1; i <= n; i++){

        // statement1

        // statement2

    }

}

for(int i = 1; i <= n; i++){

    // statement1

}
```

`O(time) = O(2n²+n+1) = O(n²)`

`O(space) = O(1)`

---

### Scenario 6: Algorithm

```java
n = ?;

for(int i = 1; i <= n; i++){

    for(int i = 1; i <= n; i++){

        for(int i = 1; i <= n; i++){

            // statement1

        }

    }

}
```

`O(time) = O(2n²+n+1) = O(n²)`

`O(space) = O(1)`

---

### Scenario 7: Algorithm

```java
n = ?;

for (int i = 1; i*i <= n; i++){

    // statement1

}
```

`O(time) = O(√n)`

`O(space) = O(1)`

---

### Scenario 8: Algorithm

```java
n = ?;

for(int i = 1; i <= n; i = i*2){

    // statement1

}
```

`O(time) = O(log base2 n)`

`O(space) = O(1)`

---

### Scenario 9: Algorithm

```java
n = ?;

for(int i = 1; i > 0; i = i/2){

    // statement1

}
```

`O(time) = O(log base2 n)`

`O(space) = O(1)`

---

### Scenario 10: Algorithm

```java
n = ?;

for(int i = 1; i <= n/2; i++){

    // statement1

}
```

**OR**

```java
n = ?;

for(int i = 1; i <= n; i += 2){

    // statement1

}
```

`O(time) = O(n/2)`

`O(space) = O(1)`

---

### Scenario 11: Algorithm

```java
n = ?;

for(int i = 1; i <= n; i++){

    for(int i = 1; i <= n; i = i/2){

        // statement1

    }

}
```

`O(time) = O(nlog base2 n)`

`O(space) = O(1)`

---

### Comparison

`n > √n` **(faster)**

`n > log base 2 n`

`log base 2 n < √n`

`nlog base 2 n < n²`

```text
O(1) < O(log n) < O(√n) < O(n) < O(nlog n) < O(n²) < O(n cube) < O(n!) < O(2 power n) < O()n power n
```

**← very fast till O(n²) ------------------------------------------ very slow →**










































