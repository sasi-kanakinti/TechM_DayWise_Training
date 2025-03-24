// let b=document.createElement('button');
// b.textContent = 'Click';
// function c()
// {

// }


let buttonElement = document.createElement('button');
buttonElement.textContent='submit';
document.body.appendChild(buttonElement);


let c=function() {
        document.body.style.background='black';
        buttonElement.textContent='clicked';
}
buttonElement.addEventListener('click', c);


let inputElement = document.createElement('input');
document.body.appendChild(inputElement);


let logbtn = document.createElement('button');
document.body.appendChild(logbtn);
logbtn.textContent='log';

// function logData() {
//     inputElement.addEventListener('inputElement', logData);
// }


let x=function(event)
{
    console.log(event);
}

inputElement.addEventListener('keypress', x);
