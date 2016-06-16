package elarib.scala

/**
	* Created by elarib on 6/16/16.
	*/
abstract class Boolean {

	def ifThenElse[T](t: => T , e: => T) : T

	def && (x: => scala.Boolean) : scala.Boolean = ifThenElse(x, false)
	def || (x: => scala.Boolean) : scala.Boolean = ifThenElse(true, x)

	def unary_! : scala.Boolean       = ifThenElse(false, true)

	def == (x: Boolean)   = ifThenElse(x, x.unary_!)
	def != (x: Boolean)   = ifThenElse(x.unary_!, x)


	def < (x: Boolean)    = ifThenElse(false, x)
	
}




object True extends Boolean{

	def ifThenElse[T] (t: => T, e: => T)  = t

}

object False extends Boolean{

	def ifThenElse[T] (t: => T, e: => T)  = e

}