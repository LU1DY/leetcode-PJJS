s = '[([]])'

def validParent(s):
    abertura = ['(', '[', '{']
    busca = ['()', '[]', '{}']
    anterior = []
    validacao = 0
    if len(s) > 1 and s[0] in abertura:
        for i in s:
            if i in abertura:
                anterior.append(i)
            else:
                if len(anterior) > 0:
                    if anterior[-1] + i in busca:
                        ultimo = len(anterior)
                        anterior.pop(ultimo-1)
                        validacao += 1
                    else: return False
                else: return False
    else: return False
    if validacao == (len(s) / 2):
        return True
    else: return False


print(validParent(s))



            

                
                
