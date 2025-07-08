function isPalindrome(x) {
  const original = x.toString();
  let invertido = original.split("").reverse().join("");
  const verificacao = original === invertido;
  return verificacao;
}

resultado = isPalindrome(-121);
console.log(resultado);
