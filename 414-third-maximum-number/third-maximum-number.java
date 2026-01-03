class Solution {
    public int thirdMax(int[] nums) {

        Integer first = null;
        Integer second = null;
        Integer third = null;

        for(int num : nums) {

            if(( first !=null && num == first )|| ( second !=null && num == second) ||( third!=null && num == third)){
                continue;
            }

            if(first == null || num > first){
                third = second;
                second = first;
                first = num;
            }

            else if (second == null || num > second){
                 third = second;
                 second = num;
            }

            else if (third == null || num > third){
                third = num;
            }
        }
        // if third max doesn't exist
        return third == null ? first : third;
    }
}














/* 

Goal of the Code

👉 Find the 3rd largest DISTINCT number
👉 If it doesn’t exist, return the largest number

🔹 Step 1: Variables

Integer first = null;
Integer second = null;
Integer third = null;

Why Integer and not int?

Integer can store null

null means value not assigned yet

Helps us know whether 1st, 2nd, or 3rd max exists

Meaning:
Variable	Stores
first	largest number
second	second largest
third	third largest



🔹 Step 2: Loop Through Array

for (int num : nums) {


We check each number one by one

num is the current element




🔹 Step 3: Skip Duplicate Numbers ⭐

if ((first != null && num == first) ||
    (second != null && num == second) ||
    (third != null && num == third)) {
    continue;
}

Why needed?

Problem says DISTINCT maximum

If number already counted → ignore it

Why first != null check?

Prevents NullPointerException

Java tries to auto-unbox Integer



🔹 Step 4: Update Largest (first)

if (first == null || num > first) {
    third = second;
    second = first;
    first = num;
}

What happens here?

If:

first is empty OR

num is bigger than current largest

Then:

third  ← second
second ← first
first  ← num


🔁 Everything shifts down




🔹 Step 5: Update Second Largest

else if (second == null || num > second) {
    third = second;
    second = num;
}

When?

num is smaller than first

But larger than second

🔁 Shift:

third ← second
second ← num



🔹 Step 6: Update Third Largest

else if (third == null || num > third) {
    third = num;
}


num is smaller than first & second

But larger than third

So:

third ← num



🔹 Step 7: Final Return

return third == null ? first : third;

Meaning:

If 3rd maximum exists → return it

Else → return the maximum (first)

*/