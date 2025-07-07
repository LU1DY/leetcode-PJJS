function two_sum(nums, target) {
  const resultado = [];
  let ignore;
  while (resultado.length != 2) {
    for (let i = 0; i < nums.length; i++) {
      if (nums[i] > target || nums[i] === nums[ignore]) {
      } else {
        resultado.push(i);
        if (
          resultado.length === 2 &&
          nums[resultado[0]] + nums[resultado[1]] != target
        ) {
          ignore = resultado.shift();
          console.log(ignore, resultado);
        }
      }
    }
  }
  return resultado;
}

const nums = [3, 2, 4];
target = 6;

const resultado = two_sum(nums, target);
console.log(resultado);
