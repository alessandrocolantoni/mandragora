/**
 *    Creation 03/02/2005
 *    Last Modification 04/11/2006
 *    @author  Alessandro Colantoni
 */

/* ====================================================================
 *		      GNU GENERAL PUBLIC LICENSE
 *		         Version 2, June 1991
 *
 *    Copyright (C) 1989, 1991 Free Software Foundation, Inc.
 *                        51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *    Everyone is permitted to copy and distribute verbatim copies
 *  of this license document, but changing it is not allowed.
 *
 *  			    Preamble
 *
 *    The licenses for most software are designed to take away your
 *  freedom to share and change it.  By contrast, the GNU General Public
 *  License is intended to guarantee your freedom to share and change free
 *  software--to make sure the software is free for all its users.  This
 *  General Public License applies to most of the Free Software
 *  Foundation's software and to any other program whose authors commit to
 *  using it.  (Some other Free Software Foundation software is covered by
 *  the GNU Library General Public License instead.)  You can apply it to
 *  your programs, too.
 *
 *    When we speak of free software, we are referring to freedom, not
 *  price.  Our General Public Licenses are designed to make sure that you
 *  have the freedom to distribute copies of free software (and charge for
 *  this service if you wish), that you receive source code or can get it
 *  if you want it, that you can change the software or use pieces of it
 *  in new free programs; and that you know you can do these things.
 *
 *     To protect your rights, we need to make restrictions that forbid
 *  anyone to deny you these rights or to ask you to surrender the rights.
 *  These restrictions translate to certain responsibilities for you if you
 *  distribute copies of the software, or if you modify it.
 *
 *     For example, if you distribute copies of such a program, whether
 *  gratis or for a fee, you must give the recipients all the rights that
 *  you have.  You must make sure that they, too, receive or can get the
 *  source code.  And you must show them these terms so they know their
 *  rights.
 *
 *     We protect your rights with two steps: (1) copyright the software, and
 *  (2) offer you this license which gives you legal permission to copy,
 *  distribute and/or modify the software.
 *
 *     Also, for each author's protection and ours, we want to make certain
 *  that everyone understands that there is no warranty for this free
 *  software.  If the software is modified by someone else and passed on, we
 *  want its recipients to know that what they have is not the original, so
 *  that any problems introduced by others will not reflect on the original
 *  authors' reputations.
 *
 *     Finally, any free program is threatened constantly by software
 *  patents.  We wish to avoid the danger that redistributors of a free
 *  program will individually obtain patent licenses, in effect making the
 *  program proprietary.  To prevent this, we have made it clear that any
 *  patent must be licensed for everyone's free use or not licensed at all.
 *
 *     The precise terms and conditions for copying, distribution and
 *  modification follow.
 *  
 *	                	    GNU GENERAL PUBLIC LICENSE
 *       TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION
 *
 *     0. This License applies to any program or other work which contains
 *  a notice placed by the copyright holder saying it may be distributed
 *  under the terms of this General Public License.  The "Program", below,
 *  refers to any such program or work, and a "work based on the Program"
 *  means either the Program or any derivative work under copyright law:
 *  that is to say, a work containing the Program or a portion of it,
 *  either verbatim or with modifications and/or translated into another
 *  language.  (Hereinafter, translation is included without limitation in
 *  the term "modification".)  Each licensee is addressed as "you".
 *
 *     Activities other than copying, distribution and modification are not
 *  covered by this License; they are outside its scope.  The act of
 *  running the Program is not restricted, and the output from the Program
 *  is covered only if its contents constitute a work based on the
 *  Program (independent of having been made by running the Program).
 *  Whether that is true depends on what the Program does.
 *
 *     1. You may copy and distribute verbatim copies of the Program's
 *  source code as you receive it, in any medium, provided that you
 *  conspicuously and appropriately publish on each copy an appropriate
 *  copyright notice and disclaimer of warranty; keep intact all the
 *  notices that refer to this License and to the absence of any warranty;
 *  and give any other recipients of the Program a copy of this License
 *  along with the Program.
 *
 *  You may charge a fee for the physical act of transferring a copy, and
 *  you may at your option offer warranty protection in exchange for a fee.
 *
 *     2. You may modify your copy or copies of the Program or any portion
 *  of it, thus forming a work based on the Program, and copy and
 *  distribute such modifications or work under the terms of Section 1
 *  above, provided that you also meet all of these conditions:
 *
 *        a) You must cause the modified files to carry prominent notices
 *     stating that you changed the files and the date of any change.
 *
 *        b) You must cause any work that you distribute or publish, that in
 *     whole or in part contains or is derived from the Program or any
 *     part thereof, to be licensed as a whole at no charge to all third
 *     parties under the terms of this License.
 *
 *        c) If the modified program normally reads commands interactively
 *     when run, you must cause it, when started running for such
 *     interactive use in the most ordinary way, to print or display an
 *     announcement including an appropriate copyright notice and a
 *     notice that there is no warranty (or else, saying that you provide
 *     a warranty) and that users may redistribute the program under
 *     these conditions, and telling the user how to view a copy of this
 *     License.  (Exception: if the Program itself is interactive but
 *     does not normally print such an announcement, your work based on
 *     the Program is not required to print an announcement.)
 *     
 *     These requirements apply to the modified work as a whole.  If
 *  identifiable sections of that work are not derived from the Program,
 *  and can be reasonably considered independent and separate works in
 *  themselves, then this License, and its terms, do not apply to those
 *  sections when you distribute them as separate works.  But when you
 *  distribute the same sections as part of a whole which is a work based
 *  on the Program, the distribution of the whole must be on the terms of
 *  this License, whose permissions for other licensees extend to the
 *  entire whole, and thus to each and every part regardless of who wrote it.
 *
 *     Thus, it is not the intent of this section to claim rights or contest
 *  your rights to work written entirely by you; rather, the intent is to
 *  exercise the right to control the distribution of derivative or
 *  collective works based on the Program.
 *
 *     In addition, mere aggregation of another work not based on the Program
 *  with the Program (or with a work based on the Program) on a volume of
 *  a storage or distribution medium does not bring the other work under
 *  the scope of this License.
 *
 *      3. You may copy and distribute the Program (or a work based on it,
 *  under Section 2) in object code or executable form under the terms of
 *  Sections 1 and 2 above provided that you also do one of the following:
 *
 *        a) Accompany it with the complete corresponding machine-readable
 *     source code, which must be distributed under the terms of Sections
 *     1 and 2 above on a medium customarily used for software interchange; or,
 *
 *        b) Accompany it with a written offer, valid for at least three
 *     years, to give any third party, for a charge no more than your
 *     cost of physically performing source distribution, a complete
 *     machine-readable copy of the corresponding source code, to be
 *     distributed under the terms of Sections 1 and 2 above on a medium
 *     customarily used for software interchange; or,
 *
 *        c) Accompany it with the information you received as to the offer
 *     to distribute corresponding source code.  (This alternative is
 *     allowed only for noncommercial distribution and only if you
 *     received the program in object code or executable form with such
 *     an offer, in accord with Subsection b above.)
 *
 *  The source code for a work means the preferred form of the work for
 *  making modifications to it.  For an executable work, complete source
 *  code means all the source code for all modules it contains, plus any
 *  associated interface definition files, plus the scripts used to
 *  control compilation and installation of the executable.  However, as a
 *  special exception, the source code distributed need not include
 *  anything that is normally distributed (in either source or binary
 *  form) with the major components (compiler, kernel, and so on) of the
 *  operating system on which the executable runs, unless that component
 *  itself accompanies the executable.
 *
 *  If distribution of executable or object code is made by offering
 *  access to copy from a designated place, then offering equivalent
 *  access to copy the source code from the same place counts as
 *  distribution of the source code, even though third parties are not
 *  compelled to copy the source along with the object code.
 *  
 *     4. You may not copy, modify, sublicense, or distribute the Program
 *  except as expressly provided under this License.  Any attempt
 *  otherwise to copy, modify, sublicense or distribute the Program is
 *  void, and will automatically terminate your rights under this License.
 *  However, parties who have received copies, or rights, from you under
 *  this License will not have their licenses terminated so long as such
 *  parties remain in full compliance.
 *
 *    5. You are not required to accept this License, since you have not
 *  signed it.  However, nothing else grants you permission to modify or
 *  distribute the Program or its derivative works.  These actions are
 *  prohibited by law if you do not accept this License.  Therefore, by
 *  modifying or distributing the Program (or any work based on the
 *  Program), you indicate your acceptance of this License to do so, and
 *  all its terms and conditions for copying, distributing or modifying
 *  the Program or works based on it.
 *
 *    6. Each time you redistribute the Program (or any work based on the
 *  Program), the recipient automatically receives a license from the
 *  original licensor to copy, distribute or modify the Program subject to
 *  these terms and conditions.  You may not impose any further
 *  restrictions on the recipients' exercise of the rights granted herein.
 *  You are not responsible for enforcing compliance by third parties to
 *  this License.
 *
 *    7. If, as a consequence of a court judgment or allegation of patent
 *  infringement or for any other reason (not limited to patent issues),
 *  conditions are imposed on you (whether by court order, agreement or
 *  otherwise) that contradict the conditions of this License, they do not
 *  excuse you from the conditions of this License.  If you cannot
 *  distribute so as to satisfy simultaneously your obligations under this
 *  License and any other pertinent obligations, then as a consequence you
 *  may not distribute the Program at all.  For example, if a patent
 *  license would not permit royalty-free redistribution of the Program by
 *  all those who receive copies directly or indirectly through you, then
 *  the only way you could satisfy both it and this License would be to
 *  refrain entirely from distribution of the Program.

 *  If any portion of this section is held invalid or unenforceable under
 *  any particular circumstance, the balance of the section is intended to
 *  apply and the section as a whole is intended to apply in other
 *  circumstances.

 *  It is not the purpose of this section to induce you to infringe any
 *  patents or other property right claims or to contest validity of any
 *  such claims; this section has the sole purpose of protecting the
 *  integrity of the free software distribution system, which is
 *  implemented by public license practices.  Many people have made
 *  generous contributions to the wide range of software distributed
 *  through that system in reliance on consistent application of that
 *  system; it is up to the author/donor to decide if he or she is willing
 *  to distribute software through any other system and a licensee cannot
 *  impose that choice.

 *  This section is intended to make thoroughly clear what is believed to
 *  be a consequence of the rest of this License.
 *  
 *    8. If the distribution and/or use of the Program is restricted in
 *  certain countries either by patents or by copyrighted interfaces, the
 *  original copyright holder who places the Program under this License
 *  may add an explicit geographical distribution limitation excluding
 *  those countries, so that distribution is permitted only in or among
 *  countries not thus excluded.  In such case, this License incorporates
 *  the limitation as if written in the body of this License.
 *
 *    9. The Free Software Foundation may publish revised and/or new versions
 *  of the General Public License from time to time.  Such new versions will
 *  be similar in spirit to the present version, but may differ in detail to
 *  address new problems or concerns.
 *
 *  Each version is given a distinguishing version number.  If the Program
 *  specifies a version number of this License which applies to it and "any
 *  later version", you have the option of following the terms and conditions
 *  either of that version or of any later version published by the Free
 *  Software Foundation.  If the Program does not specify a version number of
 *  this License, you may choose any version ever published by the Free Software
 *  Foundation.

 *    10. If you wish to incorporate parts of the Program into other free
 *  programs whose distribution conditions are different, write to the author
 *  to ask for permission.  For software which is copyrighted by the Free
 *  Software Foundation, write to the Free Software Foundation; we sometimes
 *  make exceptions for this.  Our decision will be guided by the two goals
 *  vof preserving the free status of all derivatives of our free software and
 *  of promoting the sharing and reuse of software generally.
 *
 *  			    NO WARRANTY
 *
 *    11. BECAUSE THE PROGRAM IS LICENSED FREE OF CHARGE, THERE IS NO WARRANTY
 *  FOR THE PROGRAM, TO THE EXTENT PERMITTED BY APPLICABLE LAW.  EXCEPT WHEN
 *  OTHERWISE STATED IN WRITING THE COPYRIGHT HOLDERS AND/OR OTHER PARTIES
 *  PROVIDE THE PROGRAM "AS IS" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED
 *  OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 *  MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.  THE ENTIRE RISK AS
 *  TO THE QUALITY AND PERFORMANCE OF THE PROGRAM IS WITH YOU.  SHOULD THE
 *  PROGRAM PROVE DEFECTIVE, YOU ASSUME THE COST OF ALL NECESSARY SERVICING,
 *  REPAIR OR CORRECTION.
 *
 *    12. IN NO EVENT UNLESS REQUIRED BY APPLICABLE LAW OR AGREED TO IN WRITING
 *  WILL ANY COPYRIGHT HOLDER, OR ANY OTHER PARTY WHO MAY MODIFY AND/OR
 *  REDISTRIBUTE THE PROGRAM AS PERMITTED ABOVE, BE LIABLE TO YOU FOR DAMAGES,
 *  INCLUDING ANY GENERAL, SPECIAL, INCIDENTAL OR CONSEQUENTIAL DAMAGES ARISING
 *  OUT OF THE USE OR INABILITY TO USE THE PROGRAM (INCLUDING BUT NOT LIMITED
 *  TO LOSS OF DATA OR DATA BEING RENDERED INACCURATE OR LOSSES SUSTAINED BY
 *  YOU OR THIRD PARTIES OR A FAILURE OF THE PROGRAM TO OPERATE WITH ANY OTHER
 *  PROGRAMS), EVEN IF SUCH HOLDER OR OTHER PARTY HAS BEEN ADVISED OF THE
 *  POSSIBILITY OF SUCH DAMAGES.
 *
 *  		     END OF TERMS AND CONDITIONS
 *  
 *  	    How to Apply These Terms to Your New Programs
 *    If you develop a new program, and you want it to be of the greatest
 *  possible use to the public, the best way to achieve this is to make it
 *  free software which everyone can redistribute and change under these terms.
 *
 *    To do so, attach the following notices to the program.  It is safest
 *  to attach them to the start of each source file to most effectively
 *  convey the exclusion of warranty; and each file should have at least
 *  the "copyright" line and a pointer to where the full notice is found.
 *
 *      <one line to give the program's name and a brief idea of what it does.>
 *      Copyright (C) <year>  <name of author>
 *
 *      This program is free software; you can redistribute it and/or modify
 *      it under the terms of the GNU General Public License as published by
 *      the Free Software Foundation; either version 2 of the License, or
 *      (at your option) any later version.
 *
 *      This program is distributed in the hope that it will be useful,
 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *      GNU General Public License for more details.
 *
 *      You should have received a copy of the GNU General Public License
 *      along with this program; if not, write to the Free Software
 *      Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 *
 *  Also add information on how to contact you by electronic and paper mail.
 *
 *  If the program is interactive, make it output a short notice like this
 *  when it starts in an interactive mode:
 *
 *      Gnomovision version 69, Copyright (C) year name of author
 *      Gnomovision comes with ABSOLUTELY NO WARRANTY; for details type `show w'.
 *      This is free software, and you are welcome to redistribute it
 *      under certain conditions; type `show c' for details.
 *
 *  The hypothetical commands `show w' and `show c' should show the appropriate
 *  parts of the General Public License.  Of course, the commands you use may
 *  be called something other than `show w' and `show c'; they could even be
 *  mouse-clicks or menu items--whatever suits your program.
 *
 *  You should also get your employer (if you work as a programmer) or your
 *  school, if any, to sign a "copyright disclaimer" for the program, if
 *  necessary.  Here is a sample; alter the names:
 *
 *    Yoyodyne, Inc., hereby disclaims all copyright interest in the program
 *    `Gnomovision' (which makes passes at compilers) written by James Hacker.
 *
 *    <signature of Ty Coon>, 1 April 1989
 *    Ty Coon, President of Vice

 *  This General Public License does not permit incorporating your program into
 *  proprietary programs.  If your program is a subroutine library, you may
 *  consider it more useful to permit linking proprietary applications with the
 *  library.  If this is what you want to do, use the GNU Library General
 *  Public License instead of this License.

*/

package it.aco.mandragora.bd;

