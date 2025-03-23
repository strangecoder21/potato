let userage=19;
if(userage>18){
    console.log("vote");
}
let dayno=2;
switch(dayno){
    case 0:
        console.log("Sunday");
        break;
    case 2:
        console.log("Sunday");
        break;
    default:
        console.log("sleep");
}
const mixstr="Hello, WORLD";
const result=mixstr.toLocaleLowerCase();
console.log(result);
if(mixstr.toLocaleLowerCase()==result){
    console.log('boom same');
}
const strlength=mixstr.length;
const sen2='Hello ,World';
const res3=sen2.slice(7,90);
console.log(res3);

const fruits="apple,bana,mango";
const limitedfruits=fruits.split(',',1);

const complexfruits="apple,bana;mango";
const mixedfruits=complexfruits.split(/[,;]/);
const word="kingdom";
const lett=word.split("");

const sentences='Hello,world';
const index=sentences.indexOf('hello');//0 present -1 bot present

const originaltext='this is na old text';
const newtext=originaltext.replace('old','new');
                                   (/old/g,'new')

const mytext='I have an aplle';
const rex=mytext.includes('Apple');

const num=42;
const strnum= String(num)
console.log(strnum+strnum);

const num1=25;
const strnum1=num1.toString();
console.log(typeof strnum1);