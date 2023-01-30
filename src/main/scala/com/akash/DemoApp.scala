package com.akash

import scala.annotation.tailrec
import scala.concurrent.Future

object DemoApp extends  App {

	//	Write a Scala program to create a new string where 'if' is added to the front of a given string.
	//	If the string already begins with 'if', return the string unchanged.

	//	val str = "abced"
	//	val str1 = "ifstr"
	//	val res = if(str.charAt(1) == 'i' && str.charAt(1) == 'f') {
	//		str
	//	}
	//	else {
	//		"if" + str
	//	}
	//val res = if(str1.startsWith("if")) {
	//	str1
	//}
	//else {
	//	"if" + str
	//}
	//	println(res)


	// Write a Scala program to remove the character in a given position of a given string.
	// The given position will be in the range 0...string length -1 inclusive

	//	val str = "abcd"
	//	str.take(2) + str.drop(2 + 1)


	//Write a Scala program to compare two strings lexicographically. Go to the editor

	//Note: Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions


	//	val str1 = "This is Exercise 11"
	//	val str2 = "This is Exercise 1"
	//
	//	str1.compareTo(str2) match {
	//		case -1 => println(s"$str1  less than  $str2")
	//		case 1 => println(s"$str1  greater than  $str2")
	//		case 0 => println(s"$str1  equal to  $str2")
	//	}
	//
	//	// Write a Scala program to test if a given string contains the specified sequence of char values.
	//
	//	def charContains(str1: String, str2:String): Boolean = {
	//		val l = str1.length
	//		str1..map { c =>
	//			str2.toList.map { c2 =>
	//				if (c != c2) {
	//					false
	//				}
	//				else {
	//					true
	//				}
	//			}
	//		}
	//		str1.contains(str2)
	//	}
	// Replace a string
	val str2 = "akash"
	//
	//	val res  = str2.replace('a','@')
	//
	//	str2
	//
	//	@tailrec
	//	def replaceString(str: String, oldChar: Char, ch: Char, acc: String): String = {
	//		str match {
	//			case s if s.isEmpty => acc
	//			case s if s.head == oldChar => replaceString(s.tail,oldChar,ch,acc + ch)
	//			case s if s.head != oldChar => replaceString(s.tail,oldChar,ch, acc + s.head)
	//		}
	//	}
	//	println(replaceString(str2,'k','@',""))
	//	println(res)


	//	get sum
	//	val list = List(1,2,3,4,5)

	//	val res = list.sum
	//	def listSum(ls: List[Int], acc: Int): Int = {
	//
	//		ls match {
	//			case Nil => acc
	//			case head:: tail => listSum(tail,head + acc)
	//		}
	//	}
	//	println(listSum(list,0))
	//	println(res)

	//	Remove duplicate Element

	//	val list = List(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
	//
	//	val res: (List[Int], List[Int]) => List[Int] = (ls: List[Int], acc: List[Int]) => ls match {
	//		case Nil => acc
	//		case head :: tail =>
	//			if(acc.contains(head)) res(tail,acc) else res(tail, acc :+ head)
	//	}
	//	println(res(list,List()))


	//Convert List[future[Int] -- Future[Int]
	//	import scala.concurrent.ExecutionContext.Implicits.global
	//
	//	val list: Seq[Future[Int]] = List(Future(1),Future(2))
	//
	//	val res = Future.sequence(list).map(res => res.sum)
	//	println(res.onComplete(println))


	//List contain a element or not 

	//	val list: List[String] = List("a","b","c")
	//
	//	def isListContain[T](ls: List[T],elem:T ,acc: Boolean = true): Boolean = {
	//				ls match {
	//					case Nil => acc
	//					case head :: tail => if (head == elem) true else isListContain(tail, elem, acc = false)
	//				}
	//	}
	//	println(isListContain[String](list,"k"))

	//get first highest element from the list

	val list = List(2, 6, 10, 2, 12)
	//
	//	println(list.max)
	//
	//		def highestElem(ls: List[Int],acc: Int): Int = {
	//					ls match {
	//						case Nil => acc
	//						case h :: tail => if (h > tail.headOption.getOrElse(acc)) highestElem(tail,h) else highestElem(tail,acc)
	//					}
	//		}
	//

	//	def getHighestValue(ls: List[Int], largest: Int,secondLargest: Int) : Int = {
	//		ls.headOption match {
	//			case Some(n) => if(n < largest) getHighestValue(ls.tail,largest,n) else getHighestValue(ls.tail,n,largest)
	//				case None => secondLargest
	//		}
	//	}
	//
	//	println(getHighestValue(list,Integer.MIN_VALUE,Integer.MIN_VALUE))


	//Count word in a string

	//	val str  =  "abcadefg"
	//
	//	@tailrec
	//	def coundCharString(str: String, ch : Char, count: Int): Int = {
	//	if(str.isEmpty) count
	//	else {
	//		val counNew = if(str.head == ch ) count + 1 else count
	//			coundCharString(str.tail, ch, counNew)
	//
	//	}
	//	}
	//	println(coundCharString(str,'a',0))

	//	val str2 = "hello this is a class"
	//
	//	 val res4 = str2.split(" ").map(_.capitalize).toList
	//	val res5 =
	//println(res4)

	//val list1: List[Char] = 	List('a', 'a', 'a', 'a', 'b')
	//	val list2 = List('a', 'b', 'c', 'a', 'd', 'e')
	//	println(list1)

