//Bonus: refactor Numbers.java into javascript

let arr1=[10, 100, 1000, 5, 50, 500, 3, 30, 300, 7, 70, 700, 1, 10, 100, 25, 250, 2500];

let odd=(arr)=>{
   return arr.filter(item=>item%2==1);
}
odd(arr1);

let even=(arr)=>{
   return arr.filter(item=>item%2==0);
}
even(arr1);

