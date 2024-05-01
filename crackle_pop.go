package main

import "fmt"

// Basic implementation of CracklePop challlenge - prints Crackle if 3 | i, Pop if 5 | i, and CracklePop if 15 | i.
// We assume that only one thing is printed per integer, to avoid clutter.
// If one wants to print multiple messages, change the elifs to ifs.

func cracklePop() {
	for i := 1; i <= 100; i++ {
		if i%15 == 0 {
			fmt.Println("CracklePop")
		} else if i%5 == 0 {
			fmt.Println("Pop")
		} else if i%3 == 0 {
			fmt.Println("Crackle")
		} else {
			fmt.Println(i)
		}
	}
}

func main() {
	cracklePop()
}
