object Main {


 	

  trait Expr

  case class Number(n: Int) extends Expr

  case class Sum(e1: Expr, e2: Expr) extends Expr

  def eval(e: Expr): Int = {
    e match {
      case Number(n)   => n
      case Sum(e1, e2) => (eval(e1) + eval(e2))
    }
  }                                               //> eval: (e: Main.Expr)Int
  
  
  println(eval(Sum(Number(2),Number(2))))         //> 4

}