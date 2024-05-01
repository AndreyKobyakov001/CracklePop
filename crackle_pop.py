def crackle_pop():
    """
    :returns VOID
    Basic implementation of CracklePop challlenge - prints Crackle if 3 | i, Pop if 5 | i, and CracklePop if 15 | i.
    We assume that only one thing is printed per integer, to avoid clutter - if one wants to print multiple messages,
    change the elifs to ifs.
    """
    for i in range(1, 101):
        if i % 15 == 0:
            print("CracklePop")
        elif i % 5 == 0:
            print("Pop")
        elif i % 3 == 0:
            print("Cracke")
        else:
            print(i)
