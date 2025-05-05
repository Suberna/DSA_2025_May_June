/*🧠 Simple Logic (with XOR):
XOR is a bitwise operation. It has these properties:

a ^ a = 0 → any number XOR with itself becomes 0

a ^ 0 = a → any number XOR with 0 stays the same

XOR works in any order (it's commutative and associative)

So:

If you XOR all the numbers in the array,

All the pairs will cancel each other out (become 0),

And only the unique number will remain!

💡 Example:
java
Copy
Edit
nums = [2, 3, 2]
Step 1: 0 ^ 2 = 2
Step 2: 2 ^ 3 = 1
Step 3: 1 ^ 2 = 3 → ✅ This is the unique number! */
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;  // XOR each number
        }
        return result;
    }
}