import it.aco.mandragora.exception.ApplicationException;
import it.aco.mandragora.exception.ServiceFacadeException;
import it.aco.mandragora.query.LogicCondition;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public interface BD{
    /*
    public static final String __PARANAMER_DATA = "v1.0 \n"
            + "<init> \n"
            + "findByPrimaryKey java.lang.Class,java.lang.Object realClass,pkValue\n";
    */

    /**
     * Returns the instance of class realClass whose key fields have the values in pkValues. <br/>
     * For example if I have a class UserRol that have as key the fields usercode and rolcode, invoking: <br/>
     * <code>findByPrimaryKey(UserRol.class ,new String[]{"Antonio","manager"})</code> <br/>
     * returns UserRol object with usercode ="Antonio" and rolcode="manager".
     *
     * @param realClass real class of the object to be returned
     * @param pkValues  array of the values that key fields must have
     * @return the instance of realClass whose key fields values are pkValues
     * @throws ApplicationException for any trouble.
     */
    public Object findByPrimaryKey(Class realClass,Object[] pkValues) throws ApplicationException;

    /**
     * Acts as {@link #findByPrimaryKey(Class realClass,Object[] pkValues)} where key fields are explicitly indicated
     *
     * @param realClass  realClass real class of the object to be returned
     * @param pkFieldNames array containing the names of the fields that act as key. The fields in this array must be a key.
     * @param pkValues  array of array of the values that key fields (in fieldName) must have
     * @return the instance of realClass whose key fields values are pkValues
     * @throws ApplicationException for any trouble.
     */
    public Object findByPrimaryKey(Class realClass,String[] pkFieldNames, Object[] pkValues)throws ApplicationException;

    /**
     * Acts as  {@link #findByPrimaryKey(Class realClass,Object[] pkValues)} where the key is just one field
     *
     * @param realClass realClass  realClass real class of the object to be returned
     * @param pkValue  value of the key of the real class
     * @return the instance of realClass whose key has values pkValue
     * @throws ApplicationException for any trouble.
     */
    public Object findByPrimaryKey(Class realClass, Object pkValue)throws ApplicationException;


    /**
     * This method has the same behavior of {@link #findCollectionByTemplate(Object templateVO)}, but it just retrieve the first object matching templateVO
     *
     * @param templateVO Object whose fields not null have to match in the returned object
     * @return the first object according to  templateVO
     * @throws ApplicationException for any trouble.
     */
    public Object findObjectByTemplate(Object templateVO) throws ApplicationException;




    /**
     * Returns a collection of objects of the same class as <code>templateVO</code>, whose fields, that are not null in <code>templateVO</code>,
     * have the same value of <code>templateVO</code><br/>
     * For example if we have a class <code>Car</code> with many fields, two of which are color and engine, if we do :<br/>
     * car = new Car();<br/>
     * car.setColor("red");<br/>
     * car.setEngine("mercedes");<br/>
     * findCollectionByTemplate(car);
     * Will be returned all cars whose color is red an whose engine is mercedes.
     *
     * @param templateVO Object whose fields not null have to match in the returned objects
     * @return a collection of objects according to  templateVO
     * @throws ApplicationException for any trouble.
     */
    public Collection findCollectionByTemplate(Object templateVO) throws ApplicationException;

    /**
     * This methods acts as {@link #findCollectionByTemplate(Object templateVO)} with the only difference that the  result collection is ordered by <code>orderingField</code>.</br>
     * If the input parameter <code>asc</code> is null or true  the order will be ascending, otherwise descending.
     *
     * @param templateVO object whose fields not null have to match in the returned objects
     * @param orderingField  Field against which will be performed the ordered
     * @param asc Specifies if the ordering should be ascending or descending (if the parameter is null the order will be ascending)
     * @return  a collection of objects according to <code>templateVO</code> not null field values,  ordered by <code>orderingField</code>
     * @throws ApplicationException for any trouble.
     */
    public Collection findCollectionByTemplate(Object templateVO, String orderingField, Boolean asc)  throws ApplicationException;



    /**
     * @deprecated use {@link #findCollectionByTemplate(Object templateVO, String orderingField, Boolean asc)}
     */
    public Collection findOrderedCollectionByTemplate(Object templateVO, String orderingField, boolean asc) throws ApplicationException;


    /**
     * Looks for all instances of <code>realClass</code> whose fields in the array <code>nullFields</code> are null.
     * Strings could be a path to the fields of other directly or indirectly related classes too.
     * </br>
     * @param realClass Class which instances have to looked for
     * @param nullFields Array of field names that have to be null in the search
     * @return  The collection of all instances of <code>realClass</code> realClass whose fields in the array <code>nullFields</code> are null
     * @throws ApplicationException for any trouble.
     */
    public Collection findCollectionByNullFields(Class realClass, String[] nullFields) throws ApplicationException;

    
    
    /*inicio added por alessandro el 17-03-2013*/ 
    public Object findObjectByLogicCondition(java.lang.Class realClass, LogicCondition logicCondition) throws ApplicationException;
	
	public Object findObjectByLogicCondition(String[]selectFields, java.lang.Class realClass, LogicCondition logicCondition) throws ApplicationException;
	
	public Object findObjectByLogicCondition(String[]selectFields, java.lang.Class realClass, LogicCondition logicCondition, String orderBy) throws ApplicationException;
	public Object findObjectByLogicCondition(java.lang.Class realClass, LogicCondition logicCondition, String orderBy) throws ApplicationException;
    
    
	/*fin added por alessandro el 17-03-2013*/ 
    
    
    
    
    /**
     * Looks for all instances of <code>realClass</code> that satisfy the <code>logicCondition</code></br>
     * For example <code>findCollectionByLogicCondition(Employee.class,new LogicSqlCondition("age","<=",new Integer(35),"AND", new LogicSqlCondition("salary",">=", new Integer(40000))))</code></br>
     * returns all instance of  Employee where  age<=35 and salary >= 40000 </br>
     * </br>
     * @param realClass  Class which instances have to looked for
     * @param logicCondition condition that must be satisfied
     * @return  The collection of all instances of class realClass that satisfy the <code>logicCondition</code>
     * @throws ApplicationException -If <code>realClass</code> or <code>logicCondition</code> are null. </br>
     */
    public Collection findCollectionByLogicCondition(Class realClass,LogicCondition logicCondition) throws ApplicationException;

    /**
     * This method Looks for all instances of <code>realClass</code> that satisfy the <code>logicCondition</code>, but returns the
     * collection ordered by the attribute <code>orderingField</code> , in the ascending or descending way depending of if the parameter <code>asc</code> is true or false, and
     * in the collection returned there will be just the elements between <code>startAtIndex</code>  and <code>endAtIndex</code> (included).</br>
     * If <code>orderingField</code> is null, or empty or blank string, no order is applied. </br>
     * If <code>asc</code> is null it will be considered as true. </br>
     * If <code>startAtIndex</code> is null it will be ignored. </br>
     * If <code>endAtIndex</code> is null it will be ignored. </br>
     * </br>
     *
     * @param realClass Class which instances have to looked for
     * @param logicCondition  condition that must be satisfied
     * @param orderingField attribute by which the ordering has to be applied. If null no ordering is applied.</br>
     * @param asc if true or null ascending order is applied. If not null and false descending is applied
     * @param startAtIndex Start index of the mathing instances that have to be returned in the collection
     * @param endAtIndex  end index of the mathing instances that have to be returned in the collection
     * @return The collection of all instances of class realClass that satisfy the <code>logicCondition</code>, from the element  <code>startAtIndex</code> to the elements at <code>endAtIndex</code>
     * @throws ApplicationException  -If <code>realClass</code> or <code>logicCondition</code> are null. </br>
     */
    public Collection findCollectionByLogicCondition(Class realClass,LogicCondition logicCondition,String orderingField, Boolean asc, Integer startAtIndex, Integer endAtIndex) throws ApplicationException;


    /**
     * @deprecated use {@link #findCollectionByLogicCondition(Class realClass,LogicCondition logicCondition,String orderingField, Boolean asc,Integer startAtIndex, Integer endAtIndex)}
     */
    public Collection findLimitedOrderedCollectionByLogicCondition(Class realClass,LogicCondition logicCondition,String orderingField, boolean asc,int startAtIndex, int endAtIndex) throws ApplicationException;



    /**
     * This method returns all instance of <code>realClass</code>, which field <code>pAttributeName</code> assumes one of the values contained in <code>valuesCollection</code>.</br>
     * If <code>valuesCollection</code> is null or empty, a null is returned .
     * @param realClass  Class which instances have to looked for
     * @param pAttributeName field that has to be compared with <code>valuesCollection</code>
     * @param valuesCollection values to be compared with <code>pAttributeName</code>
     * @return  all instance of  <code>realClass</code>, which field <code>pAttributeName</code> have one of the values contained in <code>valuesCollection</code>
     * @throws ApplicationException for any trouble.
     */
    public Collection findCollectionByOrValues(Class realClass,String pAttributeName,Collection valuesCollection) throws ApplicationException;


    /**
     * Looks for all instaces of <code>realClass</code> which has each field in <code>pAttributeNames</code> not equals to the correspondent value in <code>valuesArray</code>.</br>
     * In other words must be verified the condition: (<code>pAttributeNames[i]!=valuesArray[i]</code>).</br>
     * If arrays are empty all instances will be  returned.
     *
     * @param realClass Class which instances have to looked for
     * @param pAttributeNames fields to be compared
     * @param valuesArray values to be compared
     * @return  all instances of realClass where <code>properties[i]!=values[i]</code> for all i.
     * @throws ApplicationException for any trouble.
     */
    public Collection findCollectionByFieldsNotEqualsToValues(Class realClass,String[] pAttributeNames,Object[] valuesArray) throws ApplicationException;

    /**
     * Returns a collection of instances of <code>realClass</code> which satisfy <code>pAttributeNames[i] operators[i] valuesArray[i]</code> for each i</br>
     * Example: <code>color = "red" and price "<=" 10000</code></br>
     * NOTE!! Operators supported must be <code>==,=,<=,>=,<,>,!=,<></code>.</br>
     * If arrays are empty all instances are returned.
     *
     * @param realClass Class which instances have to looked for
     * @param pAttributeNames fields to be compared
     * @param operators operators to use to compare
     * @param valuesArray  values to be compared
     * @return a collection of instances of realClass which satisfy <code>pAttributeNames[i] operators[i] valuesArray[i]</code> for each i
     * @throws ApplicationException  for any trouble.
     */
    public Collection findCollectionByAndFieldsOperatorValues(Class realClass,String[] pAttributeNames, String[] operators,Object[] valuesArray) throws ApplicationException;

    /**
     *  Returns a collection of instances of <code>realClass</code>  which satisfy  AND OR conditions.</br>
     *  The condition is the AND of  <code>pAttributeNames[i] operators[i] valuesMatrix[j][i]</code> for each i,  in OR for each j.</br>
     * <p>
     *  Example: suppose <code>valuesMatrix</code> is a 2X2 matrix where valuesMatrix[0][0]=0,valuesMatrix[0][1]=1,valuesMatrix[1][0]=10,valuesMatrix[1][1]=11</br>
     *           suppose pAttributeNames={"property0", "property1"}  and   suppose operators={"<",">"}</br>
     *           the consition is (property0<0 and property1 >1)or (property0<10 and property1>11)</br>
     *  Operators supported must be <code>==,=,<=,>=,<,>,!=,<></code></br>
     *  Note!! Arrays must be not Null!!
     *
     * @param realClass   Class which instances have to looked for
     * @param pAttributeNames fields to be compared
     * @param operators operators to use to compare
     * @param valuesMatrix matrix of values to be compared
     * @return a collection of instances of <code>realClass</code> which satisfy and AND OR conditions.
     * @throws ApplicationException for any trouble.
     */
    public Collection findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Class realClass,String[] pAttributeNames, String[] operators,Object[][] valuesMatrix)  throws ApplicationException;



    /**
     * Looks for all instances of <code>realClass</code> which value of field <code>pAttributeName</code> is equal to one contained in <code>valuesCollection</code>.
     *
     * @param realClass Class which instances have to looked for
     * @param pAttributeName field whose value has to be in <code>values</code>
     * @param valuesCollection  collection in which the value of <code>pAttributeName</code> has to be searched
     * @return  all instances of <code>realClass</code> which <code>valuesCollection</code> of field pAttributeName is equal to one contained in <code>values</code>.
     * @throws ApplicationException for any trouble.
     */
    public Collection findCollectionByFieldInCollection(Class realClass,String pAttributeName, Collection valuesCollection)  throws ApplicationException;

    /**
     * Looks for all instances of <code>realClass</code> that holds <code>value</code> in one of fields in <code>pAttributeNames</code></br>
     * Matching instances must satisfy:</br>
     * <code>instance.pAttributeNames[i] Like %value%</code> for at least one i.</br>
     *
     * @param realClass Class which instances have to be looked for
     * @param pAttributeNames fields in which <code>value</code> has to be searched
     * @param value value to search in <code>pAttributeNames</code>
     * @return all instances of <code>realClass</code>  that satisfy <code>instance.pAttributeNames[i] Like %value%</code> for at list one i.
     * @throws ApplicationException -  If <code>realClass</code>  or <code>pAttributeNames</code> are null.</br>
     */
    public Collection searchValueInFields(Class realClass,String[] pAttributeNames,Object value)  throws ApplicationException;

    /**
     * This method returns a collection of instances of the class of the items of the collection <code>pInstance.pAttributeName</code>
     * that are stored in the media store and related to the same <code>pInstance</code>, but that are not present in the collection <code>pInstance.pAttributeName</code></br>
     * </br>
     * @param pInstance value object which items related to in the media store have to be returned in the collection.
     * @param pAttributeName  name of the attribute holding the collection which item class intances, related to  <code>pInstance</code>,  have to be returned, if not present in the same collection.
     * @return the collection of instances of the item class of <code>pInstance.pAttributeName</code> related to <code>pInstance</code> in the media store, but not present in the collection <code>pInstance.pAttributeName</code>.
     * @throws ApplicationException if  <code>pInstance</code> is null or <code>pAttributeName</code> is null or empty or blank characters string.
     */
    public Collection getCollectionOfStoredItemsNotInBean(Object pInstance, String pAttributeName) throws ApplicationException;

    /**
     * This method returns a collection of instances of the class of the items of the collection <code>pInstance.pAttributeName</code>
     * that are stored in the media store and related to the same <code>pInstance</code>.</br>
     * </br>
     * @param pInstance value object which items related to in the media store have to be returned in the collection.
     * @param pAttributeName name of the attribute holding the collection which item class intances, related to  <code>pInstance</code>,  have to be returned
     * @return the collection of instances of the item class of <code>pInstance.pAttributeName</code> related to <code>pInstance</code> in the media store.
     * @throws ApplicationException - if  <code>pInstance</code> is null or <code>pAttributeName</code> is null or empty or blank characters string.
     */
    public Collection getStoredCollection(Object pInstance, String pAttributeName) throws ApplicationException;

    /**
     *  Report queries are used to retrieve row data, not 'real' business objects.</br>
     *  A row is an array of Object. With these queries you can define what attributes of an object (instance of the class <code>realClass</code>) you want to have in the row.</br>
     *  The attribute names may also contain path expressions like 'owner.address.street'.</br>
     *  </br>
     * @param realClass class wich attribute you want to retrieve, or where the path expression must start from
     * @param logicCondition logic condition that specify which rows have to be retrieved
     * @param pAttributeNames array of the attribute to retrieve
     * @param groupBy It must be an array that specifies the attributes that are used in the group by clause.</br>
     *        If this parameter is null or is a 0 length array, the group by clause will not be applied.
     * @return  this method returns an Iterator over a Collection of Object[n] of the attributes
     * @throws ApplicationException for any trouble.
     */
    public Iterator getReportQueryIterator(Class realClass,LogicCondition logicCondition, String[] pAttributeNames, String[] groupBy) throws ApplicationException;

    /**
     * Retrieves the specified reference or collection attribute for the given persistent object.
     * </br>
     * @param pInstance The persistence object
     * @param pAttributeName attribute to retrieve
     * @throws ApplicationException - If <code>pInstance</code> or   <code>pAttributeName</code> are null. </br>
     */
    public void retrieveReference(Object pInstance, String pAttributeName) throws ApplicationException;

    

    /**
     * This method has the same behavior of as {@link #retrieveReference(Object, String)} with the difference that the operation is performed on all elements of <code>valueObjectsCollection</code>
     * </br>
     * @param valueObjectsCollection objects for which specified reference will be retrieved
     * @param pAttributeName specified reference to retrieve
     * @throws ApplicationException for any trouble.
     */
    public void retrieveReferenceInCollection(Collection valueObjectsCollection, String pAttributeName) throws ApplicationException;
    /**
     * Retrieves all references and collections of the given object.
     * </br>
     * @param pInstance Object in which te retrieve will be performed
     * @throws ApplicationException for any trouble.
     */
    public void retrieveAllReferences(Object pInstance) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #retrieveAllReferences(Object)} with the difference that the operation is performed on all elements of <code>collection</code>
     * </br>
     * @param valueObjectsCollection objects for which all references will be retrieved
     * @throws ApplicationException - If valueObjectsCollection is null.
     */
    public void retrieveAllReferencesInCollection(Collection valueObjectsCollection) throws ApplicationException;


    /**
     * This method retrieves the specified reference or collection attribute for the given persistent object <code>pInstance</code> .
     * if the same reference or collection attribute are null.</br>.
     * In other words the behavior is the same of {@link #retrieveReference(Object pInstance, String pAttributeName)} if
     * <code>pInstance.pAttributeName</code> is null, otherwise no job is done
     * </br>
     * @param pInstance The persistence object
     * @param pAttributeName attribute to retrieve
     * @throws ApplicationException - If <code>pInstance</code> or <code>pAttributeName</code> are null. </br>
     */
    public void retrieveNullReference(Object pInstance, String pAttributeName) throws ApplicationException;

    /**
     * This method retrieves all the references of the persistence object <code>pInstance</code> that are null.</br>
     * In other words it has the same behavior of  {@link #retrieveNullReference(Object pInstance, String pAttributeName)}, but for all its references.</br>
     * </br>
     * @param pInstance Object,  which all null references of, will be retrieved.
     * @throws ApplicationException  - If <code>pInstance</code> is null. </br>
     */
    public void retrieveAllNullReferences(Object pInstance) throws ApplicationException;




   /**
    * Retrieves references in objects or collections found following the <code>path</code> starting from <code>valueobjectOrCollection</code> .</br>
    * Suppose you have an author who wrote many books each of which has a publishing house each of which has a manager.</br>
    * If I do:</br>
    * <code>retrievePathReference(author, "books.publisher.manager");</code></br>
    * all books of the author will be retrieved, and for each book his publisher will be retrieved, and for  the publisher his manager will be retrieved.</br>
    * You can start from a colleccion instead of an object. ex:</br>
    * <code>retrievePathReference(authors, "books.publisher.manager");</code></br>
    * retrieving will be done for each author of the collection authors.</br>
    * If <code>valueobjectOrCollection</code> is null or <code>path</code> is null or empty or blank characters string, nothing is done.</br>
    *
    * @param valueobjectOrCollection Starting object or collection
    * @param path references separated by a dot; example: <code>book.publisher.manager</code>
    * @throws ApplicationException for any trouble.
    */
    public void retrievePathReference(Object valueobjectOrCollection, String path) throws ApplicationException;


    /**
     * This method has the same behavior of {@link #retrievePathReference(Object valueobjectOrCollection, String path)}
     * with the difference, that following the <code>path</code>, if the value referenced by an attribute is null, such reference
     * will be retrieved from the underlying media store, otherwise not.</br>
     * @param valueobjectOrCollection Starting object or collection
     * @param path  dot separated list of attributes: example : <code>book.publisher.manager</code>
     * @throws ApplicationException  for any trouble.
     */
    public void retrieveNullPathReference(Object valueobjectOrCollection, String path) throws ApplicationException;



    /**
     * Deletes the object <code>deleteVO</code> from  the  underlying datastore.</br>
     * The operation is atomic. </br>
     * Connection management and transaction management are fully delegated.</br>
     * User must no care at all!!.</br>
     *
     * @param deleteVO  object to be deleted
     * @throws ApplicationException for any trouble.
     */
    public void delete(Object deleteVO) throws ApplicationException; 


    /**
     * This method deletes the element of the collection <code>deleteVOs</code> rom  the  underlying datastore.</br>
     * The operation is atomic. </br>
     * Connection management and transaction management are fully delegated.</br>
     * User must no care at all!!.</br>
     *
     * @param deleteVOs collection of the elements to be deleted
     * @throws ApplicationException for any trouble.
     */
    public void deleteCollection(Collection deleteVOs) throws ApplicationException;


    /**
     * This method deletes the M2N relationship between the main object <code>left</code> and all the elements of the collection <code>rightCollection</code>
     * relationship represented by the attribute <code>leftFieldName</code> of  <code>left</code>.</br>
     * This method suppose it exists a M2N relationship  in the media store between the objects of the class of <code>left</code> and
     * the objects of the class of the elements of the collection <code>rightCollection</code>.</br>
     * If <code>left</code> or <code>rightCollection</code> are null nothing is done.</br>
     *
     * @param left  object left side of the M2N collection
     * @param leftFieldName attribute of  <code>left</code> representing the M2N relationship between  <code>left</code> and <code>rightCollection</code>
     * @param rightCollection   right side of the relationship
     * @throws ApplicationException  if <code>leftFieldName</code> is null or empty or blank characters string, or any other trouble
     */
    public void deleteMToNRelationshipCollection(Object left, String leftFieldName, Collection rightCollection) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #deleteItemsNotInCollectionsInPath(Object rootVO, String path, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)}
     * where <code>applyDeletePathCascade</code> and <code>ifM2NDeleteOnlyRelationship</code> are true while code>deleteOneToOne</code> is false.</br>
     * @param rootVO main object to delete
     * @param path  string that must be a dot separated list of attributes, that represents the relationships over which the delete cascade has to be applied
     * @throws ApplicationException for any other trouble
     */
    public void deleteItemsNotInCollectionsInPath(Object rootVO, String path) throws ApplicationException;



    /**
     * This method deletes from the underlying media store the items that are not in the collections in the path represented by the input parameter <code>path</code>, and starting from <code>rootVO</code>.</br>
     * Starting from the root, if the first attribute of <code>path</code> is a 1 to 1 relationship, if the value of such attribute is null this method ends, otherwise, it carries on recursively with the first attribute value as <code>rootVO</code> and the remaining path as <code>path</code>.</br>
     * If the first attribute of <code>path</code> is a 1 TO N or a M TO N relationship, this method deletes all the items in the database linked to the item relative to <code>rootVO</code> and that are not present in the collection list of the first attribute value.</br>
     * Depending on the value of the input parameter <code>applyDeletePathCascade</code>, the items will be delete applying a delete cascade on all the remaining path, in such case if the input parameter <code>deleteOneToOne</code> is true the cascade delete will be applied to the 1 TO 1 relationship as well, otherwise the cascade delete will stop at the first 1 TO 1 relationship found.</br>
     * Whatever will be the value of the input parameter <code>applyDeletePathCascade</code>, if the input parameter <code>ifM2NDeleteOnlyRelationship</code> is true, when a M2N relationship is found only the relationship of the M2N relationship table will be deleted, and the corresponding object  won't be touched in the database. Note that such condition, in the <code>applyDeletePathCascade</code> case, will cause the delete cascade to stop when a M2N relationship is found.</br>
     * Note that the parameter <code>deleteOneToOne<code> will cause just the deletion of ONE TO ONE related objects only of the children of nodes that have been decided to be deleted because not held by some collection, and such parameter don't  force the deletion of ONE TO ONE related objects in the database that are null or have changed on the path. So the <code>deleteOneToOne</code> parameter have sense just in the <code>applyDeletePathCascade</code> situation.</br>
     * Finally this method carries on recursively for each one of the children of <code>rootVO</code> held by the first attribute value treated as new <code>rootVO</code>, and with the remaining path as new path.</br>
     * If <code>rootVO</code> is null or <code>path</code> is null or empty or blank character string, nothing is done.</br>
     * </br>
     * @param rootVO Main object to delete
     * @param path string that must be a dot separated list of attributes, that represents the relationships over which the delete cascade has to be applied
     * @param applyDeletePathCascade specifies if an object to delete across the path have to be deleted with cascade on the remaining <code>path</code>, or have to be just a simple delete.
     * @param ifM2NDeleteOnlyRelationship specifies if when an object have to be deleted and has  a M2N relationship with its father on the <code>path</code>, the object have to be deleted or just its relationship with the father
     * @param deleteOneToOne specifies if applying the delete cascade, when found a 1 to 1 relationship, the cascade must still be applied or not.
     * @throws ApplicationException  for any other trouble
     */
    public void deleteItemsNotInCollectionsInPath(Object rootVO, String path, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) throws ApplicationException;


    /**
     * This method has the same behavior of {@link #deleteItemsNotInCollectionsInPath(Object rootVO, String path, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)}
     * where <code>applyDeletePathCascade</code> is true.</br>
     * @param rootVO Main object to delete
     * @param path  string that must be a dot separated list of attributes, that represents the relationships over which the delete cascade has to be applied
     * @param ifM2NDeleteOnlyRelationship specifies if when an object have to be deleted and has  a M2N relationship with its father on the <code>path</code>, the object have to be deleted or just its relationship with the father
     * @param deleteOneToOne  specifies if applying the delete cascade, when found a 1 to 1 relationship, the cascade must still be applied or not.
     * @throws ApplicationException for any other trouble
     */
    public void deleteItemsNotInCollectionsInPath(Object rootVO, String path,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) throws ApplicationException;





    /**
     * This method has the same behavior of {@link #deleteItemsNotInCollectionsInPath(Object rootVO, String path, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)},
     * but is applied to all paths that are in the collection  <code>paths</code>.</br>
     * @param rootVO Main object to delete
     * @param paths  collection of strings that must be a dot separated list of attributes, that represent the relationships over which the delete cascade has to be applied
     * @param applyDeletePathCascade specifies if an object to delete across the <code>paths</code> have to be deleted with cascade on the remaining <code>paths</code>, or have to be just a simple delete.
     * @param ifM2NDeleteOnlyRelationship specifies if when an object have to be deleted and has  a M2N relationship with its father on the <code>path</code>, the object have to be deleted or just its relationship with the father
     * @param deleteOneToOne   specifies if applying the delete cascade, when found a 1 to 1 relationship, the cascade must still be applied or not.
     * @throws ApplicationException  for any other trouble
     */
    public void deleteItemsNotInCollectionsInPaths(Object rootVO, Collection paths,  Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) throws ApplicationException;


    /**
     * This method deletes the main object <code>parentVO</code> and applies a delete cascade on all the elements related trough the relationship along the <code>path</code>.</br>
     * The delete cascade stops at the end of the <code>path</code> or when it finds a 1 to 1 relationship and <code>deleteOneToOne</code> is false, or when it finds a M2N relationship
     * and <code>ifM2NDeleteOnlyRelationship</code> is true.</br>
     * If <code>parentVO</code> is null nothing is done.</br>
     * @param parentVO Main object to delete
     * @param path string that must be a dot separated list of attributes, that represents the relationships over which the delete cascade has to be applied
     * @param ifM2NDeleteOnlyRelationship specifies if when  a M2N relationship  is find  on the <code>path</code>, the object have to be deleted or just its relationship with the father
     * @param deleteOneToOne specifies if , when found a 1 to 1 relationship, the cascade must still be applied or not.
     * @throws ApplicationException for any other trouble
     */
    public void deletePathCascade(Object parentVO,String path,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) throws ApplicationException;


    /**
     * This method has the same behavior of {@link #deletePathCascade(Object parentVO,String path,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)},
     * but is applied to all paths that are in the collection  <code>paths</code>.</br>
     * If <code>parentVO</code> is null nothing is done.</br>
     * @param parentVO Main object to delete
     * @param paths collection of strings that must be a dot separated list of attributes, that represent the relationships over which the delete cascade has to be applied
     * @param ifM2NDeleteOnlyRelationship  specifies if when  a M2N relationship  is find  on the <code>paths</code>, the object have to be deleted or just its relationship with the father
     * @param deleteOneToOne specifies if , when found a 1 to 1 relationship, the cascade must still be applied or not.
     * @throws ApplicationException     for any other trouble
     */
    public void deletePathsCascade(Object parentVO,Collection paths,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) throws ApplicationException;






    /**
     * Inserts the object <code>storeVO</code> in the  underlying datastore.</br>
     * The operation is atomic.</br>
     * Connection management and transaction management are fully delegated.</br>
     * User must no care at all!.</br>
     *
     * @param storeVO  Object to inserted
     * @return The same inserted object
     * @throws ApplicationException for any trouble.
     */
    public Object insert(Object storeVO) throws ApplicationException;


    

    /**
     * Updates the object <code>storeVO</code> in the  underlying datastore.</br>
     * The operation is atomic.</br>
     * Connection management and transaction management are fully delegated.</br>
     * User must no care at all!!.</br>
     *
     * @param storeVO Object to updated
     * @return The same updated object
     * @throws ApplicationException for any trouble.
     */
    public Object update(Object storeVO) throws ApplicationException;


    /**
     *  This method  updates all objects in the collection storeVOs in an atomic transaction, without user have to carry about connection and transaction
     * management. The collection must be of value objects, and for each of them will this method will act as update or insert depending
     * by if the value object already exists or not in the datastore.
     * The value object of the collection must not necessarily be instance of the same class.
     * <br/>
     *
     * @param storeVOs  objects to be updated or inserted
     * @throws ApplicationException  for any trouble.
     */
    public void updateCollection(Collection storeVOs) throws ApplicationException;







    /**
     * Updates the object <code>storeVO</code> and all objects of the collection associated to <code>pAttributeName</code>.</br>
     * <code>pAttributeName</code> has to be the name of a collection properties.</br>
     * It deletes all objects in the datastore not present in the collection specified by <code>pAttributeName</code>.</br>
     * Connection management and transaction management are fully delegated.</br>
     * User must no care at all!!.
     *
     * @param storeVO The object to update
     * @param pAttributeName property of storeVO specifying a collection
     * @return  the same storeVO
     * @throws ApplicationException for any trouble.
     */
    public Object updateCollectionReference(Object storeVO, String pAttributeName) throws ApplicationException;


    /**
     * This method must have the same behavior of {@link #updateCollectionReference(Object storeVO, String pAttributeName)} with the difference that it has done for all references.</br>
     * Connection management and transaction management are fully delegated.</br>
     * User must no care at all!!.
     *
     * @param storeVO Object to update
     * @return  storeVO
     * @throws ApplicationException for any trouble.
     */
    public Object updateCollectionReferences(Object storeVO) throws ApplicationException;



    /**
     * This method has the same behavior of  {@link #storePathsCascade(Object storeVO, Collection paths, Boolean pathsHasToBeSorted, Boolean  storeVOHasToBeStored)}
     * where the collection <code>paths</code> has just one element that is the input parameter  <code>path</code>, and where <code>pathsHasToBeSorted</code> and <code>storeVOHasToBeStored</code>
     * are both true
     * @param storeVO root of <code>path</code>
     * @param path  string  of separated list of attributes.
     * @throws ApplicationException for any trouble
     */
    public void storePathCascade(Object storeVO,String path) throws ApplicationException;

     
    /**
     * This method creates or updates the value objects on a tree.</br>
     * The tree is represented by <code>storeVO</code>, that is the value object root, and <code>paths</code>, that is a collection of strings that are the paths of the tree from the
     * root. </br>
     * Each element of <code>paths</code> is a dot separated list of attributes; for example it could be:</br>
     * <code>attribute_1.attribute_2.attribute_3.attribute_4</code></br>
     * We will deal with <code>storeVO</code> as <code>attribute_0</code>. The nodes of level i of the <code>tree</code> are all labeled <code>attribute_i</code>.</br>
     * The generic <code>attribute_i</code> can represent a value object or a collection. The <code>attribute_i</code> must be a property of <code>attribute_i-1</code> if
     * <code>attribute_i-1</code> is a value object, and must be a property of each element of<code>attribute_i-1</code> if <code>attribute_i-1</code> is a collection.</br>
     * So <code>storeVO</code> must have a property named <code>attribute_1</code> that can be a value object or a collection; the value object or each
     * element of the collection must have a property named <code>attribute_2</code> that can be a value object or a collection too. And so on.</br>.
     * Nodes of level i in the <code>tree</code> will be value objects that are the property named <code>attribute_i</code>
     * or all elements ( that are value objects too) of collections that are the property named <code>attribute_i</code>.</br>
     * When called this method do for each elements of <code>trees</code>:</br>
     * 1- Object <code>storeVO</code> will be updated if <code>storeVO</code>  exists. If not it will be created.</br>
     * 2- For each elements of <code>paths</code>:</br>
     *    2.1- Each node of level i will be created or updated, and above all it will be related to its father: concretely if the elements of the current level belong to a collection
     *         they will be linked to the father, while if are a simple valueobject, its father will be linked to it.</br>
     *
     *
     * @param storeVO  common root of <code>paths</code>
     * @param paths     collection of String. Each element  is a dot separated list of attributes.
     * @param pathsHasToBeSorted  To make the method to work, the collection of String <code>paths</code> must be ordered. If it is already ordered set this parameter to false, and t true otherwise
     * @param storeVOHasToBeStored it establishes if the root <code>storeVO</code> has to be updated too or not
     * @throws ApplicationException for any trouble
     */
    public void storePathsCascade(Object storeVO,Collection paths, Boolean pathsHasToBeSorted, Boolean  storeVOHasToBeStored) throws ApplicationException;





    /**
     * This method has the same behavior of {@link #updateCreateTrees(Object storeVO,Collection trees, Boolean storeVOHasToBeUpdated, Boolean deleteChangedOneToOne, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)},
     * where <code>storeVOHasToBeUpdated</code> is false,<code>deleteChangedOneToOne</code> is false, <code>applyDeletePathCascade</code>is true, <code>ifM2NDeleteOnlyRelationship</code>is true and <code>deleteOneToOne</code> is false.</br>
     * @param storeVO: common root of trees
     * @param trees: collection of String. Each element  is a dot separated list of attributes.
     * @return  the same storeVO
     * @throws ApplicationException  for any trouble.
     */
    public Object updateCreateTrees(Object storeVO,Collection trees)  throws ApplicationException;

    /**
     * @deprecated use {@link #updateCreateTrees(Object storeVO, Collection trees, Boolean storeVOHasToBeUpdated)}
     */
    public Object updateCreateTrees(Object storeVO, Collection trees, boolean storeVOHasToBeUpdated) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #updateCreateTrees(Object storeVO,Collection trees, Boolean storeVOHasToBeUpdated, Boolean deleteChangedOneToOne, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)},
     * where <code>deleteChangedOneToOne</code> is false, <code>applyDeletePathCascade</code>is true, <code>ifM2NDeleteOnlyRelationship</code>is true and <code>deleteOneToOne</code> is false.</br>
     * @param storeVO: common root of trees
     * @param trees: collection of String. Each element  is a dot separated list of attributes.
     * @param storeVOHasToBeUpdated it extabishes if the root <code>storeVO</code> has to be updated too or not
     * @return  the same storeVO
     * @throws ApplicationException for any trouble.
     */
    public Object updateCreateTrees(Object storeVO, Collection trees, Boolean storeVOHasToBeUpdated) throws ApplicationException;

    /**
         * This method creates or updates a collection of trees in the underlying media store.</br>
         * All trees have a common root that is <code>storeVO</code>. The structure could be considered as just one tree, but we manage it as a collection of trees to keep it easy.</br>
         * The collection of trees is represented by the input parameter <code>trees</code> that is a collection of String.</br>
         * Each element of <code>trees</code> is a dot separated list of attributes; for example it could be:</br>
         * <code>attribute_1.attribute_2.attribute_3.attribute_4</code></br>
         * We will deal with <code>storeVO</code> as <code>attribute_0</code>. The nodes of level i of a <code>tree</code> are all labeled <code>attribute_i</code>.</br>
         * The generic <code>attribute_i</code> can represent a value object or a collection. The <code>attribute_i</code> must be a property of <code>attribute_i-1</code> if
         * <code>attribute_i-1</code> is a value object, and must be a property of each element of<code>attribute_i-1</code> if <code>attribute_i-1</code> is a collection.</br>
         * So <code>rootVO</code> must have a property named <code>attribute_1</code> that can be a value object or a collection; the value object or each
         * element of the collection must have a property named <code>attribute_2</code> that can be a value object or a collection too. And so on.</br>.
         * Nodes of level i in the <code>tree</code> will be value objects that are the property named <code>attribute_i</code>
         * or all elements ( that are value objects too) of collections that are the property named <code>attribute_i</code>.</br>
         *
         * When called this method do for each elements of <code>trees</code>:</br>
         * 1- Object <code>storeVO</code> will be updated if <code>storeVO</code>  exists. If not it will be created.</br>
         * 2- For each elements of <code>trees</code>:</br>
         *    2.1- Each node of level i will be created or updated.</br>
         *    </br>
         *    2.2- For each node of level i which <code>attribute_i+1</code> is a collection, it will look in the underlying media store for all objects</br>
         *         represented by <code>attribute_i+1</code> related to the node of level i being processed and not present between its children.</br>
         *         If the collection is 1 to N or it is M to N and the parameter <code>ifM2NDeleteOnlyRelationship</code> is false, the found objects
         *         will be deleted from the media store, while if it is M to N with <code>ifM2NDeleteOnlyRelationship</code> true, only the relationship between such object and its father will
         *         be deleted from the media store.</br>
         *         When an object is deleted, it can be applied a delete cascade until the bottom of the tree being processed or it can be a simple delete, depending on the input parameter <code>applyDeletePathCascade</code>. </br>
         *         In the case of <code>applyDeletePathCascade</code> true, the cascade will stop in the bottom of the tree being processed, or when deleting is found a 1 to 1 relationship and the input parameter <code>deleteOneToOne</code> is false
         *         or is found an M to N relationship and <code>ifM2NDeleteOnlyRelationship</code> , in which case the relationship is deleted, and deletion stopped.</br>
         *         </br>
         *    2.3- For each node of level i which <code>attribute_i+1</code> is a simple value object, if <code>deleteChangedOneToOne</code> is true, this method will check if such value object
         *         is different from the correspondent stored in the media store, and if so the element in the media store will be deleted. If the value object of <code>attribute_i+1</code> is null and the correspondent in the media store is not, they
         *         will be considered distinct. If a deletion is applied, the same rules of the case of the collection is applied, so the parameters <code>applyDeletePathCascade</code>, <code>ifM2NDeleteOnlyRelationship</code> and <code>deleteOneToOne</code>
         *         will be considered.</br>
         * This method gives the possibility to specify if the root <code>storeVO</code> has to be updated too or not, through the input Boolean parameter <code>storeVOHasToBeUpdated</code>.</br>
         * If storeVO is null, nothing is done.</br>
         * </br>
         * @param storeVO common root of trees
         * @param trees  collection of String. Each element  is a dot separated list of attributes.
         * @param storeVOHasToBeUpdated it specifies if the root <code>storeVO</code> has to be updated too or not.
         * @param deleteChangedOneToOne it specifies if in 1 to 1 relationships, if the child is changed with respect to the media store relationship, the element in the media store has to be deleted or not
         * @param applyDeletePathCascade  specifies if an object to delete across the <code>trees</code> have to be deleted with cascade on the remaining <code>trees</code>, or have to be just a simple delete.
         * @param ifM2NDeleteOnlyRelationship specifies if when an object have to be deleted and has  a M2N relationship with its father on the <code>path</code>, the object have to be deleted or just its relationship with the father
         * @param deleteOneToOne specifies if applying the delete cascade, when found a 1 to 1 relationship, the cascade must still be applied or not.
         * @return the same storeVO
         * @throws ApplicationException for any trouble
         */
        public Object updateCreateTrees(Object storeVO,Collection trees, Boolean storeVOHasToBeUpdated, Boolean deleteChangedOneToOne, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) throws ApplicationException;
    

    /***********************************************************************/

    /**
     * This method creates a new Map instance with its entries built on the base of the value of specific attributes of the collection of value objects.
     * The collection of value objects is hold by the attribute specified by <code>pAttributeName</code> of the bean <code>pInstance</code>.</br>
     * So <code>pInstance.pAttributeName</code> must be a collection of value objects. If such collection is null, the relative collection will be retrieved from the underlying media store.
     * (see {@link #retrieveReference(Object pInstance, String pAttributeName)}). </br>
     * If it is still null an empty map will be returned.</br>
     * Once got the right collection, if the input Boolean parameter <code>isValueObjectKeyAttributeNameToSet</code> is true,  on each element of such collection will be executed the setter method with no arguments of
     * the attribute specified by the input string parameter <code>valueObjectKeyAttributeName</code>. So for example, if <code>valueObjectKeyAttributeName == "name"</code>,the method
     * <code>setName()</code> will be executed on each element of the collection. (Of course each of such elements must provide that method).</br>
     * Every value object of the collection must have an attribute named as specified by the input string parameter <code>valueObjectKeyAttributeName</code>, with its setter and getter.</br>
     * For each value object of the collection will be got the value of the attribute specified by <code>valueObjectKeyAttributeName</code> (ie. getName()), and if this value is not null
     * a new entry for the map will be created and its key will be the gotten value of the attribute <code>valueObjectKeyAttributeName</code> (ie. getName()). </br>
     * What do will be the value of that entry, it will depend by the other input parameters.</br>
     * If the input parameter <code>mapValueClass</code> is null, as value of the entry will be used the value of the attribute <code>valueObjectValueAttributeName</code> for the value object
     * that is being processed.  </br>.
     * For example suppose that <code>valueObjectKeyAttributeName== "name"</code> and <code>valueObjectValueAttributeName == "age"</code>, for each element of the collection
     * which has <code>element.getName() != null</code> on the created map that will be returned will be done <code>map.put(element.getName(),element.getAge()</code>.</br>
     * If the input string parameter <code>valueObjectValueAttributeName</code> is null, or empty or blank characters, it will be forced to assume the value of the input parameter
     * <code>valueObjectKeyAttributeName</code>.</br>
     * If the input parameter <code>mapValueClass</code> is not null, as value of the entry will be used a new instance of the same <code>mapValueClass</code> class. As in the previous case, from the element of the collection
     * of value objects that is being processed, will be gotten the value of the attribute specified by <code>valueObjectValueAttributeName</code> and if not null, it will used to set in the <code>mapValueClass</code> class
     * the attribute specified by the input parameter <code>mapValueClassAttributeToSetName</code>.</br>
     * For example suppose that <code>mapValueClass==Age.class</code>,  and <code>mapValueClassAttributeToSetName == "yearsOld"</code>, the entry value relative to
     * the value object that is being processed will be <code>new Age()</code>, and if <code>element.getAge()</code> is not null, on the Age instance will be applied <code>setYearsOld(element.getAge())</code>
     * Of course for the <code>mapValueClass</code> must have available the no arguments constructor;  the attribute specified by <code>valueObjectValueAttributeName</code>
     * must exist in the elements of the collection, and the attribute specified by <code>mapValueClassAttributeToSetName</code> must exist in the <code>mapValueClass</code> class.
     * If the input string parameter <code>mapValueClassAttributeToSetName</code> is null, or empty string, or blank character string, it will be forced to assume the value of <code>valueObjectValueAttributeName</code>,
     * that in turn, in the same condition is forced to assume the value  of  <code>valueObjectKeyAttributeName</code>.</br>
     *
     *
     * @param pInstance bean containing the collection whose elements have to be used to build the map. The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param isValueObjectKeyAttributeNameToSet if true executes the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                                           If this parameter is null assumes the default value false.
     * @param valueObjectValueAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries value in the map.</br>
     *                                      If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @param mapValueClassAttributeToSetName name of the attribute of <code>mapValueClass</code> that will be set with the value of the valueObject attribute specified by the string input parameter <code>valueObjectValueAttributeName</code>.</br>
     *                                          If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectValueAttributeName</code>.
     * @param mapValueClass Class of the entries values of the Map to be returned. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                      The attribute of <code>mapValueClass</code> named <code>mapValueClassAttributeToSetName</code> will be populated with the value of  attribute named <code>valueObjectValueAttributeName</code> in the element of the collection <code>pInstance.pAttributeName</code>, if that value is not null.</br>
     *                      Of course has to exist an attribute named with the value  <code>valueObjectValueAttributeName</code>in the the class of the element of the collection <code>pInstance.pAttributeName</code>
     *                      and an attribute named <code>mapValueClassAttributeToSetName</code> in the class <code>mapValueClass</code> .
     * @return  a new map built using attributes  of each element of the collection <code>pInstance.pAttributeName</code>
     * @throws ApplicationException for any trouble.
     */
    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass) throws ApplicationException;

    /**
     * @deprecated use {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)}
     */
    public HashMap buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass) throws ApplicationException;

    /**
     * This method builds a new Map using the values of specific attributes of the elements of a collection provided by input parameters.</br>
     * The collection is specified by the two input parameters <code>pInstance</code> and <code>pAttributeName</code>, where <code>pInstance</code> is the bean holding the collection
     * to be used and <code>pAttributeName</code> is the name of the attribute of <code>pInstance</code> that represents the collection. So definitively  the collection
     * to be used is <code>pInstance.pAttributeName</code></br>.
     * If the collection is null it will be retrieved from the media store (see {@link #retrieveReference(Object pInstance, String pAttributeName)}). If it is still null an empty map will be returned.</br>
     * If the collection is not null, if <code>isValueObjectKeyAttributeNameToSet</code> is true will be executed  the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection.</br>
     * If the collection is not null,then,  will be created an entry in the map for each element of the collection for which the attribute specified by the input parameter <code>valueObjectKeyAttributeName</code> has not null value .</br>
     * The entry's key will be the value of the same attribute specified by the input parameter <code>valueObjectKeyAttributeName</code> .</br>
     * The entry's value depend on if the input parameter <code>mapValueClass</code> is null or not null.</br>
     * If <code>mapValueClass</code> is null the entry's value will be the value of the attribute specified by the input parameter <code>valueObjectValueAttributeName</code>.</br>
     * If the String <code>valueObjectValueAttributeName</code> is null or empty string or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>,that, as we described above, can't be null, nor empt nor blanck chacters string to not be thrown a ApplicationException.</br>
     * In other words this method will create a map and will do:</br>
     * <code>map.put(element.valueObjectKeyAttributeName,element.valueObjectValueAttributeName);</code> for each element of the collection <code>pInstance.pAttributeName</code> for which element.valueObjectKeyAttributeName is not null.</br>
     * If <code>mapValueClass</code> is not null a new instance of <code>mapValueClass</code> will be created, with the no arguments constructor.</br>
     * The <code>mapValueClass</code> class must have an attribute named as the same value of<code>valueObjectValueAttributeName</code>; remember that the generic <code>element</code>
     * of the collection <code>pInstance.pAttributeName</code> must have such attribute as well.</br>
     * If the value of <code>element.valueObjectValueAttributeName</code> is not null, such value will be used to set the attribute <code>valueObjectValueAttributeName</code> of the newly created instance of <code>mapValueClass</code>.</br>
     * Finally the newly created instance of <code>mapValueClass</code> will be used as entry's value of the map, doing:</br>
     * <code>map.put(element.valueObjectKeyAttributeName, new instance of mapValueClass);</code></br>
     * </br>
     * Note that this method makes the same job of {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}
     * where <code>mapValueClassAttributeToSetName</code> has the same value of <code>valueObjectValueAttributeName</code> or is null. </br>
     *
     * @param pInstance bean containing the collection whose elements have to be used to build the map. The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param isValueObjectKeyAttributeNameToSet if true executes the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                                           If this parameter is null assumes the default value false.
     * @param valueObjectValueAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries value in the map.</br>
     *                                      If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @param mapValueClass Class of the values of the entries that are created. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                      The attribute of <code>mapValueClass</code> named <code>valueObjectValueAttributeName</code> will be populated with the value of the same attribute in the element of the collection <code>pInstance.pAttributeName</code>, if that value is not null.</br>
     *                      Of course has to exist an attribute named with the value  <code>valueObjectValueAttributeName</code> in both class <code>mapValueClass</code> and the class of the element of the collection <code>pInstance.pAttributeName</code>.
     * @return a new map built using attributes  of each element of the collection <code>pInstance.pAttributeName</code>
     * @throws ApplicationException     for any trouble.
     */
    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass) throws ApplicationException;

    /**
     * This method makes the same job of {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}
     * where <code>mapValueClassAttributeToSetName</code> and <code>valueObjectValueAttributeName</code> have the same value of <code>valueObjectKeyAttributeName</code> or are null. </br>
     *
     * @param pInstance bean containing the collection whose elements have to be used to build the map. The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param isValueObjectKeyAttributeNameToSet if true executes the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                                           If this parameter is null assumes the default value false.
     * @param mapValueClass Class of the entries values of the Map to be returned. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                      The attribute of <code>mapValueClass</code> named <code>valueObjectKeyAttributeName</code> will be populated with the value of  attribute named <code>valueObjectKeyAttributeName</code> in the element of the collection <code>pInstance.pAttributeName</code>, if that value is not null.</br>
     *                      Of course has to exist an attribute named with the value  <code>valueObjectKeyAttributeName</code>in the the class of the element of the collection <code>pInstance.pAttributeName</code>
     *                      and in the class <code>mapValueClass</code> .
     * @return a new map built using attributes  of each element of the collection <code>pInstance.pAttributeName</code>
     * @throws ApplicationException
     */
    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass) throws ApplicationException;


    /**
     * @deprecated use {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)}
     *
     */
    public HashMap buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName) throws ApplicationException;



    /**
     * This method makes the same job of {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}
     * where  <code>mapValueClass</code> is null. </br>
     *
     * @param pInstance  bean containing the collection whose elements have to be used to build the map. The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param isValueObjectKeyAttributeNameToSet if true executes the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                                           If this parameter is null assumes the default value false.
     * @param valueObjectValueAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries value in the map.</br>
     *                                      If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @return a new map built using attributes  of each element of the collection <code>pInstance.pAttributeName</code>
     * @throws ApplicationException for any trouble.
     */
    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName) throws ApplicationException;

    /**
     * This method makes the same job of {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}
     * where  <code>mapValueClass</code> is null, and <code>valueObjectValueAttributeName</code> assumes the same value of <code>valueObjectKeyAttributeName</code> or has null value.
     *
     * @param pInstance  bean containing the collection whose elements have to be used to build the map. The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param isValueObjectKeyAttributeNameToSet if true executes the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     * @return  a new map built using attributes  of each element of the collection <code>pInstance.pAttributeName</code>
     * @throws ApplicationException  for any trouble.
     */
    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet) throws ApplicationException;

    /**
     * This method makes the same job of {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}
     * where  <code>isValueObjectKeyAttributeNameToSet</code> is false.
     *
     * @param pInstance  bean containing the collection whose elements have to be used to build the map. The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param valueObjectValueAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries value in the map.</br>
     *                                      If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @param mapValueClassAttributeToSetName name of the attribute of <code>mapValueClass</code> that will be set with the value of the valueObject attribute specified by the string input parameter <code>valueObjectValueAttributeName</code>.</br>
     *                                          If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectValueAttributeName</code>.
     * @param mapValueClass Class of the entries values of the Map to be returned. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                      The attribute of <code>mapValueClass</code> named <code>mapValueClassAttributeToSetName</code> will be populated with the value of  attribute named <code>valueObjectValueAttributeName</code> in the element of the collection <code>pInstance.pAttributeName</code>, if that value is not null.</br>
     *                      Of course has to exist an attribute named with the value  <code>valueObjectValueAttributeName</code>in the the class of the element of the collection <code>pInstance.pAttributeName</code>
     *                      and an attribute named <code>mapValueClassAttributeToSetName</code> in the class <code>mapValueClass</code> .
     * @return a new map built using attributes  of each element of the collection <code>pInstance.pAttributeName</code>
     * @throws ApplicationException   for any trouble.
     */
    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass) throws ApplicationException;

    /**
     * This method makes the same job of {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}
     * where  <code>isValueObjectKeyAttributeNameToSet</code> is false and <code>mapValueClassAttributeToSetName</code> assumes the same value of <code>valueObjectValueAttributeName</code> or has null value.
     *
     * @param pInstance  bean containing the collection whose elements have to be used to build the map. The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName  name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param valueObjectKeyAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param valueObjectValueAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries value in the map.</br>
     *                                      If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @param mapValueClass Class of the entries values of the Map to be returned. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                      The attribute of <code>mapValueClass</code> named <code>valueObjectValueAttributeName</code> will be populated with the value of  the same attribute named <code>valueObjectValueAttributeName</code> in the element of the collection <code>pInstance.pAttributeName</code>, if that value is not null.</br>
     *                      Of course has to exist an attribute named with the value  <code>valueObjectValueAttributeName</code>in both class of the element of the collection <code>pInstance.pAttributeName</code>
     *                      and  <code>mapValueClass</code> .
     * @return a new map built using attributes  of each element of the collection <code>pInstance.pAttributeName</code>
     * @throws ApplicationException     for any trouble.
     */
    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass) throws ApplicationException;

    /**
     * This method makes the same job of {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}
     * where  <code>isValueObjectKeyAttributeNameToSet</code> is false and both <code>mapValueClassAttributeToSetName</code> and <code>valueObjectValueAttributeName</code> assume the same value of <code>valueObjectKeyAttributeName</code> or have null value.
     *
     * @param pInstance bean containing the collection whose elements have to be used to build the map. The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param mapValueClass Class of the entries values of the Map to be returned. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                      The attribute of <code>mapValueClass</code> named <code>valueObjectKeyAttributeName</code> will be populated with the value of  the same attribute named <code>valueObjectKeyAttributeName</code> in the element of the collection <code>pInstance.pAttributeName</code>, if that value is not null.</br>
     *                      Of course has to exist an attribute named with the value  <code>valueObjectKeyAttributeName</code>in both the  classof the element of the collection <code>pInstance.pAttributeName</code>
     *                      and the class <code>mapValueClass</code> .
     * @return  a new map built using attributes  of each element of the collection <code>pInstance.pAttributeName</code>
     * @throws ApplicationException  for any trouble.
     */
    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Class mapValueClass) throws ApplicationException;
    /**
     * @deprecated use {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)}
     */
    public HashMap buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,String valueObjectValueAttributeName) throws ApplicationException;

    /**
     * This method makes the same job of {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}
     * where  <code>isValueObjectKeyAttributeNameToSet</code> is false and <code>mapValueClass</code> is null.
     *
     * @param pInstance  bean containing the collection whose elements have to be used to build the map. The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param valueObjectValueAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries value in the map.</br>
     *                                      If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @return a new map built using attributes  of each element of the collection <code>pInstance.pAttributeName</code>
     * @throws ApplicationException for any trouble.
     */
    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)throws ApplicationException;


    /**
     * This method makes the same job of {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}
     * where  <code>isValueObjectKeyAttributeNameToSet</code> is false,  <code>mapValueClass</code> is null and <code>valueObjectValueAttributeName</code> assumes the same value of <code>valueObjectKeyAttributeName</code> or has null value.
     *
     * @param pInstance  bean containing the collection whose elements have to be used to build the map. The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @return  a new map built using attributes  of each element of the collection <code>pInstance.pAttributeName</code>
     * @throws ApplicationException   for any trouble.
     */
    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}. </br>
     * The difference is that the collection is directly specified by the input parameter <code>valueObjectsCollection</code>. <br>
     * If collection is null an empty map is returned <br>
     *
     * @param valueObjectsCollection  collection containing the elements to build the map.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>valueObjectsCollection</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param isValueObjectKeyAttributeNameToSet if true executes the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                                           If this parameter is null assumes the default value false.
     * @param valueObjectValueAttributeName  name of the attribute of the generic element of the collection <code>valueObjectsCollection</code>, that will be used as entries value in the map.</br>
     *                                     If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @param mapValueClassAttributeToSetName name of the attribute of <code>mapValueClass</code> that will be set with the value of the valueObject attribute specified by the string input parameter <code>valueObjectValueAttributeName</code>.</br>
     *                                          If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectValueAttributeName</code>.
     * @param mapValueClass Class of the entries values of the Map to be returned. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                      The attribute of <code>mapValueClass</code> named <code>mapValueClassAttributeToSetName</code> will be populated with the value of  attribute named <code>valueObjectValueAttributeName</code> in the element of the collection <code>valueObjectsCollection</code>, if that value is not null.</br>
     *                      Of course has to exist an attribute named with the value  <code>valueObjectValueAttributeName</code>in the the class of the element of the collection <code>valueObjectsCollection</code>
     *                      and an attribute named <code>mapValueClassAttributeToSetName</code> in the class <code>mapValueClass</code> .
     * @return a new map built using attributes  of each element of the collection <code>valueObjectsCollection</code>
     * @throws ApplicationException for any trouble.
     */
    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass) throws ApplicationException;

    /**
     * @deprecated see{@link #buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass)}
     */
    public HashMap buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)}. </br>
     * The difference is that the collection is directly specified by the input parameter <code>valueObjectsCollection</code>. <br>
     * If collection is null an empty map is returned <br>
     *
     * @param valueObjectsCollection collection containing the elements to build the map.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>valueObjectsCollection</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     *
     * @param isValueObjectKeyAttributeNameToSet if true executes the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                                           If this parameter is null assumes the default value false.
     * @param valueObjectValueAttributeName name of the attribute of the generic element of the collection <code>valueObjectsCollection</code>, that will be used as entries value in the map.</br>
     *                                     If this parameter is null it will, or empty or blank characters string be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @param mapValueClass  Class of the entries value of the map. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                       The attribute of <code>mapValueClass</code> named <code>valueObjectValueAttributeName</code> will be populated with the value of the same attribute in the element of the collection <code>valueObjectsCollection</code>, if that value is not null.</br>
     *                       Of course has to exist an attribute named with the value  <code>valueObjectValueAttributeName</code> in both class <code>mapValueClass</code> and the class of the element of the collection <code>valueObjectsCollection</code>.
     * @return a new map built using the the attributes  <code>valueObjectKeyAttributeName</code>  and <code>valueObjectValueAttributeName</code> of each element of the collection <code>valueObjectsCollection</code>
     * @throws ApplicationException   for any trouble.
     */
    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass) throws ApplicationException;


    /**
     * This method has the same behavior of {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass)}. </br>
     * The difference is that the collection is directly specified by the input parameter <code>valueObjectsCollection</code>. <br>
     * If collection is null an empty map is returned <br>
     *
     * @param valueObjectsCollection collection containing the elements to build the map.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>valueObjectsCollection</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param isValueObjectKeyAttributeNameToSet if true executes the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                                           If this parameter is null assumes the default value false.
     * @param mapValueClass Class of the entries value of the map. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                       The attribute of <code>mapValueClass</code> named <code>valueObjectKeyAttributeName</code> will be populated with the value of the same attribute in the element of the collection <code>valueObjectsCollection</code>, if that value is not null.</br>
     *                       Of course has to exist an attribute named with the value  <code>valueObjectKeyAttributeName</code> in both class <code>mapValueClass</code> and the class of the element of the collection <code>valueObjectsCollection</code>.
     * @return  the built map
     * @throws ApplicationException   for any trouble.
     */
    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)}. </br>
     * The difference is that the collection is directly specified by the input parameter <code>valueObjectsCollection</code>. <br>
     * If collection is null an empty map is returned <br>
     *
     * @param valueObjectsCollection  collection containing the elements to build the map.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>valueObjectsCollection</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param isValueObjectKeyAttributeNameToSet if true executes the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                                           If this parameter is null assumes the default value false.
     * @param valueObjectValueAttributeName  name of the attribute of the generic element of the collection <code>valueObjectsCollection</code>, that will be used as entries value in the map.</br>
     *                                     If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @return  the built map
     * @throws ApplicationException for any trouble.
     */
    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet)}. </br>
     * The difference is that the collection is directly specified by the input parameter <code>valueObjectsCollection</code>. <br>
     * If collection is null an empty map is returned <br>
     *
     * @param valueObjectsCollection  collection containing the elements to build the map.
     * @param valueObjectKeyAttributeName  name of the attribute of the generic element of the collection <code>valueObjectsCollection</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param isValueObjectKeyAttributeNameToSet if true executes the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                                           If this parameter is null assumes the default value false.
     * @return  the built map
     * @throws ApplicationException for any trouble.
     */
    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass)}. </br>
     * The difference is that the collection is directly specified by the input parameter <code>valueObjectsCollection</code>. <br>
     * If collection is null an empty map is returned <br>
     *
     * @param valueObjectsCollection  collection containing the elements to build the map.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>valueObjectsCollection</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param valueObjectValueAttributeName name of the attribute of the generic element of the collection <code>valueObjectsCollection</code>, that will be used as entries value in the map.</br>
     *                                     If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @param mapValueClassAttributeToSetName name of the attribute of <code>mapValueClass</code> that will be set with the value of the valueObject attribute specified by the string input parameter <code>valueObjectValueAttributeName</code>.</br>
     *                                          If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectValueAttributeName</code>.
     * @param mapValueClass Class of the entries values of the Map to be returned. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                      The attribute of <code>mapValueClass</code> named <code>mapValueClassAttributeToSetName</code> will be populated with the value of  attribute named <code>valueObjectValueAttributeName</code> in the element of the collection <code>valueObjectsCollection</code>, if that value is not null.</br>
     *                      Of course has to exist an attribute named with the value  <code>valueObjectValueAttributeName</code>in the the class of the element of the collection <code>valueObjectsCollection</code>
     *                      and an attribute named <code>mapValueClassAttributeToSetName</code> in the class <code>mapValueClass</code> .
     * @return  the built map
     * @throws ApplicationException for any trouble.
     */
    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass)}. </br>
     * The difference is that the collection is directly specified by the input parameter <code>valueObjectsCollection</code>. <br>
     * If collection is null an empty map is returned <br>
     *
     * @param valueObjectsCollection  collection containing the elements to build the map.
     * @param valueObjectKeyAttributeName  name of the attribute of the generic element of the collection <code>valueObjectsCollection</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param valueObjectValueAttributeName  name of the attribute of the generic element of the collection <code>valueObjectsCollection</code>, that will be used as entries value in the map.</br>
     *                                     If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @param mapValueClass  Class of the entries values of the Map to be returned. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                      The attribute of <code>mapValueClass</code> named <code>valueObjectValueAttributeName</code> will be populated with the value of the same  attribute named <code>valueObjectValueAttributeName</code> in the element of the collection <code>valueObjectsCollection</code>, if that value is not null.</br>
     *                      Of course has to exist an attribute named with the value  <code>valueObjectValueAttributeName</code>in both class of the element of the collection <code>valueObjectsCollection</code>
     *                      and  class <code>mapValueClass</code> .
     * @return     the built map
     * @throws ApplicationException   for any trouble.
     */
    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Class mapValueClass)}. </br>
     * The difference is that the collection is directly specified by the input parameter <code>valueObjectsCollection</code>. <br>
     * If collection is null an empty map is returned <br>
     *
     * @param valueObjectsCollection collection containing the elements to build the map.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>valueObjectsCollection</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param mapValueClass Class of the entries values of the Map to be returned. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                      The attribute of <code>mapValueClass</code> named <code>valueObjectKeyAttributeName</code> will be populated with the value of the same  attribute named <code>valueObjectKeyAttributeName</code> in the element of the collection <code>valueObjectsCollection</code>, if that value is not null.</br>
     *                      Of course has to exist an attribute named with the value  <code>valueObjectKeyAttributeName</code>in both class of the element of the collection <code>valueObjectsCollection</code>
     *                      and  class <code>mapValueClass</code> .
     * @return   the built map
     * @throws ApplicationException  for any trouble.
     */
    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Class mapValueClass) throws ApplicationException;

    /**
     * @deprecated use {@link #buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)}
     */
    public HashMap buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)}. </br>
     * The difference is that the collection is directly specified by the input parameter <code>valueObjectsCollection</code>. <br>
     * If collection is null an empty map is returned <br>
     *
     * @param valueObjectsCollection  collection containing the elements to build the map.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>valueObjectsCollection</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param valueObjectValueAttributeName name of the attribute of the generic element of the collection <code>valueObjectsCollection</code>, that will be used as entries value in the map.</br>
     *                                     If this parameter is null, or empty or blank characters string, it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @return a new created Map
     * @throws ApplicationException for any trouble.
     */
    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName)}. </br>
     * The difference is that the collection is directly specified by the input parameter <code>valueObjectsCollection</code>. <br>
     * If collection is null an empty map is returned <br>
     * 
     * @param valueObjectsCollection  collection containing the elements to build the map.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>valueObjectsCollection</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @return a new created Map
     * @throws ApplicationException for any trouble.
     */
    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName) throws ApplicationException;




    /* old method deleted
      @deprecated  use @addToHashMap
    public HashMap updateHashMap(Object valueObject, HashMap map, String collectionToGet, String fieldToUseAsKey,boolean setField, String fieldToUseToFillMap,Class classToUseToFillMap) throws ApplicationException;
    */



    /**
     * This method conceptually works in the same way of {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}
     * with the only difference, that in place of building a new Map, works on the <code>map</code> provided as input parameter.</br>
     * As the mentioned method, this method generates entries for the map on the base of the input parameter.</br>
     * Each one of the generated entries (pairs key,value ), will be added to the map if and only if the key doesn't exist in the map, or if the key exists , it is
     * mapped to a null value.</br>
     * So in the map provided as input, all the entries that have not null values are left unmodified.
     *
     * @param pInstance  bean containing the collection whose elements have to be used to add entries to map. It should be a value object.The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param map Map to add entries to.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param isValueObjectKeyAttributeNameToSet  if true executes the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                                           If this parameter is null assumes the default value false.
     * @param valueObjectValueAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries value in the map.</br>
     *                                      If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @param mapValueClassAttributeToSetName name of the attribute of <code>mapValueClass</code> that will be set with the value of the valueObject attribute specified by the string input parameter <code>valueObjectValueAttributeName</code>.</br>
     *                                          If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectValueAttributeName</code>.
     * @param mapValueClass       Class of the entries values of the <code>map</code>. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                      The attribute of <code>mapValueClass</code> named <code>mapValueClassAttributeToSetName</code> will be populated with the value of  attribute named <code>valueObjectValueAttributeName</code> in the element of the collection <code>pInstance.pAttributeName</code>, if that value is not null.</br>
     *                      Of course has to exist an attribute named with the value  <code>valueObjectValueAttributeName</code>in the the class of the element of the collection <code>pInstance.pAttributeName</code>
     *                      and an attribute named <code>mapValueClassAttributeToSetName</code> in the class <code>mapValueClass</code> .
     * @return the same <code>map</code> with the eventually added entries.
     * @throws ApplicationException    for any trouble
     */
    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass) throws ApplicationException;

    /**
     * @deprecated use  {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)}
     */
    public HashMap addToHashMap(Object pInstance, HashMap map, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass) throws ApplicationException;


    /**
     * This method makes the same job of {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}
     * where <code>mapValueClassAttributeToSetName</code> has the same value of <code>valueObjectKeyAttributeName</code> or is null. </br>
     *
     * @param pInstance bean containing the collection whose elements have to be used to add entries to map. It should be a value object.The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName  name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param map Map to add entries to.
     * @param valueObjectKeyAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param isValueObjectKeyAttributeNameToSet  if true executes the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                                           If this parameter is null assumes the default value false.
     * @param valueObjectValueAttributeName   name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries value in the map.</br>
     *                                      If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @param mapValueClass     Class of the entries values of the <code>map</code>. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                      The attribute of <code>mapValueClass</code> named <code>mapValueClassAttributeToSetName</code> will be populated with the value of  attribute named <code>valueObjectValueAttributeName</code> in the element of the collection <code>pInstance.pAttributeName</code>, if that value is not null.</br>
     *                      Of course has to exist an attribute named with the value  <code>valueObjectValueAttributeName</code>in the the class of the element of the collection <code>pInstance.pAttributeName</code>
     *                      and an attribute named <code>mapValueClassAttributeToSetName</code> in the class <code>mapValueClass</code> .
     * @return  the same <code>map</code> with the eventually added entries.
     * @throws ApplicationException    for any trouble
     */

    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass) throws ApplicationException;


    /**
     * This method makes the same job of {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}
     * where <code>mapValueClassAttributeToSetName</code> and <code>valueObjectValueAttributeName</code> have the same value of <code>valueObjectKeyAttributeName</code> or are null. </br>
     *
     * @param pInstance  bean containing the collection whose elements have to be used to add entries to map. It should be a value object.The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param map Map to add entries to.
     * @param valueObjectKeyAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param isValueObjectKeyAttributeNameToSet  if true executes the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                                           If this parameter is null assumes the default value false.
     * @param mapValueClass     Class of the entries values of the <code>map</code>. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                      The attribute of <code>mapValueClass</code> named <code>mapValueClassAttributeToSetName</code> will be populated with the value of  attribute named <code>valueObjectValueAttributeName</code> in the element of the collection <code>pInstance.pAttributeName</code>, if that value is not null.</br>
     *                      Of course has to exist an attribute named with the value  <code>valueObjectValueAttributeName</code>in the the class of the element of the collection <code>pInstance.pAttributeName</code>
     *                      and an attribute named <code>mapValueClassAttributeToSetName</code> in the class <code>mapValueClass</code> .
     * @return  the same <code>map</code> with the eventually added entries.
     * @throws ApplicationException for any trouble
     */
    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass) throws ApplicationException;

    /**
     * @deprecated use  {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)}
     */
    public HashMap addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName) throws ApplicationException;

    /**
     * This method makes the same job of {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}
     * where  <code>mapValueClass</code> is null. </br>
     *
     * @param pInstance bean containing the collection whose elements have to be used to add entries to map. It should be a value object.The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param map Map to add entries to.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param isValueObjectKeyAttributeNameToSet if true executes the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                                           If this parameter is null assumes the default value false.
     * @param valueObjectValueAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries value in the map.</br>
     *                                      If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @return  the same modified map passed as input parameter.
     * @throws ApplicationException   for any trouble
     */
    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName) throws ApplicationException;

    /**
     * This method makes the same job of {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}
     * where  <code>mapValueClass</code> is null, and <code>valueObjectValueAttributeName</code> assumes the same value of <code>valueObjectKeyAttributeName</code> or has null value.
     *
     * @param pInstance bean containing the collection whose elements have to be used to add entries to map. It should be a value object.The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param map  Map to add entries to.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param isValueObjectKeyAttributeNameToSet  if true executes the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                                           If this parameter is null assumes the default value false.
     * @return the same <code>map</code> with the eventually added entries.
     * @throws ApplicationException  for any trouble
     */
    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet) throws ApplicationException;

    /**
     * This method makes the same job of {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}
     * where  <code>isValueObjectKeyAttributeNameToSet</code> is false.
     *
     * @param pInstance bean containing the collection whose elements have to be used to add entries to map. It should be a value object.The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param map  Map to add entries to.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param valueObjectValueAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries value in the map.</br>
     *                                      If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @param mapValueClassAttributeToSetName  name of the attribute of <code>mapValueClass</code> that will be set with the value of the valueObject attribute specified by the string input parameter <code>valueObjectValueAttributeName</code>.</br>
     *                                          If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectValueAttributeName</code>.
     * @param mapValueClass    Class of the entries values of the <code>map</code>. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                      The attribute of <code>mapValueClass</code> named <code>mapValueClassAttributeToSetName</code> will be populated with the value of  attribute named <code>valueObjectValueAttributeName</code> in the element of the collection <code>pInstance.pAttributeName</code>, if that value is not null.</br>
     *                      Of course has to exist an attribute named with the value  <code>valueObjectValueAttributeName</code>in the the class of the element of the collection <code>pInstance.pAttributeName</code>
     *                      and an attribute named <code>mapValueClassAttributeToSetName</code> in the class <code>mapValueClass</code> .
     * @return  the same <code>map</code> with the eventually added entries.
     * @throws ApplicationException  for any trouble
     */
    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass) throws ApplicationException;

    /**
     * This method makes the same job of {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}
     * where  <code>isValueObjectKeyAttributeNameToSet</code> is false and <code>mapValueClassAttributeToSetName</code> assumes the same value of <code>valueObjectValueAttributeName</code> or has null value.
     *
     * @param pInstance bean containing the collection whose elements have to be used to add entries to map. It should be a value object.The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param map  Map to add entries to.
     * @param valueObjectKeyAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param valueObjectValueAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries value in the map.</br>
     *                                      If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @param mapValueClass     Class of the entries values of the <code>map</code>. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                      The attribute of <code>mapValueClass</code> named <code>mapValueClassAttributeToSetName</code> will be populated with the value of  attribute named <code>valueObjectValueAttributeName</code> in the element of the collection <code>pInstance.pAttributeName</code>, if that value is not null.</br>
     *                      Of course has to exist an attribute named with the value  <code>valueObjectValueAttributeName</code>in the the class of the element of the collection <code>pInstance.pAttributeName</code>
     *                      and an attribute named <code>mapValueClassAttributeToSetName</code> in the class <code>mapValueClass</code> .
     * @return the same <code>map</code> with the eventually added entries.
     * @throws ApplicationException  for any trouble
     */
    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass) throws ApplicationException;


    /**
     * This method makes the same job of {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}
     * where  <code>isValueObjectKeyAttributeNameToSet</code> is false and both <code>mapValueClassAttributeToSetName</code> and <code>valueObjectValueAttributeName</code> assume the same value of <code>valueObjectKeyAttributeName</code> or have null value.
     *
     * @param pInstance bean containing the collection whose elements have to be used to add entries to map. It should be a value object.The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param map  Map to add entries to.
     * @param valueObjectKeyAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param mapValueClass    Class of the entries values of the <code>map</code>. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>pInstance.pAttributeName</code>.</br>
     *                      The attribute of <code>mapValueClass</code> named <code>mapValueClassAttributeToSetName</code> will be populated with the value of  attribute named <code>valueObjectValueAttributeName</code> in the element of the collection <code>pInstance.pAttributeName</code>, if that value is not null.</br>
     *                      Of course has to exist an attribute named with the value  <code>valueObjectValueAttributeName</code>in the the class of the element of the collection <code>pInstance.pAttributeName</code>
     *                      and an attribute named <code>mapValueClassAttributeToSetName</code> in the class <code>mapValueClass</code> .
     * @return the same <code>map</code> with the eventually added entries.
     * @throws ApplicationException    for any trouble
     */
    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Class mapValueClass)  throws ApplicationException;


    /**
     * @deprecated use {@link #addToMap(Object pInstance,String pAttributeName, Map map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)}
     */
    public HashMap addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName) throws ApplicationException;

    /**
     * This method makes the same job of {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}
     * where  <code>isValueObjectKeyAttributeNameToSet</code> is false and <code>mapValueClass</code> is null.
     *
     * @param pInstance bean containing the collection whose elements have to be used to add entries to map. It should be a value object.The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param map Map to add entries to.
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param valueObjectValueAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries value in the map.</br>
     *                                      If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @return the same modified map passed as input parameter.
     * @throws ApplicationException for any trouble
     */
    public Map addToMap(Object pInstance,String pAttributeName, Map map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName) throws ApplicationException;

    /**
     * This method makes the same job of {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}
     * where  <code>isValueObjectKeyAttributeNameToSet</code> is false,  <code>mapValueClass</code> is null and <code>valueObjectValueAttributeName</code> assumes the same value of <code>valueObjectKeyAttributeName</code> or has null value.
     *
     * @param pInstance  bean containing the collection whose elements have to be used to add entries to map. It should be a value object.The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName  name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param map  Map to add entries to.
     * @param valueObjectKeyAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @return  the same <code>map</code> with the eventually added entries.
     * @throws ApplicationException  for any trouble
     */
    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName)throws ApplicationException;

    /**
     * This method has the same behavior of {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)}. </br>
     * The difference is that the collection is directly specified by the input parameter <code>valueObjectsCollection</code>. <br>
     * If collection is null an empty map is returned <br>
     *
     * @param valueObjectsCollection  collection containing the elements to create the map entries to add to the <code>map</code>.
     * @param map  Map to add entries to.
     * @param valueObjectKeyAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param isValueObjectKeyAttributeNameToSet  if true executes the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                                           If this parameter is null assumes the default value false.
     * @param valueObjectValueAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries value in the map.</br>
     *                                      If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @param mapValueClassAttributeToSetName  name of the attribute of <code>mapValueClass</code> that will be set with the value of the valueObject attribute specified by the string input parameter <code>valueObjectValueAttributeName</code>.</br>
     *                                          If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectValueAttributeName</code>.
     * @param mapValueClass   Class of the entries values of the <code>map</code>. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                      The attribute of <code>mapValueClass</code> named <code>mapValueClassAttributeToSetName</code> will be populated with the value of  attribute named <code>valueObjectValueAttributeName</code> in the element of the collection <code>valueObjectsCollection</code>, if that value is not null.</br>
     *                      Of course has to exist an attribute named with the value  <code>valueObjectValueAttributeName</code>in the the class of the element of the collection <code>valueObjectsCollection</code>
     *                      and an attribute named <code>mapValueClassAttributeToSetName</code> in the class <code>mapValueClass</code> .
     * @return  the same <code>map</code> with the eventually added entries.
     * @throws ApplicationException for any trouble
     */
    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass) throws ApplicationException;

    /**
     * @deprecated use  {@link #addToMap(Collection valueObjectsCollection, Map map,  String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)}
     */
    public HashMap addToHashMap(Collection valueObjectsCollection, HashMap map,  String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #addToMap(Object pInstance, String pAttributeName, Map map,  String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)}. </br>
     * The difference is that the collection is directly specified by the input parameter <code>valueObjectsCollection</code>. <br>
     * If collection is null an empty map is returned <br>
     *
     * @param valueObjectsCollection collection containing the elements to create the map entries to add to the <code>map</code>.
     * @param map  Map to add entries to.
     * @param valueObjectKeyAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param isValueObjectKeyAttributeNameToSet if true executes the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                                           If this parameter is null assumes the default value false.
     * @param valueObjectValueAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries value in the map.</br>
     *                                      If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @param mapValueClass  Class of the entries values of the <code>map</code>. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                      The attribute of <code>mapValueClass</code> named <code>mapValueClassAttributeToSetName</code> will be populated with the value of  attribute named <code>valueObjectValueAttributeName</code> in the element of the collection <code>valueObjectsCollection</code>, if that value is not null.</br>
     *                      Of course has to exist an attribute named with the value  <code>valueObjectValueAttributeName</code>in the the class of the element of the collection <code>valueObjectsCollection</code>
     *                      and an attribute named <code>mapValueClassAttributeToSetName</code> in the class <code>mapValueClass</code> .
     * @return the same <code>map</code> with the eventually added entries.
     * @throws ApplicationException  for any trouble
     */
    public Map addToMap(Collection valueObjectsCollection, Map map,  String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass)}. </br>
     * The difference is that the collection is directly specified by the input parameter <code>valueObjectsCollection</code>. <br>
     * If collection is null an empty map is returned <br>
     *
     * @param valueObjectsCollection   collection containing the elements to create the map entries to add to the <code>map</code>.
     * @param map Map to add entries to.
     * @param valueObjectKeyAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param isValueObjectKeyAttributeNameToSet if true executes the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                                           If this parameter is null assumes the default value false.
     * @param mapValueClass  Class of the entries values of the <code>map</code>. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                      The attribute of <code>mapValueClass</code> named <code>mapValueClassAttributeToSetName</code> will be populated with the value of  attribute named <code>valueObjectValueAttributeName</code> in the element of the collection <code>valueObjectsCollection</code>, if that value is not null.</br>
     *                      Of course has to exist an attribute named with the value  <code>valueObjectValueAttributeName</code>in the the class of the element of the collection <code>valueObjectsCollection</code>
     *                      and an attribute named <code>mapValueClassAttributeToSetName</code> in the class <code>mapValueClass</code> .
     * @return the same <code>map</code> with the eventually added entries.
     * @throws ApplicationException for any trouble
     */
    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass) throws ApplicationException;

    /**
     * @deprecated use {@link #addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName)}
     */
    public HashMap addToHashMap(Collection valueObjectsCollection,HashMap map, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName) }. </br>
     * The difference is that the collection is directly specified by the input parameter <code>valueObjectsCollection</code>. <br>
     * If collection is null an empty map is returned <br>
     *
     * @param valueObjectsCollection collection containing the elements to create the map entries to add to the <code>map</code>.
     * @param map Map to add entries to.
     * @param valueObjectKeyAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param isValueObjectKeyAttributeNameToSet  if true executes the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                                           If this parameter is null assumes the default value false.
     * @param valueObjectValueAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries value in the map.</br>
     *                                      If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @return the same <code>map</code> with the eventually added entries.
     * @throws ApplicationException for any trouble
     */
    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet)}. </br>
     * The difference is that the collection is directly specified by the input parameter <code>valueObjectsCollection</code>. <br>
     * If collection is null an empty map is returned <br>
     *
     * @param valueObjectsCollection  collection containing the elements to create the map entries to add to the <code>map</code>.
     * @param map Map to add entries to.
     * @param valueObjectKeyAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param isValueObjectKeyAttributeNameToSet  if true executes the setter method with no arguments on the attribute whose name is represented by the input string <code>valueObjectKeyAttributeName</code> for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                                           If this parameter is null assumes the default value false.
     * @return the same <code>map</code> with the eventually added entries.
     * @throws ApplicationException
     */
    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass)}. </br>
     * The difference is that the collection is directly specified by the input parameter <code>valueObjectsCollection</code>. <br>
     * If collection is null an empty map is returned <br>
     *
     * @param valueObjectsCollection  collection containing the elements to create the map entries to add to the <code>map</code>.
     * @param map  Map to add entries to.
     * @param valueObjectKeyAttributeName   name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param valueObjectValueAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries value in the map.</br>
     *                                      If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @param mapValueClassAttributeToSetName  name of the attribute of <code>mapValueClass</code> that will be set with the value of the valueObject attribute specified by the string input parameter <code>valueObjectValueAttributeName</code>.</br>
     *                                          If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectValueAttributeName</code>.
     * @param mapValueClass  Class of the entries values of the <code>map</code>. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                      The attribute of <code>mapValueClass</code> named <code>mapValueClassAttributeToSetName</code> will be populated with the value of  attribute named <code>valueObjectValueAttributeName</code> in the element of the collection <code>valueObjectsCollection</code>, if that value is not null.</br>
     *                      Of course has to exist an attribute named with the value  <code>valueObjectValueAttributeName</code>in the the class of the element of the collection <code>valueObjectsCollection</code>
     *                      and an attribute named <code>mapValueClassAttributeToSetName</code> in the class <code>mapValueClass</code> .
     * @return the same <code>map</code> with the eventually added entries.
     * @throws ApplicationException for any trouble
     */
    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass)}. </br>
     * The difference is that the collection is directly specified by the input parameter <code>valueObjectsCollection</code>. <br>
     * If collection is null an empty map is returned <br>
     *
     * @param valueObjectsCollection    collection containing the elements to create the map entries to add to the <code>map</code>.
     * @param map  Map to add entries to.
     * @param valueObjectKeyAttributeName   name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param valueObjectValueAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries value in the map.</br>
     *                                      If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @param mapValueClass  Class of the entries values of the <code>map</code>. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                       The attribute of <code>mapValueClass</code> named <code>mapValueClassAttributeToSetName</code> will be populated with the value of  attribute named <code>valueObjectValueAttributeName</code> in the element of the collection <code>valueObjectsCollection</code>, if that value is not null.</br>
     *                       Of course has to exist an attribute named with the value  <code>valueObjectValueAttributeName</code>in the the class of the element of the collection <code>valueObjectsCollection</code>
     *                       and an attribute named <code>mapValueClassAttributeToSetName</code> in the class <code>mapValueClass</code> .
     * @return the same <code>map</code> with the eventually added entries.
     * @throws ApplicationException  for any trouble
     */
    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass)throws ApplicationException;

    /**
     * This method has the same behavior of {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Class mapValueClass)}. </br>
     * The difference is that the collection is directly specified by the input parameter <code>valueObjectsCollection</code>. <br>
     * If collection is null an empty map is returned <br>
     *
     * @param valueObjectsCollection   collection containing the elements to create the map entries to add to the <code>map</code>.
     * @param map  Map to add entries to.
     * @param valueObjectKeyAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param mapValueClass  Class of the entries values of the <code>map</code>. A new instance of this class will be created (with no arguments constructor) for each element of the collection <code>valueObjectsCollection</code>.</br>
     *                       The attribute of <code>mapValueClass</code> named <code>mapValueClassAttributeToSetName</code> will be populated with the value of  attribute named <code>valueObjectValueAttributeName</code> in the element of the collection <code>valueObjectsCollection</code>, if that value is not null.</br>
     *                       Of course has to exist an attribute named with the value  <code>valueObjectValueAttributeName</code>in the the class of the element of the collection <code>valueObjectsCollection</code>
     *                       and an attribute named <code>mapValueClassAttributeToSetName</code> in the class <code>mapValueClass</code> .
     * @return the same <code>map</code> with the eventually added entries.
     * @throws ApplicationException  for any trouble
     */
    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Class mapValueClass) throws ApplicationException;

    /**
     * @deprecated use {@link #addToMap(Collection valueObjectsCollection ,Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)}
     */
    public HashMap addToHashMap(Collection valueObjectsCollection ,HashMap map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)}. </br>
     * The difference is that the collection is directly specified by the input parameter <code>valueObjectsCollection</code>. <br>
     * If collection is null an empty map is returned <br>
     *
     * @param valueObjectsCollection  collection containing the elements to create the map entries to add to the <code>map</code>.
     * @param map  Map to add entries to.
     * @param valueObjectKeyAttributeName   name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param valueObjectValueAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries value in the map.</br>
     *                                      If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>
     * @return  the same <code>map</code> with the eventually added entries.
     * @throws ApplicationException  for any trouble
     */
    public Map addToMap(Collection valueObjectsCollection ,Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName)}. </br>
     * The difference is that the collection is directly specified by the input parameter <code>valueObjectsCollection</code>. <br>
     * If collection is null an empty map is returned <br>
     *
     * @param valueObjectsCollection   collection containing the elements to create the map entries to add to the <code>map</code>.
     * @param map  Map to add entries to.
     * @param valueObjectKeyAttributeName  name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be used as entries key in the map.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @return the same <code>map</code> with the eventually added entries.
     * @throws ApplicationException for any trouble
     */
    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName) throws ApplicationException;




    /**
     * This method has the same behavior of  {@link #updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)}
     * where valueObjectsCollection is the collection <code>pInstance.pAttributeName</code> .</br>
     * So <code>pInstance.pAttributeName</code> must be a collection of value objects. If such collection is null, the relative collection will be retrieved from the underlying media store.
     * (see {@link #retrieveReference(Object pInstance, String pAttributeName)}). </br>
     *
     * @param pInstance  pInstance bean containing the collection whose elements have to be updated using the <code>map</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param map   map used to update the collection <code>pInstance.pAttributeName</code>
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, whose value has to match with an entry's key of  <code>map</code>,
     *                                    to update the attribute <code>valueObjectValueAttributeName</code> of the same element with the entry value.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param valueObjectValueAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, that will be updated with the entry value of the <code>map</code>
     *                                      If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>.
     * @throws ApplicationException  -
     *      <code>map</code> is null.</br>
     *      if  <code>valueObjectKeyAttributeName</code>  is null, or empty or blank characters string.</br>
     */
    public void updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)throws ApplicationException;


    /**
     * This method has the same behavior of {@link #updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)}
     * where as <code>valueObjectValueAttributeName<code> is  passed  <code>valueObjectKeyAttributeName<code>.</br>
     *
     * @param pInstance pInstance bean containing the collection whose elements have to be updated using the <code>map</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param pAttributeName  name of the attribute representing the collection contained in the bean represented by <code>pInstance</code>. The collection will be <code>pInstance.pAttributeName</code>.
     * @param map map used to update the collection <code>pInstance.pAttributeName</code>
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>pInstance.pAttributeName</code>, whose value has to match with an entry's key of  <code>map</code>,
     *                                    to update the attribute <code>valueObjectValueAttributeName</code> of the same element with the entry value.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @throws ApplicationException -
     *      <code>map</code> is null.</br>
     *      if  <code>valueObjectKeyAttributeName</code>  is null, or empty or blank characters string.</br>
     */
    public void updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName)throws ApplicationException;




    /**
     * This method updates an attribute of specific elements of the  collection <code>valueObjectsCollection</code> with elements of  the input parameter <code>map</code>.</br>
     * For each <code>key</code> of the <code>map</code>, this method looks for all the elements in <code>valueObjectsCollection</code> having the attribute <code>valueObjectKeyAttributeName==key</code>.</br>
     * For all the elements found, this method updates the attribute <code>valueObjectValueAttributeName</code>  with <code>map.get(key)</code>.</br>
     * If  valueObjectsCollection is null nothing is done.</br>
     *
     * @param valueObjectsCollection  Collection whose elements attribute have to be update
     * @param map   map used to update the <code>valueObjectsCollection</code>
     * @param valueObjectKeyAttributeName  name of the attribute of the generic element of the collection <code>valueObjectsCollection</code>, whose value has to match with an entry's key of  <code>map</code>,
     *                                    to update the attribute <code>valueObjectValueAttributeName</code> of the same element with the entry value.</br>
     *                                    If this parameter is null, or empty or blank characters string an ApplicationException will be thrown.
     * @param valueObjectValueAttributeName name of the attribute of the generic element of the collection <code>valueObjectsCollection</code>, that will be updated with the entry value of the <code>map</code>
     *                                      If this parameter is null, or empty or blank characters string it will be forced to assume the value of <code>valueObjectKeyAttributeName</code>.
     * @throws ApplicationException -
     *      <code>map</code> is null.</br>
     *      if  <code>valueObjectKeyAttributeName</code>  is null, or empty or blank characters string.</br>
     */
    public void updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)throws ApplicationException;


    /**
     * This method updates an attribute of specific elements of the  collection <code>valueObjectsCollection</code> with elements of  the input parameter <code>map</code>.</br>
     * This method has the same behavior of {@link #updateCollectionWithMap(Collection valueObjectsCollection,  Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)}
     * where as <code>valueObjectValueAttributeName<code> is  passed  <code>valueObjectKeyAttributeName<code>
     *
     * @param valueObjectsCollection Collection whose elements attribute have to be update
     * @param map  map used to update the <code>valueObjectsCollection</code>
     * @param valueObjectKeyAttributeName name of the attribute of the generic element of the collection <code>valueObjectsCollection</code>, whose value has to match with an entry's key of  <code>map</code>,
     *                                    to update the attribute <code>valueObjectValueAttributeName</code> of the same element with the entry value.</br>
     *                                    If this parameter is null, or empty or blank characters string a BusinessObjectException will be thrown.
     * @throws ApplicationException  -
     *       <code>map</code> is null.</br>
     *      if  <code>valueObjectKeyAttributeName</code>  is null, or empty or blank characters string.</br>
     */
    public void updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName)throws ApplicationException;


    /**
     * @deprecated use {@link it.aco.mandragora.common.utils.BeanCollectionUtils#getTreeLeaves(Object valueobjectOrCollection, String path)}
     * This method creates and returns a collection holding leaves of a tree of value objects, or of a collection of trees of value objects. Not all the leaves will be added to the
     * collection to be returned, but just the leaves that have the depth specified by the number of the dot separated tokens of the input string parameter <code>path</code>.</br>
     * The value object root of the tree, or the collection of the value object roots of the trees, is represented by the input parameter
     * <code>valueobjectOrCollection</code>, that, as his name states, can be a value object or a collection of value objects.</br>
     * <code>valueobjectOrCollection</code> (or each element of it, if it is a collection) must have an attribute named as the first token
     * of <code>path</code> (the separator is the dot), and such attribute represents a value object or an other collection of value objects. In both cases, these value objects,
     * must have in turn an attribute named as the second token of <code>path</code>, and so on.</br>
     * We can say that the two input parameters  <code>valueobjectOrCollection</code> and <code>path</code>  represent a tree of value objects or a collection of
     * trees of value objects (if <code>valueobjectOrCollection</code> is a collection), where the nodes are value objects and the branches
     * are tokens of <code>path</code>. </br>
     * Considering the root (or roots) the level 1, each node value object of level <code>i</code>, let's call it <code>NODE-N</code>, must have an attribute named as the <code>i-th</code> token
     * of <code>path</code>. As we saw such attribute value can be null, or can be a value object, or a not empty collection or an empty collection.
     * If the attribute value is null or empty collection, <code>NODE-N</code> doesn't have any child, so it is a leaf, but it won't be added to the collection to return.
     * If the attribute value is a value object, this is the only child of <code>NODE-N</code>,
     * and it is joined to <code>NODE-N</code> by a branch labeled as the <code>i-th</code> token of <code>path</code>.  If the attribute value is a not empty collection
     * of value objects, all of them are children of <code>NODE-N</code>, and are joined to <code>NODE-N</code> by a branch labeled as the <code>i-th</code> token of <code>path</code>.</br>
     * All the value object that are leaves and that are joined to their parent by the last token of <code>path</code> will be the elements (and the only elements) of the collection
     * to be returned.</br>
     * If no one of the leaves of the tree is suitable to be added to the collection (no one is depth enough) to return an empty collection is returned
     * </br>
     * If  <code>valueobjectOrCollection</code> is null, or <code>path</code> is null or empty string or blank characters string, a null is returned.</br>
     * If  <code>valueobjectOrCollection</code> is an empty collection, an empty collection is returned.</br>
     *
     * @param valueobjectOrCollection this parameter is the value object root of the tree of value objects, or the collection of value object roots of the trees of value objects
     * @param path dot separated list of the attributes that represent the path from the root to the leaves
     * @return a collection holding leaves of depth of the number of tokens of <code>path</code>
     * @throws ApplicationException for any trouble
     */
    public Collection getTreeLeaves(Object valueobjectOrCollection, String path) throws ApplicationException ;


    /**
     * This method has the same behavior of calling in sequence the two methods :</br>
     * {@link #retrievePathReference(Object valueobjectOrCollection, String path)} and </br>
     * {@link it.aco.mandragora.common.utils.BeanCollectionUtils#getTreeLeaves(Object valueobjectOrCollection, String path)} </br>
     * </br>
     *
     * @param valueobjectOrCollection value object root of the tree of value objects, or the collection of value object roots of the trees of value objects
     * @param path dot separated list of the attributes that represent the path from the root to the leaves
     * @return a collection holding leaves of depth of the number of tokens of <code>path</code>
     * @throws ApplicationException   for any trouble
     */
    public Collection retrieveTreeLeaves(Object valueobjectOrCollection, String path) throws ApplicationException ;

    /**
     * @deprecated use {@link #retrieveTreeLeaves(Object valueobjectOrCollection, String path)}
     */
    public Collection getCollectionOfRelatedMToNElements(Object pInstance, String collectionName, String pAttributeName) throws ApplicationException;

    /**
     * This method has the same behavior of calling in sequence the two methods :</br>
     * {@link #retrieveNullPathReference(Object valueobjectOrCollection, String path)}  and </br>
     * {@link #getTreeLeaves(Object valueobjectOrCollection, String path)} </br>
     * </br>
     *
     * @param valueobjectOrCollection value object root of the tree of value objects, or the collection of value object roots of the trees of value objects
     * @param path dot separated list of the attributes that represent the path from the root to the leaves
     * @return a collection holding leaves of depth of the number of tokens of <code>path</code>
     * @throws ApplicationException for any trouble
     */
    public Collection retrieveNullPathTreeLeaves(Object valueobjectOrCollection, String path) throws ApplicationException;



    /**
     * This method adds to and removes elements from a collection on the base of the leaves of a tree of value objects.</br>
     * The collection to add to or remove elements from is <code>pInstance.pAttributeName</code>. If such collection is null an empty one is created.</br>
     * <code>pAttributeName</code> can be directly the name of an attribute of  <code>pInstance</code>, or can be a dot separated list of attributes, that
     * establish a path through value objects from <code>pInstance</code> to the collection we want to add element to or remove from. The path has to be a walk through only value objects,
     * with no collection on its walk, except for the last attribute that must be a collection (note that if <code>pAttributeName</code> is a single token it must be a reference to a collection). If not an ApplicationException is thrown.</br>
     * All the null references to value objects on the path  <code>pAttributeName</code> (so not the reference to the last collection) will be retrieved from the underlying media store.
     * If the collection of the last reference on the path <code>pAttributeName</code> is null, and empty collection will be created (the final collection is never retrieved), and the last reference to the collection
     * will be populated with the created collection, while if some value  object is still null after retrieving, no collection is created, and the method returns</br>
     * The collection implementation class will be the one specified in the mapping file (i.e. repository.xml for Ojb).</br>
     * See {@link it.aco.mandragora.as.ApplicationService#getReferenceCollectionOrEmptyIfNull(Object pInstance, String pAttributeName)}</br>
     * </br>
     * The tree of value objects is represented by <code>pInstance</code>, that is a value object and is the root, and by the input string parameter <code>path</code>,
     * that is a dot separated list of tokens, that are the branches. The root <code>pInstance</code> must have  an attribute named as the first token of <code>path</code>,
     * and  such attribute holds a value object or an other collection of value objects. In both cases, these value objects,
     * must have in turn an attribute named as the second token of <code>path</code>, and so on.</br>
     * Considering the root the level 1, each node value object of level <code>i</code>, let's call it <code>NODE-N</code>, must have an attribute named as the <code>i-th</code> token
     * of <code>path</code>. Such attribute value can be null, or can be a value object, or a not empty collection or an empty collection.
     * If the attribute value is null or empty collection, <code>NODE-N</code> doesn't have any child.
     * If the attribute value is a value object, this is the only child of <code>NODE-N</code>,
     * and it is joined to <code>NODE-N</code> by a branch labeled as the <code>i-th</code> token of <code>path</code>.  If the attribute value is a not empty collection
     * of value objects, all of them are children of <code>NODE-N</code>, and are joined to <code>NODE-N</code> by a branch labeled as the <code>i-th</code> token of <code>path</code>.</br>
     * </br>
     * All the value object that are leaves of such tree, and that have the maximum depth (the depth equal to the number of tokens of <code>path</code>, or in other words
     * the leaves that are joined to their parent by the last token of <code>path</code>), all these leaves will constitute a new collection that we can call <code>treeLeaves</code>.</br>
     * </br>
     * On the base of <code>treeLeaves</code> this method creates a new collection which item class is the same of the item class of the collection <code>pInstance.pAttributeName</code>, and such
     * created collection will be the one whose items not yet present will be added to <code>pInstance.pAttributeName</code>, and the one that if don't hold an item of <code>pInstance.pAttributeName</code>, such item
     * will be removed from the same <code>pInstance.pAttributeName</code>. We call such collection <code>transformedTreeLeaves</code>.</br>
     * If the class of the items of the <code>treeLeaves</code> is already the same of the items of <code>pInstance.pAttributeName</code>, the new collection <code>transformedTreeLeaves</code>
     * will hold all the items of <code>treeLeaves</code>, while if not, a new instance of the class of the items of <code>pInstance.pAttributeName</code> will be created (and added to <code>transformedTreeLeaves</code>)
     * for each items of <code>treeLeaves</code>. </br>
     * The attributes of the array <code>targetPAttributeNames</code> of each elements of <code>transformedTreeLeaves</code> will be set with the values of the attributes <code>sourcePAttributeNames</code>
     * of the correspondent items of <code>treeLeaves</code>. Of course if the items of <code>transformedTreeLeaves</code> are the same of <code>treeLeaves</code>, the method is
     * copying the value of an attribute to an other attribute of the same value object.</br>
     * Then the attributes of the array <code>pAttributeNames</code> of each elements of <code>transformedTreeLeaves</code> will be set with the values of the array <code>valuesArray</code>.</br>
     * Then if the items of <code>transformedTreeLeaves</code> are new instances, the attributes of  <code>attributesComparator</code> of each elements of <code>transformedTreeLeaves</code>
     * will be set with the values of the same attributes of the correspondent value object of <code>treeLeaves</code>.</br>
     * Note that the case of the items of <code>treeLeaves</code> share the same class with the items of <code>pInstance.pAttributeName</code>, it can take place a side effect on the leaves of the tree.</br>
     * Once built the collection <code>transformedTreeLeaves</code>, All the value objects of <code>pInstance.pAttributeName</code> that are not found in <code>transformedTreeLeaves</code> comparing using the array of attributes <code>attributesComparator</code> are
     * removed from the same <code>pInstance.pAttributeName</code>.</br>
     * If the input array parameter <code>attributesComparator</code> is null, <code>attributesComparator</code> will be the primary key attributes name of the class of the elements of the collection <code>pInstance.pAttributeName</code>.</br>
     * Comparing using the same array of attributes <code>attributesComparator</code>, each one of the value objects of <code>transformedTreeLeaves</code> not found in <code>pInstance.pAttributeName</code>,
     * will be added to it.</br>
     * The last, the attributes of the added instance, that are the inverse foreign keys fields to <code>pInstance</code>, will be set
     * with the values of the attributes that are the primary key fields of <code>pInstance</code>.</br>
     * </br>
     * If <code>path</code> is null or empty string, or blank characters string, if  <code>pInstance.pAttributeName</code> is empty nothing is done
     * otherwise <code>pInstance.pAttributeName</code> is cleared.</br>
     * If no one of the leaves of the tree is suitable to be added to the collection (no one is depth enough)
     * <code>pInstance.pAttributeName</code> is cleared.</br>
     *
     * If just one of <code>sourcePAttributeNames</code> and  <code>targetPAttributeNames</code> is null, it will assume the value of the other one.
     * For example if <code>sourcePAttributeNames</code> is null and <code>targetPAttributeNames</code> is not null, <code>sourcePAttributeNames</code> will have the value of <code>targetPAttributeNames</code> (and viceversa).</br>
     * <code>pAttributeNames</code> and <code>valuesArray</code> have to be both null or both not null, and if they are not null must have the same length otherwise an ApplicationException will be thrown.</br>
     *
     * @param pInstance  bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from
     * @param attributesComparator array of the attributes that must have the leaves of the tree and the elements of the collection <code>pInstance.pAttributeName</code>, and that will be used to compare.</br>
     *                              If null <code>attributesComparator</code> will be the primary key attributes name of the class of the elements of the collection <code>pInstance.pAttributeName</code>.
     * @param path  dot separated list of the attributes that represent the path from the root to the leaves of tree of value objects.
     * @param sourcePAttributeNames names of the attributes of the leaves of the tree to use to populate the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>,  attributes whose names are in <code>targetPAttributeNames</code></br>
     *                              If null it will assume the value of <code>targetPAttributeNames</code>
     * @param targetPAttributeNames names of the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>,  to populate with attributes,  whose names are in <code>sourcePAttributeNames</code>, of the leaves of the tree.</br>
     *                              If null it will assume the value of <code>sourcePAttributeNames</code>
     * @param valuesArray  values to use to populate the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>, attributes in <code>pAttributeNames</code>.
     * @param pAttributeNames  names of the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>, to populate with values in <code>valuesArray</code>
     * @throws ApplicationException  for any trouble
     */
    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames) throws ApplicationException;

    /**
     * This method is the same  of calling {@link #addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames)}
     * where <code>valuesArray</code> and  <code>pAttributeNames</code> are null.</br>
     * So it's just the same behavior , except that <code>pAttributeNames</code> are not loaded with <code>valuesArray</code>
     *
     * @param pInstance bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from
     * @param attributesComparator array of the attributes that must have the leaves of the tree and the elements of the collection <code>pInstance.pAttributeName</code>, and that will be used to compare.</br>
     *                              If null <code>attributesComparator</code> will be the primary key attributes name of the class of the elements of the collection <code>pInstance.pAttributeName</code>.
     * @param path  dot separated list of the attributes that represent the path from the root to the leaves of tree of value objects.
     * @param sourcePAttributeNames names of the attributes of the leaves of the tree to use to populate the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>,  attributes whose names are in <code>targetPAttributeNames</code></br>
     *                              If null it will assume the value of <code>targetPAttributeNames</code>
     * @param targetPAttributeNames names of the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>,  to populate with attributes,  whose names are in <code>sourcePAttributeNames</code>, of the leaves of the tree.</br>
     *                              If null it will assume the value of <code>sourcePAttributeNames</code>
     * @throws ApplicationException   for any trouble
     */

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames) throws ApplicationException;

    /**
     * This method is the same  of calling {@link #addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames)}
     * where <code>valuesArray</code> and  <code>pAttributeNames</code> are null and <code>targetPAttributeNames</code> assumes the value of <code>sourcePAttributeNames</code>.</br>
     * So it's just the same behavior , except that <code>pAttributeNames</code> are not loaded with <code>valuesArray</code>, and <code>targetPAttributeNames</code> is the same of <code>sourcePAttributeNames</code>.</br>
     * </br>
     * @param pInstance bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from
     * @param attributesComparator array of the attributes that must have the leaves of the tree and the elements of the collection <code>pInstance.pAttributeName</code>, and that will be used to compare.</br>
     *                              If null <code>attributesComparator</code> will be the primary key attributes name of the class of the elements of the collection <code>pInstance.pAttributeName</code>.
     * @param path  dot separated list of the attributes that represent the path from the root to the leaves of tree of value objects.
     * @param sourcePAttributeNames names of the attributes of the leaves of the tree to use to populate the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>,  attributes whose names are in <code>sourcePAttributeNames</code> as well.</br>
     * @throws ApplicationException   for any trouble
     */
    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path,  String[] sourcePAttributeNames) throws ApplicationException;

    /**
     * This method is the same  of calling {@link #addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames)}
     * where <code>valuesArray</code>, <code>pAttributeNames</code>,<code>targetPAttributeNames</code> and <code>sourcePAttributeNames</code>  are null.</br>
     * So it's just the same behavior , except that <code>pAttributeNames</code> are not loaded with <code>valuesArray</code>,
     * and the attributes <code>targetPAttributeNames</code> of the elements of <code>pInstance.pAttributeName</code>  are not loaded with the attributes <code>sourcePAttributeNames</code> of the tree leaves.</br>
     *
     * @param pInstance bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from.
     * @param attributesComparator array of the attributes that must have the leaves of the tree and the elements of the collection <code>pInstance.pAttributeName</code>, and that will be used to compare.</br>
     *                              If null <code>attributesComparator</code> will be the primary key attributes name of the class of the elements of the collection <code>pInstance.pAttributeName</code>.
     * @param path  dot separated list of the attributes that represent the path from the root to the leaves of tree of value objects.
     *
     * @throws ApplicationException  for any trouble
     */
    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path) throws ApplicationException;

    /**
     * This method is the same  of calling {@link #addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames)}
     * where <code>targetPAttributeNames</code> assumes the value of <code>sourcePAttributeNames</code>.</br>
     * So it's just the same behavior, except that <code>targetPAttributeNames</code> is the same of <code>sourcePAttributeNames</code>.</br>
     *
     * @param pInstance bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from.
     * @param attributesComparator array of the attributes that must have the leaves of the tree and the elements of the collection <code>pInstance.pAttributeName</code>, and that will be used to compare.</br>
     *                              If null <code>attributesComparator</code> will be the primary key attributes name of the class of the elements of the collection <code>pInstance.pAttributeName</code>.
     * @param path  dot separated list of the attributes that represent the path from the root to the leaves of tree of value objects.
     * @param sourcePAttributeNames sourcePAttributeNames names of the attributes of the leaves of the tree to use to populate the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>,  attributes whose names are in <code>sourcePAttributeNames</code> as well.</br>
     * @param valuesArray  values to use to populate the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>, attributes in <code>pAttributeNames</code>.
     * @param pAttributeNames  names of the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>, to populate with values in <code>valuesArray</code>
     * @throws ApplicationException for any trouble
     */
    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames) throws ApplicationException;

    /**
     * This method is the same  of calling {@link #addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames)}
     * where <code>targetPAttributeNames</code> and <code>sourcePAttributeNames</code>  are null.</br>
     * So it's just the same behavior , except that attributes <code>targetPAttributeNames</code> of the elements of <code>pInstance.pAttributeName</code>  are not loaded with the attributes <code>sourcePAttributeNames</code> of the tree leaves.</br>
     *
     * @param pInstance bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from.
     * @param attributesComparator array of the attributes that must have the leaves of the tree and the elements of the collection <code>pInstance.pAttributeName</code>, and that will be used to compare.</br>
     *                              If null <code>attributesComparator</code> will be the primary key attributes name of the class of the elements of the collection <code>pInstance.pAttributeName</code>.
     * @param path array of the attributes that must have the leaves of the tree and the elements of the collection <code>pInstance.pAttributeName</code>, and that will be used to compare.</br>
     *                              If null <code>attributesComparator</code> will be the primary key attributes name of the class of the elements of the collection <code>pInstance.pAttributeName</code>.
     * @param valuesArray  values to use to populate the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>, attributes in <code>pAttributeNames</code>.
     * @param pAttributeNames  names of the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>, to populate with values in <code>valuesArray</code>
     * @throws ApplicationException  for any trouble
     */
    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path,Object[] valuesArray, String[] pAttributeNames) throws ApplicationException;


    /**
     * This method is the same  of calling {@link #addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames)}
     * where <code>attributesComparator</code> is null.</br>
     * So it's just the same behavior , except that <code>attributesComparator</code> will be the primary key attributes name of the class of the elements of the collection <code>pInstance.pAttributeName</code>.</br>
     *
     * @param pInstance  bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from
     * @param path  dot separated list of the attributes that represent the path from the root to the leaves of tree of value objects.
     * @param sourcePAttributeNames names of the attributes of the leaves of the tree to use to populate the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>,  attributes whose names are in <code>targetPAttributeNames</code></br>
     *                              If null it will assume the value of <code>targetPAttributeNames</code>
     * @param targetPAttributeNames names of the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>,  to populate with attributes,  whose names are in <code>sourcePAttributeNames</code>, of the leaves of the tree.</br>
     *                              If null it will assume the value of <code>sourcePAttributeNames</code>
     * @param valuesArray  values to use to populate the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>, attributes in <code>pAttributeNames</code>.
     * @param pAttributeNames  names of the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>, to populate with values in <code>valuesArray</code>
     * @throws ApplicationException
     */
    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames) throws ApplicationException;

    /**
     * This method is the same  of calling {@link #addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames)}
     * where <code>attributesComparator</code> is null and <code>valuesArray</code> and  <code>pAttributeNames</code> are null.</br>
     * So it's just the same behavior , except that <code>attributesComparator</code> will be the primary key attributes name of the class of the elements of the collection <code>pInstance.pAttributeName</code>
     * and <code>pAttributeNames</code> are not loaded with <code>valuesArray</code>..</br>
     *
     * @param pInstance  bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from
     * @param path  dot separated list of the attributes that represent the path from the root to the leaves of tree of value objects.
     * @param sourcePAttributeNames names of the attributes of the leaves of the tree to use to populate the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>,  attributes whose names are in <code>targetPAttributeNames</code></br>
     *                              If null it will assume the value of <code>targetPAttributeNames</code>
     * @param targetPAttributeNames names of the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>,  to populate with attributes,  whose names are in <code>sourcePAttributeNames</code>, of the leaves of the tree.</br>
     *                              If null it will assume the value of <code>sourcePAttributeNames</code>
     * @throws ApplicationException  for any trouble
     */
    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames) throws ApplicationException;

    /**
     * This method is the same  of calling {@link #addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames)}
     * where <code>attributesComparator</code> is null and <code>valuesArray</code> and  <code>pAttributeNames</code> are null,and <code>targetPAttributeNames</code> assumes the value of <code>sourcePAttributeNames</code>.</br>
     * So it's just the same behavior , except that <code>attributesComparator</code> will be the primary key attributes name of the class of the elements of the collection <code>pInstance.pAttributeName</code>
     * and <code>pAttributeNames</code> are not loaded with <code>valuesArray</code> and <code>targetPAttributeNames</code> is the same of <code>sourcePAttributeNames</code>.</br>
     *
     * @param pInstance  bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from
     * @param path  dot separated list of the attributes that represent the path from the root to the leaves of tree of value objects.
     * @param sourcePAttributeNames names of the attributes of the leaves of the tree to use to populate the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>,  attributes whose names are in <code>sourcePAttributeNames</code> as well.</br>
     * @throws ApplicationException for any trouble
     */
    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames) throws ApplicationException;

    /**
     * This method is the same  of calling {@link #addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames)}
     * where <code>attributesComparator</code> is null and <code>valuesArray</code> and  <code>pAttributeNames</code> are null,and <code>targetPAttributeNames</code> and <code>sourcePAttributeNames</code> are null too.</br>
     * So it's just the same behavior , except that <code>attributesComparator</code> will be the primary key attributes name of the class of the elements of the collection <code>pInstance.pAttributeName</code>
     * and <code>pAttributeNames</code> are not loaded with <code>valuesArray</code> and the attributes <code>targetPAttributeNames</code> of the elements of <code>pInstance.pAttributeName</code>  are not loaded with the attributes <code>sourcePAttributeNames</code> of the tree leaves.</br>
     *
     * @param pInstance  bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from
     * @param path  dot separated list of the attributes that represent the path from the root to the leaves of tree of value objects.
     * @throws ApplicationException   for any trouble
     */
    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path) throws ApplicationException;

    /**
     * This method is the same  of calling {@link #addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames)}
     * where <code>attributesComparator</code> is null and <code>targetPAttributeNames</code> assumes the value of <code>sourcePAttributeNames</code>.</br>
     * So it's just the same behavior, except that <code>attributesComparator</code> will be the primary key attributes name of the class of the elements of the collection <code>pInstance.pAttributeName</code> and
     * <code>targetPAttributeNames</code> is the same of <code>sourcePAttributeNames</code>.</br>
     *
     * @param pInstance  bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from
     * @param path  dot separated list of the attributes that represent the path from the root to the leaves of tree of value objects.
     * @param sourcePAttributeNames  sourcePAttributeNames names of the attributes of the leaves of the tree to use to populate the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>,  attributes whose names are in <code>sourcePAttributeNames</code> as well.</br>
     * @param valuesArray  values to use to populate the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>, attributes in <code>pAttributeNames</code>.
     * @param pAttributeNames  names of the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>, to populate with values in <code>valuesArray</code>
     * @throws ApplicationException   for any trouble
     */
    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames) throws ApplicationException;
    /**
     * This method is the same  of calling {@link #addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames)}
     * where <code>attributesComparator</code> is null and <code>targetPAttributeNames</code> and <code>sourcePAttributeNames</code>  are null.</br>
     * So it's just the same behavior , except that <code>attributesComparator</code> will be the primary key attributes name of the class of the elements of the collection <code>pInstance.pAttributeName</code> and
     * attributes <code>targetPAttributeNames</code> of the elements of <code>pInstance.pAttributeName</code>  are not loaded with the attributes <code>sourcePAttributeNames</code> of the tree leaves.</br>
     *
     * @param pInstance bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from.
     * @param path array of the attributes that must have the leaves of the tree and the elements of the collection <code>pInstance.pAttributeName</code>, and that will be used to compare.</br>
     *                              If null <code>attributesComparator</code> will be the primary key attributes name of the class of the elements of the collection <code>pInstance.pAttributeName</code>.
     * @param valuesArray  values to use to populate the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>, attributes in <code>pAttributeNames</code>.
     * @param pAttributeNames  names of the attributes of the created instances of the class of the elements of the collection <code>pInstance.pAttributeName</code>, to populate with values in <code>valuesArray</code>
     * @throws ApplicationException  for any trouble
     */
    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,Object[] valuesArray, String[] pAttributeNames) throws ApplicationException;


    /**
     * This method adds to and removes elements from a collection on the base of the nodes of a tree of value objects.</br>
     * The collection to add to or remove elements from is <code>pInstance.pAttributeName</code>. If such collection is null an empty one is created.</br>
     * <code>pAttributeName</code> can be directly the name of an attribute of <code>pInstance</code>, or can be a dot separated list of attributes, that
     * establish a path through value objects from <code>pInstance</code> to the collection we want to add element to or remove from. <code>pAttributeName</code> has to be a walk through only value objects,
     * with no collection on his walk, except for the last attribute that must be a collection (note that if <code>pAttributeName</code> is a single token it must be a reference to a collection). If not an ApplicationException is thrown.</br>
     * All the null references to value objects on the path  <code>pAttributeName</code> (so not the reference to the last collection) will be retrieved from the underlying media store.
     * If the collection of the last reference on the path <code>pAttributeName</code> is null, and empty collection will be created (the final collection is never retrieved), and the last reference to the collection
     * will be populated with the created collection, while if some value object is still null after retrieving, no collection is created, and the method returns</br>
     * The collection implementation class will be the one specified in the mapping file (i.e. repository.xml for Ojb).</br>
     * See {@link it.aco.mandragora.as.ApplicationService#getReferenceCollectionOrEmptyIfNull(Object pInstance, String pAttributeName)}.</br>
     * </br>
     * Once established which is the collection to add elements to or remove from, let's introduce which is the value objects tree.
     * The tree of value objects is identified by the two input parameter <code>pInstance</code> and <code>path</code>.</br>
     * The root of the tree is <code>pInstance</code>. The input parameter <code>path</code> is a dot separated list of attributes. The first attribute must be an attribute
     * of <code>pInstance</code>, that can be a  value object or a collection of value objects. If it is a value object, this one must have an attribute named as the second
     * attribute of the input parameter <code>path</code>, that in turn can be a value object or a collection of value objects, while if it is a collection of value object, each of them must have an attribute named as the second
     * attribute of <code>path</code>, that in turn can be a value object or a collection of value objects. Applying this rule recursively for all the attributes of path, the tree is identified.</br>
     * If <code>path</code> is null, it will be considered empty string (tree with just the root.)</br>
     *  </br>
     * Such tree of value objects is used to create a collection (that we can call collection to compare) which elements will be added to the collection <code>pInstance.pAttributeName</code>, and all the elements
     * of <code>pInstance.pAttributeName</code> not present in the created collection will be removed from <code>pInstance.pAttributeName</code>.</br>  The comparation to decide
     * if an element of the collection to compare belongs to <code>pInstance.pAttributeName</code> and viceversa is done on the base of <code>pkNames</code>.
     * The collection to compare is built in the following way.</br>
     * For each walk from the root to each leaf that is the end of <code>path</code> (no null value object or null or empty collection have forbidden to reach the end of the dot separated list of attributes)
     * a new instance of the class of the items of <code>pInstance.pAttributeName</code> is created and added to the same collection.</br>
     * Some, or all, of the attributes of the created instance is set with values that are collected during the corresponding walk from the root to the leaf.</br>
     * The attributes of the created instance to set are the ones specified by the input parameter <code>pkNames</code>, and by the input parameter <code>nodeTargetPAttributeNames</code>.</br>
     * If <code>pkNames</code> is null in its place will be considered the primary key attributes names of the class of the items of <code>pInstance.pAttributeName</code>, primary key attributes names that are specified in the mapping file (i.e. repository.xml for Ojb).</br>
     * The values to use to set the the created instance attributes specified by <code>pkNames</code>, are the primary key values of all the nodes on the walk from the root (<code>pInstance</code>) to the specific leaf,
     * but for each node are discarded the inverse foreign keys to its parent, if the node belongs to a one to N collection
     * of the parent (the attribute of <code>path</code> used for the parent's children is a collection), and are discarded the foreign key to its child, if the link to its child is an attribute holding a value object and not a collection.</br>
     * The input parameter <code>nodeTargetPAttributeNames</code> specifies other attributes names of the created instance, that will be set with the values of the attributes of the value objects of the walk, attributes
     * whose names are specified by the input parameter <code>nodeSourcePAttributeNames</code>.
     * Both <code>nodeTargetPAttributeNames</code> and <code>nodeSourcePAttributeNames</code> are arrays of arrays of attributes names; the first one is of arrays of the created instance attributes,
     * while the second one is of arrays of the node of the tree attributes.</br>
     * For a node of depth <code>i</code> (considering the root of depth 0) on the path from the root to the leaf, the attributes names in the
     * array  <code>nodeTargetPAttributeNames[depth]</code>  of the created instance  will be set with the values of the attributes of the current node whose names are specified in <code>nodeSourcePAttributeNames[depth]</code>
     * if <code>nodeTargetPAttributeNames[depth]</code>  and <code>nodeSourcePAttributeNames[depth]</code> are not null.
     * Once the attributes of <code>pkNames</code> and of all arrays of <code>nodeTargetPAttributeNames</code> for the created instance are set,
     * all the attribute of this instance whose names are in <code>pAttributeNames</code> will be set with the corresponding values of <code>valuesArray</code>.</br>
     * See {@link it.aco.mandragora.as.ApplicationService#createCollectionWithTreeNodes(Class, Class, String[], Object, String, String[][], String[][], String[], Object[])}.</br>
     * </br>
     * At the end all the inverse foreign keys attributes of the elements of <code>pInstance.pAttributeName</code> will be set (See {@link it.aco.mandragora.as.ApplicationService#setInverseForeignKeyFields(Object, String)})
     * </br>
     *
     * @param pInstance bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from.
     * @param pkNames arrays holding the attribute names of elements of the collection <code>pInstance.pAttributeName</code> that will be set with key values of the nodes. If null in his place will be considered the primary key attributes names of the class of the instances of <code>pInstance.pAttributeName</code> specified in the mapping file (i.e. repository.xml for Ojb).
     * @param path dot separated list of attributes that specifies the tree of root <code>pInstance</code>. If null it will be considered empty string.
     * @param nodeSourcePAttributeNames array of arrays of attributes names. For a node of a depth, <code>nodeSourcePAttributeNames[depth]</code> is an array holding the attributes names of the node
     *                                  which values have to be used to set the attributes of a created instance of the class of the items of  <code>pInstance.pAttributeName</code> whose names are in <code>nodeTargetPAttributeNames[depth]</code>.
     * @param nodeTargetPAttributeNames array of arrays of attributes names. For a node of a depth, <code>nodeTargetPAttributeNames[depth]</code> elements
     *                                   have to be set with the values of the attributes in <code>nodeSourcePAttributeNames[depth]</code> of some node in the tree.
     * @param pAttributeNames names of the class of the items of  <code>pInstance.pAttributeName</code>  attributes to populate with values in <code>valuesArray</code>
     * @param valuesArray values to use to populate the created instances of the class of the items of  <code>pInstance.pAttributeName</code> attributes in <code>pAttributeNames</code>.
     * @throws ApplicationException if <code>pInstance</code> is null;</br>
     *     If <code>nodeSourcePAttributeNames</code> and <code>nodeTargetPAttributeNames</code>  are not both null must have the same length, that must be the number of token of <code>path</code> more 1 otherwise an ApplicationException is thrown.</br>
     *     For each level (depth) of the tree, <code>nodeSourcePAttributeNames[depth]</code> and <code>nodeTargetPAttributeNames[depth]</code> must be bot null or both not null, and
     *     if not null must have the same length otherwise an ApplicationException is thrown.</br>
     *     When the method reaches a leaf, the built array of primary key values must have reached the same length of <code>pkNames</code> otherwise an ApplicationException is thrown.</br>
     *     <code>pAttributeNames</code> and <code>valuesArray</code> have to be both null or both not null, and if they are not null must have the same length otherwise an ApplicationException will be thrown..</br>
     */
    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray) throws ApplicationException;

    /**
     * This method is the same  of calling  {@link #addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray) }
     * where  <code>pAttributeNames</code> and <code>valuesArray</code>are null.</br>
     * So it's just the same behavior , except that <code>pAttributeNames</code> of the created instances of the elements of  <code>pInstance.pAttributeName</code> are not loaded with <code>valuesArray</code>.</br>
     *
     * @param pInstance bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from.
     * @param pkNames arrays holding the attribute names of elements of the collection <code>pInstance.pAttributeName</code> that will be set with key values of the nodes. If null in his place will be considered the primary key attributes names of the class of the instances of <code>pInstance.pAttributeName</code> specified in the mapping file (i.e. repository.xml for Ojb).
     * @param path dot separated list of attributes that specifies the tree of root <code>pInstance</code>. If null it will be considered empty string.
     * @param nodeSourcePAttributeNames array of arrays of attributes names. For a node of a depth, <code>nodeSourcePAttributeNames[depth]</code> is an array holding the attributes names of the node
     *                                  which values have to be used to set the attributes of a created instance of the class of the items of  <code>pInstance.pAttributeName</code> whose names are in <code>nodeTargetPAttributeNames[depth]</code>.
     * @param nodeTargetPAttributeNames array of arrays of attributes names. For a node of a depth, <code>nodeTargetPAttributeNames[depth]</code> elements
     *                                   have to be set with the values of the attributes in <code>nodeSourcePAttributeNames[depth]</code> of some node in the tree.
     *
     * @throws ApplicationException if <code>pInstance</code> is null;</br>
     *     If <code>nodeSourcePAttributeNames</code> and <code>nodeTargetPAttributeNames</code>  are not both null  must have the same length, that must be the number of token of <code>path</code> more 1 otherwise an ApplicationException is thrown.</br>
     *     For each level (depth) of the tree, <code>nodeSourcePAttributeNames[depth]</code> and <code>nodeTargetPAttributeNames[depth]</code> must be bot null or both not null, and
     *     if not null must have the same length otherwise an ApplicationException is thrown.</br>
     *     When the method reaches a leaf, the built array of primary key values must have reached the same length of <code>pkNames</code> otherwise an ApplicationException is thrown.</br>
     */
    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames) throws ApplicationException;

    /**
     * This method is the same  of calling  {@link #addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray) }
     * where  <code>pAttributeNames</code> and <code>valuesArray</code>are null and  <code>nodeTargetPAttributeNames</code> is the same of <code>nodeSourcePAttributeNames</code> .</br>
     * So it's just the same behavior , except that <code>pAttributeNames</code> of the created instances of the elements of  <code>pInstance.pAttributeName</code> are not loaded with <code>valuesArray</code> and
     * that attributes of  the created instances of the elements of  <code>pInstance.pAttributeName</code> to be populated with the attributes of the generic tree nodes, attributes whose names are specified by <code>nodeSourcePAttributeNames</code>,
     * have the same names of  the same <code>nodeSourcePAttributeNames</code>.</br>
     *
     * @param pInstance bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from.
     * @param pkNames arrays holding the attribute names of elements of the collection <code>pInstance.pAttributeName</code> that will be set with key values of the nodes. If null in his place will be considered the primary key attributes names of the class of the instances of <code>pInstance.pAttributeName</code> specified in the mapping file (i.e. repository.xml for Ojb).
     * @param path dot separated list of attributes that specifies the tree of root <code>pInstance</code>. If null it will be considered empty string.
     * @param nodeSourcePAttributeNames array of arrays of attributes names. For a node of a depth, <code>nodeSourcePAttributeNames[depth]</code> is an array holding the attributes names of the node
     *                                  which values have to be used to set the attributes of a created instance of the class of the items of  <code>pInstance.pAttributeName</code> with the same names</code>.
     * @throws ApplicationException if <code>pInstance</code> is null;</br>
     *     When the method reaches a leaf, the built array of primary key values must have reached the same length of <code>pkNames</code> otherwise an ApplicationException is thrown.</br>
     */
    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames) throws ApplicationException;

    /**
     * This method is the same  of calling  {@link #addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray) }
     * where  <code>pAttributeNames</code> and <code>valuesArray</code>are null, and <code>nodeTargetPAttributeNames</code> and <code>nodeSourcePAttributeNames</code>  are null too.</br>
     * So it's just the same behavior , except that <code>pAttributeNames</code> of the created instances of the elements of  <code>pInstance.pAttributeName</code> are not loaded with <code>valuesArray</code>
     * and moreover than the primary key attributes values of the tree nodes that are used to populate the
     * attributes specified by <code>pkNames</code>, no other attributes of the tree nodes are used to populate the attributes of the created items of  <code>pInstance.pAttributeName.</br>
     *
     * @param pInstance bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from.
     * @param pkNames arrays holding the attribute names of elements of the collection <code>pInstance.pAttributeName</code> that will be set with key values of the nodes. If null in his place will be considered the primary key attributes names of the class of the instances of <code>pInstance.pAttributeName</code> specified in the mapping file (i.e. repository.xml for Ojb).
     * @param path dot separated list of attributes that specifies the tree of root <code>pInstance</code>. If null it will be considered empty string.
     * @throws ApplicationException if <code>pInstance</code> is null;</br>
     *     When the method reaches a leaf, the built array of primary key values must have reached the same length of <code>pkNames</code> otherwise an ApplicationException is thrown.</br>
     */
    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path) throws ApplicationException;

    /**
     * This method is the same  of calling  {@link #addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray) }
     * where  <code>pAttributeNames</code> and <code>valuesArray</code>are null, and <code>pkNames</code> and <code>nodeTargetPAttributeNames</code> and <code>nodeSourcePAttributeNames</code>  are null too.</br>
     * So it's just the same behavior , except that <code>pAttributeNames</code> of the created instances of the elements of  <code>pInstance.pAttributeName</code> are not loaded with <code>valuesArray</code> and
     * <code>pkNames</code> are the primary key attributes names of the class of the instances of <code>pInstance.pAttributeName</code> specified in the mapping file (i.e. repository.xml for Ojb)
     * and moreover than the primary key attributes values of the tree nodes that are used to populate the
     * attributes specified by <code>pkNames</code>, no other attributes of the tree nodes are used to populate the attributes of the created items of  <code>pInstance.pAttributeName.</br>
     *
     * @param pInstance bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from.
     * @param path dot separated list of attributes that specifies the tree of root <code>pInstance</code>. If null it will be considered empty string.
     * @throws ApplicationException if <code>pInstance</code> is null;</br>
     *     When the method reaches a leaf, the built array of primary key values must have reached the same length of the primary key attributes names of the class of the instances of <code>pInstance.pAttributeName</code> specified in the mapping file (i.e. repository.xml for Ojb) otherwise an ApplicationException is thrown.</br>
     */
    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path) throws ApplicationException;


    /**
     * This method is the same  of calling  {@link #addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray) }
     * where  <code>pAttributeNames</code> and <code>valuesArray</code> and <code>pkNames</code> are null.</br>
     * So it's just the same behavior , except that <code>pAttributeNames</code> of the created instances of the elements of  <code>pInstance.pAttributeName</code> are not loaded with <code>valuesArray</code> and
     * <code>pkNames</code> are the primary key attributes names of the class of the instances of <code>pInstance.pAttributeName</code> specified in the mapping file (i.e. repository.xml for Ojb)
     *
     * @param pInstance bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from.
     * @param path dot separated list of attributes that specifies the tree of root <code>pInstance</code>. If null it will be considered empty string.
     * @param nodeSourcePAttributeNames array of arrays of attributes names. For a node of a depth, <code>nodeSourcePAttributeNames[depth]</code> is an array holding the attributes names of the node
     *                                  which values have to be used to set the attributes of a created instance of the class of the items of  <code>pInstance.pAttributeName</code> whose names are in <code>nodeTargetPAttributeNames[depth]</code>.
     * @param nodeTargetPAttributeNames array of arrays of attributes names. For a node of a depth, <code>nodeTargetPAttributeNames[depth]</code> elements
     *                                   have to be set with the values of the attributes in <code>nodeSourcePAttributeNames[depth]</code> of some node in the tree.
     * @throws ApplicationException if <code>pInstance</code> is null;</br>
     *     If <code>nodeSourcePAttributeNames</code> and <code>nodeTargetPAttributeNames</code>  are not both null  must have the same length, that must be the number of token of <code>path</code> more 1 otherwise an ApplicationException is thrown.</br>
     *     For each level (depth) of the tree, <code>nodeSourcePAttributeNames[depth]</code> and <code>nodeTargetPAttributeNames[depth]</code> must be bot null or both not null, and
     *     if not null must have the same length otherwise an ApplicationException is thrown.</br>
     *     When the method reaches a leaf, the built array of primary key values must have reached the same length of the primary key attributes names of the class of the instances of <code>pInstance.pAttributeName</code> specified in the mapping file (i.e. repository.xml for Ojb) otherwise an ApplicationException is thrown.</br>
     */
    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames) throws ApplicationException;

    /**
     * This method is the same  of calling  {@link #addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray) }
     * where  <code>pAttributeNames</code> and <code>valuesArray</code> and <code>pkNames</code> are null, and  <code>nodeTargetPAttributeNames</code> is the same of <code>nodeSourcePAttributeNames</code> .</br>.</br>
     * So it's just the same behavior , except that <code>pAttributeNames</code> of the created instances of the elements of  <code>pInstance.pAttributeName</code> are not loaded with <code>valuesArray</code> and
     * and except that attributes of  the created instances of the elements of  <code>pInstance.pAttributeName</code> to be populated with the attributes of the generic tree nodes, attributes whose names are specified by <code>nodeSourcePAttributeNames</code>,
     * have the same names of  the same <code>nodeSourcePAttributeNames</code>,
     * and except that <code>pkNames</code> are the primary key attributes names of the class of the instances of <code>pInstance.pAttributeName</code> specified in the mapping file (i.e. repository.xml for Ojb).</br>
     *
     * @param pInstance bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from.
     * @param path dot separated list of attributes that specifies the tree of root <code>pInstance</code>. If null it will be considered empty string.
     * @param nodeSourcePAttributeNames array of arrays of attributes names. For a node of a depth, <code>nodeSourcePAttributeNames[depth]</code> is an array holding the attributes names of the node
     *        which values have to be used to set the attributes of a created instance of the class of the items of  <code>pInstance.pAttributeName</code> with the same names</code>.
     * @throws ApplicationException if <code>pInstance</code> is null;</br>
     *     When the method reaches a leaf, the built array of primary key values must have reached the same length of the primary key attributes names of the class of the instances of <code>pInstance.pAttributeName</code> specified in the mapping file (i.e. repository.xml for Ojb) otherwise an ApplicationException is thrown.</br>
     */
    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames) throws ApplicationException;

    /**
     * This method is the same  of calling  {@link #addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray) }
     * where  <code>nodeTargetPAttributeNames</code> is the same of <code>nodeSourcePAttributeNames</code> .</br>
     * So it's just the same behavior , except that  attributes of  the created instances of the elements of  <code>pInstance.pAttributeName</code> to be populated with the attributes of the generic tree nodes, attributes whose names are specified by <code>nodeSourcePAttributeNames</code>,
     * have the same names of  the same <code>nodeSourcePAttributeNames</code>.</br>
     *
     * @param pInstance bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from.
     * @param pkNames arrays holding the attribute names of elements of the collection <code>pInstance.pAttributeName</code> that will be set with key values of the nodes. If null in his place will be considered the primary key attributes names of the class of the instances of <code>pInstance.pAttributeName</code> specified in the mapping file (i.e. repository.xml for Ojb).
     * @param path dot separated list of attributes that specifies the tree of root <code>pInstance</code>. If null it will be considered empty string.
     * @param nodeSourcePAttributeNames array of arrays of attributes names. For a node of a depth, <code>nodeSourcePAttributeNames[depth]</code> is an array holding the attributes names of the node
     *                                  which values have to be used to set the attributes of a created instance of the class of the items of  <code>pInstance.pAttributeName</code> with the same names</code>.
     *
     * @param pAttributeNames names of the class of the items of  <code>pInstance.pAttributeName</code>  attributes to populate with values in <code>valuesArray</code>
     * @param valuesArray values to use to populate the created instances of the class of the items of  <code>pInstance.pAttributeName</code> attributes in <code>pAttributeNames</code>.
     * @throws ApplicationException if <code>pInstance</code> is null;</br>
     *     When the method reaches a leaf, the built array of primary key values must have reached the same length of <code>pkNames</code> otherwise an ApplicationException is thrown.</br>
     *     <code>pAttributeNames</code> and <code>valuesArray</code> have to be both null or both not null, and if they are not null must have the same length otherwise an ApplicationException will be thrown..</br>
     */
    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[] pAttributeNames,Object[] valuesArray) throws ApplicationException;

    /**
     * This method is the same  of calling  {@link #addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray) }
     * where  both <code>nodeTargetPAttributeNames</code> and  <code>nodeSourcePAttributeNames</code> are null.</br>
     * So it's just the same behavior , except that  and moreover than the primary key attributes values of the tree nodes that are used to populate the
     * attributes specified by <code>pkNames</code>, no other attributes of the tree nodes are used to populate the attributes of the created items of  <code>pInstance.pAttributeName.</br>
     *
     * @param pInstance bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from.
     * @param pkNames arrays holding the attribute names of elements of the collection <code>pInstance.pAttributeName</code> that will be set with key values of the nodes. If null in his place will be considered the primary key attributes names of the class of the instances of <code>pInstance.pAttributeName</code> specified in the mapping file (i.e. repository.xml for Ojb).
     * @param path dot separated list of attributes that specifies the tree of root <code>pInstance</code>. If null it will be considered empty string.
     * @param pAttributeNames names of the class of the items of  <code>pInstance.pAttributeName</code>  attributes to populate with values in <code>valuesArray</code>
     * @param valuesArray values to use to populate the created instances of the class of the items of  <code>pInstance.pAttributeName</code> attributes in <code>pAttributeNames</code>.
     * @throws ApplicationException if <code>pInstance</code> is null;</br>
     *     When the method reaches a leaf, the built array of primary key values must have reached the same length of <code>pkNames</code> otherwise an ApplicationException is thrown.</br>
     *     <code>pAttributeNames</code> and <code>valuesArray</code> have to be both null or both not null, and if they are not null must have the same length otherwise an ApplicationException will be thrown..</br>
     */
    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[] pAttributeNames,Object[] valuesArray) throws ApplicationException;

    /**
     * This method is the same  of calling  {@link #addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray) }
     * where  both <code>nodeTargetPAttributeNames</code> and  <code>nodeSourcePAttributeNames</code> and <code>pkNames</code> are null.</br>
     * So it's just the same behavior , except that
     * <code>pkNames</code> are the primary key attributes names of the class of the instances of <code>pInstance.pAttributeName</code> specified in the mapping file (i.e. repository.xml for Ojb)
     * and moreover than the primary key attributes values of the tree nodes that are used to populate the
     * attributes specified by <code>pkNames</code>, no other attributes of the tree nodes are used to populate the attributes of the created items of  <code>pInstance.pAttributeName.</br>
     *
     * @param pInstance  bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from.
     * @param path dot separated list of attributes that specifies the tree of root <code>pInstance</code>. If null it will be considered empty string.
     * @param pAttributeNames  names of the class of the items of  <code>pInstance.pAttributeName</code>  attributes to populate with values in <code>valuesArray</code>
     * @param valuesArray values to use to populate the created instances of the class of the items of  <code>pInstance.pAttributeName</code> attributes in <code>pAttributeNames</code>.
     * @throws ApplicationException if <code>pInstance</code> is null;</br>
     *     When the method reaches a leaf, the built array of primary key values must have reached the same length of the primary key attributes names of the class of the instances of <code>pInstance.pAttributeName</code> specified in the mapping file (i.e. repository.xml for Ojb) otherwise an ApplicationException is thrown.</br>
     *     <code>pAttributeNames</code> and <code>valuesArray</code> have to be both null or both not null, and if they are not null must have the same length otherwise an ApplicationException will be thrown..</br>
     */
    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[] pAttributeNames,Object[] valuesArray) throws ApplicationException;

    /**
     * This method is the same  of calling  {@link #addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray) }
     * where  <code>pkNames</code> is null.</br>
     * So it's just the same behavior , except that
     * <code>pkNames</code> are the primary key attributes names of the class of the instances of <code>pInstance.pAttributeName</code> specified in the mapping file (i.e. repository.xml for Ojb)
     *
     * @param pInstance  bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from.
     * @param path dot separated list of attributes that specifies the tree of root <code>pInstance</code>. If null it will be considered empty string.
     * @param nodeSourcePAttributeNames array of arrays of attributes names. For a node of a depth, <code>nodeSourcePAttributeNames[depth]</code> is an array holding the attributes names of the node
     *                                  which values have to be used to set the attributes of a created instance of the class of the items of  <code>pInstance.pAttributeName</code> whose names are in <code>nodeTargetPAttributeNames[depth]</code>.
     * @param nodeTargetPAttributeNames array of arrays of attributes names. For a node of a depth, <code>nodeTargetPAttributeNames[depth]</code> elements
     *                                   have to be set with the values of the attributes in <code>nodeSourcePAttributeNames[depth]</code> of some node in the tree.
     * @param pAttributeNames names of the class of the items of  <code>pInstance.pAttributeName</code>  attributes to populate with values in <code>valuesArray</code>
     * @param valuesArray values to use to populate the created instances of the class of the items of  <code>pInstance.pAttributeName</code> attributes in <code>pAttributeNames</code>.
     * @throws ApplicationException if <code>pInstance</code> is null;</br>
     *     If <code>nodeSourcePAttributeNames</code> and <code>nodeTargetPAttributeNames</code>  are not both null  must have the same length, that must be the number of token of <code>path</code> more 1 otherwise an ApplicationException is thrown.</br>
     *     For each level (depth) of the tree, <code>nodeSourcePAttributeNames[depth]</code> and <code>nodeTargetPAttributeNames[depth]</code> must be bot null or both not null, and
     *     if not null must have the same length otherwise an ApplicationException is thrown.</br>
     *     When the method reaches a leaf, the built array of primary key values must have reached the same length of the primary key attributes names of the class of the instances of <code>pInstance.pAttributeName</code> specified in the mapping file (i.e. repository.xml for Ojb) otherwise an ApplicationException is thrown.</br>
     *     <code>pAttributeNames</code> and <code>valuesArray</code> have to be both null or both not null, and if they are not null must have the same length otherwise an ApplicationException will be thrown..</br>
     */
    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray) throws ApplicationException;

    /**
     * This method is the same  of calling  {@link #addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray) }
     * where  <code>pkNames</code> is null and <code>nodeTargetPAttributeNames</code> is the same of <code>nodeSourcePAttributeNames</code> </br>
     * So it's just the same behavior , except that
     * <code>pkNames</code> are the primary key attributes names of the class of the instances of <code>pInstance.pAttributeName</code> specified in the mapping file (i.e. repository.xml for Ojb)
     * and except that  attributes of  the created instances of the elements of  <code>pInstance.pAttributeName</code> to be populated with the attributes of the generic tree nodes, attributes whose names are specified by <code>nodeSourcePAttributeNames</code>,
     * have the same names of  the same <code>nodeSourcePAttributeNames</code>.</br>
     *
     * @param pInstance  bean holding the collection <code>pInstance.pAttributeName</code> to add to or remove from, and root of the tree.
     * @param pAttributeName name of the collection attribute of <code>pInstance</code> to add to or remove element from.
     * @param path dot separated list of attributes that specifies the tree of root <code>pInstance</code>. If null it will be considered empty string.
     * @param nodeSourcePAttributeNames array of arrays of attributes names. For a node of a depth, <code>nodeSourcePAttributeNames[depth]</code> is an array holding the attributes names of the node
     *                                  which values have to be used to set the attributes of a created instance of the class of the items of  <code>pInstance.pAttributeName</code> with the same names</code>.
     *
     * @param pAttributeNames names of the class of the items of  <code>pInstance.pAttributeName</code>  attributes to populate with values in <code>valuesArray</code>
     * @param valuesArray values to use to populate the created instances of the class of the items of  <code>pInstance.pAttributeName</code> attributes in <code>pAttributeNames</code>.
     * @throws ApplicationException if <code>pInstance</code> is null;</br>
     *     When the method reaches a leaf, the built array of primary key values must have reached the same length of the primary key attributes names of the class of the instances of <code>pInstance.pAttributeName</code> specified in the mapping file (i.e. repository.xml for Ojb) otherwise an ApplicationException is thrown.</br>
     *     <code>pAttributeNames</code> and <code>valuesArray</code> have to be both null or both not null, and if they are not null must have the same length otherwise an ApplicationException will be thrown..</br>
     */
    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[][] nodeSourcePAttributeNames,   String[] pAttributeNames,Object[] valuesArray) throws ApplicationException;

    /**
     * @deprecated use {@link #addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames,  String[] pAttributeNames,Object[] valuesArray)}
     */
    public void align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,String[] pkNames,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames) throws ApplicationException;

    /**
     * @deprecated use {@link #addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[][] nodeSourcePAttributeNames,   String[] pAttributeNames,Object[] valuesArray)}
     */
    public void align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames) throws ApplicationException;


    /**
     * This method creates a tree of value object, using as source of information the items of the collection input parameter <code>pInstance.pAttributeName</code>.</br>
     * The root of the tree is <code>pInstance</code>. The input parameter <code>path</code> is a dot separated list of attributes. The first attribute must be an attribute
     * of <code>pInstance</code>, which class can be a of a value object or of a collection of value objects. If it is a value object class, this one must have an attribute named as the second
     * attribute of <code>path</code>, which class in turn can be of a value object or of a collection of value objects, while if it is a collection of value object, each of them must have an attribute named as the second
     * attribute of <code>path</code>, which class in turn can be of a value object or of a collection of value objects. Applying this rule recursively for all the attributes of path, the tree structure is identified.</br>
     * So note that all the nodes of the same level of the tree are instances of the same class.</br>
     * </br>
     * This method will select all the distinct sets of values that the attributes specified by  <code>groupedPkNames[0]</code> assume in the items of <code>pInstance.pAttributeName</code>.</br>
     * For each one of these sets this method will creates a new instance of the class of the items of the collection held by the attribute of <code>pInstance</code> specified by
     * the first attribute of <code>path</code>, if such attribute specifies a collection, or creates a new instance of the class of the value object of the the attribute of <code>pInstance</code> specified by
     * the first attribute of <code>path</code>, if it specifies a simple value object.</br>
     * If the first attribute of <code>path</code> specifies an attribute of <code>pInstance</code> that is a value object and not a collection, there must be only one distinct set of values that the attributes specified by  <code>groupedPkNames[0]</code>
     * assume in the items of <code>valueObjectsCollection</code>, otherwise an ApplicationException is thrown.</br>
     * For each one of the created instances,its primary key fields will be set with the set of the values of <code>valueObjectsCollection</code> that is being processed.</br>
     * If the first attribute of path of <code>pInstance</code> is a collection all the inverse foreign key of the elements of  the collection referring to <code>pInstance</code>
     * will be set with the key values of  <code>pInstance</code>, while if the first attribute of path of <code>pInstance</code> is a value object,
     * the foreign keys of  <code>pInstance</code> referring to such value objects will set with the key values of the value object.</br>
     * Moreover, the new created nodes must have attributes named as specified in nodePAttributeNames[0], and such attributes will be set with the corresponding values of nodeValuesArray[0]
     * For each one of the created children nodes, the method will be called recursively, where the new   <code>pInstance</code> is the child, and <code>path</code> will be the same with
     * the first attribute excluded and as collection of value object source of information to add nodes to the tree, will be passed the same collection<code>pInstance.pAttributeName</code> filtered
     * so to have just the elements that have the attributes groupedPkNames[depth] equals to the key values of the child being passed as <code>pInstance</code>.</br>
     * In the generic recursion, will be used the arrays <code>groupedPkNames[depth]</code> <code>nodePAttributeNames[depth]</code> <code>nodeValuesArray[depth]</code>
     * where <code>depth</code> is the depth of <code>pInstance</code>, considering the root of depth 0.</br>
     * </br>
     * If <code>pInstance.pAttributeName</code> is null or empty the method return.</br>
     * If <code>path</code> is empty string or blank characters string the method return.</br>
     * If <code>groupedPkNames</code> is null, as <code>groupedPkNames[depth]</code> will be considered the primary key fields of the class of nodes of level  <code>depth+1</code>
     * where the root is considered to be of level 0; even if groupedPkNames is not null, some <code>groupedPkNames[depth]</code> can be null, and in such case, the  same rule is applied.</br>
     * If <code>groupedPkNames</code> is not null, its length must be greater or equal than the number of tokens of <code>path</code>, otherwise an ApplicationException is thrown;
     * if strictly greater, the ones left over, will be ignored.</br>
     * For each depth <code>groupedPkNames[depth]</code> must be greater or equals than the number of the key fields of the node class of the level  <code>depth+1</code> (the over ones will be ignored)
     * otherwise an ApplicationException is thrown.</br>
     * </br>
     *
     * @param pInstance root of the tree,and value object holding the collection <code>pInstance.pAttributeName</code>. It can't be null
     * @param pAttributeName attribute name of the collection that will be used as source of information to create the tree. If <code>pInstance.pAttributeName</code> is null or empty the method returns without doing nothing.
     * @param path dot separated list of attributes, defining the tree with <code>pInstance</code>
     * @param groupedPkNames array of arrays of attributes names that specifies how to group the <code>pInstance.pAttributeName</code> item attributes to constitute the primary keys of the nodes of the tree to create.</br>
     * @param nodePAttributeNames array of arrays of attributes names of the children of <code>pInstance</code> to create, attributes to populate with values in <code>nodeValuesArray</code>
     * @param nodeValuesArray  array of arrays of values to use to populate the children of <code>pInstance</code> to create attributes in <code>nodePAttributeNames</code>.
     * @throws ApplicationException if <code>pInstance</code> or <code>path</code> are null.</br>
     *      If <code>groupedPkNames</code> is not null, and his length is less than the number of tokens of <code>path</code>.</br>
     *      If <code>groupedPkNames</code> is not null and for some depth <code>groupedPkNames[depth]</code> has length less than the number of the key fields of the node class of the level  <code>depth+1</code> where the root is considered to be of level 0.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are not both null or both not null.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null and they don't have the same length.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null, have the same length, but the length is less than the number of tokens of <code>path</code> .</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null, have the same length, that is greater or equals  than the number of tokens of <code>path</code>,
     *      but for some depth, <code>nodePAttributeNames[depth]</code> <code>nodePAttributeNames[depth]</code> are not both null and  not both not null, or if both not null, they don't have  the same length .</br>
     */
    public void   createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)}
     * where <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are null.
     * So except the parimary keys fields, and foreign key fields (inverse and not) no extra fields of the nodes of the tree will be populated.</br>
     * @param pInstance root of the tree,and value object holding the collection <code>pInstance.pAttributeName</code>. It can't be null
     * @param pAttributeName attribute name of the collection that will be used as source of information to create the tree. If <code>pInstance.pAttributeName</code> is null or empty the method returns without doing nothing.
     * @param path dot separated list of attributes, defining the tree with <code>pInstance</code>
     * @param groupedPkNames array of arrays of attributes names that specifies how to group the <code>pInstance.pAttributeName</code> items attributes to constitute the primary keys of the nodes of the tree to create.</br>
     * @throws  ApplicationException if <code>pInstance</code> or <code>path</code> are null.</br>
     *      If <code>groupedPkNames</code> is not null, and his length is less than the number of tokens of <code>path</code>.</br>
     *      If <code>groupedPkNames</code> is not null and for some depth <code>groupedPkNames[depth]</code> has length less than the number of the key fields of the node class of the level  <code>depth+1</code> where the root is considered to be of level 0.</br>
     */
    public void createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)}
     * where <code>nodePAttributeNames</code>, <code>nodeValuesArray</code> and <code>groupedPkNames</code> are null.
     * So except the parimary keys fields, and foreign key fields (inverse and not) no extra fields of the nodes of the tree will be populated.</br>
     * As <code>groupedPkNames</code>  is null, as <code>groupedPkNames[depth]</code> will be considered the primary key fields of the class of nodes of level  <code>depth+1</code>
     * where the root is considered to be of level 0.</br>
     * 
     * @param pInstance root of the tree,and value object holding the collection <code>pInstance.pAttributeName</code>. It can't be null
     * @param pAttributeName attribute name of the collection that will be used as source of information to create the tree. If <code>pInstance.pAttributeName</code> is null or empty the method returns without doing nothing.
     * @param path dot separated list of attributes, defining the tree with <code>pInstance</code>
     * @throws ApplicationException if <code>pInstance</code> or <code>path</code> are null.</br>
     */
    public void createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path) throws ApplicationException;

    
    /**
     * This method has the same behavior of {@link #createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)}
     * where <code>groupedPkNames</code> is null.
     * As <code>groupedPkNames</code>  is null, as <code>groupedPkNames[depth]</code> will be considered the primary key fields of the class of nodes of level  <code>depth+1</code>
     * where the root is considered to be of level 0.</br>
     * 
     * @param pInstance root of the tree,and value object holding the collection <code>pInstance.pAttributeName</code>. It can't be null
     * @param pAttributeName attribute name of the collection that will be used as source of information to create the tree. If <code>pInstance.pAttributeName</code> is null or empty the method returns without doing nothing.
     * @param path dot separated list of attributes, defining the tree with <code>pInstance</code>
     * @param nodePAttributeNames array of arrays of attributes names of the children of <code>pInstance</code> to create, attributes to populate with values in <code>nodeValuesArray</code>
     * @param nodeValuesArray  array of arrays of values to use to populate the children of <code>pInstance</code> to create attributes in <code>nodePAttributeNames</code>.
     * @throws ApplicationException if <code>pInstance</code> or <code>path</code> are null.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are not both null or both not null.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null and they don't have the same length.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null, have the same length, but the length is less than the number of tokens of <code>path</code> .</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null, have the same length, that is greater or equals  than the number of tokens of <code>path</code>,
     *      but for some depth, <code>nodePAttributeNames[depth]</code> <code>nodePAttributeNames[depth]</code> are not both null and  not both not null, or if both not null, they don't have  the same length .</br>
     */
    public void createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws ApplicationException;



    /**
     * This method has the same behavior of {@link #createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)}
     * with the difference that the collection source of information for the tree building, is directly specified by the input parameter  <code>valueObjectsCollection</code>.</br>
     *
     * @param valueObjectsCollection  Collection of value objects used to create the tree of value objects. If null or empty the method returns without doing nothing.
     * @param pInstance  root of the tree. It can't be null.
     * @param path  dot separated list of attributes, defining the tree with <code>pInstance</code>
     * @param groupedPkNames array of arrays of attributes names that specifies how to group the <code>valueObjectsCollection</code> item attributes to constitute the primary keys of the nodes of the tree to create.</br>
     * @param nodePAttributeNames array of arrays of attributes names of the children of <code>pInstance</code> to create, attributes to populate with values in <code>nodeValuesArray</code>
     * @param nodeValuesArray  array of arrays of values to use to populate the children of <code>pInstance</code> to create attributes in <code>nodePAttributeNames</code>.
     * @throws ApplicationException if <code>pInstance</code> or <code>path</code> are null.</br>
     *      If <code>groupedPkNames</code> is not null, and his length is less than the number of tokens of <code>path</code>.</br>
     *      If <code>groupedPkNames</code> is not null and for some depth <code>groupedPkNames[depth]</code> has length less than the number of the key fields of the node class of the level  <code>depth+1</code> where the root is considered to be of level 0.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are not both null or both not null.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null and they don't have the same length.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null, have the same length, but the length is less than the number of tokens of <code>path</code> .</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null, have the same length, that is greater or equals  than the number of tokens of <code>path</code>,
     *      but for some depth, <code>nodePAttributeNames[depth]</code> <code>nodePAttributeNames[depth]</code> are not both null and  not both not null, or if both not null, they don't have  the same length .</br>
     */
    public void createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)}
     * with the difference that the collection source of information for the tree building, is directly specified by the input parameter  <code>valueObjectsCollection</code>
     * and where <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are null.
     * So except the parimary keys fields, and foreign key fields (inverse and not) no extra fields of the nodes of the tree will be populated.</br>
     *
     * @param valueObjectsCollection  Collection of value objects used to create the tree of value objects. If null or empty the method returns without doing nothing.
     * @param pInstance  root of the tree. It can't be null.
     * @param path  dot separated list of attributes, defining the tree with <code>pInstance</code>
     * @param groupedPkNames array of arrays of attributes names that specifies how to group the <code>valueObjectsCollection</code> item attributes to constitute the primary keys of the nodes of the tree to create.</br>
     * @throws ApplicationException if <code>pInstance</code> or <code>path</code> are null.</br>
     *      If <code>groupedPkNames</code> is not null, and his length is less than the number of tokens of <code>path</code>.</br>
     *      If <code>groupedPkNames</code> is not null and for some depth <code>groupedPkNames[depth]</code> has length less than the number of the key fields of the node class of the level  <code>depth+1</code> where the root is considered to be of level 0.</br>
     */
    public void createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)}
     * with the difference that the collection source of information for the tree building, is directly specified by the input parameter  <code>valueObjectsCollection</code>
     * and where <code>nodePAttributeNames</code>, <code>nodeValuesArray</code> and <code>groupedPkNames</code> are null.
     * So except the parimary keys fields, and foreign key fields (inverse and not) no extra fields of the nodes of the tree will be populated.</br>
     * As <code>groupedPkNames</code>  is null, as <code>groupedPkNames[depth]</code> will be considered the primary key fields of the class of nodes of level  <code>depth+1</code>
     * where the root is considered to be of level 0.</br>
     *
     * @param valueObjectsCollection  Collection of value objects used to create the tree of value objects. If null or empty the method returns without doing nothing.
     * @param pInstance  root of the tree. It can't be null.
     * @param path  dot separated list of attributes, defining the tree with <code>pInstance</code>
     * @throws ApplicationException if <code>pInstance</code> or <code>path</code> are null.</br>
     */
    public void createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)}
     * with the difference that the collection source of information for the tree building, is directly specified by the input parameter  <code>valueObjectsCollection</code>
     * and where <code>groupedPkNamesv</code> is null.
     * As <code>groupedPkNames</code>  is null, as <code>groupedPkNames[depth]</code> will be considered the primary key fields of the class of nodes of level  <code>depth+1</code>
     * where the root is considered to be of level 0.</br>
     *
     * @param valueObjectsCollection  Collection of value objects used to create the tree of value objects. If null or empty the method returns without doing nothing.
     * @param pInstance  root of the tree. It can't be null.
     * @param path  dot separated list of attributes, defining the tree with <code>pInstance</code>
     * @param nodePAttributeNames array of arrays of attributes names of the children of <code>pInstance</code> to create, attributes to populate with values in <code>nodeValuesArray</code>
     * @param nodeValuesArray  array of arrays of values to use to populate the children of <code>pInstance</code> to create attributes in <code>nodePAttributeNames</code>.
     * @throws ApplicationException if <code>pInstance</code> or <code>path</code> are null.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are not both null or both not null.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null and they don't have the same length.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null, have the same length, but the length is less than the number of tokens of <code>path</code> .</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null, have the same length, that is greater or equals  than the number of tokens of <code>path</code>,
     *      but for some depth, <code>nodePAttributeNames[depth]</code> <code>nodePAttributeNames[depth]</code> are not both null and  not both not null, or if both not null, they don't have  the same length .</br>
     */
    public void createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws ApplicationException;

    /**
     * This method adds nodes to a tree of value object, using as source of information the items of the collection  <code>pInstance.pAttributeName</code>.</br>
     * The root of the tree is <code>pInstance</code>. The input parameter <code>path</code> is a dot separated list of attributes. The first attribute must be an attribute
     * of <code>pInstance</code>, which class can be a of a value object or of a collection of value objects. If it is a value object class, this one must have an attribute named as the second
     * attribute of <code>path</code>, which class in turn can be of a value object or of a collection of value objects, while if it is a collection of value object, each of them must have an attribute named as the second
     * attribute of <code>path</code>, which class in turn can be of a value object or of a collection of value objects. Applying this rule recursively for all the attributes of path, the tree structure is identified.</br>
     * So note that all the nodes of the same level of the tree are instances of the same class.</br>
     * This method will select all the distinct sets of values that the attributes specified by  <code>groupedPkNames[0]</code> assume in the items of the collection <code>pInstance.pAttributeName</code>.</br>
     * Such sets of values will be the key values of the children of <code>pInstance</code> to add to it.
     * </br>
     * If the first attribute of <code>path</code> specifies the name of an attribute of  <code>pInstance</code> that is a value objects, there must be only
     * one distinct set of values, otherwise an ApplicationException is thrown; if such attribute of <code>pInstance</code> is null or the primary keys values
     * of the value object represented by such attribute are not equals to the distinct set of values, the attribute of  <code>pInstance</code> is replaced
     * by a new instance of the class of the attribute that have as primary key values the set of distinct values. Moreover for such new instance the attributes named as in <code>nodePAttributeNames[0]</code> will be set
     * with the corresponding values of  <code>nodeValuesArray[0]</code> (of course if they are not null); in both cases the foreign key fields
     * of <code>pInstance</code> referring to the value object child, are set with the primary key values of the same child. (It could be that even if the right
     * child was already existing, the foreign key fields to it were not properly set). </br>
     * If the first attribute of <code>path</code> specifies the name of an attribute of  <code>pInstance</code> that is a collection, if such collection is null
     * a new empty one is created (using the implementation specified in the mapping file, i.e repository.xml for Ojb), and the attribute of  <code>pInstance</code>
     * will be set to it.</br>
     * For each one of the distinct sets of values of the attributes, whose names are in <code>groupedPkNames[0]</code>, of the items of <code>pInstance.pAttributeName</code>
     * if in the collection of the children of <code>pInstance</code> is not yet present  a value object which primary key values are  equals to the distinct set of values
     * being processed, such value object will be created (a new instance of the class of the children of <code>pInstance</code>, class that should be mapped
     * in the mapping file, i.e repository.xml for Ojb) with key primary values set to the values of the distinct set of values being processed.
     * Moreover for such new instance the attributes named as in <code>nodePAttributeNames[0]</code> will be set
     * with the corresponding values of  <code>nodeValuesArray[0]</code> (of course if they are not null); then the new created instances will be added
     * to the collection of the children of <code>pInstance</code>.</br>
     * For all the children of <code>pInstance</code>, the inverse foreign key field referring to the parent <code>pInstance</code> will be set with the key values
     * of <code>pInstance</code>, this is done for the new added ones and for the already existing children, as it could be that such fields, for the already existing children,
     * were not properly set.</br>
     * For all the the children of <code>pInstance</code>, in both cases that the first attribute of <code>path</code> specifies a value object or a collection,
     * this method will be called recursively, where the new   <code>pInstance</code> is the child, and <code>path</code> will be the same with
     * the first attribute excluded, and  as collection of value object source of information to add nodes to the tree, will be passed the same collection<code>pInstance.pAttributeName</code> filtered
     * so to have just the elements that have the attributes groupedPkNames[1] equals to the key values of the child being passed as <code>pInstance</code>.</br>
     * In the generic recursion, will be used the arrays <code>groupedPkNames[depth]</code> <code>nodePAttributeNames[depth]</code> <code>nodeValuesArray[depth]</code>
     * where <code>depth</code> is the depth of <code>pInstance</code>, considering the root of depth 0.</br>
     * The recursion will end at the end of <code>path</code> .</br>
     * </br>
     * If <code>pInstance.pAttributeName</code> is null or empty the method return.</br>
     * If <code>path</code> is empty string or blank characters string the method return.</br>
     * If <code>groupedPkNames</code> is null, as <code>groupedPkNames[depth]</code> will be considered the primary key fields of the class of nodes of level  <code>depth+1</code>
     * where the root is considered to be of level 0; even if groupedPkNames is not null, some <code>groupedPkNames[depth]</code> can be null, and in such case, the  same rule is applied.</br>
     * If <code>groupedPkNames</code> is not null, his length must be greater or equal than the number of tokens of <code>path</code>, otherwise an ApplicationException is thrown;
     * if strictly greater, the ones left over, will be ignored.</br>
     * For each depth <code>groupedPkNames[depth]</code> must be greater or equals than the number of the key fields of the node class of the level  <code>depth+1</code> (the over ones will be ignored)
     * otherwise an ApplicationException is thrown.</br>
     * </br>
     * @param pInstance pInstance root of the tree,and value object holding the collection <code>pInstance.pAttributeName</code>. It can't be null
     * @param pAttributeName attribute name of the collection that will be used as source of information to create the nodes to add to the tree. If <code>pInstance.pAttributeName</code> is null or empty the method returns without doing nothing.
     * @param path dot separated list of attributes, defining the tree with <code>pInstance</code>
     * @param groupedPkNames array of arrays of attributes names that specifies how to group the <code>pInstance.pAttributeName</code> items attributes to constitute the primary keys of the nodes to add to the tree.</br>
     * @param nodePAttributeNames array of arrays of attributes names of the children of <code>pInstance</code> to add to, attributes to populate with values in <code>nodeValuesArray</code>
     * @param nodeValuesArray  array of arrays of values to use to populate the  attributes in <code>nodePAttributeNames</code> of the children of <code>pInstance</code>  to add to attributes in <code>nodePAttributeNames</code>.
     * @throws ApplicationException if <code>pInstance</code> or <code>path</code> are null.</br>
     *      If <code>groupedPkNames</code> is not null, and his length is less than the number of tokens of <code>path</code>.</br>
     *      If <code>groupedPkNames</code> is not null and for some depth <code>groupedPkNames[depth]</code> has length less than the number of the key fields of the node class of the level  <code>depth+1</code> where the root is considered to be of level 0.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are not both null or both not null.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null and they don't have the same length.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null, have the same length, but the length is less than the number of tokens of <code>path</code> .</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null, have the same length, that is greater or equals  than the number of tokens of <code>path</code>,
     *      but for some depth, <code>nodePAttributeNames[depth]</code> <code>nodePAttributeNames[depth]</code> are not both null and  not both not null, or if both not null, they don't have  the same length .</br>
     */
    public void addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)}
     * where <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are null.
     * So except the primary keys fields, and foreign key fields (inverse and not) no extra fields of the nodes added to the tree will be populated.</br>
     *
     * @param pInstance pInstance root of the tree,and value object holding the collection <code>pInstance.pAttributeName</code>. It can't be null
     * @param pAttributeName attribute name of the collection that will be used as source of information to create the nodes to add to the tree. If <code>pInstance.pAttributeName</code> is null or empty the method returns without doing nothing.
     * @param path dot separated list of attributes, defining the tree with <code>pInstance</code>
     * @param groupedPkNames array of arrays of attributes names that specifies how to group the <code>pInstance.pAttributeName</code> items attributes to constitute the primary keys of the nodes to add to the tree.</br>
     * @throws ApplicationException if <code>pInstance</code> or <code>path</code> are null.</br>
     *      If <code>groupedPkNames</code> is not null, and his length is less than the number of tokens of <code>path</code>.</br>
     *      If <code>groupedPkNames</code> is not null and for some depth <code>groupedPkNames[depth]</code> has length less than the number of the key fields of the node class of the level  <code>depth+1</code> where the root is considered to be of level 0.</br>
     */
    public void addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)}
     * where <code>nodePAttributeNames</code>, <code>nodeValuesArray</code> and <code>groupedPkNames</code> are null.
     * So except the parimary keys fields, and foreign key fields (inverse and not) no extra fields of the nodes added to the tree will be populated.</br>
     * As <code>groupedPkNames</code>  is null, as <code>groupedPkNames[depth]</code> will be considered the primary key fields of the class of nodes of level  <code>depth+1</code>
     * where the root is considered to be of level 0.</br>
     *
     * @param pInstance pInstance pInstance root of the tree,and value object holding the collection <code>pInstance.pAttributeName</code>. It can't be null
     * @param pAttributeName attribute name of the collection that will be used as source of information to create the nodes to add to the tree. If <code>pInstance.pAttributeName</code> is null or empty the method returns without doing nothing.
     * @param path dot separated list of attributes, defining the tree with <code>pInstance</code>
     * @throws ApplicationException if <code>pInstance</code> or <code>path</code> are null.</br>
     */
    public void addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path) throws ApplicationException;


    /**
     * This method has the same behavior of {@link #createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)}
     * where <code>groupedPkNames</code> is null.
     * As <code>groupedPkNames</code>  is null, as <code>groupedPkNames[depth]</code> will be considered the primary key fields of the class of nodes of level  <code>depth+1</code>
     * where the root is considered to be of level 0.</br>
     * @param pInstance root of the tree,and value object holding the collection <code>pInstance.pAttributeName</code>. It can't be null
     * @param pAttributeName attribute name of the collection that will be used as source of information to create the tree. If <code>pInstance.pAttributeName</code> is null or empty the method returns without doing nothing.
     * @param path dot separated list of attributes, defining the tree with <code>pInstance</code>
     * @param nodePAttributeNames array of arrays of attributes names of the children of <code>pInstance</code> to add to, attributes to populate with values in <code>nodeValuesArray</code>
     * @param nodeValuesArray  array of arrays of values to use to populate the  attributes in <code>nodePAttributeNames</code> of the children of <code>pInstance</code>  to add to attributes in <code>nodePAttributeNames</code>.
     * @throws ApplicationException if <code>pInstance</code> or <code>path</code> are null.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are not both null or both not null.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null and they don't have the same length.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null, have the same length, but the length is less than the number of tokens of <code>path</code> .</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null, have the same length, that is greater or equals  than the number of tokens of <code>path</code>,
     *      but for some depth, <code>nodePAttributeNames[depth]</code> <code>nodePAttributeNames[depth]</code> are not both null and  not both not null, or if both not null, they don't have  the same length .</br>
     */
    public void addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)}
     * with the difference that the collection source of information for the creatation of the nodes to add to the tree, is directly specified by the input parameter  <code>valueObjectsCollection</code>.</br>
     *
     * @param valueObjectsCollection  Collection of value objects used to create the nodes to add to the  tree of value objects. If null or empty the method returns without doing nothing.
     * @param pInstance  root of the tree. It can't be null.
     * @param path  dot separated list of attributes, defining the tree with <code>pInstance</code>
     * @param groupedPkNames array of arrays of attributes names that specifies how to group the <code>valueObjectsCollection</code> item attributes to constitute the primary keys of the nodes of to add to the tree.</br>
     * @param nodePAttributeNames array of arrays of attributes names of the children of <code>pInstance</code> to add to, attributes to populate with values in <code>nodeValuesArray</code>
     * @param nodeValuesArray  array of arrays of values to use to populate the  attributes in <code>nodePAttributeNames</code> of the children of <code>pInstance</code>  to add to attributes in <code>nodePAttributeNames</code>.
     * @throws ApplicationException if <code>pInstance</code> or <code>path</code> are null.</br>
     *      If <code>groupedPkNames</code> is not null, and his length is less than the number of tokens of <code>path</code>.</br>
     *      If <code>groupedPkNames</code> is not null and for some depth <code>groupedPkNames[depth]</code> has length less than the number of the key fields of the node class of the level  <code>depth+1</code> where the root is considered to be of level 0.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are not both null or both not null.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null and they don't have the same length.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null, have the same length, but the length is less than the number of tokens of <code>path</code> .</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null, have the same length, that is greater or equals  than the number of tokens of <code>path</code>,
     *      but for some depth, <code>nodePAttributeNames[depth]</code> <code>nodePAttributeNames[depth]</code> are not both null and  not both not null, or if both not null, they don't have  the same length .</br>
     */
    public void addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)}
     * with the difference that the collection source of information for the creatation of the nodes to add to the tree, is directly specified by the input parameter  <code>valueObjectsCollection</code>
     * and where <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are null.
     * So except the parimary keys fields, and foreign key fields (inverse and not) no extra fields of the nodes added to the tree will be populated.</br>
     *
     * @param valueObjectsCollection  Collection of value objects used to create the nodes to add to the  tree of value objects. If null or empty the method returns without doing nothing.
     * @param pInstance  root of the tree. It can't be null.
     * @param path  dot separated list of attributes, defining the tree with <code>pInstance</code>
     * @param groupedPkNames array of arrays of attributes names that specifies how to group the <code>valueObjectsCollection</code> item attributes to constitute the primary keys of the nodes of to add to the tree.</br>
     * @throws ApplicationException if <code>pInstance</code> or <code>path</code> are null.</br>
     *      If <code>groupedPkNames</code> is not null, and his length is less than the number of tokens of <code>path</code>.</br>
     *      If <code>groupedPkNames</code> is not null and for some depth <code>groupedPkNames[depth]</code> has length less than the number of the key fields of the node class of the level  <code>depth+1</code> where the root is considered to be of level 0.</br>
     *
     */
    public void addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)}
     * with the difference that the collection source of information for the creatation of the nodes to add to the tree, is directly specified by the input parameter  <code>valueObjectsCollection</code>
     * and where <code>nodePAttributeNames</code>, <code>nodeValuesArray</code> and <code>groupedPkNames</code> are null.
     * So except the parimary keys fields, and foreign key fields (inverse and not) no extra fields of the nodes added to the tree will be populated.</br>
     * As <code>groupedPkNames</code>  is null, as <code>groupedPkNames[depth]</code> will be considered the primary key fields of the class of nodes of level  <code>depth+1</code>
     * where the root is considered to be of level 0.</br>
     *
     * @param valueObjectsCollection  Collection of value objects used to create the nodes to add to the  tree of value objects. If null or empty the method returns without doing nothing.
     * @param pInstance  root of the tree. It can't be null.
     * @param path  dot separated list of attributes, defining the tree with <code>pInstance</code>
     * @throws ApplicationException if <code>pInstance</code> or <code>path</code> are null.</br>
     */
    public void addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)}
     * with the difference that the collection source of information for the creatation of the nodes to add to the tree, is directly specified by the input parameter  <code>valueObjectsCollection</code>
     * and where <code>groupedPkNames</code> is null.
     * As <code>groupedPkNames</code>  is null, as <code>groupedPkNames[depth]</code> will be considered the primary key fields of the class of nodes of level  <code>depth+1</code>
     * where the root is considered to be of level 0.</br>
     *
     * @param valueObjectsCollection  Collection of value objects used to create the nodes to add to the  tree of value objects. If null or empty the method returns without doing nothing.
     * @param pInstance  root of the tree. It can't be null.
     * @param path  dot separated list of attributes, defining the tree with <code>pInstance</code>
     * @param nodePAttributeNames array of arrays of attributes names of the children of <code>pInstance</code> to add to, attributes to populate with values in <code>nodeValuesArray</code>
     * @param nodeValuesArray  array of arrays of values to use to populate the  attributes in <code>nodePAttributeNames</code> of the children of <code>pInstance</code>  to add to attributes in <code>nodePAttributeNames</code>.
     * @throws ApplicationException if <code>pInstance</code> or <code>path</code> are null.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are not both null or both not null.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null and they don't have the same length.</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null, have the same length, but the length is less than the number of tokens of <code>path</code> .</br>
     *      If <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are both not null, have the same length, that is greater or equals  than the number of tokens of <code>path</code>,
     *      but for some depth, <code>nodePAttributeNames[depth]</code> <code>nodePAttributeNames[depth]</code> are not both null and  not both not null, or if both not null, they don't have  the same length .</br>
     */
    public void addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws ApplicationException;

    /**
     * Build a Tree organization from the collectionSource.
     * Suppose you have a collection of beans (collectionSource). Let's considere some field of these beans (say field_1...field_n)
     * We can imagine that the values of these n fields represent a path on a tree of n+1 levels from the root (valueObject) to a leaf.
     * So let's build our tree.
     * The valueObject will be the root.
     * The nodes of level 1 (root's children) will be all the values (not repeated) of the field_1 on all the beans of collectionSource.
     * Children of a node of level 1 will be all the values (not repeated) of field_2 on all the beans whose field_1 value corresponds to the node we are processing.
     * We will say that children of a node of level i will be all the values (not repeated) on all the beans whose values of fields_1 ... fields_i correspond
     * to the values of the path from the root to the node we are processing.
     * Each node will be a bean. A bean representing a node o level i must have a property named as field_i.
     * Of course this property will be filled with the value of field_i representing the node we are processing.
     * All not null references will be retrieved for this bean
     * Each bean holds the collection of his children. The property name of the bean (node) of level i representing this collection
     * is that in the i-th position in treePathCollectionTarget.  The property can be a nested property too.
     * The name of field_i is that in the i-th position in fields.
     * treePathCollectionTarget and fields can't be null nor empty
     * @deprecated  see {@link #public void createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] pkNames,  String[][] pAttributeNames,Object[][] valuesArray) }
     * @param valueObject: root of the tree to build
     * @param treePathCollectionTarget: name of the properties representing the collections of child
     * @param collectionSource: collection of bean to use as source to build the tree
     * @param fields: name of the properties representing nodes and path on the tree to build
     * @throws ApplicationException
     */
   // public void buildTreeValueObjectFromCollection(Object valueObject, Collection treePathCollectionTarget, Collection  collectionSource,  Collection fields)throws ApplicationException;

    /**
     * It acts as @ buildTreeValueObjectFromCollection, but it update the existing tre structure with the missing parts
     * treePathCollectionTarget and fields can't be null nor empty
     * @param valueObject
     * @param treePathCollectionTarget
     * @param collectionSource
     * @param fields
     * @throws ApplicationException
     */
    //public void updateTreeValueObjectFromCollection(Object valueObject, Collection treePathCollectionTarget, Collection  collectionSource,  Collection fields)throws ApplicationException;

    /**
     * @deprecated use {@link #addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray)}
     */
    public void createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray)throws ApplicationException;

    /**
     * @deprecated use {@link #addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName)}
     */
    public void createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName)throws ApplicationException;

    /**
     * @deprecated use {@link #addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection)}
     */
    public void createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection)throws ApplicationException;

    /**
     * @deprecated use {@link #addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)}
     */
    public void createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)throws ApplicationException;


    /**
     * This method has the same behavior  of {@link #addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)}
     * where <code>valueObjectsCollection</code> is null.
     *
     * @param pInstance:value object that has to be related
     * @param collectionName name of the attribute of <code>pInstance</code> holding the collecton ofteh relationships
     * @param pAttributeName property name of the generic elements of the collection <code>pInstance.collectionName</code> representig the value object which <code>pInstance</code> has to be related to
     * @param pAttributeNames  attributes of the generic value object of the collection <code>pInstance.collectionName</code> that has to be populated with <code>pInstance.valuesArray</code>
     * @param valuesArray values to use to populate <code>pAttributeNames</code>
     * @throws ApplicationException  -
     *      If <code>pInstance</code> is null.</br>
     *      If <code>pAttributeNames</code> and <code>valuesArray</code> are not both null or both not null, and if they are not null don't have the same length.</br>
     */
    public void addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray)throws ApplicationException;

    /**
     *
     * This method has the same behavior  of {@link #addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)}
     * where <code>pAttributeNames</code> and <code>valuesArray</code>  and  <code>valueObjectsCollection</code> are null.
     *
     * @param pInstance:value object that has to be related
     * @param collectionName name of the attribute of <code>pInstance</code> holding the collecton ofteh relationships
     * @param pAttributeName property name of the generic elements of the collection <code>pInstance.collectionName</code> representig the value object which <code>pInstance</code> has to be related to
     * @throws ApplicationException  -
     *      If <code>pInstance</code> is null.</br>
     */
    public void addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName)throws ApplicationException;

    /**
     * This method has the same behavior  of {@link #addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)}
     * where <code>pAttributeNames</code> and <code>valuesArray</code> are null.
     *
     * @param pInstance:value object that has to be related
     * @param collectionName name of the attribute of <code>pInstance</code> holding the collecton ofteh relationships
     * @param pAttributeName property name of the generic elements of the collection <code>pInstance.collectionName</code> representig the value object which <code>pInstance</code> has to be related to
     * @param valueObjectsCollection Collection of the value objects which  <code>pInstance</code>  has to be related to. If it is null all instance in the media store will be used
     * @throws ApplicationException  -
     *      If <code>pInstance</code> is null.</br>
     */
    public void addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection)throws ApplicationException;

    /**
     * This method deals with m:n decomposed relationships.</br>
     * <code>pInstance</code> must have an attribute named <code>collectionName</code> that is a collection.</br>
     * <code>pInstance.collectionName</code> must be a collection which elements have an attribute named <code>pAttributeName</code> that must be a value object.</br>
     * The collection <code>pInstance.collectionName</code> establishes a relationship between <code>pInstance</code> and instances of the class mapped by
     * <code>collectionName.pAttributeName</code>.</br>
     * This method creates new relationships between <code>pInstance</code> and the value objects of the collection <code>valueObjectsCollection</code>, that must be instances
     * of the class specified in the mapping file (i.e. repository.xml for Ojb ) by <code>pInstance.collectionName.pAttributeName</code>.</br>
     * That means that for each element of the collection <code>valueObjectsCollection</code> will be created a new instance of the class of the elements of the collection <code>pInstance.collectionName</code>
     * (that is a new relationship); the inverse foreign  key fields of such instance to <code>pInstance</code> will be populated with the key values of <code>pInstance</code>
     * and the foreign key fields to the class represented by <code>collectionName.pAttributeName</code> will be set to the key values of the value object of <code>valueObjectsCollection</code>
     * being processed; moreover the attribute <code>pAttributeName</code> of the created instance will be set to the value object being processed. At the end,
     * if <code>pAttributeNames</code> and  <code>valuesArray</code> are not null, the attributes <code>pAttributeNames</code> of the new created instance are set with values in <code>valuesArray</code>.</br>
     * Note that, being the new instance a relationship between <code>pInstance</code> and the value object being processed, the inverse foreign key to   <code>pInstance</code>,
     * joined with the foreign key to the value object being processed must be the primary key fields of the elements of the collection  <code>pInstance.collectionName</code>.
     * Once created the new instance, relationship between <code>pInstance</code> and a value object of the collection <code>valueObjectsCollection</code>, its
     * key value will be comapred with the key values of the elements of <code>pInstance.collectionName</code>, and if no matching one is found, the created instance will be added
     * to the collection  <code>pInstance.collectionName</code>, while if some matching one is found, it won't be added.</br>
     * Note that if there are in <code>valueObjectsCollection</code> more elements with the same key values, just the first one in the iteration will be considered.</br>
     * </br>
     * If <code>valueObjectsCollection</code> is null, in its place it will be considered the collection of all the elements of the class
     * specified in the mapping file (i.e. repository.xml for Ojb ) by <code>pInstance.collectionName.pAttributeName</code> present in the underlying media store.</br>
     * If the collection <code>pInstance.collectionName</code> is null, a new one is created.
     *
     * @param pInstance value object that has to be related
     * @param collectionName name of the attribute of <code>pInstance</code> holding the collection of the relationships
     * @param pAttributeName property name of the generic elements of the collection <code>pInstance.collectionName</code> representing the value object which <code>pInstance</code> has to be related to
     * @param valueObjectsCollection Collection of the value objects which  <code>pInstance</code>  has to be related to. If it is null all instance in the media store will be used
     * @param pAttributeNames  attributes of the generic value object of the collection <code>pInstance.collectionName</code> that has to be populated with <code>pInstance.valuesArray</code>
     * @param valuesArray values to use to populate <code>pAttributeNames</code>
     * @throws ApplicationException  -
     *      If <code>pInstance</code> is null.</br>
     *      If <code>pAttributeNames</code> and <code>valuesArray</code> are not both null or both not null, and if they are not null don't have the same length.</br>
     *
     */
    public void addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)throws ApplicationException;

    /**
     * This method creates a new collection of relationship between <code>pInstance</code> ,
     * and the value objects of the collection <code>valueObjectsCollection</code>, and uses this new collection to set the attribute named <code>collectionName</code> of <code>pInstance</code>.</br>
     * If <code>valueObjectsCollection</code> is null, in its place it will be considered the collection of all the elements of the class
     * specified in the mapping file (i.e. repository.xml for Ojb ) by the path <code>collectionName.pAttributeName</code> starting from the class of <code>pInstance</code>, elements present in the underlying media store.</br>
     * If <code>valueObjectsCollection</code> is still null, the attribute named <code>collectionName</code> of <code>pInstance</code> will be set to null.</br>
     * </br>
     * code>pInstance</code> must have an attribute named <code>collectionName</code> that is a collection, and the class of the items of such collection
     * must be of the same class of the elements of <code>valueObjectsCollection</code>, and must have an attribute named <code>pAttributeName</code>.</br>
     * <code>pInstance.collectionName</code> must be a collection which elements have an attribute named <code>pAttributeName</code> that must be a value object.</br>
     * The collection <code>pInstance.collectionName</code> establishes a relationship between <code>pInstance</code> and instances of the class mapped by
     * <code>collectionName.pAttributeName</code>.</br>
     * In the mapping file must be specified which is the collection implementation class of the relationship collection, that is the one of the attribute  <code>collectionName</code>,
     * of the class <code>realClass</code>, and the class of the items of such collection.</br>
     * For each element of the collection <code>valueObjectsCollection</code> will be created a new instance of the class of the  elements of the collection <code>pInstance.collectionName</code>
     * (that is a new relationship); the inverse foreign  key fields of such instance to the class <code>realClass</code> will be populated with the key values of <code>pInstance</code>,
     * and the foreign key fields to the elements of <code>valueObjectsCollection</code> being precessed will be set to its the key values;
     * moreover the attribute <code>pAttributeName</code> of the created instance will be set to the value object being processed. At the end,
     * if <code>pAttributeNames</code> and  <code>valuesArray</code> are not null, the attributes <code>pAttributeNames</code> of the new created instance are set with values in <code>valuesArray</code>.</br>
     * Note that, being the new instance a relationship between an instance of <code>realClass</code> which key values are specified by the input parameter <code>keyValues</code> and the value object being processed,
     * the inverse foreign key to   <code>pInstance</code>,
     * joined with the foreign key to the value object being processed must be the primary key fields of the elements of the collection  <code>pInstance.collectionName</code>.
     * </br>
     * Note that the old value of the collection <code>pInstance.collectionName</code> will be overwritten by this method.
     *
     * @param pInstance value object that has to be related
     * @param collectionName name of the attribute of <code>pInstance</code> holding the collection of the relationships
     * @param pAttributeName property name of the generic elements of the collection <code>pInstance.collectionName</code> representing the value object which <code>pInstance</code> has to be related to
     * @param valueObjectsCollection Collection of the value objects which  <code>pInstance</code>  has to be related to. If it is null all instance in the media store will be used
     * @param pAttributeNames  attributes of the generic value object of the collection <code>pInstance.collectionName</code> that has to be populated with <code>pInstance.valuesArray</code>
     * @param valuesArray values to use to populate <code>pAttributeNames</code>
     * @throws ApplicationException   -
     *      If <code>pInstance</code> is null.</br>
     *      If <code>pAttributeNames</code> and <code>valuesArray</code> are not both null or both not null, and if they are not null don't have the same length.</br>
     *
     */
    public void createRelationshipCollection(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray) throws ApplicationException;

    /**
     * This method has the same behavior of {@link #createRelationshipCollection(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)}
     * where <code>valueObjectsCollection</code> is the collection of value objects retrieved form the underlying media store
     * applying the method {@link #findCollectionByOrValues(Class realClass, String pAttributeName, java.util.Collection valuesCollection)}
     * where <code>realClass</code> is the class specified in the mapping file (i.e. repository.xml for Ojb) by  the path <code>collectionName.pAttributeName</code>
     * starting from the class of <code>pInstance</code>,  <code>pAttributeName</code> is the input string parameter <code>orPAttributeName</code>, and
     * <code>valuesCollection</code> is the same input parameter  <code>valuesCollection</code>.
     * If <code>valuesCollection</code> is null or empty, the collection <code>pInstance.collectionName</code will be set to null.
     *
     *
     * @param pInstance value object that has to be related
     * @param collectionName name of the attribute of <code>pInstance</code> holding the collection of the relationships
     * @param pAttributeName property name of the generic elements of the collection <code>pInstance.collectionName</code> representing the value object which <code>pInstance</code> has to be related to
     * @param orPAttributeName name of the attribute that has to be compared with <code>valuesCollection</code>
     * @param valuesCollection  values to be compared with <code>orPAttributeName</code>
     * @param pAttributeNames attributes of the generic value object of the collection <code>pInstance.collectionName</code> that has to be populated with <code>pInstance.valuesArray</code>
     * @param valuesArray values to use to populate <code>pAttributeNames</code>
     * @throws ApplicationException -
     *      If <code>pInstance</code> is null.</br>
     *      If <code>pAttributeNames</code> and <code>valuesArray</code> are not both null or both not null, and if they are not null don't have the same length.</br>
     */
    public void createRelationshipCollectionByOrValues(Object pInstance, String collectionName, String pAttributeName, String orPAttributeName, Collection valuesCollection,  String[] pAttributeNames,Object[] valuesArray)throws ApplicationException;

    
    /**
     * @deprecated use {@link #createRelationshipCollectionByOrValues(Object pInstance, String collectionName, String pAttributeName, String orPAttributeName, Collection valuesCollection,  String[] pAttributeNames,Object[] valuesArray)}
     */
    public void setRelationshipElementWithQueryByOrValues(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String orPAttributeName,Collection valuesCollection)throws ApplicationException;



    /**
     * This method has the same behavior of {@link #createRelationshipCollection(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)}
     * where <code>valueObjectsCollection</code> is the collection of value objects retrieved form the underlying media store
     * applying the method {@link #searchValueInFields(Class realClass, String[] pAttributeNames, Object value)}
     * where <code>realClass</code> is the class specified in the mapping file (i.e. repository.xml for Ojb) by  the path <code>collectionName.pAttributeName</code>
     * starting from the class of <code>pInstance</code>,  <code>pAttributeNames</code> is the input parameter <code>toSearchInPAttributeNames</code>, and
     * <code>value</code> is the same input parameter  <code>value</code>.</br>
     * If <code>toSearchInPAttributeNames</code> is null or empty, the collection <code>pInstance.collectionName</code will be set to null.
     * @param pInstance value object that has to be related
     * @param collectionName name of the attribute of <code>pInstance</code> holding the collection of the relationships
     * @param pAttributeName property name of the generic elements of the collection <code>pInstance.collectionName</code> representing the value object which <code>pInstance</code> has to be related to
     * @param toSearchInPAttributeNames attributes in which <code>value</code> has to be searched
     * @param value value to search in <code>toSearchInPAttributeNames</code>
     * @param pAttributeNames of the generic value object of the collection <code>pInstance.collectionName</code> that has to be populated with <code>pInstance.valuesArray</code>
     * @param valuesArray values to use to populate <code>pAttributeNames</code>
     * @throws ApplicationException -
     *      If <code>pInstance</code> is null.</br>
     *      If <code>pAttributeNames</code> and <code>valuesArray</code> are not both null or both not null, and if they are not null don't have the same length.</br>
     */
    public void createRelationshipCollectionBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName, String[] toSearchInPAttributeNames, Object value,  String[] pAttributeNames,Object[] valuesArray)throws ApplicationException;

    /**
     *
     * @deprecated use {@link #createRelationshipCollectionBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName, String[] toSearchInPAttributeNames, Object value,  String[] pAttributeNames,Object[] valuesArray)}
     */
    public void setRelationshipElementWithQueryBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String[] toSearchInPAttributeNames,Object value)throws ApplicationException;



    /**
     * This method adds <code>toAddPInstance</code> to the collection <code>pInstance.pAttributeName</code> if not yet existing.</br>
     * If such collection is null an empty one is created.</br>
     * <code>pAttributeName</code> can be directly the name of an attribute of <code>pInstance</code>, or can be a dot separated list of attributes, that
     * establish a path through value objects from <code>pInstance</code> to the collection we want to add element to. <code>pAttributeName</code> has to be a walk through only value objects,
     * with no collection on his walk, except for the last attribute that must be a collection (note that if <code>pAttributeName</code> is a single token it must be a reference to a collection). If not an ApplicationException is thrown.</br>
     * All the null references to value objects on the path  <code>pAttributeName</code> (so not the reference to the last collection) will be retrieved from the underlying media store.
     * If the collection of the last reference on the path <code>pAttributeName</code> is null, an empty collection will be created (the final collection is never retrieved), and the last reference to the collection
     * will be populated with the created collection, while if some value object is still null after retrieving, no collection is created, and the method returns false  </br>
     * The collection implementation class will be the one specified in the mapping file (i.e. repository.xml for Ojb).</br>
     * See {@link it.aco.mandragora.as.ApplicationService#getReferenceCollectionOrEmptyIfNull(Object pInstance, String pAttributeName)}.</br>
     * This method search in the collection <code>pInstance.pAttributeName</code> an element having the same primary key values of <code>toAddPInstance</code>;
     * if such element is found <code>toAddPInstance</code> is not added to <code>pInstance.pAttributeName</code>, and a false is returned;
     * if such element is not found <code>toAddPInstance</code> will be added to <code>pInstance.pAttributeName</code>, its inverse foreign key referring to <code>pInstance</code>
     * will be set to the primary key values of <code>pInstance</code>, and a true is returned </br>
     *
     *
     * @param pInstance value object holding the collection that <code>toAddPInstance</code> have to be added to
     * @param pAttributeName attribute name or dot separated list of attributes representing the collection to which  <code>toAddPInstance</code> have to be added
     * @param toAddPInstance  value object to add to <code>pInstance.pAttributeName</code> if not yet present.
     * @return true if <code>toAddPInstance</code> is added to <code>pInstance.pAttributeName</code>, false otherwise.
     * @throws ApplicationException - If some one of the primary key fields of <code>toAddPInstance</code> is null.</br>
     *      If some one of the primary key fields of <code>pInstance</code> is null.</br>
     *      If <code>pInstance</code> is null or <code>toAddPInstance</code>.</br>
     */
    public boolean addToCollection(Object pInstance, String pAttributeName, Object toAddPInstance) throws ApplicationException;

    
    /**
     * @deprecated use {@link #addToCollection(Object pInstance, String pAttributeName, Object toAddPInstance)}
     */
    public boolean addElementToCollectionReference(Object pInstance, String pAttributeName, Object toAddPInstance) throws ApplicationException;



    /**
     * This method adds to the collection <code>pInstance.pAttributeName</code> all not yet present elements of the collection <code>valueObjectsCollectionToAdd</code>,
     * and returns true or false depending by if at least one elements is added or not.</br>
     * If <code>pInstance.pAttributeName</code> is null will be set to an empty collection, appositely created.</br>
     * <code>pAttributeName</code> can be directly the name of an attribute of <code>pInstance</code>, or can be a dot separated list of attributes, that
     * establish a path through value objects from <code>pInstance</code> to the collection we want to add elements to. <code>pAttributeName</code> has to be a walk through only value objects,
     * with no collection on his walk, except for the last attribute that must be a collection (note that if <code>pAttributeName</code> is a single token it must be a reference to a collection). If not an ApplicationException is thrown.</br>
     * All the null references to value objects on the path  <code>pAttributeName</code> (so not the reference to the last collection) will be retrieved from the underlying media store.
     * If the collection of the last reference on the path <code>pAttributeName</code> is null, and empty collection will be created (the final collection is never retrieved), and the last reference to the collection
     * will be populated with the created collection, while if some value object is still null after retrieving, no collection is created, and the method returns false. </br>
     * The collection implementation class will be the one specified in the mapping file (i.e. repository.xml for Ojb).</br>
     * See {@link it.aco.mandragora.as.ApplicationService#getReferenceCollectionOrEmptyIfNull(Object pInstance, String pAttributeName)}.</br>
     * For each element of <code>valueObjectsCollectionToAdd</code> this method search in the collection <code>pInstance.pAttributeName</code> an element having the same primary key values of the element being processed;
     * if such element is found it will not added to <code>pInstance.pAttributeName</code>;
     * if such element is not found the element being processed will be added to <code>pInstance.pAttributeName</code>, its inverse foreign key referring to <code>pInstance</code>
     * will be set to the primary key values of <code>pInstance</code>.</br>
     * If at least one element is added, will be returned true, otherwise false.</br>
     * Note that if there are element in <code>valueObjectsCollectionToAdd</code> with the same key values, just the first one in the iteration will be added, of course if not yet present, to the collection <code>pInstance.pAttributeName</code>
     *
     * @param pInstance value object holding the collection to which the elements not yet present of <code>valueObjectsCollectionToAdd</code> have to be added to
     * @param pAttributeName attribute name or dot separated list of attributes representing the collection to which  the elements not yet present of <code>valueObjectsCollectionToAdd</code> have to be added.
     * @param valueObjectsCollectionToAdd colletion of the elements that have to be added to <code>pInstance.pAttributeName</code>, if not yet present. If null it will be returned false
     * @return If at least one element is added, will be returned true, otherwise false.
     * @throws ApplicationException - If some one of the primary key fields of some elements of <code>valueObjectsCollectionToAdd</code> is null.</br>
     *      If some one of the primary key fields of <code>pInstance</code> is null.</br>
     *      If <code>pInstance</code> is null or some elements of <code>valueObjectsCollectionToAdd</code> is null.</br>
     *      If <code>pInstance.pAttributeName</code> is not a collection but a value object.</br>
     *      If <code>pAttributeName</code> is a dot separated list of attributes that represent a path starting from <code>pInstance</code>, and on this path to reach the collection
     *      to add the elements to, there is an other collection.</br>
     */
    public boolean addAllToCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd) throws ApplicationException;

    /**
     * @deprecated use {@link #addAllToCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd)}
     */
    public Object addCollectionToCollectionReference(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd) throws ApplicationException;


    /**
     * This method for each element of <code>valueObjectsCollectionToAdd</code> creates
     * a new instance of <code>targetRealClass</code> and its attributes whose names are in <code>targetPAttributeNames</code> are populated
     * with attributes values of the element of <code>valueObjectsCollectionToAdd</code>  being processed, and
     * if <code>pAttributeNames</code> and  <code>valuesArray</code> are not null, the created instance attributes names in <code>pAttributeNames</code> are set with values
     * in <code>valuesArray</code>.</br>
     * In other words, for each <code>i</code> the attribute <code>targetPAttributeNames[i]</code> of  the created instance
     * will be set with the value of the attribute <code>sourcePAttributeNames[i]</code> of  element of <code>valueObjectsCollectionToAdd</code>  being processed, and
     * if <code>pAttributeNames</code> and  <code>valuesArray</code> are not null,  for each <code>j</code>,
     * the attribute <code>pAttributeNames[j]</code> of the created instance will be set with <code>valuesArray[j]</code>.</br>
     * If <code>sourcePAttributeNames</code> and  <code>targetPAttributeNames</code> are both null, such attributes won't be set; if just one of them is null, it will assume the value of the other one.
     * For example if <code>sourcePAttributeNames</code> is null and <code>targetPAttributeNames</code> is not null, <code>sourcePAttributeNames</code> will have the value of <code>targetPAttributeNames</code> (and viceversa).</br>
     * If <code>targetRealClass</code> is null it won't be created a new instance, and in its place will be used the same element of <code>valueObjectsCollectionToAdd</code>  being processed,
     * so that the attributes <code>targetPAttributeNames</code> of the element being processed will be set with the values of the attributes <code>sourcePAttributeNames</code>
     * of the same element, and analagously, the attributes <code>pAttributeNames</code> of the element will be set with <code>valuesArray</code>.</br>
     * If some element of  <code>valueObjectsCollectionToAdd</code> is null, in its place will be used the same  instance of <code>targetRealClass</code> created during its processing,
     * so the attributes <code>targetPAttributeNames</code> of the created instance  will be set with the values of the attributes <code>sourcePAttributeNames</code>
     * of the same created instance. If some element of  <code>valueObjectsCollectionToAdd</code> is null , <code>targetRealClass</code> can't be null too, otherwise
     * an ApplicationException is thrown.</br>
     * If <code>valueObjectsCollectionToAdd</code> is null no job is done and false is returned.</br>
     * </br>
     * If <code>targetRealClass</code> is not null each one of the created instances, is checked if after the attributes setting still has some primary key attributes value null, and if so for at least one
     * of at least one of the created instances, an ApplicationException is thrown; if all the created instances have all the primary key values not null, for each created instance
     * this method will search in the collection <code>valueObjectsCollection</code> for some element having the same key values, and if not found, the created instance
     * will be added to <code>valueObjectsCollection</code>,otherwise it won't be added. Of course the primary key attributes of the elements of <code>valueObjectsCollection</code> must
     * have the same names of the primary key attributes of <code>targetRealClass</code>, otherwise an ApplicationException is thrown.</br>
     * </br>
     * If <code>targetRealClass</code> is null, each one of the elements of <code>valueObjectsCollectionToAdd</code>,  is checked if after the attributes setting has some primary key attributes value null, and if so for at least one
     * of at least one of them, an ApplicationException is thrown; if after the attributes setting all the elements of <code>valueObjectsCollectionToAdd</code> have all the primary key values not null, for each one of such elements
     * this method will search in the collection <code>valueObjectsCollection</code> for some element having the same key values, and if not found, the element
     * will be added to <code>valueObjectsCollection</code>,otherwise it won't be added. Of course the primary key attributes of the elements of <code>valueObjectsCollection</code> must
     * have the same names of the primary key attributes of of the elements of <code>valueObjectsCollectionToAdd</code>, otherwise an ApplicationException is thrown.</br>
     *
     *
     * @param targetRealClass class of the instances to create to add to <code>valueObjectsCollection</code>
     * @param valueObjectsCollection collection to add elements to. It can't be null.
     * @param valueObjectsCollectionToAdd Collection which elements attributes <code>sourcePAttributeNames</code>  will be used to populate  the created instances of <code>targetRealClass</code> attributes <code>targetPAttributeNames</code>,
     *           if <code>targetRealClass</code> is not null, or, if <code>targetRealClass</code> is null, collection which elements attributes <code>targetPAttributeNames</code>
     *           will be populated with the elements attributes <code>sourcePAttributeNames</code> of the same element, which elements attributes  <code>pAttributeNames</code>
     *           will be populated with <code>valuesArray</code>, and which elements will be added to <code>valueObjectsCollection</code>, if such collection doesn't hold an other element with
     *           the same key values. If null no job is done and false is returned.</br>
     * @param sourcePAttributeNames names of the attributes of the elements of <code>valueObjectsCollectionToAdd</code> to use to populate the created instances of <code>targetRealClass</code>  attributes, whose names are in <code>targetPAttributeNames</code>,
     *          if <code>targetRealClass</code> is not null, or, if <code>targetRealClass</code> is null, to use to populate the attributes <code>targetPAttributeNames</code> of the same element.</br>
     *          If null it will assume the value of <code>targetPAttributeNames</code>.</br>
     * @param targetPAttributeNames names of the attributes of the created instances of <code>targetRealClass</code>  to populate with attributes,  whose names are in <code>sourcePAttributeNames</code>, of the elements of <code>valueObjectsCollectionToAdd</code>
     *          if <code>targetRealClass</code> is not null, or, if <code>targetRealClass</code> is null, names of the attributes of the elements of <code>valueObjectsCollectionToAdd</code> to populate with the attributes <code>sourcePAttributeNames</code>
     *          of the same element.</br>
     *          If null it will assume the value of <code>sourcePAttributeNames</code>.</br>
     * @param pAttributeNames names of the attributes of the created instances of <code>targetRealClass</code> to populate with values in <code>valuesArray</code>
     *          if <code>targetRealClass</code> is not null, or, if <code>targetRealClass</code> is null, names of the attributes of the elements of <code>valueObjectsCollectionToAdd</code>
     *          to populate with values in <code>valuesArray</code>.</br>
     * @param valuesArray values to use to populate the attributes of the created instances of <code>targetRealClass</code> attributes in <code>pAttributeNames</code>
     *          if <code>targetRealClass</code> is not null, or, if <code>targetRealClass</code> is null, to populate the attributes in <code>pAttributeNames</code>
     *          of the elements of <code>valueObjectsCollectionToAdd</code>.</br>
     * @return true if some element is added to <code>valueObjectsCollection</code>, and false otherwise.
     * @throws ApplicationException  -
     *      If <code>targetRealClass</code> is null and <code>valueObjectsCollectionToAdd</code> holds some null value.</br>
     *      If only one of the array <code>pAttributeNames</code> and <code>valuesArray</code> is null, and the other one is not null.</br>
     *      If <code>pAttributeNames</code> and <code>valuesArray</code> are both not null, and don't have the same length.</br>
     *      If <code>targetRealClass</code> is not null and at least one of the created instances, after the attributes setting still have some primary key attribute value null.</br>
     *      If <code>targetRealClass</code> is null and at least one of the elements of <code>valueObjectsCollectionToAdd</code>, after the attributes setting still have some primary key attribute value null.</br>
     *      If <code>targetRealClass</code> is not null and the primary key attributes of the elements of <code>valueObjectsCollection</code> don't have the same names of the primary key attributes of <code>targetRealClass</code>.</br>
     *      If <code>targetRealClass</code> is null and the primary key attributes of the elements of <code>valueObjectsCollection</code> don't have the same names of the primary key attributes of the elements of <code>valueObjectsCollectionToAdd</code>.</br>
     *      If <code>valueObjectsCollection</code> is null.</br>
     */
    public boolean addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames,Object[] valuesArray) throws ApplicationException;



    /**
     * @deprecated use {@link #addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames,Object[] valuesArray)}
     */
    public Collection addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection, String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames, Object[] valuesArray ) throws ApplicationException;

    /**
     * @deprecated use {@link #addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames)}
     */
    public Collection addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection,String[] sourcePAttributeNames,String[] targetPAttributeNames) throws ApplicationException;




    /**
     * For each elements of <code>valueObjectsCollectionToAdd</code>, this method searches an element in <code>valueObjectsCollection</code> which attributes,
     * whose names are in <code>pAttributeNames</code>, have the same values of the same attributes of the element of  <code>valueObjectsCollectionToAdd</code>
     * being processed. If such element is not found, the element of  <code>valueObjectsCollectionToAdd</code> being processed will be added to <code>valueObjectsCollection</code>, otherwise no.</br>
     * The elements of both collection <code>valueObjectsCollectionToAdd</code> and <code>valueObjectsCollection</code> must have attributes named as <code>pAttributeNames</code>, otherwise an ApplicationException is thrown.</br>
     * Note that if there are elements in <code>valueObjectsCollectionToAdd</code> with the same values for the attributes  <code>pAttributeNames</code>,
     * just the first one in the iteration will be added, of course if not yet present, to the collection <code>valueObjectsCollection</code>
     * If  <code>valueObjectsCollectionToAdd</code> is null no job is done and false is returned.</br>
     *
     * @param valueObjectsCollection Collection to be added the elements of <code>valueObjectsCollectionToAdd</code> to. It can' be null.
     * @param valueObjectsCollectionToAdd Elements to add to <code>valueObjectsCollection</code>. If null no job is done and false is returned.</br>
     * @param pAttributeNames attributes to compare elements of  <code>valueObjectsCollectionToAdd</code> with the <code>valueObjectsCollection</code> ones
     * @return  true if some element of <code>valueObjectsCollectionToAdd</code> is added to <code>valueObjectsCollection</code>, false otherwise
     * @throws ApplicationException  -
     * If <code>valueObjectsCollection</code> is null</br>
     * If some element of <code>valueObjectsCollectionToAdd</code> is null.</br>
     * If some element of <code>valueObjectsCollectionToAdd</code> or of <code>valueObjectsCollectionToAdd</code> don0t have some attributes of <code>pAttributeNames</code>.</br>
     */
    public boolean addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, String[] pAttributeNames) throws ApplicationException;

    /**
     *
     * For each elements of <code>valueObjectsCollectionToAdd</code>, this method searches an element in <code>valueObjectsCollection</code> which attributes,
     * whose names are the same of the primary key fields of <code>realClass</code>, have the same values of the same attributes of the element of  <code>valueObjectsCollectionToAdd</code>
     * being processed. If such element is not found, the element of  <code>valueObjectsCollectionToAdd</code> being processed will be added to <code>valueObjectsCollection</code>, otherwise no.</br>
     * The elements of both collection <code>valueObjectsCollectionToAdd</code> and <code>valueObjectsCollection</code> must have attributes named as the primary key fields of
     * <code>realClass</code>, other wise an ApplicationException is thrown.</br>
     * Note that if there are elements in <code>valueObjectsCollectionToAdd</code> with the same values for the attributes named as the primary key fields of <code>realClass</code>,
     * just the first one in the iteration will be added, of course if not yet present, to the collection <code>valueObjectsCollection</code>
     * If  <code>valueObjectsCollectionToAdd</code> no job is done and false is returned.</br>
     *
     * @param valueObjectsCollection  Collection to be added the elements of <code>valueObjectsCollectionToAdd</code> to. It can' be null.
     * @param valueObjectsCollectionToAdd  Elements to add to <code>valueObjectsCollection</code>. If null no job is done and false is returned.</br>
     * @param realClass class whose primary key fields are used to compare the elements of <code>valueObjectsCollectionToAdd</code> with the elements of  <code>valueObjectsCollection</code>
     * @return  true if some element of <code>valueObjectsCollectionToAdd</code> is added to <code>valueObjectsCollection</code>, false otherwise
     * @throws ApplicationException -
     * If <code>valueObjectsCollection</code> is null</br>
     * If some element of <code>valueObjectsCollectionToAdd</code> is null.</br>
     * If some element of <code>valueObjectsCollectionToAdd</code> or of <code>valueObjectsCollectionToAdd</code> don0t have some attributes that is primary key of <code>realClass</code>
     */
    public boolean addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, Class realClass)  throws ApplicationException;

    /**
     * @deprecated use {@link #addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, Class realClass)}
     */
    public Collection mergeTwoCollections(Collection valueObjectsCollection, Collection valueObjectsCollectionToAdd, Class realClass) throws ApplicationException;



    /**
     * This method has the same behavior of {@link #addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames,Object[] valuesArray)}
     * where <code>pAttributeNames</code> and <code>valuesArray</code> are both not null.</br>
     * </br>
     * @param targetRealClass  class of the instances to create to add to <code>valueObjectsCollection</code>
     * @param valueObjectsCollection  collection to add elements to. It can't be null.
     * @param valueObjectsCollectionToAdd Collection which elements attributes <code>sourcePAttributeNames</code>  will be used to populate  the created instances of <code>targetRealClass</code> attributes <code>targetPAttributeNames</code>,
     *           if <code>targetRealClass</code> is not null, or, if <code>targetRealClass</code> is null, collection which elements attributes <code>targetPAttributeNames</code>
     *           will be populated with the elements attributes <code>sourcePAttributeNames</code> of the same element,  and which elements will be added to <code>valueObjectsCollection</code>, if such collection doesn't hold an other element with
     *           the same key values. If null no job is done and false is returned.</br>
     * @param sourcePAttributeNames names of the attributes of the elements of <code>valueObjectsCollectionToAdd</code> to use to populate the created instances of <code>targetRealClass</code>  attributes, whose names are in <code>targetPAttributeNames</code>,
     *          if <code>targetRealClass</code> is not null, or, if <code>targetRealClass</code> is null, to use to populate the attributes <code>targetPAttributeNames</code> of the same element.</br>
     *          If null it will assume the value of <code>targetPAttributeNames</code>.</br>
     * @param targetPAttributeNames names of the attributes of the created instances of <code>targetRealClass</code>  to populate with attributes,  whose names are in <code>sourcePAttributeNames</code>, of the elements of <code>valueObjectsCollectionToAdd</code>
     *          if <code>targetRealClass</code> is not null, or, if <code>targetRealClass</code> is null, names of the attributes of the elements of <code>valueObjectsCollectionToAdd</code> to populate with the attributes <code>sourcePAttributeNames</code>
     *          of the same element.</br>
     *          If null it will assume the value of <code>sourcePAttributeNames</code>.</br>
     * @return if some element is added to <code>valueObjectsCollection</code>, and false otherwise.
     * @throws ApplicationException -
     *      If <code>targetRealClass</code> is null and <code>valueObjectsCollectionToAdd</code> holds some null value.</br>
     *      If <code>targetRealClass</code> is not null and at least one of the created instances, after the attributes setting still have some primary key attribute value null.</br>
     *      If <code>targetRealClass</code> is null and at least one of the elements of <code>valueObjectsCollectionToAdd</code>, after the attributes setting still have some primary key attribute value null.</br>
     *      If <code>targetRealClass</code> is not null and the primary key attributes of the elements of <code>valueObjectsCollection</code> don't have the same names of the primary key attributes of <code>targetRealClass</code>.</br>
     *      If <code>targetRealClass</code> is null and the primary key attributes of the elements of <code>valueObjectsCollection</code> don't have the same names of the primary key attributes of the elements of <code>valueObjectsCollectionToAdd</code>.</br>
     *      If <code>valueObjectsCollection</code> is null.</br>
     */
    public boolean addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames) throws ApplicationException;

    /**
     * This method looks for all the elements of <code>valueObjectsCollectionToAdd</code> that have the value of the attribute <code>pAttributeNameMapKey</code> equals to
     * some key mapped to a not null value in the <code>map</code>, and adds  each one of such elements to the collection  <code>valueObjectsCollection</code>,
     * if such collection doesn't hold yet an element with the same value for the attribute <code>pAttributeNameMapKey</code> of the element being processed.</br>
     * Note that the value of the attribute <code>pAttributeNameMapKey</code> is compared to the keys of the <code>map</code> and not with the values mapped to the keys.</br>
     * If <code>map</code> is null , nothing is done and false is returned
     * @param valueObjectsCollection collection to add elements to
     * @param map Map which keys that are mapped to not null values are used to compare the values of the attribute <code>pAttributeNameMapKey</code> of the elements of <code>valueObjectsCollectionToAdd</code>
     * @param valueObjectsCollectionToAdd collection which elements which the values of the attribute <code>pAttributeNameMapKey</code> is equals to at least one of the keys of <code>map</code>
     *      mapped to not null values, are added to <code>valueObjectsCollection</code>.
     * @param pAttributeNameMapKey name of the attribute of the elements of <code>valueObjectsCollectionToAdd</code> and <code>valueObjectsCollection</code> used to compare
     * @return  true if some element is added to  <code>valueObjectsCollection</code>, false otherwise.</br>
     * @throws ApplicationException -
     *      if <code>valueObjectsCollection</code> is null.</br>
     *      if <code>pAttributeNameMapKey</code> is null.</br>
     *      If some element of  <code>valueObjectsCollection</code> or <code>valueObjectsCollectionToAdd</code> don't have <code>pAttributeNameMapKey</code>  as attribute.</br>
     */
    public boolean addAllToCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAdd, String pAttributeNameMapKey) throws ApplicationException;



    /**
     * This method removes from the collection  <code>pInstance.pAttributeName</code>  all the elements not present in the collection
     * <code>toRetainValueObjectsCollection</code> .</br>
     * in other words each element of <code>pInstance.pAttributeName</code> is searched in <code>toRetainValueObjectsCollection</code>,  comparing with the attributes
     * that are primary keys of the generic element of <code>pInstance.pAttributeName</code>, and if it is not found, it is removed from <code>valueObjectsCollection</code>.</br>
     * If <code>valueObjectsCollection</code> is null nothing is done and false is returned.</br>
     * If <code>toRetainValueObjectsCollection</code> is null or empty, if  <code>valueObjectsCollection</code> is empty a false is returned and nothing is done
     * otherwise <code>valueObjectsCollection</code> is cleared and true is returned.</br>
     *
     * @param pInstance value object holding the collection to remove elements from
     * @param pAttributeName name attribute holding the collection in <code>pInstance</code>
     * @param toRetainValueObjectsCollection  collection holding the elements that have not to be removed from <code>pInstance.pAttributeName</code>
     * @return  if some element is removed, or false if not.
     * @throws ApplicationException for any trouble
     */
    public boolean retainAllInCollection(Object pInstance, String pAttributeName, Collection  toRetainValueObjectsCollection) throws ApplicationException;

    /**
     * This method removes from the collection  <code>valueObjectsCollection</code>  all the elements not present in the collection
     * <code>toRetainValueObjectsCollection</code> .</br>
     * in other words each element of <code>valueObjectsCollection</code> is searched in <code>toRetainValueObjectsCollection</code>,  comparing with the primary keys attributes of
     * <code>realClass</code>, and if it is not found, it is removed from <code>valueObjectsCollection</code>.</br>
     * If <code>valueObjectsCollection</code> is null nothing is done and false is returned.</br>
     * If <code>toRetainValueObjectsCollection</code> is null or empty, if  <code>valueObjectsCollection</code> is empty a false is returned and nothing is done
     * otherwise <code>valueObjectsCollection</code> is cleared and true is returned.</br>
     *
     * @param valueObjectsCollection  collection to remove elements from
     * @param toRetainValueObjectsCollection collection holding the elements that have not to be removed from <code>valueObjectsCollection</code>
     * @param realClass class which primary keys are used to compare
     * @return if some element is removed, or false if not.
     * @throws ApplicationException - if <code>realClass</code> is null.
     */
    public boolean retainAllInCollection(Collection valueObjectsCollection, Collection  toRetainValueObjectsCollection, Class realClass) throws ApplicationException;

    /**
     * This method removes from the collection  <code>valueObjectsCollection</code>  all the elements not present in the collection
     * <code>toRetainValueObjectsCollection</code> .</br>
     * in other words each element of <code>valueObjectsCollection</code> is searched in <code>toRetainValueObjectsCollection</code>,  comparing with the attributes
     * <code>pAttributeNames</code>, and if it is not found, it is removed from <code>valueObjectsCollection</code>.</br>
     * If <code>valueObjectsCollection</code> is null nothing is done and false is returned.</br>
     * If <code>toRetainValueObjectsCollection</code> is null or empty, if  <code>valueObjectsCollection</code> is empty a false is returned and nothing is done
     * otherwise <code>valueObjectsCollection</code> is cleared and true is returned.</br>
     *
     * @param valueObjectsCollection  collection to remove elements from.
     * @param toRetainValueObjectsCollection collection holding the elements that have not to be removed from <code>valueObjectsCollection</code>
     * @param pAttributeNames attributes  used to compare <code>valueObjectsCollection</code> elements with <code>toRetainValueObjectsCollection</code> elements
     * @return true if some element is removed, or false if not.
     * @throws ApplicationException - if <code>pAttributeNames</code> is null
     */
    public boolean retainAllInCollection(Collection valueObjectsCollection, Collection toRetainValueObjectsCollection, String[] pAttributeNames) throws ApplicationException;

    /**
     * This method removes from the collection <code>valueObjectsCollection</code> all its elements for which the value of their attribute <code>pAttributeNameMapKey</code>
     * used as key in <code>map</code> return a null value.</br>
     * It will be returned true is some element is removed, and false otherwise.</br>
     * If <code>valueObjectsCollection</code> is null , nothing is done and false will be returned.</br>
     * If <code>map</code> is null, all the elements will be removed from <code>valueObjectsCollection</code> and true will be returned.</br>
     *
     * @param valueObjectsCollection collection to remove elements from.
     * @param map  map to use to check if the value of the attribute  <code>pAttributeNameMapKey</code> of an element of <code>valueObjectsCollection</code>, used as key, is mapped to a null value or not
     * @param pAttributeNameMapKey attribute which value is used as key of <code>map</code>
     * @return  true if some element is removed, and false otherwise.</br>
     * @throws ApplicationException -
     *      If <code>pAttributeNameMapKey</code> is null.</br>
     *      If some element of  <code>valueObjectsCollection</code> don't have <code>pAttributeNameMapKey</code>  as attribute.</br>
     */
    public boolean retainAllInCollection(Collection valueObjectsCollection, Map map, String pAttributeNameMapKey) throws ApplicationException;



    /**
     * @deprecated use {@link #retainAllInCollection(Collection valueObjectsCollection, Map map, String pAttributeNameMapKey)}
     */
    public void removeFromCollectionElementsNotInMap(Collection valueObjectsCollection, HashMap map,  String pAttributeNameMapKey) throws ApplicationException;

    /**
     * This method has the same behavior of applying in sequence the two methods :</br>
     * {@link #retainAllInCollection(Object pInstance, String pAttributeName, Collection  toRetainValueObjectsCollection) } </br>
     * {@link #addAllToCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd)} </br>
     * where both  <code>toRetainValueObjectsCollection</code> and <code>valueObjectsCollectionToAdd</code> are <code>valueObjectsCollectionToAddAndRetain</code>
     *
     * @param pInstance value object holding the collection to add elements to and remove from
     * @param pAttributeName name of the attribute of <code>pInstance</code> that is the collection   to add elements to and remove from
     * @param valueObjectsCollectionToAddAndRetain collection holding the elements that have not to be removed from <code>pInstance.pAttributeName</code> and that are to be added if not yet present
     * @return true if some element is removed or added, and false otherwise
     * @throws ApplicationException  -
     *      If some one of the primary key fields of some elements of <code>valueObjectsCollectionToAddAndRetain</code> is null.</br>
     *      If some one of the primary key fields of <code>pInstance</code> is null.</br>
     *      If <code>pInstance</code> is null or some elements of <code>valueObjectsCollectionToAddAndRetain</code> is null.</br>
     *      If <code>pInstance.pAttributeName</code> is not a collection but a value object..</br>
     *      If <code>pAttributeName</code> is a dot separated list of attributes that represent a path starting from <code>pInstance</code>, and on this path to reach the collection
     *      to add the elements to, there is an other collection..</br>
     *
     */
    public boolean addToRetainInCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAddAndRetain)throws ApplicationException;

    /**
     * This method has the same behavior of applying in sequence the two methods :</br>
     * {@link #retainAllInCollection(Collection valueObjectsCollection, Collection  toRetainValueObjectsCollection, Class realClass)} </br>
     * {@link #addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, Class realClass)} </br>
     * where both  <code>toRetainValueObjectsCollection</code> and <code>valueObjectsCollectionToAdd</code> are <code>valueObjectsCollectionToAddAndRetain</code>
     *
     * @param valueObjectsCollection  collection to add elements to and remove from
     * @param valueObjectsCollectionToAddAndRetain  collection holding the elements that have not to be removed from <code>valueObjectsCollection</code> and that have to be added if not yet present
     * @param realClass class which primary keys are used to compare
     * @return  true if some element is removed or added, and false otherwise
     * @throws ApplicationException  -
     *      If <code>realClass</code> is null.</br>
     *      If <code>valueObjectsCollection</code> is null</br>
     *      If some element of <code>valueObjectsCollectionToAddAndRetain</code> is null.</br>
     *      If some element of <code>valueObjectsCollectionToAddAndRetain</code> or of <code>valueObjectsCollectionToAddAndRetain</code> don't have some attributes that is primary key of <code>realClass</code>
     */
    public boolean addToRetainInCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAddAndRetain, Class realClass) throws ApplicationException;

    /**
     * This method has the same behavior of applying in sequence the two methods :</br>
     * {@link #retainAllInCollection(Collection valueObjectsCollection, Collection toRetainValueObjectsCollection, String[] pAttributeNames)} </br>
     * {@link #addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, String[] pAttributeNames)} </br>
     * where both  <code>toRetainValueObjectsCollection</code> and <code>valueObjectsCollectionToAdd</code> are <code>valueObjectsCollectionToAddAndRetain</code>
     *
     * @param valueObjectsCollection collection to add elements to and remove from
     * @param valueObjectsCollectionToAddAndRetain collection holding the elements that have not to be removed from <code>valueObjectsCollection</code> and that have to be added if not yet present
     * @param pAttributeNames  attributes  used to compare <code>valueObjectsCollection</code> elements with <code>valueObjectsCollectionToAddAndRetain</code> elements
     * @return  true if some element is removed or added, and false otherwise
     * @throws ApplicationException -
     *      if <code>pAttributeNames</code> is null.</br>
     *      If <code>valueObjectsCollection</code> is null</br>
     *      If some element of <code>valueObjectsCollectionToAddAndRetain</code> is null.</br>
     *      If some element of <code>valueObjectsCollectionToAddAndRetain</code> or of <code>valueObjectsCollectionToAddAndRetain</code> don0t have some attributes of <code>pAttributeNames</code>.</br>
     */
    public boolean addToRetainInCollection(Collection valueObjectsCollection, Collection valueObjectsCollectionToAddAndRetain, String[] pAttributeNames) throws ApplicationException;


    /**
     * This method removes from the collection <code>valueObjectsCollection</code> all its elements for which the value of their attribute <code>pAttributeNameMapKey</code>
     * used as key in <code>map</code> return a null value.</br>
     * </br>
     * Then this method looks for all the elements of <code>valueObjectsCollectionToAddAndRetain</code> that have the value of the attribute <code>pAttributeNameMapKey</code> equals to
     * some key mapped to a not null value in the <code>map</code>, and adds  each one of such elements to the collection  <code>valueObjectsCollection</code>,
     * if such collection doesn't hold yet an element with the same value for the attribute <code>pAttributeNameMapKey</code> of the element being processed.</br>
     * Note that the value of the attribute <code>pAttributeNameMapKey</code> is compared to the keys of the <code>map</code> and not with the values mapped to the keys.</br>
     * </br>
     * It will be returned true is some element is removed or added, and false otherwise.</br>
     * If <code>map</code> is null, all the elements will be removed from <code>valueObjectsCollection</code> and true will be returned.</br>
     *
     * @param valueObjectsCollection collection to add elements to and remove from
     * @param map its keys mapped to not null values are used as the attributes values one of which  must assume an element of <code>valueObjectsCollectionToAddAndRetain</code>  to be added to <code>valueObjectsCollection</code>, and
     *      and its keys mapped to null values are used as the attributes values one of which  must assume an element of <code>valueObjectsCollection</code> to be removed from  the same collection.</br>
     * @param valueObjectsCollectionToAddAndRetain  collection which elements which the values of the attribute <code>pAttributeNameMapKey</code> is equals to at least one of the keys of <code>map</code>
     *      mapped to not null values, are added to <code>valueObjectsCollection</code>.
     * @param pAttributeNameMapKey name of the attribute of the elements of <code>valueObjectsCollectionToAddAndRetain</code> and <code>valueObjectsCollection</code> used to compare
     * @return true if some element is removed or added, and false otherwise
     * @throws ApplicationException -
     *      if <code>valueObjectsCollection</code> is null.</br>
     *      if <code>pAttributeNameMapKey</code> is null.</br>
     *      If some element of  <code>valueObjectsCollection</code> or <code>valueObjectsCollectionToAddAndRetain</code> don't have <code>pAttributeNameMapKey</code>  as attribute.</br>
     */
    public boolean addToRetainInCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)throws ApplicationException;


    /**
     * @deprecated use {@link #addToRetainInCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)}
     *
     */
    public void refreshCollectionWithOtherCollectionUsingMapAsRelation(Collection valueObjectsCollection, HashMap map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey) throws ApplicationException;



    /**
     * All elements of the collection <code>pInstance.pAttributeName</code> will be compared with <code>toRemovePInstance</code> and the matching ones will be removed from <code>valueObjectsCollection</code>.</br>
     * Objects are compared by fields that are primary keys in <code>toRemovePInstance</code></br>
     * Note that instances are removed just from the collection and not from the underlying media store.  </br>
     *
     * If <code>pInstance.pAttributeName</code> is null nothing is done and false is returned
     *
     * @param pInstance bean holding collection  which look for in
     * @param pAttributeName   attribute of <code>pInstance</code> representing the collection which look for in.
     * @param toRemovePInstance element to look for in collection to remove
     * @return true if an element is removed, false if not
     * @throws ApplicationException   for any trouble
     */
    public boolean removeFromCollection(Object pInstance, String pAttributeName, Object toRemovePInstance) throws ApplicationException;

    /**
     * If <code>valueObjectsCollection</code> is null nothing is done and false is returned
     * All the elements of <code>valueObjectsCollection</code> will be compared with <code>toRemovePInstance</code> and the matching ones will be removed from <code>valueObjectsCollection</code>.</br>
     * Objects are compared by fields that are primary keys in <code>toRemovePInstance</code></br>
     * Note that instances are removed just from the collection and not from the underlying media store.
     *
     * @param valueObjectsCollection: collection in which looking for
     * @param toRemovePInstance: element to look for in collection to remove
     * @return true if an element is removed, false if not
     * @throws ApplicationException   for any trouble
     */
    public boolean removeFromCollection(Collection valueObjectsCollection, Object toRemovePInstance) throws ApplicationException;




    /**
     * @deprecated use {@link #removeFromCollection(Object pInstance, String pAttributeName, Object toRemovePInstance)}
     */
    public boolean removeElementFromCollectionReference(Object pInstance, String pAttributeName, Object toRemovePInstance) throws ApplicationException;



    /**
     * This method removes from the collection <code>pInstance.pAttributeName</code> all the elements which primary key values are the same
     * of some element of the collection <code>valueObjectsCollectionToRemove</code>.</br>
     * If some element is removed from <code>pInstance.pAttributeName</code> this method returns true, false otherwise.</br>
     * If <code>pInstance.pAttributeName</code> is null, nothing is done and false is returned.</br>
     *
     * @param pInstance  value object  holding the collection <code>pInstance.pAttributeName</code>.
     * @param pAttributeName attribute name of <code>pInstance</code> or dot separated list of attributes that leads from <code>pInstance</code> to the collection we want to remove elements from.
     * @param valueObjectsCollectionToRemove collection holding the elements to remove from <code>valueObjectsCollection</code>.
     * @return true if  some element is removed from <code>valueObjectsCollection</code>, false otherwise.
     * @throws ApplicationException for any trouble
     */
    public boolean removeAllFromCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToRemove) throws ApplicationException;




    /**
     * This method looks in the underlying media store the instance of the class <code>sourceRealClass</code> whose primary keys values are expressed by <code>pkValues</code>
     * and primary keys fields are expressed by <code>pkFieldNames</code>(see {@link #findByPrimaryKey(Class realClass,String[] pkFieldNames,Object[] pkValues)}) </br>
     * Once got such instance this method creates a new instance of the class <code>targetRealClass</code>, and if <code>pAttributeNames</code> and  <code>valuesArray</code>
     * are not null, the new instance of the class <code>targetRealClass</code> attributes names in <code>pAttributeNames</code> are set with values in <code>valuesArray</code>.</br>
     * In other words,if <code>pAttributeNames</code> and  <code>valuesArray</code> are not null,  for each <code>j</code>,
     * the attribute <code>pAttributeNames[j]</code> of  <code>pInstance</code> will be set with <code>valuesArray[j]</code>.</br>
     * If the retrieved instance of <code>sourceRealClass</code> is null,
     * the created instance of <code>targetRealClass</code> will be returned, otherwise, all its attributes in <code>targetPAttributeNames</code> will be set with the value of the
     * attributes in <code>sourcePAttributeNames</code> of the instance of <code>sourceRealClass</code> retrieved from the media store.Of course this is done
     * if <code>sourcePAttributeNames</code>  and  <code>targetPAttributeNames</code> are not both null at the same time.</br>
     * In other words, if the retrieved instance of <code>sourceRealClass</code> is not null, and <code>sourcePAttributeNames</code>  and  <code>targetPAttributeNames</code> are not both null at the same time,
     * for each <code>i</code> the attribute <code>targetPAttributeNames[i]</code> of the created instance of <code>targetRealClass</code>
     * will be set with the value of the attribute <code>sourcePAttributeNames[i]</code> of the retrieved instance of <code>sourceRealClass</code>. </br>
     * If just one of code>sourcePAttributeNames</code>  and  <code>targetPAttributeNames</code> is null, it will assume the value of the other one.
     * For example if <code>sourcePAttributeNames</code> is null and <code>targetPAttributeNames</code> is not null, <code>sourcePAttributeNames</code> will have the value of <code>targetPAttributeNames</code> (and viceversa).</br>
     * Of course if the two arrays <code>targetPAttributeNames</code> and <code>sourcePAttributeNames</code> are not both null, must have the same length, otherwise a ApplicationException will be thrown. </br>
     *
     * @param sourceRealClass class of the instance that has to be retrieved form the media store using the primary keys values expressed by <code>pkValues</code> and primary keys fields are expresseb by <code>pkFieldNames</code>
     * @param pkFieldNames primary key fields of the instance of the class <code>sourceRealClass</code> that has to be retrieved from the media store.
     * @param pkValues   primary key values of the instance of the class <code>sourceRealClass</code> that has to be retrieved from the media store.
     * @param targetRealClass class of the instance that has to be created and returned.
     * @param sourcePAttributeNames attributes names of the retrieved instance of <code>sourceRealClass</code> that will be used to set the attributes of the created instance of <code>targetRealClass</code> in <code>targetPAttributeNames</code></br>
     *                              If null it will assume the value of <code>targetPAttributeNames</code>
     * @param targetPAttributeNames Attributes names of the created instance of <code>targetRealClass</code> that will be set with the values of the attributes of the retrieved instance of <code>sourceRealClass</code> in <code>sourcePAttributeNames</code></br>
     *                              If null it will assume the value of <code>sourcePAttributeNames</code>
     * @param pAttributeNames names of <code>targetRealClass</code> instance attributes to populate with values in <code>valuesArray</code>
     * @param valuesArray  values to use to populate <code>targetRealClass</code> instance attributes in <code>pAttributeNames</code>.
     * @return a new instance of <code>targetRealClass</code>
     * @throws ApplicationException -
     *      If <code>sourceRealClass</code>  or <code>targetRealClass</code> or <code>pkFieldNames</code> are null.</br>
     *      If the two arrays <code>targetPAttributeNames</code> and <code>sourcePAttributeNames</code> are both not null, and don't have the same length. </br>
     *      If <code>pAttributeNames</code> and <code>valuesArray</code> are not both null or both not null, and if they are not null don't have the same length.</br>
     */
    public Object createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray) throws ApplicationException;

    /**
     * This method looks in the underlying media store the instance of the class <code>sourceRealClass</code> whose primary keys values are expressed by <code>pkValues</code>
     * and primary keys fields are expressed by <code>pkFieldNames</code>(see {@link #findByPrimaryKey(Class realClass,String[] pkFieldNames,,Object[] pkValues)}) </br>
     * Once got such instance this method creates a new instance of the class <code>targetRealClass</code>, and, if the retrieved instance of <code>sourceRealClass</code> is null,
     * the created instance of <code>targetRealClass</code> will be returned, otherwise, all his attributes in <code>targetPAttributeNames</code> will be set with the value of the
     * attributes in <code>sourcePAttributeNames</code> of the instance of <code>sourceRealClass</code> retrieved from the media store.Of course this is done
     * if <code>sourcePAttributeNames</code>  and  <code>targetPAttributeNames</code> are not both null at the same time.</br>
     * In other words, if the retrieved instance of <code>sourceRealClass</code> is not null, and <code>sourcePAttributeNames</code>  and  <code>targetPAttributeNames</code> are not both null at the same time,
     * for each <code>i</code> the attribute <code>targetPAttributeNames[i]</code> of the created instance of <code>targetRealClass</code>
     * will be set with the value of the attribute <code>sourcePAttributeNames[i]</code> of the retrieved instance of <code>sourceRealClass</code>. </br>
     * If just one of code>sourcePAttributeNames</code>  and  <code>targetPAttributeNames</code> is null, it will assume the value of the other one.
     * For example if <code>sourcePAttributeNames</code> is null and <code>targetPAttributeNames</code> is not null, <code>sourcePAttributeNames</code> will have the value of <code>targetPAttributeNames</code> (and viceversa).</br>
     * Of course if the two arrays <code>targetPAttributeNames</code> and <code>sourcePAttributeNames</code> are not both null, must have the same length, otherwise a ApplicationException will be thrown. </br>
     *
     * @param sourceRealClass class of the instance that has to be retrieved form the media store using the primary keys values expressed by <code>pkValues</code> and primary keys fields are expresseb by <code>pkFieldNames</code>
     * @param pkFieldNames primary key fields of the instance of the class <code>sourceRealClass</code> that has to be retrieved from the media store.
     * @param pkValues  primary key values of the instance of the class <code>sourceRealClass</code> that has to be retrieved from the media store.
     * @param targetRealClass class of the instance that has to be created and returned.
     * @param sourcePAttributeNames attributes names of the retrieved instance of <code>sourceRealClass</code> that will be used to set the attributes of the created instance of <code>targetRealClass</code> in <code>targetPAttributeNames</code></br>
     *                              If null it will assume the value of <code>targetPAttributeNames</code>
     * @param targetPAttributeNames Attributes names of the created instance of <code>targetRealClass</code> that will be set with the values of the attributes of the retrieved instance of <code>sourceRealClass</code> in <code>sourcePAttributeNames</code></br>
     *                              If null it will assume the value of <code>sourcePAttributeNames</code>
     * @return a new instance of <code>targetRealClass</code>
     * @throws ApplicationException -
     *      If <code>sourceRealClass</code>  or <code>targetRealClass</code> or <code>pkFieldNames</code> are null.</br>
     *      If the two arrays <code>targetPAttributeNames</code> and <code>sourcePAttributeNames</code> are both not null, and don't have the same length. </br>
     *
     */
    public Object createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames) throws ApplicationException;

    /**
     * This method looks in the underlying media store the instance of the class <code>sourceRealClass</code> whose primary keys values are expressed by <code>pkValues</code>. (see {@link #findByPrimaryKey(Class realClass,Object[] pkValues)}) </br>
     * Once got such instance this method creates a new instance of the class <code>targetRealClass</code>, and,
     * if <code>pAttributeNames</code> and  <code>valuesArray</code>
     * are not null, the new instance of the class <code>targetRealClass</code> attributes names in <code>pAttributeNames</code> are set with values in <code>valuesArray</code>.</br>
     * In other words,if <code>pAttributeNames</code> and  <code>valuesArray</code> are not null,  for each <code>j</code>,
     * the attribute <code>pAttributeNames[j]</code> of  <code>pInstance</code> will be set with <code>valuesArray[j]</code>.</br>
     * If the retrieved instance of <code>sourceRealClass</code> is null,
     * the created instance of <code>targetRealClass</code> will be returned, otherwise, all his attributes in <code>targetPAttributeNames</code> will be set with the value of the
     * attributes in <code>sourcePAttributeNames</code> of the instance of <code>sourceRealClass</code> retrieved from the media store. Of course this is done
     * if <code>sourcePAttributeNames</code>  and  <code>targetPAttributeNames</code> are not both null at the same time.</br>
     * In other words, if the retrieved instance of <code>sourceRealClass</code> is not null, and <code>sourcePAttributeNames</code>  and  <code>targetPAttributeNames</code> are not both null at the same time,
     * for each <code>i</code> the attribute <code>targetPAttributeNames[i]</code> of the created instance of <code>targetRealClass</code>
     * will be set with the value of the attribute <code>sourcePAttributeNames[i]</code> of the retrieved instance of <code>sourceRealClass</code>. </br>
     * If just one of code>sourcePAttributeNames</code>  and  <code>targetPAttributeNames</code> is null, it will assume the value of the other one.
     * For example if <code>sourcePAttributeNames</code> is null and <code>targetPAttributeNames</code> is not null, <code>sourcePAttributeNames</code> will have the value of <code>targetPAttributeNames</code> (and viceversa).</br>
     * Of course if the two arrays <code>targetPAttributeNames</code> and <code>sourcePAttributeNames</code> are not both null, must have the same length, otherwise a ApplicationException will be thrown. </br>
     *
     * @param sourceRealClass class of the instance that has to be retrieved form the media store using the primary keys values expressed by <code>pkValues</code> and primary keys fields are expresseb by <code>pkFieldNames</code>
     * @param pkValues  primary key values of the instance of the class <code>sourceRealClass</code> that has to be retrieved from the media store.
     * @param targetRealClass class of the instance that has to be created and returned.
     * @param sourcePAttributeNames attributes names of the retrieved instance of <code>sourceRealClass</code> that will be used to set the attributes of the created instance of <code>targetRealClass</code> in <code>targetPAttributeNames</code></br>
     *                              If null it will assume the value of <code>targetPAttributeNames</code>
     * @param targetPAttributeNames Attributes names of the created instance of <code>targetRealClass</code> that will be set with the values of the attributes of the retrieved instance of <code>sourceRealClass</code> in <code>sourcePAttributeNames</code></br>
     *                              If null it will assume the value of <code>sourcePAttributeNames</code>
     * @param pAttributeNames names of <code>targetRealClass</code> instance attributes to populate with values in <code>valuesArray</code>
     * @param valuesArray  values to use to populate <code>targetRealClass</code> instance attributes in <code>pAttributeNames</code>.
     * @return a new instance of <code>targetRealClass</code>
     * @throws ApplicationException  -
     *      If <code>sourceRealClass</code>  or <code>targetRealClass</code> are null.</br>
     *      If the two arrays <code>targetPAttributeNames</code> and <code>sourcePAttributeNames</code> are both not null, and don't have the same length. </br>
     *      If <code>pAttributeNames</code> and <code>valuesArray</code> are not both null or both not null, and if they are not null don't have the same length.</br>
     */
    public Object createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray) throws ApplicationException;



    /**
     * This method looks in the underlying media store the instance of the class <code>sourceRealClass</code> whose primary keys values are expressed by <code>pkValues</code>. (see {@link #findByPrimaryKey(Class realClass,Object[] pkValues)}) </br>
     * Once got such instance this method creates a new instance of the class <code>targetRealClass</code>, and, if the retrieved instance of <code>sourceRealClass</code> is null,
     * the created instance of <code>targetRealClass</code> will be returned, otherwise, all his attributes in <code>targetPAttributeNames</code> will be set with the value of the
     * attributes in <code>sourcePAttributeNames</code> of the instance of <code>sourceRealClass</code> retrieved from the media store. Of course this is done
     * if <code>sourcePAttributeNames</code>  and  <code>targetPAttributeNames</code> are not both null at the same time.</br>
     * In other words, if the retrieved instance of <code>sourceRealClass</code> is not null, and <code>sourcePAttributeNames</code>  and  <code>targetPAttributeNames</code> are not both null at the same time,
     * for each <code>i</code> the attribute <code>targetPAttributeNames[i]</code> of the created instance of <code>targetRealClass</code>
     * will be set with the value of the attribute <code>sourcePAttributeNames[i]</code> of the retrieved instance of <code>sourceRealClass</code>. </br>
     * If just one of code>sourcePAttributeNames</code>  and  <code>targetPAttributeNames</code> is null, it will assume the value of the other one.
     * For example if <code>sourcePAttributeNames</code> is null and <code>targetPAttributeNames</code> is not null, <code>sourcePAttributeNames</code> will have the value of <code>targetPAttributeNames</code> (and viceversa).</br>
     * Of course if the two arrays <code>targetPAttributeNames</code> and <code>sourcePAttributeNames</code> are not both null, must have the same length, otherwise a ApplicationException will be thrown. </br>
     *
     * @param sourceRealClass class of the instance that has to be retrieved form the media store using the primary keys values expressed by <code>pkValues</code>
     * @param pkValues primary key values of the instance of the class <code>sourceRealClass</code> that has to be retrieved from the media store.
     * @param targetRealClass class of the instance that has to be created and returned.
     * @param sourcePAttributeNames attributes names of the retrieved instance of <code>sourceRealClass</code> that will be used to set the attributes of the created instance of <code>targetRealClass</code> in <code>targetPAttributeNames</code></br>
     *                              If null it will assume the value of <code>targetPAttributeNames</code>
     * @param targetPAttributeNames attributes names of the created instance of <code>targetRealClass</code> that will be set with the values of the attributes of the retrieved instance of <code>sourceRealClass</code> in <code>sourcePAttributeNames</code></br>
     *                              If null it will assume the value of <code>sourcePAttributeNames</code>
     * @return  a new instance of <code>targetRealClass</code>
     * @throws ApplicationException -
     *      If <code>sourceRealClass</code>  or <code>targetRealClass</code> are null.</br>
     *      If the two arrays <code>targetPAttributeNames</code> and <code>sourcePAttributeNames</code> are both not null, and don't have the same length. </br>
     *
     */
    public Object createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames) throws ApplicationException;

    /**
     * This method creates a new instance of the class <code>targetRealClass</code>, and,
     * if <code>pAttributeNames</code> and  <code>valuesArray</code>
     * are not null, the new instance of the class <code>targetRealClass</code> attributes names in <code>pAttributeNames</code> are set with values in <code>valuesArray</code>.</br>
     * In other words,if <code>pAttributeNames</code> and  <code>valuesArray</code> are not null,  for each <code>j</code>,
     * the attribute <code>pAttributeNames[j]</code> of  <code>pInstance</code> will be set with <code>valuesArray[j]</code>.</br>
     * If <code>sourcePInstance</code> is null,
     * the created instance of <code>targetRealClass</code> will be returned, otherwise, all his attributes in <code>targetPAttributeNames</code> will be set with the value of the
     * attributes in <code>sourcePAttributeNames</code> of <code>sourcePInstance</code>. Of course this is done
     * if <code>sourcePAttributeNames</code>  and  <code>targetPAttributeNames</code> are not both null at the same time.</br>
     * In other words, if <code>sourcePInstance</code> is not null, and <code>sourcePAttributeNames</code>  and  <code>targetPAttributeNames</code> are not both null at the same time,
     * for each <code>i</code> the attribute <code>targetPAttributeNames[i]</code> of the created instance of <code>targetRealClass</code>
     * will be set with the value of the attribute <code>sourcePAttributeNames[i]</code> of <code>sourcePInstance</code>. </br>
     * If just one of code>sourcePAttributeNames</code>  and  <code>targetPAttributeNames</code> is null, it will assume the value of the other one.
     * For example if <code>sourcePAttributeNames</code> is null and <code>targetPAttributeNames</code> is not null, <code>sourcePAttributeNames</code> will have the value of <code>targetPAttributeNames</code> (and viceversa).</br>
     * Of course if the two arrays <code>targetPAttributeNames</code> and <code>sourcePAttributeNames</code> are not both null, must have the same length, otherwise a ApplicationException will be thrown. </br>
     *
     * @param sourcePInstance bean holding source attributes.
     * @param targetRealClass lass of the instance that has to be created and returned.
     * @param sourcePAttributeNames names of the attributes of <code>sourcePInstance</code> to use to populate the <code>targetRealClass</code> instance  attributes whose names are in <code>targetPAttributeNames</code></br>
     *                              If null it will assume the value of <code>targetPAttributeNames</code>
     * @param targetPAttributeNames names of the attributes of  the <code>targetRealClass</code> instance to populate with <code>sourcePInstance</code>  attributes  whose names are in <code>sourcePAttributeNames</code></br>
     *                              If null it will assume the value of <code>sourcePAttributeNames</code>
     * @param pAttributeNames names of <code>targetRealClass</code> instance attributes to populate with values in <code>valuesArray</code>
     * @param valuesArray  values to use to populate <code>targetRealClass</code> instance attributes in <code>pAttributeNames</code>.
     * @return a new instance of <code>targetRealClass</code>
     * @throws ApplicationException -
     *      If <code>targetRealClass</code> is null.</br>
     *      If the two arrays <code>targetPAttributeNames</code> and <code>sourcePAttributeNames</code> are both not null, and don't have the same length. </br>
     *      If <code>pAttributeNames</code> and <code>valuesArray</code> are not both null or both not null, and if they are not null don't have the same length.</br>
     */
    public Object createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray) throws ApplicationException;


    /**
     * This method creates a new instance of the class <code>targetRealClass</code>, and, if <code>sourcePInstance</code> is null,
     * the created instance of <code>targetRealClass</code> will be returned, otherwise, all his attributes in <code>targetPAttributeNames</code> will be set with the value of the
     * attributes in <code>sourcePAttributeNames</code> of <code>sourcePInstance</code>. Of course this is done
     * if <code>sourcePAttributeNames</code>  and  <code>targetPAttributeNames</code> are not both null at the same time.</br>
     * In other words, if <code>sourcePInstance</code> is not null, and <code>sourcePAttributeNames</code>  and  <code>targetPAttributeNames</code> are not both null at the same time,
     * for each <code>i</code> the attribute <code>targetPAttributeNames[i]</code> of the created instance of <code>targetRealClass</code>
     * will be set with the value of the attribute <code>sourcePAttributeNames[i]</code> of <code>sourcePInstance</code>. </br>
     * If just one of code>sourcePAttributeNames</code>  and  <code>targetPAttributeNames</code> is null, it will assume the value of the other one.
     * For example if <code>sourcePAttributeNames</code> is null and <code>targetPAttributeNames</code> is not null, <code>sourcePAttributeNames</code> will have the value of <code>targetPAttributeNames</code> (and viceversa).</br>
     * Of course if the two arrays <code>targetPAttributeNames</code> and <code>sourcePAttributeNames</code> are not both null, must have the same length, otherwise a ApplicationException will be thrown. </br>
     *
     * @param sourcePInstance  bean holding source attributes.
     * @param targetRealClass lass of the instance that has to be created and returned.
     * @param sourcePAttributeNames names of the attributes of <code>sourcePInstance</code> to use to populate the <code>targetRealClass</code> instance  attributes whose names are in <code>targetPAttributeNames</code></br>
     *                              If null it will assume the value of <code>targetPAttributeNames</code>
     * @param targetPAttributeNames names of the attributes of  the <code>targetRealClass</code> instance to populate with <code>sourcePInstance</code>  attributes  whose names are in <code>sourcePAttributeNames</code></br>
     *                              If null it will assume the value of <code>sourcePAttributeNames</code>
     * @return a new instance of <code>targetRealClass</code>
     * @throws ApplicationException -
     *      If <code>targetRealClass</code> is null.</br>
     *      If the two arrays <code>targetPAttributeNames</code> and <code>sourcePAttributeNames</code> are both not null, and don't have the same length. </br>
     */
    public Object createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames) throws ApplicationException;

   





    

    /**
     * This method has the same behavior of {@link #addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, Collection nodeSourcePAttributeNamesCollection, Collection nodeTargetPAttributeNamesCollection, Collection nodePAttributeNamesCollection, Collection nodeValuesArrayCollection)}
     * or {@link #addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames, String[][] nodePAttributeNames, Object[][] nodeValuesArray)}
     * but it is applied for all the sourceTreePath and  targetTreePath of the collection of <code>sourceTreePaths</code> and <code>targetTreePaths</code>.</br>
     * The input parameters <code>sourceTreePaths</code>, <code>targetTreePaths</code>, <code>treeNodeSourcePAttributeNames</code>, <code>treeNodeTargetPAttributeNames</code>, <code>treeNodePAttributeNames</code>, <code>treeNodeValuesArray</code>, where not null,
     * must be collection of the same size.
     * The elements in the position <code>i</code> of these six collection will be the last six input parameter for one of the two methods above. (Note that <code>sourceRootVO</code> and <code>targetRootVO</code>
     * will be the same for all the calls). Which one the two methods is called at each iteration depends by the type of the elements of the position <code>i</code>
     * of the collection <code>treeNodeSourcePAttributeNames</code>, <code>treeNodeTargetPAttributeNames</code>, <code>treeNodePAttributeNames</code>, <code>treeNodeValuesArray</code>
     * that are not null.
     * @param sourceRootVO Root of the source trees. It can't be null.
     * @param targetRootVO Root of the target trees. It can't be null.
     * @param sourceTreePaths collection of paths, each one being a dot separated list of attributes defining a source tree which root is <code>sourceRootVO</code>
     * @param targetTreePaths collection of paths, each one being a dot separated list of attributes defining a target tree which root is <code>targetRootVO</code>
     * @param treeNodeSourcePAttributeNames collection of attributes names used as source of information to create the new value objects that will be the nodes of the target tree.</br>
     * @param treeNodeTargetPAttributeNames collection of attributes names of new nodes of the target tree that will be populated with the values of  attributes of the source tree.
     * @param treeNodePAttributeNames collection of attributes names of new nodes of the target tree that will be populated with <code>treeNodeValuesArray</code>
     * @param treeNodeValuesArray  values to populate the attributes of the new nodes of the target tree
     * @return return true id some elements is added to the tree of root <code>targetRootVO</code>, false otherwise.</br>
     * @throws ApplicationException -
     *      If  <code>sourceRootVO</code> or <code>targetRootVO</code> or <code>sourceTreePaths</code> or <code>targetTreePaths</code> are null.</br>
     *      If <code>sourceTreePaths</code> and <code>targetTreePaths</code> do not have the same size.</br>
     *      If two elements in the same position of the two collection <code>sourceTreePaths</code> and <code>targetTreePaths</code> are not both empty strings or not both not empty strings.</br>
     *      If some elements of <code>sourceTreePaths</code> or <code>targetTreePaths</code> is null.</br>
     *      If two of the six collection <code>sourceTreePaths</code>, <code>targetTreePaths</code>, <code>treeNodeSourcePAttributeNames</code>, <code>treeNodeTargetPAttributeNames</code>, <code>treeNodePAttributeNames</code>, <code>treeNodeValuesArray</code> that are not null, have different size.</br>
     *      If <code>treeNodePAttributeNames</code> and <code>treeNodeValuesArray</code> are not both null or both not null.</br>
     *      If  the not null elements of the same position of the for colletions <code>treeNodeSourcePAttributeNames</code>, <code>treeNodeTargetPAttributeNames</code>, <code>treeNodePAttributeNames</code> and <code>treeNodeValuesArray</code> are not all Collection or all String[][].</br>
     *      If two elements in the same position of the two collection <code>treeNodeSourcePAttributeNames</code> and <code>treeNodeTargetPAttributeNames</code> are not null, and don't have the same length.</br>
     *      If, called <code>nodeSourcePAttributeNames</code> and  <code>nodeTargetPAttributeNames</code> two elements in the same position of the two collection <code>treeNodeSourcePAttributeNames</code> and <code>treeNodeTargetPAttributeNames</code>,<code>nodeSourcePAttributeNames</code> and  <code>nodeTargetPAttributeNames</code> are not null, and, for some <code>depth</code>, <code>nodeSourcePAttributeNames[depth]</code> and <code>nodeTargetPAttributeNames[depth]</code> are not null but don't have the same length.</br>
     *      If two elements in the same position of the two collection <code>treeNodePAttributeNames</code> and <code>treeNodeValuesArray</code> are not both null or both both not null.</br>
     *      If two elements in the same position of the two collection <code>treeNodePAttributeNames</code> and <code>treeNodeValuesArray</code> are not null, and don't have the same length.</br>
     *      If, called  <code>nodePAttributeNames</code> and  <code>nodeValuesArray</code>,  two elements in the same position of the two collection <code>treeNodePAttributeNames</code> and <code>treeNodeValuesArray</code> <code>nodePAttributeNames</code> and  <code>nodeValuesArray</code> are not null, and, for some <code>depth</code>, <code>nodePAttributeNames[depth]</code> and <code>nodeValuesArray[depth]</code> are not null but don't have the same length.</br>
     *      If elements of the same position of the collections <code>treeNodeSourcePAttributeNames</code>, <code>treeNodeTargetPAttributeNames</code>, <code>treeNodePAttributeNames</code>, <code>treeNodeValuesArray</code> that are not null don't have all the same length.</br>
     *      If two attributes of the same position of elements of the same position of <code>sourceTreePaths</code> and <code>targetTreePaths</code>  are not both collection or both value objects of the class of the nodes of the level of position -1 respectively of the source and target tree of the respective iteration.</br>
     */
    public boolean  addTreeToTree(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ) throws ApplicationException;



   /**
     * @deprecated use {@link #addTreeToTree(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray )}
     * */
    public Object addTreesToTrees(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames,Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ) throws ApplicationException;



    /**
     * This method recurs in a parallel way two trees of value objects, that we will call source tree and target tree.</br>
     * If a value object of the source tree is not present in the correspondent position in the target tree, it will be created a new instance of the class
     * of the corresponding position of the missing element in the target tree, some of its attributes will be populated using the attributes values of the value object of the source tree, and with
     * other values specified by the input parameters, and the reference fields will be properly populated too; such new created instance will be then added to the same target tree.</br>
     * </br>
     * The source tree is specified by the input parameters  <code>sourceRootVO</code> and <code>sourceTreePath</code>.</br>
     * The parameter <code>sourceRootVO</code> is the value object of the root node.</br>
     * The parameter <code>sourceTreePath</code> is a dot separated list of attributes; for example it could be:</br>
     * <code>sourceAttribute_1.sourceAttribute_2.sourceAttribute_3.sourceAttribute_4</code></br>
     * The first attribute must be an attribute of <code>sourceRootVO</code> holding a value object or a collection of value objects; if it is a value object it must have an
     * attribute named as the second attribute of the dot separated list, while if it is a collection, all its elements must have the second attribute of the list.</br>
     * If the first attribute is a value object, this one will be the only child of <code>sourceRootVO</code>, while if it is a collection, its elements will be all the children
     * of <code>sourceRootVO</code>. The tree is defined applying recursively such rule, so that for a value object node of some <code>depth</code> (considering the root a node of <code>depth</code> 0)
     * we have to look at the attribute in the position <code>depth+1</code> in the dot separated list of attributes
     * (considering the first attribute as an attribute of position 1), and such value object node , if it is not a leaf, must have such attribute, that can be a value object (its only child) having in turn
     * an attribute named as the attribute in the position <code>depth+2</code>, or can be a collection of value objects (that are all its children) each one having in turn
     * an attribute named as the attribute in the position <code>depth+2</code>.</br>
     * In the same way is defined the target tree, with the input parameter <code>targetRootVO</code> and <code>targetTreePath</code>.</br>
     * </br>
     * The two trees must have the same alternate sequence of value objects and collections, in other word, if the attribute in the position <code>i+1</code> of <code>targetTreePath</code>
     * represents a collection for the value object nodes of depth <code>i</code> in the target tree, the attribute in the position <code>i+1</code> of <code>sourceTreePath</code> must
     * represent a collection for the value object nodes of depth <code>i</code> in the source tree too; analogously in the case the attribute represents  a value object.
     * </br>
     * Let's start from the two roots and let's see how this method works.</br>
     * If the first attributes of <code>targetRootVO</code> and <code>targetTreePath</code>
     * are respectively collections of  <code>sourceRootVO</code> and <code>targetRootVO</code>,  for each element of the collection held by <code>sourceRootVO</code>
     * this method will create a new instance of the class of the elements of the collection held by  <code>targetRootVO</code> (if such collection is not existing will be created an empty one, using the
     * collection implementation class specified in the mapping file for it), and for such created instance its attributes <code>nodeTargetPAttributeNames[0]</code>
     * will be populated with the attributes <code>nodeSourcePAttributeNames[0]</code> of the element being processed,  its  attributes <code>nodePAttributeNames[0]</code>
     * will be populated with <code>nodeValuesArray[0]</code>, and its foreign fields to  <code>targetRootVO</code> will be populated with the key values of <code>targetRootVO</code>.</br>
     * The new created instance will be compared with the elements of the collection held by <code>targetRootVO</code> by its key values, and if no matching element is found it will be added to it.
     * The same rule is recursively applied, where the new  <code>sourceRootVO</code> and <code>targetRootVO</code> will be respectively the element being processed of the collection held by by <code>sourceRootVO</code> and the
     * new created instance; the new <code>sourceTreePath</code> and <code>targetTreePath</code> will be the same input parameter, but from the second attribute; the index of the arrays is increased by 1 at each recursion
     * and the remaining parameters are unchanged. If in the comparison between the new created instance and the elements of the collection held by <code>targetRootVO</code> a matching element is found,
     * the recursion is the same of above, with the difference that the new <code>targetRootVO</code> won't be the created instance, but the found matching element.</br>
     * </br>
     * If the first attributes of <code>targetRootVO</code> and <code>targetTreePath</code>
     * are respectively value objects of  <code>sourceRootVO</code> and <code>targetRootVO</code>, if the value object held by <code>sourceRootVO</code> is not null and
     * the value object held by <code>targetRootVO</code> is null, this method will create a new instance of the class of the value object held by <code>targetRootVO</code> ,
     * and for such created instance its attributes <code>nodeTargetPAttributeNames[0]</code>
     * will be populated with the attributes <code>nodeSourcePAttributeNames[0]</code> of the value object held by <code>sourceRootVO</code>,  its  attributes <code>nodePAttributeNames[0]</code>
     * will be populated with <code>nodeValuesArray[0]</code>, and this new instance will be used to set the first attribute of  <code>targetTreePath</code>
     * of <code>targetRootVO</code>, and the foreign keys fields of <code>targetRootVO</code> to such value object will be set with the key values of the new instance.</br>
     * Moreover if the value object held by <code>sourceRootVO</code> is not null, a recursion will take place, in the same way described above, but where the new <code>sourceRootVO</code> and <code>targetRootVO</code>
     * will be the two value objects respectively held by themselves (for the value object held by targetRootVO it could be the new instanced one).</br>
     * </br>
     * The recursion ends when <code>sourceTreePath</code> and  <code>targetTreePath</code> are empty strings.</br>
     * </br>
     * If <code>nodeSourcePAttributeNames</code> and  <code>nodeTargetPAttributeNames</code> are both null, the relative operations are not performed; if just one of them is null, it will assume the value of the other one.
     * For example if <code>nodeSourcePAttributeNames</code> is null and <code>nodeTargetPAttributeNames</code> is not null, <code>nodeSourcePAttributeNames</code> will have the value of <code>nodeTargetPAttributeNames</code> (and viceversa).</br>
     * If <code>nodeSourcePAttributeNames</code> and  <code>nodeTargetPAttributeNames</code> are not null, for each <code>index</code>
     * if <code>nodeSourcePAttributeNames[index]</code> and  <code>nodeTargetPAttributeNames[index]</code> are both null, the relative operations are not performed for the nodes of depth  <code>index-1</code>; if just one of them is null, it will assume the value of the other one.
     * If <code>nodePAttributeNames</code> and  <code>nodeValuesArray</code> are both null, the relative operations are not performed; if they are not null for each <code>index</code>
     * if code>nodePAttributeNames[index]</code> and <code>nodeValuesArray[index]</code> are both null, the relative operations are not performed for the nodes of depth  <code>index-1</code>.
     * </br>
     *
     * @param sourceRootVO Root of the source tree. It can't be null.
     * @param targetRootVO Root of the target tree. It can't be null.
     * @param sourceTreePath dot separated list of attributes defining the source tree. It can't be null.
     * @param targetTreePath dot separated list of attributes defining the target tree. It can't be null.
     * @param nodeSourcePAttributeNames  <code>nodeSourcePAttributeNames[index]</code> are the attributes names of the children of the nodes of level <code>index</code> of the source tree
     * @param nodeTargetPAttributeNames  <code>nodeTargetPAttributeNames[index]</code> are the attributes names of the children of the nodes of level <code>index</code> of the target tree
     * @param nodePAttributeNames <code>nodePAttributeNames[index]</code> are the attributes names of the created instances to add to the children of the nodes of level <code>index</code> of the target tree
     *              to be populated with <code>nodeValuesArray[index]</code>.
     * @param nodeValuesArray <code>nodeValuesArray[index]</code> are used to populate the attributes <code>nodePAttributeNames[index]</code> of the created instances children of the nodes of level <code>index</code> of the target tree.
     * @return  true if the target tree is modified, false otherwise.
     * @throws ApplicationException -
     *      If  <code>sourceRootVO</code> or <code>targetRootVO</code> or <code>sourceTreePath</code> or <code>targetTreePath</code> are null.</br>
     *      If  <code>sourceTreePath</code> and <code>targetTreePath</code> are not both empty strings or not both not empty strings.</br>
     *      If  <code>nodeSourcePAttributeNames</code> and  <code>nodeTargetPAttributeNames</code> are not null, and don't have the same length.</br>
     *      If  <code>nodeSourcePAttributeNames</code> and  <code>nodeTargetPAttributeNames</code> are not null, and, for some <code>depth</code>, <code>nodeSourcePAttributeNames[depth]</code> and <code>nodeTargetPAttributeNames[depth]</code> are not null but don't have the same length.</br>
     *      If  <code>nodePAttributeNames</code> and  <code>nodeValuesArray</code> are not both null or both both not null.</br>
     *      If  <code>nodePAttributeNames</code> and <code>nodeValuesArray</code> are not null, and don't have the same length.</br>
     *      If  <code>nodePAttributeNames</code> and  <code>nodeValuesArray</code> are not null, and, for some <code>depth</code>, <code>nodePAttributeNames[depth]</code> and <code>nodeValuesArray[depth]</code> are not null but don't have the same length.</br>
     *      If  <code>nodePAttributeNames</code>,   <code>nodeValuesArray</code>,  <code>nodeSourcePAttributeNames</code> and  <code>nodeTargetPAttributeNames</code> are not null, and don't have all the same length.</br>
     *      If two attributes of the same position of <code>sourceTreePath</code> and <code>targetTreePath</code>  are not both collection or both value objects of the class of the nodes of the level of position -1 respectively of the source and target tree.</br>
     */
    public boolean addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames, String[][] nodePAttributeNames, Object[][] nodeValuesArray)throws ApplicationException;

    /**
     * This method has the same behavior of the method
     * {@link #addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames, String[][] nodePAttributeNames, Object[][] nodeValuesArray)},
     * but in place of the arrays <code>nodeSourcePAttributeNames</code>, <code>nodeTargetPAttributeNames</code>, <code>nodePAttributeNames</code> and <code>nodeValuesArray</code>
     * are used the collections <code>nodeSourcePAttributeNamesCollection</code>, <code>nodeTargetPAttributeNamesCollection</code>, <code>nodePAttributeNamesCollection</code> and <code>nodeValuesArrayCollection</code>
     * </br>
     * @param sourceRootVO Root of the source tree. It can't be null.
     * @param targetRootVO Root of the target tree. It can't be null.
     * @param sourceTreePath dot separated list of attributes defining the source tree. It can't be null.
     * @param targetTreePath dot separated list of attributes defining the target tree. It can't be null.
     * @param nodeSourcePAttributeNamesCollection the <code>i-th</code> element of this collection is an array of strings that are the attributes names of the children of the nodes of level <code>i</code> of the source tree
     * @param nodeTargetPAttributeNamesCollection the <code>i-th</code> element of this collection is an array of strings that are the attributes names of the children of the nodes of level <code>i</code> of the target tree
     * @param nodePAttributeNamesCollection the <code>i-th</code> element of this collection is an array of strings that are the attributes names of the created instances to add to the children of the nodes of level <code>index</code> of the target tree
     *              to be populated with the array that is the element of the position <code>i-th</code> of the collection<code>nodeValuesArrayCollection</code>.
     * @param nodeValuesArrayCollection the <code>i-th</code> element of this collection is an array of objects that are used to populate the attributes of the array of strings that is the elements of position <code>i-th</code> of the collection <code>nodePAttributeNamesCollection</code> of the created instances children of the nodes of level <code>i</code> of the target tree.
     * @return  true if the target tree is modified, false otherwise.
     * @throws ApplicationException -
     *      If  <code>sourceRootVO</code> or <code>targetRootVO</code> or <code>sourceTreePath</code> or <code>targetTreePath</code> are null.</br>
     *      If  <code>sourceTreePath</code> and <code>targetTreePath</code> are not both empty strings or not both not empty strings.</br>
     *      If  <code>nodeSourcePAttributeNamesCollection</code> and  <code>nodeTargetPAttributeNamesCollection</code> are not null, and don't have the same size.</br>
     *      If  <code>nodeSourcePAttributeNamesCollection</code> and  <code>nodeTargetPAttributeNamesCollection</code> are not null, and, for some <code>depth</code>, <code>nodeSourcePAttributeNamesCollection(depth)</code> and <code>nodeTargetPAttributeNamesCollection(depth)</code> are not null but don't have the same length.</br>
     *      If  <code>nodePAttributeNamesCollection</code> and  <code>nodeValuesArrayCollection</code> are not both null or both both not null.</br>
     *      If  <code>nodePAttributeNamesCollection</code> and <code>nodeValuesArrayCollection</code> are not null, and don't have the same size.</br>
     *      If  <code>nodePAttributeNamesCollection</code> and  <code>nodeValuesArrayCollection</code> are not null, and, for some <code>depth</code>, <code>nodePAttributeNamesCollection(depth)</code> and <code>nodeValuesArrayCollection(depth)</code> are not null but don't have the same length.</br>
     *      If  <code>nodePAttributeNamesCollection</code>,   <code>nodeValuesArrayCollection</code>,  <code>nodeSourcePAttributeNamesCollection</code> and  <code>nodeTargetPAttributeNamesCollection</code> are not null, and don't have all the same size.</br>
     *      If two attributes of the same position of <code>sourceTreePath</code> and <code>targetTreePath</code>  are not both collection or both value objects of the class of the nodes of the level of position -1 respectively of the source and target tree.</br>
     */
    public boolean addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, Collection nodeSourcePAttributeNamesCollection, Collection nodeTargetPAttributeNamesCollection, Collection nodePAttributeNamesCollection, Collection nodeValuesArrayCollection) throws ApplicationException;
    

}

