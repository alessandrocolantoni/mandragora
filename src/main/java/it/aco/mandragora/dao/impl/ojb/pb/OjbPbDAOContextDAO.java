/**
 *    
 *
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

package it.aco.mandragora.dao.impl.ojb.pb;

import it.aco.mandragora.common.ServiceLocator;
import it.aco.mandragora.exception.ServiceLocatorException;
import it.aco.mandragora.dao.DAO;
import it.aco.mandragora.dao.context.ContextDAO;
import it.aco.mandragora.query.LogicCondition;
import it.aco.mandragora.exception.DataAccessException;
import it.aco.mandragora.exception.DataOptimisticLockException;

import java.util.*;
import java.lang.Class;

import org.apache.ojb.broker.*;
import org.apache.ojb.broker.metadata.*;
import org.apache.ojb.broker.util.ObjectModification;
import org.apache.commons.chain.Context;


public class OjbPbDAOContextDAO extends OjbPbDAO implements DAO, ContextDAO {

    protected static OjbPbDAOContextDAO ojbPbDAOContextDAO = null;

    static {
        try {
            if (ojbPbDAOContextDAO!=null) throw new DataAccessException("thrown in the static block of OjbPbDAOContextDAO: static instance is already set");//added by alessandro on 25/09/2007
            ojbPbDAOContextDAO = new OjbPbDAOContextDAO();
        }catch (Exception e){
            throw new RuntimeException("Exception thrown in the static block of OjbPbDAOContextDAO "+ e.toString(),e);
        }
    }
    protected OjbPbDAOContextDAO(){
    }
    public static OjbPbDAO getInstance(){ // // It has to return OjbPbDAO to not clash with getInstance of OjbPbDAO.
        return ojbPbDAOContextDAO;
    }
    // Create Log4j category instance for logging
    static private org.apache.log4j.Category log = org.apache.log4j.Logger.getLogger(OjbPbDAOContextDAO.class.getName());



    public Object findByPrimaryKey(Context context)throws DataAccessException{
        log.info("************Entering the OjbPbDAO.findByPrimaryKey(Context context) ***************");
        Object result = null;
        try{
            Class realClass = (Class)context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.findByPrimaryKey(Context context): realClass not in context. ");

            Object pkValue = context.get("pkValue");

            if (pkValue!=null){
                result = findByPrimaryKey(realClass,pkValue);
            } else{
                Object[] pkValues =(Object[]) context.get("pkValues");
                if(pkValues==null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.findByPrimaryKey(Context context): pkValue and pkValues not in context. ");
                //pkValues!=null
                String[] pkFieldNames = (String[]) context.get("pkFieldNames");
                if (pkFieldNames!=null && pkFieldNames.length!=0){
                    result = findByPrimaryKey(realClass,pkFieldNames,pkValues);
                } else{
                    result = findByPrimaryKey(realClass,pkValues);
                }
            }
        }catch (DataAccessException e) {
            log.error("DataAccessException thrown in  OjbPbDAOContextDAO.findByPrimaryKey(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.findByPrimaryKey(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.findByPrimaryKey(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.findByPrimaryKey(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.findByPrimaryKey(Context context)***************");
        return result;
    }


    public Object findObjectByTemplate(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.findObjectByTemplate(Context context) ***************");
        Object result = null;
        try{
            Object templateVO = context.get("templateVO");
            if (templateVO == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.findObjectByTemplate(Context context): templateVO not in context. ");

            result = findObjectByTemplate(templateVO);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.findObjectByTemplate(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.findObjectByTemplate(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.findObjectByTemplate(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.findObjectByTemplate(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.findObjectByTemplate(Context context)***************");
        return result;

    }


    public Collection findCollectionByTemplate(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.findCollectionByTemplate(Context context) ***************");
        Collection result;
        try{
            Object templateVO = context.get("templateVO");
            if (templateVO == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByTemplate(Context context): templateVO not in context. ");
            String orderingField = (String) context.get("orderingField");

            if (orderingField==null || orderingField.trim().equals("")){
                result = findCollectionByTemplate(templateVO);
            } else{
                Boolean asc = (Boolean) context.get("asc");
                if (asc == null) asc=Boolean.TRUE;
                result = findCollectionByTemplate(templateVO,orderingField,asc);
            }
        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.findCollectionByTemplate(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByTemplate(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.findCollectionByTemplate(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByTemplate(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.findCollectionByTemplate(Context context)***************");
        return result;
    }

    public Collection findCollectionByNullFields(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.findCollectionByNullFields(Context context) ***************");
        Collection result = null;
        try{
            Class realClass = (Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByNullFields(Context context): realClass not in context. ");

            String[] nullFields = (String[]) context.get("nullFields");
            if (nullFields == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByNullFields(Context context): nullFields not in context. ");

            result = findCollectionByNullFields(realClass,nullFields);


        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.findCollectionByNullFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByNullFields(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.findCollectionByNullFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByNullFields(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.findCollectionByNullFields(Context context)***************");
        return result;
    }




    public Collection findCollectionByLogicCondition(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.findCollectionByLogicCondition(Context context) ***************");
        Collection result = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByLogicCondition(Context context): realClass not in context. ");

            LogicCondition logicCondition =(LogicCondition) context.get("logicCondition");
            if (logicCondition == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByLogicCondition(Context context): logicCondition not in context. ");


            String orderingField = (String) context.get("orderingField");
            Boolean asc = (Boolean) context.get("asc");

            Integer startAtIndex = (Integer) context.get("startAtIndex");
            Integer endAtIndex = (Integer) context.get("endAtIndex");


            result = findCollectionByLogicCondition(realClass, logicCondition, orderingField, asc, startAtIndex, endAtIndex );



        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.findCollectionByLogicCondition(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByLogicCondition(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.findCollectionByLogicCondition(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByLogicCondition(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.findCollectionByLogicCondition(Context context)***************");
        return result;
    }





    public Collection findCollectionByOrValues(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.findCollectionByOrValues(Context context) ***************");
        Collection result = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByOrValues(Context context): realClass not in context. ");

            String pAttributeName =(String) context.get("pAttributeName");
            if (pAttributeName == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByOrValues(Context context): pAttributeName not in context. ");
            if (pAttributeName.trim().equals("")) throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByOrValues(Context context): pAttributeName in context is empty string. ");

            Collection valuesCollection = (Collection) context.get("valuesCollection");



            result =findCollectionByOrValues(realClass, pAttributeName, valuesCollection);



        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.findCollectionByOrValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByOrValues(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.findCollectionByOrValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByOrValues(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.findCollectionByOrValues(Context context)***************");
        return result;

    }

    public Collection findCollectionByFieldsNotEqualsToValues(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.findCollectionByFieldsNotEqualsToValues(Context context) ***************");
        Collection result = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByFieldsNotEqualsToValues(Context context): realClass not in context. ");

            String[] pAttributeNames =(String[]) context.get("pAttributeNames");
            Object[] valuesArray = (Object[]) context.get("valuesArray");

            result = findCollectionByFieldsNotEqualsToValues(realClass,pAttributeNames,valuesArray);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.findCollectionByFieldsNotEqualsToValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByFieldsNotEqualsToValues(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.findCollectionByFieldsNotEqualsToValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByFieldsNotEqualsToValues(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.findCollectionByFieldsNotEqualsToValues(Context context)***************");
        return result;
    }


    public Collection findCollectionByAndFieldsOperatorValues(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.findCollectionByAndFieldsOperatorValues(Context context) ***************");
        Collection result = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByAndFieldsOperatorValues(Context context): realClass not in context. ");

            String[] pAttributeNames =(String[]) context.get("pAttributeNames");
            String[] operators =(String[]) context.get("operators");
            Object[] valuesArray = (Object[]) context.get("valuesArray");

            result = findCollectionByAndFieldsOperatorValues(realClass, pAttributeNames, operators, valuesArray);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.findCollectionByAndFieldsOperatorValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByAndFieldsOperatorValues(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.findCollectionByAndFieldsOperatorValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByAndFieldsOperatorValues(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.findCollectionByAndFieldsOperatorValues(Context context)***************");
        return result;
    }




    public Collection findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context) ***************");
        Collection result = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context): realClass not in context. ");

            String[] pAttributeNames =(String[]) context.get("pAttributeNames");
            String[] operators =(String[]) context.get("operators");
            Object[][] valuesMatrix = (Object[][]) context.get("valuesMatrix");

            result = findCollectionByAndFieldsOperatorValues(realClass, pAttributeNames, operators, valuesMatrix);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context)***************");
        return result;
    }


    public Collection findCollectionByFieldInCollection(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.findCollectionByFieldInCollection(Context context) ***************");
        Collection result = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByFieldInCollection(Context context): realClass not in context. ");

            String pAttributeName =(String) context.get("pAttributeName");
            Collection valuesCollection =(Collection)  context.get("valuesCollection");

            result = findCollectionByFieldInCollection(realClass, pAttributeName, valuesCollection);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.findCollectionByFieldInCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByFieldInCollection(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.findCollectionByFieldInCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.findCollectionByFieldInCollection(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.findCollectionByFieldInCollection(Context context)***************");
        return result;
    }

    public Collection searchValueInFields(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.searchValueInFields(Context context) ***************");
        Collection result = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.searchValueInFields(Context context): realClass not in context. ");

            String[] pAttributeNames =(String[]) context.get("pAttributeNames");
            Object value =  context.get("value");

            result = searchValueInFields(realClass, pAttributeNames, value);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.searchValueInFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.searchValueInFields(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.searchValueInFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.searchValueInFields(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.searchValueInFields(Context context)***************");
        return result;
    }

    public Collection getCollectionOfStoredItemsNotInBean(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.getCollectionOfStoredItemsNotInBean(Context context) ***************");
        Collection result=null;
        try{
            Object pInstance=context.get("pInstance");
            if (pInstance == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.getCollectionOfStoredItemsNotInBean(Context context): pInstance not in context. ");

            String pAttributeName= (String) context.get("pAttributeName");
            if (pAttributeName == null || pAttributeName.trim().equals("")) throw new DataAccessException("Error in  OjbPbDAOContextDAO.getCollectionOfStoredItemsNotInBean(Context context): pAttributeName not in context or empty string. ");


            result = getCollectionOfStoredItemsNotInBean(pInstance, pAttributeName);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.getCollectionOfStoredItemsNotInBean(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getCollectionOfStoredItemsNotInBean(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.getCollectionOfStoredItemsNotInBean(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getCollectionOfStoredItemsNotInBean(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.getCollectionOfStoredItemsNotInBean(Context context)***************");
        return result;
    }




    public Collection getStoredCollection(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.getStoredCollection(Context context) ***************");
        Collection result=null;
        try{
            Object pInstance=context.get("pInstance");
            if (pInstance == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.getStoredCollection(Context context): pInstance not in context. ");

            String pAttributeName= (String) context.get("pAttributeName");
            if (pAttributeName == null || pAttributeName.trim().equals("")) throw new DataAccessException("Error in  OjbPbDAOContextDAO.getStoredCollection(Context context): pAttributeName not in context or empty string. ");


            result = getStoredCollection(pInstance, pAttributeName);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.getStoredCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getStoredCollection(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.getStoredCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getStoredCollection(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.getStoredCollection(Context context)***************");
        return result;
    }




    public Iterator getReportQueryIterator(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.getReportQueryIterator(Context context) ***************");
        Iterator iterator = null;
        try{
            Class realClass=(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.getReportQueryIterator(Context context): realClass not in context. ");

            LogicCondition logicCondition= (LogicCondition) context.get("logicCondition");
            String[] pAttributeNames= (String[]) context.get("pAttributeNames");
            String[] groupBy= (String[]) context.get("groupBy");


            iterator = getReportQueryIterator(realClass, logicCondition, pAttributeNames, groupBy);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.getReportQueryIterator(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getReportQueryIterator(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.getReportQueryIterator(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getReportQueryIterator(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.getReportQueryIterator(Context context)***************");
        return iterator;
    }



    public void retrieveReference(Context context)throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.retrieveReference(Context context) ***************");
        try{
            Object pInstance = context.get("pInstance");
            if (pInstance == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveReference(Context context): pInstance not in context. ");

            String pAttributeName =(String) context.get("pAttributeName");
            if (pAttributeName == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveReference(Context context): pAttributeName not in context. ");

            retrieveReference(pInstance,pAttributeName);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.retrieveReference(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveReference(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.retrieveReference(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveReference(Context context): " + e.toString(),e);
        }

        log.info("************Done with the  OjbPbDAOContextDAO.retrieveReference(Context context)***************");
    }

    public void retrieveNullReference(Context context)throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.retrieveNullReference(Context context) ***************");
        try{
            Object pInstance = context.get("pInstance");
            if (pInstance == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveNullReference(Context context): pInstance not in context. ");

            String pAttributeName =(String) context.get("pAttributeName");
            if (pAttributeName == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveNullReference(Context context): pAttributeName not in context. ");

            retrieveNullReference(pInstance,pAttributeName);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.retrieveNullReference(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveNullReference(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.retrieveNullReference(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveNullReference(Context context): " + e.toString(),e);
        }

        log.info("************Done with the  OjbPbDAOContextDAO.retrieveNullReference(Context context)***************");
    }


    public void retrieveAllNullReferences(Context context)throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.retrieveAllNullReferences(Context context) ***************");
        try{
            Object pInstance = context.get("pInstance");
            if (pInstance == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveAllNullReferences(Context context): pInstance not in context. ");


            retrieveAllNullReferences(pInstance);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.retrieveAllNullReferences(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveAllNullReferences(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.retrieveAllNullReferences(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveAllNullReferences(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.retrieveAllNullReferences(Context context)***************");
    }

    public void retrievePathReference(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.retrievePathReference(Context context) ***************");
        try{
            Object valueobjectOrCollection=context.get("valueobjectOrCollection");
            String path= (String) context.get("path");

            retrievePathReference(valueobjectOrCollection, path);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.retrievePathReference(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrievePathReference(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.retrievePathReference(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrievePathReference(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.retrievePathReference(Context context)***************");

    }








    public void retrieveNullPathReference(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.retrieveNullPathReference(Context context) ***************");
        try{
            Object valueobjectOrCollection=context.get("valueobjectOrCollection");
            String path= (String) context.get("path");

            retrieveNullPathReference(valueobjectOrCollection, path);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.retrieveNullPathReference(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveNullPathReference(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.retrieveNullPathReference(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveNullPathReference(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.retrieveNullPathReference(Context context)***************");

    }






    public void retrieveAllReferences(Context context)throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.retrieveAllReferences(Context context) ***************");
        try{
            Object pInstance = context.get("pInstance");
            if (pInstance == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveAllReferences(Context context): pInstance not in context. ");

            retrieveAllReferences(pInstance);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.retrieveAllReferences(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveAllReferences(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.retrieveAllReferences(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveAllReferences(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.retrieveAllReferences(Context context)***************");
    }




    public void retrieveAllReferencesInCollection(Context context)throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.retrieveAllReferencesInCollection(Context context) ***************");
        try{
            Collection valueObjectsCollection = (Collection)context.get("valueObjectsCollection");
            if (valueObjectsCollection == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveAllReferencesInCollection(Context context): valueObjectsCollection not in context. ");

            retrieveAllReferencesInCollection(valueObjectsCollection);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.retrieveAllReferencesInCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveAllReferencesInCollection(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.retrieveAllReferencesInCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveAllReferencesInCollection(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.retrieveAllReferencesInCollection(Context context)***************");
    }






    public void retrieveReferenceInCollection(Context context)throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.retrieveReferenceInCollection(Context context) ***************");
        try{
            Collection valueObjectsCollection = (Collection)context.get("valueObjectsCollection");
            if (valueObjectsCollection == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveReferenceInCollection(Context context): valueObjectsCollection not in context. ");

            String pAttributeName =(String) context.get("pAttributeName");
            if (pAttributeName == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveReferenceInCollection(Context context): pAttributeName not in context. ");


            retrieveReferenceInCollection(valueObjectsCollection,pAttributeName);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.retrieveReferenceInCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveReferenceInCollection(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.retrieveReferenceInCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.retrieveReferenceInCollection(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.retrieveReferenceInCollection(Context context)***************");
    }


    public void delete(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbDAOContextDAO.delete(Context context)***************");
        try{

            Object deleteVO = context.get("deleteVO");
            if (deleteVO == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.delete(Context context): deleteVO not in context. ");


            delete(deleteVO);


        }catch (DataOptimisticLockException e) {
                log.error("DataOptimisticLockException thrown in OjbPbDAOContextDAO.delete(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbDAOContextDAO.delete(Context context): " + e.toString(),e);
        } catch (DataAccessException e) {
                log.error("DataAccessException thrown in OjbPbDAOContextDAO.delete(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbDAOContextDAO.delete(Context context): " + e.toString(),e);
        }  catch (Exception e) {
            log.error("Exception thrown in OjbPbDAOContextDAO.delete(Context context): " + e.toString());
            throw new DataAccessException("Error in OjbPbDAOContextDAO.delete(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.delete(Context context)***************");
    }


    public void deleteCollection(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbDAOContextDAO.delete(Context context)***************");
        try{

            Collection deleteVOs = (Collection) context.get("deleteVOs");


            deleteCollection(deleteVOs);


        }catch (DataOptimisticLockException e) {
                log.error("DataOptimisticLockException thrown in OjbPbDAOContextDAO.deleteCollection(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbDAOContextDAO.deleteCollection(Context context): " + e.toString(),e);
        } catch (DataAccessException e) {
                log.error("DataAccessException thrown in OjbPbDAOContextDAO.deleteCollection(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbDAOContextDAO.deleteCollection(Context context): " + e.toString(),e);
        }  catch (Exception e) {
            log.error("Exception thrown in OjbPbDAOContextDAO.deleteCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in OjbPbDAOContextDAO.deleteCollection(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.deleteCollection(Context context)***************");
    }

    public void deleteMToNRelationshipCollection(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.deleteMToNRelationshipCollection(Context context) ***************");
        try{
            Object left =  context.get("left");
            String leftFieldName =  (String) context.get("leftFieldName");
            Collection rightCollection = (Collection) context.get("rightCollection");

            deleteMToNRelationshipCollection(left, leftFieldName, rightCollection);

        }catch (DataAccessException e) {
                log.error("DataAccessException thrown in OjbPbDAOContextDAO.deleteMToNRelationshipCollection(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbDAOContextDAO.deleteMToNRelationshipCollection(Context context): " + e.toString(),e);
        }  catch (Exception e) {
            log.error("Exception thrown in OjbPbDAOContextDAO.deleteMToNRelationshipCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in OjbPbDAOContextDAO.deleteMToNRelationshipCollection(Context context): " + e.toString(),e);
        }
        log.info("************Done with the OjbPbDAOContextDAO.deleteMToNRelationshipCollection(Context context) ***************");

    }


    public void deleteItemsNotInCollectionsInPath(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.deleteItemsNotInCollectionsInPath(Context context) ***************");

        try{

            Object rootVO =  context.get("rootVO");
            String path =  (String) context.get("path");
            Boolean applyDeletePathCascade =  (Boolean) context.get("applyDeletePathCascade");
            Boolean ifM2NDeleteOnlyRelationship =  (Boolean) context.get("ifM2NDeleteOnlyRelationship");
            Boolean deleteOneToOne =  (Boolean) context.get("deleteOneToOne");

            deleteItemsNotInCollectionsInPath(rootVO, path, applyDeletePathCascade, ifM2NDeleteOnlyRelationship, deleteOneToOne);



        }catch (DataAccessException e) {
                log.error("DataAccessException thrown in OjbPbDAOContextDAO.deleteItemsNotInCollectionsInPath(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbDAOContextDAO.deleteItemsNotInCollectionsInPath(Context context): " + e.toString(),e);
        }  catch (Exception e) {
            log.error("Exception thrown in OjbPbDAOContextDAO.deleteItemsNotInCollectionsInPath(Context context): " + e.toString());
            throw new DataAccessException("Error in OjbPbDAOContextDAO.deleteItemsNotInCollectionsInPath(Context context): " + e.toString(),e);
        }
        log.info("************Done with the OjbPbDAOContextDAO.deleteItemsNotInCollectionsInPath(Context context) ***************");

    }

    public void deleteItemsNotInCollectionsInPaths(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.deleteItemsNotInCollectionsInPaths(Context context) ***************");

        try{

            Object rootVO =  context.get("rootVO");
            Collection paths =  (Collection) context.get("paths");
            Boolean applyDeletePathCascade =  (Boolean) context.get("applyDeletePathCascade");
            Boolean ifM2NDeleteOnlyRelationship =  (Boolean) context.get("ifM2NDeleteOnlyRelationship");
            Boolean deleteOneToOne =  (Boolean) context.get("deleteOneToOne");

            deleteItemsNotInCollectionsInPaths(rootVO, paths, applyDeletePathCascade, ifM2NDeleteOnlyRelationship, deleteOneToOne);



        }catch (DataAccessException e) {
                log.error("DataAccessException thrown in OjbPbDAOContextDAO.deleteItemsNotInCollectionsInPaths(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbDAOContextDAO.deleteItemsNotInCollectionsInPaths(Context context): " + e.toString(),e);
        }  catch (Exception e) {
            log.error("Exception thrown in OjbPbDAOContextDAO.deleteItemsNotInCollectionsInPaths(Context context): " + e.toString());
            throw new DataAccessException("Error in OjbPbDAOContextDAO.deleteItemsNotInCollectionsInPaths(Context context): " + e.toString(),e);
        }
        log.info("************Done with the OjbPbDAOContextDAO.deleteItemsNotInCollectionsInPaths(Context context) ***************");

    }

    public void deletePathCascade(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.deletePathCascade(Context context) ***************");

        try{

            Object parentVO =  context.get("parentVO");
            String path =  (String) context.get("path");
            Boolean ifM2NDeleteOnlyRelationship =  (Boolean) context.get("ifM2NDeleteOnlyRelationship");
            Boolean deleteOneToOne =  (Boolean) context.get("deleteOneToOne");

            deletePathCascade(parentVO, path,  ifM2NDeleteOnlyRelationship, deleteOneToOne);



        }catch (DataAccessException e) {
                log.error("DataAccessException thrown in OjbPbDAOContextDAO.deletePathCascade(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbDAOContextDAO.deletePathCascade(Context context): " + e.toString(),e);
        }  catch (Exception e) {
            log.error("Exception thrown in OjbPbDAOContextDAO.deletePathCascade(Context context): " + e.toString());
            throw new DataAccessException("Error in OjbPbDAOContextDAO.deletePathCascade(Context context): " + e.toString(),e);
        }
        log.info("************Done with the OjbPbDAOContextDAO.deletePathCascade(Context context) ***************");

    }

    public void deletePathsCascade(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.deletePathCascade(Context context) ***************");

        try{

            Object parentVO =  context.get("parentVO");
            Collection paths =  (Collection) context.get("paths");
            Boolean ifM2NDeleteOnlyRelationship =  (Boolean) context.get("ifM2NDeleteOnlyRelationship");
            Boolean deleteOneToOne =  (Boolean) context.get("deleteOneToOne");

            deletePathsCascade(parentVO, paths,  ifM2NDeleteOnlyRelationship, deleteOneToOne);



        }catch (DataAccessException e) {
                log.error("DataAccessException thrown in OjbPbDAOContextDAO.deletePathsCascade(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbDAOContextDAO.deletePathsCascade(Context context): " + e.toString(),e);
        }  catch (Exception e) {
            log.error("Exception thrown in OjbPbDAOContextDAO.deletePathsCascade(Context context): " + e.toString());
            throw new DataAccessException("Error in OjbPbDAOContextDAO.deletePathsCascade(Context context): " + e.toString(),e);
        }
        log.info("************Done with the OjbPbDAOContextDAO.deletePathsCascade(Context context) ***************");

    }

    public Object insert(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbDAOContextDAO.(Context context)***************");
        Object storeVO;
        try{
            storeVO = store(context,ObjectModification.INSERT);
        } catch (DataOptimisticLockException e) {
            log.error("DataOptimisticLockException thrown in OjbPbDAOContextDAO.(Context context): " + e.toString());
            throw new DataOptimisticLockException("Error in OjbPbDAOContextDAO.insert(Context context): " + e.toString(),e);
        } catch (DataAccessException e) {
            log.error("DataAccessException thrown in OjbPbDAOContextDAO.insert(Context context): " + e.toString());
            throw new DataAccessException("Error in OjbPbDAOContextDAO.insert(Context context): " + e.toString(),e);
        }
        log.info("************Done with the OjbPbDAOContextDAO.insert(Context context)***************");
        return storeVO;
    }





    public Object update(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbDAOContextDAO.update(Context context)***************");
        Object storeVO;
        try{
            storeVO = store(context,ObjectModification.UPDATE);
        } catch (DataOptimisticLockException e) {
            log.error("DataOptimisticLockException thrown in OjbPbDAOContextDAO.update(Context context): " + e.toString());
            throw new DataOptimisticLockException("Error in OjbPbDAOContextDAO.update(Context context): " + e.toString(),e);
        } catch (DataAccessException e) {
            log.error("DataAccessException thrown in OjbPbDAOContextDAO.update(Context context): " + e.toString());
            throw new DataAccessException("Error in OjbPbDAOContextDAO.update(Context context): " + e.toString(),e);
        }
        log.info("************Done with the OjbPbDAOContextDAO.update(Context context)***************");
        return storeVO;
    }


    public void updateCollection(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbDAOContextDAO.updateCollection(Context context)***************");
        try{
            storeCollection(context);
        } catch (DataOptimisticLockException e) {
            log.error("DataOptimisticLockException thrown in OjbPbDAOContextDAO.updateCollection(Context context): " + e.toString());
            throw new DataOptimisticLockException("Error in OjbPbDAOContextDAO.updateCollection(Context context): " + e.toString(),e);
        } catch (DataAccessException e) {
            log.error("DataAccessException thrown in OjbPbDAOContextDAO.updateCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in OjbPbDAOContextDAO.updateCollection(Context context): " + e.toString(),e);
        }
        log.info("************Done with the OjbPbDAOContextDAO.updateCollection(Context context)***************");
    }





    private Object store(Context context,ObjectModification modification) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbDAOContextDAO.store(Context context,ObjectModification modification)***************");
        Object storeVO = null;
        try{
            storeVO = context.get("storeVO");
            if (storeVO == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.store(Context context,ObjectModification modification): storeVO not in context. ");

            storeVO = store(storeVO,modification);

        } catch (DataOptimisticLockException e) {
                log.error("DataOptimisticLockException thrown in OjbPbDAOContextDAO.store(Context context,ObjectModification modification): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbDAOContextDAO.store(Context context,ObjectModification modification): " + e.toString(),e);
        } catch (DataAccessException e) {
                log.error("DataAccessException thrown in OjbPbDAOContextDAO.store(Context context,ObjectModification modification): " + e.toString());
                throw new DataAccessException("Error in OjbPbDAOContextDAO.store(Context context,ObjectModification modification): " + e.toString(),e);
        }  catch (Exception e) {
            log.error("Exception thrown in OjbPbDAOContextDAO.store(Context context,ObjectModification modification): " + e.toString());
            throw new DataAccessException("Error in OjbPbDAOContextDAO.store(Context context,ObjectModification modification): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.store(Context context,ObjectModification modification)***************");
        return storeVO;
    }




    private void storeCollection(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbDAOContextDAO.storeCollection(Context context)***************");
        try{
            Collection storeVOs = (Collection) context.get("storeVOs");
            if (storeVOs == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.storeCollection(Context context): storeVOs not in context. ");

            storeCollection(storeVOs);

        }catch (DataOptimisticLockException e) {
                log.error("DataOptimisticLockException thrown in OjbPbDAOContextDAO.storeCollection(Context context) : " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbDAOContextDAO.storeCollection(Context context) : " + e.toString(),e);
        } catch (DataAccessException e) {
                log.error("DataAccessException thrown in OjbPbDAOContextDAO.storeCollection(Context context) : " + e.toString());
                throw new DataAccessException("Error in OjbPbDAOContextDAO.storeCollection(Context context) : " + e.toString(),e);
        }  catch (Exception e) {
            log.error("Exception thrown in OjbPbDAOContextDAO.storeCollection(Context context) : " + e.toString());
            throw new DataAccessException("Error in OjbPbDAOContextDAO.storeCollection(Context context) : " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.storeCollection(Context context)***************");
    }




    public Object updateCollectionReference(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbDAOContextDAO.updateCollectionReference(Context context)***************");
        Object storeVO = null;
        try{
            storeVO = context.get("storeVO");
            if (storeVO == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.updateCollectionReference(Context context): storeVO not in context. ");

            String pAttributeName =(String) context.get("pAttributeName");
            if (pAttributeName == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.updateCollectionReference(Context context): pAttributeName not in context. ");


            storeVO = updateCollectionReference(storeVO,pAttributeName);

        }catch (DataOptimisticLockException e) {
                log.error("DataOptimisticLockException thrown in OjbPbDAOContextDAO.updateCollectionReference(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbDAOContextDAO.updateCollectionReference(Context context): " + e.toString(),e);
        } catch (DataAccessException e) {
                log.error("DataAccessException thrown in OjbPbDAOContextDAO.updateCollectionReference(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbDAOContextDAO.updateCollectionReference(Context context): " + e.toString(),e);
        }  catch (Exception e) {
            log.error("Exception thrown in OjbPbDAOContextDAO.updateCollectionReference(Context context): " + e.toString());
            throw new DataAccessException("Error in OjbPbDAOContextDAO.updateCollectionReference(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.updateCollectionReference(Context context)***************");
        return storeVO;
    }




    public Object updateCollectionReferences(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbDAOContextDAO.updateCollectionReferences(Context context)***************");
        Object storeVO = null;
        try{
            storeVO = context.get("storeVO");
            if (storeVO == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.updateCollectionReferences(Context context): storeVO not in context. ");

            storeVO = updateCollectionReferences(storeVO);


        } catch (DataOptimisticLockException e) {
                log.error("DataOptimisticLockException thrown in OjbPbDAOContextDAO.updateCollectionReferences(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbDAOContextDAO.updateCollectionReferences(Context context): " + e.toString(),e);
        } catch (DataAccessException e) {
                log.error("DataAccessException thrown in OjbPbDAOContextDAO.updateCollectionReferences(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbDAOContextDAO.updateCollectionReferences(Context context): " + e.toString(),e);
        }  catch (Exception e) {
            log.error("Exception thrown in OjbPbDAOContextDAO.updateCollectionReferences(Context context): " + e.toString());
            throw new DataAccessException("Error in OjbPbDAOContextDAO.updateCollectionReferences(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.updateCollectionReferences(Context context)***************");
        return storeVO;
    }

    public void storePathCascade(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbDAOContextDAO.storePathCascade(Context context)***************");
        try{
            Object storeVO = context.get("storeVO");
            String path = (String) context.get("path");

            storePathCascade(storeVO,path);


        } catch (DataOptimisticLockException e) {
                log.error("DataOptimisticLockException thrown in OjbPbDAOContextDAO.storePathCascade(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbDAOContextDAO.storePathCascade(Context context): " + e.toString(),e);
        } catch (DataAccessException e) {
                log.error("DataAccessException thrown in OjbPbDAOContextDAO.storePathCascade(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbDAOContextDAO.storePathCascade(Context context): " + e.toString(),e);
        }  catch (Exception e) {
            log.error("Exception thrown in OjbPbDAOContextDAO.storePathCascade(Context context): " + e.toString());
            throw new DataAccessException("Error in OjbPbDAOContextDAO.storePathCascade(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.storePathCascade(Context context)***************");
    }


    //public void storePathsCascade(Object storeVO, Collection paths, Boolean pathsHasToBeSorted, Boolean  storeVOHasToBeStored) throws DataAccessException, DataOptimisticLockException{

    public void storePathsCascade(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbDAOContextDAO.storePathsCascade(Context context)***************");
        try{
            Object storeVO = context.get("storeVO");
            Collection paths = (Collection) context.get("paths");
            Boolean pathsHasToBeSorted = (Boolean) context.get("pathsHasToBeSorted");
            Boolean storeVOHasToBeStored = (Boolean) context.get("storeVOHasToBeStored");

            storePathsCascade(storeVO,paths,pathsHasToBeSorted,storeVOHasToBeStored);


        } catch (DataOptimisticLockException e) {
                log.error("DataOptimisticLockException thrown in OjbPbDAOContextDAO.storePathsCascade(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbDAOContextDAO.storePathsCascade(Context context): " + e.toString(),e);
        } catch (DataAccessException e) {
                log.error("DataAccessException thrown in OjbPbDAOContextDAO.storePathsCascade(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbDAOContextDAO.storePathsCascade(Context context): " + e.toString(),e);
        }  catch (Exception e) {
            log.error("Exception thrown in OjbPbDAOContextDAO.storePathsCascade(Context context): " + e.toString());
            throw new DataAccessException("Error in OjbPbDAOContextDAO.storePathsCascade(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.storePathsCascade(Context context)***************");
    }



    //updateCreateTrees(Object storeVO,Collection<String> trees, Boolean storeVOHasToBeUpdated, Boolean deleteChangedOneToOne, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)
    public Object updateCreateTrees(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbDAOContextDAO.updateCreateTrees(Context context)***************");
        Object storeVO = null;
        try{
            storeVO = context.get("storeVO");
            Collection<String> trees =(Collection<String>) context.get("trees");
            Boolean storeVOHasToBeUpdated = (Boolean)context.get("storeVOHasToBeUpdated");
            Boolean deleteChangedOneToOne = (Boolean)context.get("deleteChangedOneToOne");
            Boolean applyDeletePathCascade = (Boolean)context.get("applyDeletePathCascade");
            Boolean ifM2NDeleteOnlyRelationship = (Boolean)context.get("ifM2NDeleteOnlyRelationship");
            Boolean deleteOneToOne = (Boolean)context.get("deleteOneToOne");
            //if(storeVOHasToBeUpdated== null)storeVOHasToBeUpdated= Boolean.TRUE;


            //storeVO = updateCreateTrees(storeVO, trees,storeVOHasToBeUpdated);
            storeVO = updateCreateTrees(storeVO, trees,  storeVOHasToBeUpdated,  deleteChangedOneToOne,  applyDeletePathCascade,  ifM2NDeleteOnlyRelationship,  deleteOneToOne);

        } catch (DataOptimisticLockException e) {
                log.error("DataOptimisticLockException thrown in OjbPbDAOContextDAO.updateCreateTrees(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbDAOContextDAO.updateCreateTrees(Context context): " + e.toString(),e);
        } catch (DataAccessException e) {
                log.error("DataAccessException thrown in OjbPbDAOContextDAO.updateCreateTrees(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbDAOContextDAO.updateCreateTrees(Context context): " + e.toString(),e);
        }  catch (Exception e) {
            log.error("Exception thrown in OjbPbDAOContextDAO.updateCreateTrees(Context context): " + e.toString());
            throw new DataAccessException("Error in OjbPbDAOContextDAO.updateCreateTrees(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.updateCreateTrees(Context context,ObjectModification modification)***************");
        return storeVO;
    }






    public Class getClassFromPath(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.findCollectionByOrValues(Context context) ***************");
        Class realClass = null;
        try{
            realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.getClassFromPath(Context context): realClass not in context. ");

            String path =(String) context.get("path");

            realClass = getClassFromPath(realClass, path);



        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.getClassFromPath(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getClassFromPath(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.getClassFromPath(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getClassFromPath(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.getClassFromPath(Context context)***************");
        return realClass;
    }



    public Class getCollectionClassFromPath(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.getCollectionClassFromPath(Context context) ***************");
        Class realClass = null;
        try{
            realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.getCollectionClassFromPath(Context context): realClass not in context. ");

            String path =(String) context.get("path");

            realClass = getClassFromPath(realClass, path );



        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.getCollectionClassFromPath(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getCollectionClassFromPath(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.getCollectionClassFromPath(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getCollectionClassFromPath(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.getCollectionClassFromPath(Context context)***************");
        return realClass;
    }







    public Vector getFksToItemClassInDecomposedRelationship(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.getFksToItemClassInDecomposedRelationship(Context context) ***************");
        Vector flds = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.getFksToItemClassInDecomposedRelationship(Context context): realClass not in context. ");


            String oneToN =(String) context.get("oneToN");
            if (oneToN == null || oneToN.trim().equals("")) throw new DataAccessException("Error in  OjbPbDAOContextDAO.getFksToItemClassInDecomposedRelationship(Context context): oneToN not in context or empty string. ");

            String mToOne =(String) context.get("mToOne");
            if (mToOne == null || mToOne.trim().equals("")) throw new DataAccessException("Error in  OjbPbDAOContextDAO.getFksToItemClassInDecomposedRelationship(Context context): mToOne not in context or empty string. ");


            flds = getFksToItemClassInDecomposedRelationship(realClass,oneToN,mToOne);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.getFksToItemClassInDecomposedRelationship(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getFksToItemClassInDecomposedRelationship(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.getFksToItemClassInDecomposedRelationship(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getFksToItemClassInDecomposedRelationship(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.getFksToItemClassInDecomposedRelationship(Context context)***************");
        return flds;
    }


    public Object[] getKeyValues(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.getKeyValues(Context context) ***************");
        Object[] keyValues = null;
        try{
            Object pInstance = context.get("pInstance");
            if (pInstance == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.getKeyValues(Context context): pInstance not in context. ");


            keyValues = getKeyValues(pInstance);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.getKeyValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getKeyValues(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.getKeyValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getKeyValues(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.getKeyValues(Context context)***************");
        return keyValues;
    }

    public String[] getPkNames(Class realClass) throws DataAccessException{
        PersistenceBroker broker = null;
        String[] pkNames = null;
        try{
            broker = ServiceLocator.getInstance().findBroker();
            FieldDescriptor[] fields = broker.getClassDescriptor(realClass).getPkFields();
            pkNames=new String[fields.length];
            for (int i=0; i<pkNames.length;i++){
                pkNames[i]= fields[i].getAttributeName();
            }

        } catch (ServiceLocatorException e) {
            log.error("ServiceLocatorException thrown in  OjbPbDAOContextDAO.getPkNames(Class realClass): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getPkNames(Class realClass): " + e.toString(),e);
        } finally {
              //if (broker != null) broker.close();
              if (broker != null && (!PersistenceBrokerInternal.class.isInstance(broker) || !((PersistenceBrokerInternal)broker).isManaged())) broker.close();
        }
        return pkNames;
    }

    public String[] getPkNames(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.getPkNames(Context context) ***************");
        String[] pkNames = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.getPkNames(Context context): realClass not in context. ");


            pkNames = getPkNames(realClass);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.getPkNames(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getPkNames(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.getPkNames(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getPkNames(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.getPkNames(Context context)***************");
        return pkNames;
    }



    public String[] getFksToThisClass(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.getFksToThisClass(Context context) ***************");
        String[] flds = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.getFksToThisClass(Context context): realClass not in context. ");

            String oneToN =(String) context.get("oneToN");
            if (oneToN == null||oneToN.trim().equals("")) throw new DataAccessException("Error in  OjbPbDAOContextDAO.getFksToThisClass(Context context): oneToN not in context or empty string. ");


            flds = getFksToThisClass(realClass,oneToN);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.getFksToThisClass(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getFksToThisClass(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.getFksToThisClass(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getFksToThisClass(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.getFksToThisClass(Context context)***************");
        return flds;
    }


    public Vector getForeignKeyFields(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.getForeignKeyFields(Context context) ***************");
        Vector flds = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.getForeignKeyFields(Context context): realClass not in context. ");

            String pAttributeName =(String) context.get("pAttributeName");
            if (pAttributeName == null||pAttributeName.trim().equals("")) throw new DataAccessException("Error in  OjbPbDAOContextDAO.getForeignKeyFields(Context context): pAttributeName not in context or empty string. ");

            flds = getForeignKeyFields(realClass,pAttributeName);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.getForeignKeyFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getForeignKeyFields(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.getForeignKeyFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getForeignKeyFields(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.getForeignKeyFields(Context context)***************");
        return flds;
    }



    public Vector getInverseForeignKeyFields(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.getInverseForeignKeyFields(Context context) ***************");
        Vector flds = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.getInverseForeignKeyFields(Context context): realClass not in context. ");

            String pAttributeName =(String) context.get("pAttributeName");
            if (pAttributeName == null||pAttributeName.trim().equals("")) throw new DataAccessException("Error in  OjbPbDAOContextDAO.getInverseForeignKeyFields(Context context): pAttributeName not in context or empty string. ");


            flds = getInverseForeignKeyFields(realClass,pAttributeName);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.getInverseForeignKeyFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getInverseForeignKeyFields(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.getInverseForeignKeyFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getInverseForeignKeyFields(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.getInverseForeignKeyFields(Context context)***************");
        return flds;
    }

    //public void setInverseForeignKeyFields(Object pInstance, String pAttributeName) throws DataAccessException
    public void setInverseForeignKeyFields(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbDAOContextDAO.setInverseForeignKeyFields(Context context) ***************");
        Vector flds = null;
        try{
            Object pInstance = context.get("pInstance");
            if (pInstance == null) throw new DataAccessException("Error in  OjbPbDAOContextDAO.setInverseForeignKeyFields(Context context): pInstance not in context. ");

            String pAttributeName =(String) context.get("pAttributeName");
            if (pAttributeName == null||pAttributeName.trim().equals("")) throw new DataAccessException("Error in  OjbPbDAOContextDAO.getInverseForeignKeyFields(Context context): pAttributeName not in context or empty string. ");


            setInverseForeignKeyFields(pInstance,pAttributeName);

        }catch (DataAccessException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbDAOContextDAO.setInverseForeignKeyFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.setInverseForeignKeyFields(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbDAOContextDAO.setInverseForeignKeyFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOContextDAO.getInverseForeignKeyFields(Context context): " + e.toString(),e);
        }
        log.info("************Done with the  OjbPbDAOContextDAO.setInverseForeignKeyFields(Context context)***************");
    }



















}