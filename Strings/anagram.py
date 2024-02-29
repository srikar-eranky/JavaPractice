def is_anagram(s,t):
    return sorted(s) == sorted(t)

def test_cases():
    print(is_anagram("anagram","nagaram"))
    print(is_anagram("cat","car"))
    print(is_anagram("rat","cat"))
    
test_cases()