import time

s = 'ckilbkd'


def longSubstring(s):
    if len(s) > 1:
        substring = []
        sequencia = []
        for i in range(len(s)):
            if s[i] in sequencia:
                if s[i] in sequencia:
                    substring.append(sequencia)
                    indice = sequencia.index(s[i])
                    indice +=1
                    sequencia = sequencia[indice:]
                    sequencia.append(s[i])
                    print(sequencia)
                
                    
            else:
                sequencia.append(s[i])
        
        substring.append(sequencia)
        maior = 0        
        for i in substring:
            if len(i) > maior:
                maior = len(i)

         
        return maior
    else:
        if len(s) == 1: return 1
        else: return 0

print(longSubstring(s))



