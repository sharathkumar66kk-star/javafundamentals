## Input Buffer Problem
When using Scanner, mixing nextInt() and nextLine() can cause issues.

## Why the problem occurs
- nextInt() reads only the number
- The newline character (\n) remains in the input buffer
- nextLine() reads this leftover newline immediately

## Solution
- Call an extra nextLine() after nextInt()
- This consumes the leftover newline before reading actual string input

## Key rule
When mixing numeric input and string input, always handle the buffer properly.
