s = 'anagram'
t = 'nagaram'

def validAnagram(s, t):
    s = sorted(s)
    t = sorted(t)
    if s == t:
        return True
    else:
        return False
