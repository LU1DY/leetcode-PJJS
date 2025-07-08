def isPalindrome(x):
    original = str(x)
    invertido = ''.join(reversed(original))
    verificacao = invertido == original
    return verificacao
    

resultado = isPalindrome(101)
print(resultado)
