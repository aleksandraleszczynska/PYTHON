#program który znajdzie pierwszą w ciągu liczbę parzystą

n = 10
A = [None, 5, 99, 3, 7, 111, 13, 4, 24, 4, 8]

def szukaj_binarnie(A):

    lewy = 1

    prawy = n

    while lewy < prawy:
        
        środek = (lewy + prawy)//2
        
        if A[środek] % 2 != 0:
            
            lewy = środek + 1
            
        else:
            
            prawy = środek

    return A[prawy]