"hello world"

1+4

println("Hello, scala")

def FizzbBuzz(n: Int): Unit = {
  1 to n foreach { i=>
   println((i % 3, i % 5) match{
    case(0, 0) =>"FizzBuzz"
    case(0, _) => "Fizz"
    case(_, 0) => "Buzz"
    case _ => 1
    })
  }
}
FizzbBuzz(15)
