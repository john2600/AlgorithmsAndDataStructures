import time

def factorial(num):
    if num == 0:
        return 1
    else:
        return num * factorial(num -1)

start = time.perf_counter()
print("%d" % factorial(5))
elapsed = time.perf_counter() - start

print(elapsed, 'ns')
