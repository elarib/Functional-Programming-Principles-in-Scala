

/**
	* Created by elarib on 6/9/16.
	*/



trait List[T]{
	def isEmpty : Boolean
	def head : T
	def tail : List[T]


	def nth[T](n: Int, list : List[T]): T= {

		if(n == 0) list.head
		else
			{
				nth[T](n- 1 , list.tail)
			}


	}

}



class Cons[T](val head: T, val tail: List[T]) extends List[T]{

	def isEmpty = false

}

class Nil[T] extends  List[T]{
	def isEmpty = true

	def head: Nothing = throw new NoSuchElementException("Nil.head ")

	def tail: Nothing = throw new NoSuchElementException("Tail.head")

}




object TestApp extends App {

	override def main(args: Array[String]): Unit = {
		val google = List("android", "Android", "galaxy", "Galaxy", "nexus", "Nexus")

		println(google.map(elem => "android is Amazing lkdelkdelk".contains(elem)))
	}
}