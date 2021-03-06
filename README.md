﻿# JavaGarments-Fabrics
 BELOW IS THE EXCERCISE ASSIGNED TO ME BY MY JAVA LECTURER:
 
This is an exercise about implementing maintainable classes. You should always assume
the specifications may change and you should make sure your implementation can
implement these changes with the minimum amount of effort.

For this assignment you will learn about inheritance in Java. You will learn how to design
a class hierarchy for Garments and Fabrics. You should start by studying the dependencies
between the different Garment/Fabric classes, by working out which are the more general
Garment/Fabric types, and by determining which Garment/Fabric types are more specific than
other Garment/Fabric types. As part of this exercise you may have to introduce intermediate
Garment/Fabric classes and other classes that aren’t mentioned in the specification. You will
then translate your class hierarchy to a Java inheritance-based hierarchy, with the more general
classes at the top of the hierarchy and the more specific classes at the bottom of the hierarchy.
Please note that you are supposed to implement an inheritance-based hierarchy: you may not
use interfaces or enumerated classes.
Your aim should be to maximise code re-use in the hierarchy, so don’t use copy-and-paste to
“implement” shared behaviour.

In this assignment you will implement a Garment class hierarchy that has the class Garment
sitting at the top of the hierarchy.
Each garment also has a name, which is a proper English name of the garment. There are
three kinds of Garments: trousers, shirts, and coats. Each garment has getName( ) behaviour,
which returns the name of the garment. Garments also have printPurpose( ) behaviour. This
behaviour prints the purpose of the garment. The following are the purposes of the garments.
Trousers Cover the legs; The only trousers at the moment are jeans.
Shirts Cover the body. The only shirt at the moment is a t-shirt.
Coats Provide extra protection against the elements. The only coats at the moment are: winter
coat, rain coat, and jacket.

Garment # of Units Fabric
  Jeans 2.0 cotton
  T-Shirt 1.5 cotton
  Winter coat 2.5 polyester
  Rain coat 2.5 acrylic
  Jacket 2.0 tweed
Table 1: Garments and the number of units of fabric which they’re made of

Natural Fabrics Price per Unit
  Cotton 2.0
  Tweed 3.0
  Synthetic Fabrics Price per Unit
  polyester 5.0
  acrylic 6.0
 Table 2: Fabrics and their (made up) price per unit of fabric
 
Each garment has a price which depends on the fabric which it is made of and the number
of units of fabric which are needed to produce one item of the garment. A garment is made
from a single fabric, which may be natural or synthetic.
Natural fabrics For natural fabrics (tweed, cotton, …) the price of the garment is c × u, where c is
the cost of the fabric per unit and u is the number of units of fabric which are needed to
produce one item of the garment.

Synthetic fabric For synthetic fabrics, such as polyester and acrylic, the price of the garment is
(c + e) × u, where c is the cost of the fabric per unit, e is the 2.0 Euro environment tax per
unit of fabric, and u is the number of units of fabric which are needed to produce one
item of the garment.

Table 1 lists each garment, the fabric which it’s made of, and the number of units of farbic which
are needed to produce one item of garment. Table 2 lists the kind of each fabric (natural or
synthetic) and the unit price of the fabric.

Natural fabrics also have a source, which provides additional information about the origin of
the material. For example the source of tweed and cotton, which are the only natural fabrics,
are wool for tweed and Gossypium for cotton. You get the source of a natural fabric with its
getSource( ) method. Synthetic fabrics don’t have a source.
Each garment can print an itemised bill of its name and price with a method called void
printItemisedBill( ).


EXAMPLE OUTPUT:

jeans cover the legs

Itemised bill for jeans
Made of 2.0 units of cotton made of Gossypium
 environment tax: 2.0 * 0.0 = 0.0
      base price: 2.0 * 2.0 = 4.0
     grand total: 2.0 * 2.0 = 4.0
