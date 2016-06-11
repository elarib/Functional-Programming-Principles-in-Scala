/**
	* Created by elarib on 6/9/16.
	*/
abstract class IntSet {

	def incl(x: Int): IntSet
	def contains(x: Int) : Boolean
	
}


class Empty extends IntSet{
	def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)

	def contains(x: Int): Boolean = false
}


class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet{
	def incl(x: Int): IntSet =
		if(x < elem) new NonEmpty(elem, left incl x, right)
	else if(x > elem) new NonEmpty(elem, left, right incl x)
	else  this

	def contains(x: Int): Boolean =
		if(x < elem)
			left contains x
		else if(x > elem) right contains x
		else  true

}


trait Shape{
	def width : Int

	val d = 2
}



  def getTheNthElt(nth: Int, list : List) ={

	  list.take(nth)

  }