	//	val list = DemoApp.isort(List(1, 4, 2, 5))
	//	println(list)
	//
	//	def isort(xs: List[Int]): List[Int] = {
	//		xs match {
	//			case Nil => Nil
	//			case _ => insert(xs.head, isort(xs.tail))
	//
	//		}
	//	}
	//
	//	def insert(elem: Int, list: List[Int]): List[Int] = {
	//		if (list.isEmpty || elem <= list.head) elem :: list
	//		else list.head :: insert(elem, list.tail)
	//	}

	//	println(sort(list,List()))

	//	val str = "abbbaaccccee"
	//
	//	def countNo(str1: String,ch: Char, acc: Int) : Int = {
	//		str1 match {
	//			case s if s.isEmpty => acc
	//			case s if s.head == ch => countNo(s.tail,ch,acc + 1)
	//			case s if s.head != ch => countNo(s.tail,ch,acc)
	//		}
	//	}
	//	println(countNo(str,'b',0))


	//	Write a Scala program to count the number of occurrences of each element in a given list

	val list2 = List(1, 2, 3, 2, 4, 4, 6)

	//	val res = list2.groupBy(e => e)
	//		.map(c => (c._1,c._2.length))
	//	println(res)


	// Repeat element 3 times
	//	val res  = list2.flatMap(s => List.fill(3)(s))
	//	println(res)

	//	def addEachNtimes


	//	Flatten a list


	//
	//	def flatlist(ls: List[_]): List[Any] ={
	//		ls match {
	//			case Nil => Nil
	//			case h:: t => h :: flatlist(t)
	//			case (h: List[_]) :: t => h :: flatlist(t)
	//		}
	//	}


	//	Write a Scala program to reverse a given list.

	//	def reverseList(ls: List[Int], acc: List[Int]): List[Int] = {
	//		ls match {
	//			case Nil => acc
	//			case h:: t => reverseList(t, h :: acc)
	//		}
	//	}


	//	println(reverseList(list2,List()))


	//get odd element of a list

	//def oddNoList(ls: List[Int],acc: List[Int]): List[Int] = {
	//	ls match {
	//		case Nil => acc
	//		case h:: t => if(h % 2 != 0) oddNoList(t,acc :+ h) else oddNoList(t,acc)
	//	}
	//}
	//
	//	println(oddNoList(list2,List()))


	//print no of triples in string form

	//	val str  = "abbbcccdddee"
	//
	//	val res = if(str.isEmpty) {
	//		0
	//	}
	//	else {
	//		str.groupBy(e => e).count(c => c._2.length == 3)
	//	}
	//
	//	println(res)


	//
	//	input = welcome  and  w3resource
	//	output  = wwe3lrceosmoeurce

	//	val str1  = " "
	//	val str3  = "w3resource"
	//
	//	def addStr(str1: String, str2: String, acc: String): String = {
	//		(str1,str2) match {
	//			case (s1,s2) if s1.isEmpty & s2.nonEmpty => s2
	//			case (s1,s2) if s1.nonEmpty & s2.nonEmpty =>  addStr(s1.tail,s2.tail,acc + s1.head + s2.head)
	//		}
	//	}
	//
	//	println(addStr(str1,str3,""))


	//	Write a Scala program to create a new string repeating every character twice of a given string

	//	The given string is: welcome
	//	The new string is: wweellccoommee
	//val str4 = "welcome"
	//	def createRepetedString(str1: String, acc: String): String = {
	//		str1 match {
	//			case s if s.isEmpty => acc
	//			case s => createRepetedString(s.tail, acc + s.head + s.head)
	//		}
	//	}
	//
	//	println(createRepetedString("s",""))


	//	Write a Scala program to print after removing duplicates from a given string
	//val str4  = "w3resource"
	//	val res: (String, String) => String = (str: String, acc: String) => str match {
	//		case "" => acc
	//		case s => if(acc.contains(s.head)) res(s.tail, acc) else res(s.tail,acc + s.head)
	//	}
	//	println(res(str4,""))


	//	Write a Scala program to find the maximum occurring character in a string.Go to the editor
	//		Sample Output:

	//	The given string is: test string
	//		Maximum occurring character of the said string is
	//	:
	//	t
	//	The given string is: Scala
	//	Maximum occurring character of the said string is: a


	//	val list8 = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
	//	def elemRemov(ls: List[Char],acc: List[Char]): Any = {
	//ls match {
	//	case Nil => acc
	//	case x :: y :: xs if x == y =>  elemRemov(y:: xs,acc)
	//	case x :: xs => elemRemov(xs, acc ::: List(x))
	//}
	//	}
	//	println(elemRemov(list8,List()))


	// check string is palindrome or not

	//	val str = "nitinb"
	//
	//	def isPalindrome(str: String,acc: Boolean): Boolean = {
	//		str match {
	//			case s if s.isEmpty || s.tail.isEmpty => acc
	//			case s => if(s.head == s.last) isPalindrome(s.tail.dropRight(1),acc = true)  else false
	//		}
	//	}
	//	println(isPalindrome(str,true))

	val str3 = "abbbbaccce"

	//	def getHighestChar(str: String, ch: String, acc: Int): Int = {
	//		str match {
	//			case s if s.isEmpty => acc
	//			case s => if()
	//
	//	}

	val str5 = "Hello this is a world"
	val res4 = str5.split(" ")(1)

//		.mkString("Array(", ", ", ")")
	println(res4.capitalize)


	@tailrec
	def getHighestChar(str: String, ch: String): String = {
		str match {
			case s if s.isEmpty => ch
			case s => if (s.head == 't') {
				println("hii")
				ch + s.head.toUpper + s.tail}
			else {
				println("else")
				getHighestChar(s.tail,ch + s.head)
			}
		}
	}

	println(getHighestChar(str5,""))
}
