function calculate() {
    let a = document.getElementById("a").value;
    let b = document.getElementById("b").value;

    a = parseFloat(a);
    b = parseFloat(b);

    if (isNaN(a) || isNaN(b)) {
        alert("Please enter valid numbers.");
        return;
    }

    let sumResult = a + b;

    let factorialResult = factorial(sumResult);

    let reverseResult = reverseNumber(sumResult);

    document.getElementById("result").innerHTML = `
        <strong>Sum:</strong> ${sumResult} <br>
        <strong>Factorial of Sum:</strong> ${factorialResult} <br>
        <strong>Reverse of Sum:</strong> ${reverseResult}
    `;
}

function factorial(n) {
    if (n === 0 || n === 1) return 1;
    let fact = 1;
    for (let i = 2; i <= n; i++) {
        fact *= i;
    }
    return fact;
}

function reverseNumber(n) {
    return n.toString().split('').reverse().join('');
}
