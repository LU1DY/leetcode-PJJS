function two_sum(nums, target) {
  const resultado = {};
  for (let i = 0; i < nums.length; i++) {
    const complemento = target - nums[i];
    if (complemento in resultado) {
      return [resultado[complemento], i];
    }
    resultado[nums[i]] = i;
  }
}

const nums = [3, 2, 4];
const target = 6;

const resultado = two_sum(nums, target);
console.log(resultado);

