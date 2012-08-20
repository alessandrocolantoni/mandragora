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
package it.aco.mandragora.dao.context.impl.ojb.pb;


import it.aco.mandragora.common.ServiceLocator;
import it.aco.mandragora.dao.context.ContextDAO;
import it.aco.mandragora.dao.impl.ojb.pb.support.PersistenceBrokerSupport;
import it.aco.mandragora.dao.impl.ojb.pb.core.OjbPbCore;
import it.aco.mandragora.query.LogicCondition;
import it.aco.mandragora.exception.DataAccessException;
import it.aco.mandragora.exception.DataOptimisticLockException;
import it.aco.mandragora.exception.*;

import java.util.*;
import java.lang.Class;

import org.apache.ojb.broker.*;
import org.apache.ojb.broker.util.ObjectModification;
import org.apache.commons.chain.Context;


public abstract class BaseOjbPbContextDAO implements ContextDAO {


    protected PersistenceBrokerSupport persistenceBrokerSupport;


    protected OjbPbCore ojbPbCore;





    // Create Log4j category instance for logging
    private static org.apache.log4j.Category log = org.apache.log4j.Logger.getLogger(BaseOjbPbContextDAO.class.getName());






    protected abstract PersistenceBrokerSupport getPersistenceBrokerSupport(Context context) throws DataAccessException;



    protected abstract OjbPbCore getOjbPbCore(Context context) throws DataAccessException;



    public Object findByPrimaryKey(Context context)throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.findByPrimaryKey(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Object result = null;
        PersistenceBroker pb = null;
        try{
            if(context==null){
                log.error("DataAccessException thrown in  OjbPbContextDAO.findByPrimaryKey(Context context):context==null ");
                throw new DataAccessException("DataAccessException in  OjbPbContextDAO.findByPrimaryKey(Context context): context==null" );
            }
            Class realClass = (Class)context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbContextDAO.findByPrimaryKey(Context context): realClass not in context. ");

            Object pkValue = context.get("pkValue");

            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);


            if (pkValue!=null){
                result = localOjbPbCore.findByPrimaryKey(realClass,pkValue,pb);
            } else{
                Object[] pkValues =(Object[]) context.get("pkValues");
                if(pkValues==null) throw new DataAccessException("Error in  OjbPbContextDAO.findByPrimaryKey(Context context): pkValue and pkValues not in context. ");
                //pkValues!=null
                String[] pkFieldNames = (String[]) context.get("pkFieldNames");
                if (pkFieldNames!=null && pkFieldNames.length!=0){
                    result = localOjbPbCore.findByPrimaryKey(realClass,pkFieldNames,pkValues,pb);
                } else{
                    result = localOjbPbCore.findByPrimaryKey(realClass,pkValues,pb);
                }
            }
        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.findByPrimaryKey(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findByPrimaryKey(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.findByPrimaryKey(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findByPrimaryKey(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.findByPrimaryKey(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findByPrimaryKey(Context context): " + e.toString(),e);
        } finally {
            try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.findByPrimaryKey(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.findByPrimaryKey(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.findByPrimaryKey(Context context)***************");
        return result;
    }

    public Object findObjectByTemplate(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.findObjectByTemplate(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Object result = null;
        PersistenceBroker pb = null;
        try{
            Object templateVO = context.get("templateVO");
            if (templateVO == null) throw new DataAccessException("Error in  OjbPbContextDAO.findObjectByTemplate(Context context): templateVO not in context. ");

            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            result = localOjbPbCore.findObjectByTemplate(templateVO,pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.findObjectByTemplate(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findObjectByTemplate(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.findObjectByTemplate(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findObjectByTemplate(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.findObjectByTemplate(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findObjectByTemplate(Context context): " + e.toString(),e);
        } finally {
                try{
                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);
            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.findObjectByTemplate(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.findObjectByTemplate(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.findObjectByTemplate(Context context)***************");
        return result;

    }



    public Collection findCollectionByLogicCondition(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.findCollectionByLogicCondition(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Collection result = null;
        PersistenceBroker pb = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByLogicCondition(Context context): realClass not in context. ");

            LogicCondition logicCondition =(LogicCondition) context.get("logicCondition");
            if (logicCondition == null) throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByLogicCondition(Context context): logicCondition not in context. ");


            String orderingField = (String) context.get("orderingField");
            Boolean asc = (Boolean) context.get("asc");

            Integer startAtIndex = (Integer) context.get("startAtIndex");
            Integer endAtIndex = (Integer) context.get("endAtIndex");


            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            result = localOjbPbCore.findCollectionByLogicCondition(realClass, logicCondition, orderingField, asc, startAtIndex, endAtIndex,pb );



        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.findCollectionByLogicCondition(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByLogicCondition(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.findCollectionByLogicCondition(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByLogicCondition(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.findCollectionByLogicCondition(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByLogicCondition(Context context): " + e.toString(),e);
        } finally {
                try{
                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);
            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.findCollectionByLogicCondition(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByLogicCondition(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.findCollectionByLogicCondition(Context context)***************");
        return result;
    }

    public Collection findCollectionByOrValues(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.findCollectionByOrValues(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Collection result = null;
        PersistenceBroker pb = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByOrValues(Context context): realClass not in context. ");

            String pAttributeName =(String) context.get("pAttributeName");
            if (pAttributeName == null) throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByOrValues(Context context): pAttributeName not in context. ");
            if (pAttributeName.trim().equals("")) throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByOrValues(Context context): pAttributeName in context is empty string. ");

            Collection valuesCollection = (Collection) context.get("valuesCollection");



            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            result = localOjbPbCore.findCollectionByOrValues(realClass, pAttributeName, valuesCollection,pb );



        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.findCollectionByOrValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByOrValues(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.findCollectionByOrValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByOrValues(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.findCollectionByOrValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByOrValues(Context context): " + e.toString(),e);
        } finally {
                try{
                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);
            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.findCollectionByOrValues(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByOrValues(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.findCollectionByOrValues(Context context)***************");
        return result;

    }

    public Collection findCollectionByTemplate(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.findCollectionByTemplate(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Collection result = null;
        PersistenceBroker pb = null;
        try{
            Object templateVO = context.get("templateVO");
            if (templateVO == null) throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByTemplate(Context context): templateVO not in context. ");
            String orderingField = (String) context.get("orderingField");

            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            if (orderingField==null || orderingField.trim().equals("")){
                result = localOjbPbCore.findCollectionByTemplate(templateVO,pb);
            } else{
                Boolean asc = (Boolean) context.get("asc");
                //if (asc == null) asc=Boolean.TRUE; it is already set to true inside the localOjbPbCore
                result = localOjbPbCore.findCollectionByTemplate(templateVO,orderingField,asc,pb);
            }
        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.findCollectionByTemplate(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByTemplate(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.findCollectionByTemplate(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByTemplate(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.findCollectionByTemplate(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByTemplate(Context context): " + e.toString(),e);
        } finally {
                try{
                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);
            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.findCollectionByTemplate(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByTemplate(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.findCollectionByTemplate(Context context)***************");
        return result;
    }

    public Collection findCollectionByNullFields(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.findCollectionByNullFields(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Collection result = null;
        PersistenceBroker pb = null;
        try{
            Class realClass = (Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByNullFields(Context context): realClass not in context. ");

            String[] nullFields = (String[]) context.get("nullFields");
            if (nullFields == null) throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByNullFields(Context context): nullFields not in context. ");

            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);


            result = localOjbPbCore.findCollectionByNullFields(realClass,nullFields,pb);


        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.findCollectionByNullFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByNullFields(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.findCollectionByNullFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByNullFields(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.findCollectionByNullFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByNullFields(Context context): " + e.toString(),e);
        } finally {
                try{
                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);
            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.findCollectionByNullFields(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByNullFields(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.findCollectionByNullFields(Context context)***************");
        return result;
    }

    public Collection findCollectionByFieldsNotEqualsToValues(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.findCollectionByFieldsNotEqualsToValues(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Collection result = null;
        PersistenceBroker pb = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByFieldsNotEqualsToValues(Context context): realClass not in context. ");

            String[] pAttributeNames =(String[]) context.get("pAttributeNames");
            Object[] valuesArray = (Object[]) context.get("valuesArray");

            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            result = localOjbPbCore.findCollectionByFieldsNotEqualsToValues(realClass,pAttributeNames,valuesArray,pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.findCollectionByFieldsNotEqualsToValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByFieldsNotEqualsToValues(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.findCollectionByFieldsNotEqualsToValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByFieldsNotEqualsToValues(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.findCollectionByFieldsNotEqualsToValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByFieldsNotEqualsToValues(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.findCollectionByFieldsNotEqualsToValues(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByFieldsNotEqualsToValues(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.findCollectionByFieldsNotEqualsToValues(Context context)***************");
        return result;
    }

    public Collection findCollectionByAndFieldsOperatorValues(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.findCollectionByAndFieldsOperatorValues(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Collection result = null;
        PersistenceBroker pb = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByAndFieldsOperatorValues(Context context): realClass not in context. ");

            String[] pAttributeNames =(String[]) context.get("pAttributeNames");
            String[] operators =(String[]) context.get("operators");
            Object[] valuesArray = (Object[]) context.get("valuesArray");

            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            result = localOjbPbCore.findCollectionByAndFieldsOperatorValues(realClass, pAttributeNames, operators, valuesArray,pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.findCollectionByAndFieldsOperatorValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByAndFieldsOperatorValues(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.findCollectionByAndFieldsOperatorValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByAndFieldsOperatorValues(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.findCollectionByAndFieldsOperatorValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByAndFieldsOperatorValues(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.findCollectionByAndFieldsOperatorValues(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByAndFieldsOperatorValues(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.findCollectionByAndFieldsOperatorValues(Context context)***************");
        return result;
    }

    public Collection findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Collection result = null;
        PersistenceBroker pb = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context): realClass not in context. ");

            String[] pAttributeNames =(String[]) context.get("pAttributeNames");
            String[] operators =(String[]) context.get("operators");
            Object[][] valuesMatrix = (Object[][]) context.get("valuesMatrix");

            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            result = localOjbPbCore.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(realClass, pAttributeNames, operators, valuesMatrix,pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Context context)***************");
        return result;
    }



    public Collection findCollectionByFieldInCollection(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.findCollectionByFieldInCollection(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Collection result = null;
        PersistenceBroker pb = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByFieldInCollection(Context context): realClass not in context. ");

            String pAttributeName =(String) context.get("pAttributeName");
            Collection valuesCollection =(Collection)  context.get("valuesCollection");

            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            result = localOjbPbCore.findCollectionByFieldInCollection(realClass, pAttributeName, valuesCollection,pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.findCollectionByFieldInCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByFieldInCollection(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.findCollectionByFieldInCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByFieldInCollection(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.findCollectionByFieldInCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByFieldInCollection(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.findCollectionByFieldInCollection(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.findCollectionByFieldInCollection(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.findCollectionByFieldInCollection(Context context)***************");
        return result;
    }

    public Collection searchValueInFields(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.searchValueInFields(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Collection result = null;
        PersistenceBroker pb = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbContextDAO.searchValueInFields(Context context): realClass not in context. ");

            String[] pAttributeNames =(String[]) context.get("pAttributeNames");
            Object value =  context.get("value");

            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            result = localOjbPbCore.searchValueInFields(realClass, pAttributeNames, value,pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.searchValueInFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.searchValueInFields(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.searchValueInFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.searchValueInFields(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.searchValueInFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.searchValueInFields(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.searchValueInFields(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.searchValueInFields(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.searchValueInFields(Context context)***************");
        return result;
    }


    public Collection getCollectionOfStoredItemsNotInBean(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.getCollectionOfStoredItemsNotInBean(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Collection result=null;
        PersistenceBroker pb = null;
        try{
            Object pInstance=context.get("pInstance");
            if (pInstance == null) throw new DataAccessException("Error in  OjbPbContextDAO.getCollectionOfStoredItemsNotInBean(Context context): pInstance not in context. ");

            String pAttributeName= (String) context.get("pAttributeName");
            if (pAttributeName == null || pAttributeName.trim().equals("")) throw new DataAccessException("Error in  OjbPbContextDAO.getCollectionOfStoredItemsNotInBean(Context context): pAttributeName not in context or empty string. ");


            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            result = localOjbPbCore.getCollectionOfStoredItemsNotInBean(pInstance, pAttributeName, pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.getCollectionOfStoredItemsNotInBean(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getCollectionOfStoredItemsNotInBean(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.getCollectionOfStoredItemsNotInBean(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getCollectionOfStoredItemsNotInBean(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.getCollectionOfStoredItemsNotInBean(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getCollectionOfStoredItemsNotInBean(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.getCollectionOfStoredItemsNotInBean(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.getCollectionOfStoredItemsNotInBean(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.getCollectionOfStoredItemsNotInBean(Context context)***************");
        return result;
    }

    public Collection getStoredCollection(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.getStoredCollection(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Collection result=null;
        PersistenceBroker pb = null;
        try{
            Object pInstance=context.get("pInstance");
            if (pInstance == null) throw new DataAccessException("Error in  OjbPbContextDAO.getStoredCollection(Context context): pInstance not in context. ");

            String pAttributeName= (String) context.get("pAttributeName");
            if (pAttributeName == null || pAttributeName.trim().equals("")) throw new DataAccessException("Error in  OjbPbContextDAO.getStoredCollection(Context context): pAttributeName not in context or empty string. ");


            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            result = localOjbPbCore.getStoredCollection(pInstance, pAttributeName, pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.getStoredCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getStoredCollection(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.getStoredCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getStoredCollection(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.getStoredCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getStoredCollection(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.getStoredCollection(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.getStoredCollection(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.getStoredCollection(Context context)***************");
        return result;
    }

    public Iterator getReportQueryIterator(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.getReportQueryIterator(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Iterator iterator = null;
        PersistenceBroker pb = null;
        try{
            Class realClass=(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbContextDAO.getReportQueryIterator(Context context): realClass not in context. ");

            LogicCondition logicCondition= (LogicCondition) context.get("logicCondition");
            String[] pAttributeNames= (String[]) context.get("pAttributeNames");
            String[] groupBy= (String[]) context.get("groupBy");


            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            iterator = localOjbPbCore.getReportQueryIterator(realClass, logicCondition, pAttributeNames, groupBy, pb);

        } catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.getReportQueryIterator(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getReportQueryIterator(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.getReportQueryIterator(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getReportQueryIterator(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.getReportQueryIterator(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getReportQueryIterator(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.getReportQueryIterator(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.getReportQueryIterator(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.getReportQueryIterator(Context context)***************");
        return iterator;
    }

    public void retrieveReference(Context context)throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.retrieveReference(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        try{
            Object pInstance = context.get("pInstance");
            if (pInstance == null) throw new DataAccessException("Error in  OjbPbContextDAO.retrieveReference(Context context): pInstance not in context. ");

            String pAttributeName =(String) context.get("pAttributeName");
            if (pAttributeName == null) throw new DataAccessException("Error in  OjbPbContextDAO.retrieveReference(Context context): pAttributeName not in context. ");

            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localOjbPbCore.retrieveReference(pInstance,pAttributeName,pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.retrieveReference(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveReference(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.retrieveReference(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveReference(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.retrieveReference(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveReference(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.retrieveReference(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.retrieveReference(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.retrieveReference(Context context)***************");
    }

    public void retrieveReferenceInCollection(Context context)throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.retrieveReferenceInCollection(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        try{
            Collection valueObjectsCollection =(Collection) context.get("valueObjectsCollection");
            if (valueObjectsCollection == null) throw new DataAccessException("Error in  OjbPbContextDAO.retrieveReferenceInCollection(Context context): valueObjectsCollection not in context. ");

            String pAttributeName =(String) context.get("pAttributeName");
            if (pAttributeName == null) throw new DataAccessException("Error in  OjbPbContextDAO.retrieveReferenceInCollection(Context context): pAttributeName not in context. ");

            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localOjbPbCore.retrieveReferenceInCollection(valueObjectsCollection,pAttributeName,pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.retrieveReferenceInCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveReferenceInCollection(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.retrieveReferenceInCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveReferenceInCollection(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.retrieveReferenceInCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveReferenceInCollection(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.retrieveReferenceInCollection(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.retrieveReferenceInCollection(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.retrieveReferenceInCollection(Context context)***************");
    }

    public void retrieveAllReferences(Context context)throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.retrieveAllReferences(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        try{
            Object pInstance = context.get("pInstance");
            if (pInstance == null) throw new DataAccessException("Error in  OjbPbContextDAO.retrieveAllReferences(Context context): pInstance not in context. ");

            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localOjbPbCore.retrieveAllReferences(pInstance,pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.retrieveAllReferences(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveAllReferences(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.retrieveAllReferences(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveAllReferences(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.retrieveAllReferences(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveAllReferences(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.retrieveAllReferences(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.retrieveAllReferences(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.retrieveAllReferences(Context context)***************");
    }

    public void retrieveAllReferencesInCollection(Context context)throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.retrieveAllReferencesInCollection(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        try{
            Collection valueObjectsCollection = (Collection)context.get("valueObjectsCollection");
            if (valueObjectsCollection == null) throw new DataAccessException("Error in  OjbPbContextDAO.retrieveAllReferencesInCollection(Context context): valueObjectsCollection not in context. ");

            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localOjbPbCore.retrieveAllReferencesInCollection(valueObjectsCollection,pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.retrieveAllReferencesInCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveAllReferencesInCollection(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.retrieveAllReferencesInCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveAllReferencesInCollection(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.retrieveAllReferencesInCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveAllReferencesInCollection(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.retrieveAllReferencesInCollection(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.retrieveAllReferencesInCollection(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.retrieveAllReferencesInCollection(Context context)***************");
    }

    public void retrieveNullReference(Context context)throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.retrieveNullReference(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        try{
            Object pInstance = context.get("pInstance");
            if (pInstance == null) throw new DataAccessException("Error in  OjbPbContextDAO.retrieveNullReference(Context context): pInstance not in context. ");

            String pAttributeName =(String) context.get("pAttributeName");
            if (pAttributeName == null) throw new DataAccessException("Error in  OjbPbContextDAO.retrieveNullReference(Context context): pAttributeName not in context. ");

            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localOjbPbCore.retrieveNullReference(pInstance,pAttributeName,pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.retrieveNullReference(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveNullReference(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.retrieveNullReference(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveNullReference(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.retrieveNullReference(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveNullReference(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.retrieveNullReference(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.retrieveNullReference(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.retrieveNullReference(Context context)***************");
    }

    public void retrieveAllNullReferences(Context context)throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.retrieveAllNullReferences(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        try{
            Object pInstance = context.get("pInstance");
            if (pInstance == null) throw new DataAccessException("Error in  OjbPbContextDAO.retrieveAllNullReferences(Context context): pInstance not in context. ");


            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localOjbPbCore.retrieveAllNullReferences(pInstance,pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.retrieveAllNullReferences(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveAllNullReferences(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.retrieveAllNullReferences(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveAllNullReferences(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.retrieveAllNullReferences(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveAllNullReferences(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.retrieveAllNullReferences(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.retrieveAllNullReferences(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.retrieveAllNullReferences(Context context)***************");
    }

    public void retrievePathReference(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.retrievePathReference(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        try{
            Object valueobjectOrCollection=context.get("valueobjectOrCollection");
            String path= (String) context.get("path");


            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localOjbPbCore.retrievePathReference(valueobjectOrCollection, path, pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.retrievePathReference(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrievePathReference(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.retrievePathReference(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrievePathReference(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.retrievePathReference(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrievePathReference(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.retrievePathReference(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.retrievePathReference(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.retrievePathReference(Context context)***************");

    }

    public void retrieveNullPathReference(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.retrieveNullPathReference(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        try{
            Object valueobjectOrCollection=context.get("valueobjectOrCollection");
            String path= (String) context.get("path");


            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localOjbPbCore.retrieveNullPathReference(valueobjectOrCollection, path, pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.retrieveNullPathReference(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveNullPathReference(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.retrieveNullPathReference(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveNullPathReference(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.retrieveNullPathReference(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.retrieveNullPathReference(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);


            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.retrieveNullPathReference(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.retrieveNullPathReference(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.retrieveNullPathReference(Context context)***************");

    }


    public void delete(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbContextDAO.delete(Context context)***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        try{

            Object deleteVO = context.get("deleteVO");
            log.debug("OjbPbContextDAO.delete(Context context) deleteVO got from context ");
            if (deleteVO == null) throw new DataAccessException("Error in  OjbPbContextDAO.delete(Context context): deleteVO not in context. ");
            log.debug("OjbPbContextDAO.delete(Context context) :::deleteVO is not null ");
            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            log.debug("OjbPbContextDAO.delete(Context context) ::: localPersistenceBrokerSupport built ");
            OjbPbCore localOjbPbCore = getOjbPbCore(context);
            log.debug("OjbPbContextDAO.delete(Context context) ::: localOjbPbCore built ");

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);
            log.debug("OjbPbContextDAO.delete(Context context) ::: After localPersistenceBrokerSupport.getPersistenceBroker(context) ");

            log.debug("OjbPbContextDAO.delete(Context context) ::: After context.put");


            localPersistenceBrokerSupport.beginTransaction(context,pb);
            log.debug("OjbPbContextDAO.delete(Context context) ::: After localPersistenceBrokerSupport.beginTransaction(context,pb)");
            localOjbPbCore.delete(deleteVO,pb);
            log.debug("OjbPbContextDAO.delete(Context context) ::: After localOjbPbCore.delete(deleteVO,pb)");
            localPersistenceBrokerSupport.commit(context,pb);
            log.debug("OjbPbContextDAO.delete(Context context) ::: After localPersistenceBrokerSupport.commit(context,pb)");

        }catch (OptimisticLockException e) {
        	try{
                localPersistenceBrokerSupport.rollback(context,pb); // change of policy. Now the if OptimisticLockException is rolled back , depends as other Exceptions, on if the environment is
                                                                // managed or not. Context can be used to add an apecial attribute for OptimisticLockException management
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OptimisticLockException in OjbPbContextDAO.delete(Context context): " + pbsEx.toString());
            } finally{
                log.error("OptimisticLockException thrown in OjbPbContextDAO.delete(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.delete(Context context): " + e.toString(),e);
            }
        } catch (PersistenceBrokerSupportException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the PersistenceBrokerSupportException in OjbPbContextDAO.delete(Context context): " + pbsEx.toString());
            } finally{
                log.error("PersistenceBrokerSupportException thrown in OjbPbContextDAO.delete(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.delete(Context context): " + e.toString(),e);
            }
        } catch (OjbPbCoreException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OjbPbCoreException in OjbPbContextDAO.delete(Context context): " + pbsEx.toString());
            } finally{
                log.error("OjbPbCoreException thrown in OjbPbContextDAO.delete(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.delete(Context context): " + e.toString(),e);
            }
        } catch (Exception e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the Exception in OjbPbContextDAO.delete(Context context): " + pbsEx.toString());
            } finally{
                log.error("Exception thrown in OjbPbContextDAO.delete(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.delete(Context context): " + e.toString(),e);
            }
        } finally {
            try{
                localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);
            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.delete(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.delete(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.delete(Context context)***************");
    }

    public void deleteCollection(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbContextDAO.deleteCollection(Context context)***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        try{
            Collection deleteVOs = (Collection) context.get("deleteVOs");
            if(deleteVOs!=null) {
                log.debug("OjbPbContextDAO.deleteCollection(Context context) :::deleteVOs is not null ");
                localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
                log.debug("OjbPbContextDAO.deleteCollection(Context context) ::: localPersistenceBrokerSupport built ");
                OjbPbCore localOjbPbCore = getOjbPbCore(context);
                log.debug("OjbPbContextDAO.deleteCollection(Context context) ::: localOjbPbCore built ");

                pb = localPersistenceBrokerSupport.getPersistenceBroker(context);
                log.debug("OjbPbContextDAO.deleteCollection(Context context) ::: After localPersistenceBrokerSupport.getPersistenceBroker(context) ");

                localPersistenceBrokerSupport.beginTransaction(context,pb);

                log.debug("OjbPbContextDAO.deleteCollection(Context context) ::: After localPersistenceBrokerSupport.beginTransaction(context,pb)");
                localOjbPbCore.deleteCollection(deleteVOs,pb);
                log.debug("OjbPbContextDAO.deleteCollection(Context context) ::: After localOjbPbCore.delete(deleteVO,pb)");
                localPersistenceBrokerSupport.commit(context,pb);
                log.debug("OjbPbContextDAO.deleteCollection(Context context) ::: After localPersistenceBrokerSupport.commit(context,pb)");

            }
        } catch (OptimisticLockException e) {
        	try{
                localPersistenceBrokerSupport.rollback(context,pb); // change of policy. Now the if OptimisticLockException is rolled back , depends as other Exceptions, on if the environment is
                                                                // managed or not. Context can be used to add an apecial attribute for OptimisticLockException management
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OptimisticLockException in OjbPbContextDAO.deleteCollection(Context context): " + pbsEx.toString());
            } finally{
                log.error("OptimisticLockException thrown in OjbPbContextDAO.deleteCollection(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.deleteCollection(Context context): " + e.toString(),e);
            }
        } catch (PersistenceBrokerSupportException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the PersistenceBrokerSupportException in OjbPbContextDAO.deleteCollection(Context context): " + pbsEx.toString());
            } finally{
                log.error("PersistenceBrokerSupportException thrown in OjbPbContextDAO.deleteCollection(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbContextDAO.deleteCollection(Context context): " + e.toString(),e);
            }
        } catch (OjbPbCoreException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OjbPbCoreException in OjbPbContextDAO.deleteCollection(Context context): " + pbsEx.toString());
            } finally{
                log.error("OjbPbCoreException thrown in OjbPbContextDAO.deleteCollection(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbContextDAO.deleteCollection(Context context): " + e.toString(),e);
            }
        } catch (Exception e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the Exception in OjbPbContextDAO.deleteCollection(Context context): " + pbsEx.toString());
            } finally{
                log.error("Exception thrown in OjbPbContextDAO.deleteCollection(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbContextDAO.deleteCollection(Context context): " + e.toString(),e);
            }
        } finally {
            try{
                localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);
            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.deleteCollection(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.deleteCollection(Context context) in the finally clause: " + e.toString(),e);
            }
        }

        log.info("************Done with the OjbPbContextDAO.deleteCollection(Context context) ***************");

    }


    public void deleteMToNRelationshipCollection(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.deleteMToNRelationshipCollection(Context context)***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        try{
            Object left =  context.get("left");
            String leftFieldName =  (String) context.get("leftFieldName");
            Collection rightCollection = (Collection) context.get("rightCollection");



            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localPersistenceBrokerSupport.beginTransaction(context,pb);

            localOjbPbCore.deleteMToNRelationshipCollection(left, leftFieldName, rightCollection,pb);
            localPersistenceBrokerSupport.commit(context,pb);


        } catch (PersistenceBrokerSupportException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the PersistenceBrokerSupportException in OjbPbContextDAO.deleteMToNRelationshipCollection(Context context): " + pbsEx.toString());
            } finally{
                log.error("PersistenceBrokerSupportException thrown in OjbPbContextDAO.deleteMToNRelationshipCollection(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbContextDAO.deleteMToNRelationshipCollection(Context context): " + e.toString(),e);
            }
        } catch (OjbPbCoreException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OjbPbCoreException in OjbPbContextDAO.deleteMToNRelationshipCollection(Context context): " + pbsEx.toString());
            } finally{
                log.error("OjbPbCoreException thrown in OjbPbContextDAO.deleteMToNRelationshipCollection(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbContextDAO.deleteMToNRelationshipCollection(Context context): " + e.toString(),e);
            }
        } catch (Exception e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the Exception in OjbPbContextDAO.deleteMToNRelationshipCollection(Context context): " + pbsEx.toString());
            } finally{
                log.error("Exception thrown in OjbPbContextDAO.deleteMToNRelationshipCollection(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbContextDAO.deleteMToNRelationshipCollection(Context context): " + e.toString(),e);
            }
        } finally {
            try{
                localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);
            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.deleteMToNRelationshipCollection(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.deleteMToNRelationshipCollection(Context context) in the finally clause: " + e.toString(),e);
            }
        }

        log.info("************Done with the OjbPbContextDAO.deleteMToNRelationshipCollection(Context context) ***************");

    }

    public void deleteItemsNotInCollectionsInPath(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.deleteItemsNotInCollectionsInPath(Context context)***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        try{
            Object rootVO =  context.get("rootVO");
            String path =  (String) context.get("path");
            Boolean applyDeletePathCascade =  (Boolean) context.get("applyDeletePathCascade");
            Boolean ifM2NDeleteOnlyRelationship =  (Boolean) context.get("ifM2NDeleteOnlyRelationship");
            Boolean deleteOneToOne =  (Boolean) context.get("deleteOneToOne");



            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localPersistenceBrokerSupport.beginTransaction(context,pb);

            localOjbPbCore.deleteItemsNotInCollectionsInPath(rootVO, path, applyDeletePathCascade, ifM2NDeleteOnlyRelationship, deleteOneToOne,pb) ;
            localPersistenceBrokerSupport.commit(context,pb);


        } catch (PersistenceBrokerSupportException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the PersistenceBrokerSupportException in OjbPbContextDAO.deleteItemsNotInCollectionsInPath(Context context): " + pbsEx.toString());
            } finally{
                log.error("PersistenceBrokerSupportException thrown in OjbPbContextDAO.deleteItemsNotInCollectionsInPath(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbContextDAO.deleteItemsNotInCollectionsInPath(Context context): " + e.toString(),e);
            }
        } catch (OjbPbCoreException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OjbPbCoreException in OjbPbContextDAO.deleteItemsNotInCollectionsInPath(Context context): " + pbsEx.toString());
            } finally{
                log.error("OjbPbCoreException thrown in OjbPbContextDAO.deleteItemsNotInCollectionsInPath(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbContextDAO.deleteItemsNotInCollectionsInPath(Context context): " + e.toString(),e);
            }
        } catch (Exception e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the Exception in OjbPbContextDAO.deleteItemsNotInCollectionsInPath(Context context): " + pbsEx.toString());
            } finally{
                log.error("Exception thrown in OjbPbContextDAO.deleteItemsNotInCollectionsInPath(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbContextDAO.deleteItemsNotInCollectionsInPath(Context context): " + e.toString(),e);
            }
        } finally {
            try{
                localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);
            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.deleteItemsNotInCollectionsInPath(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.deleteItemsNotInCollectionsInPath(Context context) in the finally clause: " + e.toString(),e);
            }
        }

        log.info("************Done with the OjbPbContextDAO.deleteItemsNotInCollectionsInPath(Context context) ***************");

    }


    public void deleteItemsNotInCollectionsInPaths(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.deleteItemsNotInCollectionsInPaths(Context context)***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        try{
            Object rootVO =  context.get("rootVO");
            Collection<String> paths =  (Collection<String> ) context.get("paths");
            Boolean applyDeletePathCascade =  (Boolean) context.get("applyDeletePathCascade");
            Boolean ifM2NDeleteOnlyRelationship =  (Boolean) context.get("ifM2NDeleteOnlyRelationship");
            Boolean deleteOneToOne =  (Boolean) context.get("deleteOneToOne");



            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localPersistenceBrokerSupport.beginTransaction(context,pb);

            localOjbPbCore.deleteItemsNotInCollectionsInPaths(rootVO, paths, Boolean.TRUE,  applyDeletePathCascade, ifM2NDeleteOnlyRelationship, deleteOneToOne,pb);
            localPersistenceBrokerSupport.commit(context,pb);


        } catch (PersistenceBrokerSupportException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the PersistenceBrokerSupportException in OjbPbContextDAO.deleteItemsNotInCollectionsInPaths(Context context): " + pbsEx.toString());
            } finally{
                log.error("PersistenceBrokerSupportException thrown in OjbPbContextDAO.deleteItemsNotInCollectionsInPaths(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbContextDAO.deleteItemsNotInCollectionsInPaths(Context context): " + e.toString(),e);
            }
        } catch (OjbPbCoreException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OjbPbCoreException in OjbPbContextDAO.deleteItemsNotInCollectionsInPaths(Context context): " + pbsEx.toString());
            } finally{
                log.error("OjbPbCoreException thrown in OjbPbContextDAO.deleteItemsNotInCollectionsInPaths(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbContextDAO.deleteItemsNotInCollectionsInPaths(Context context): " + e.toString(),e);
            }
        } catch (Exception e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the Exception in OjbPbContextDAO.deleteItemsNotInCollectionsInPaths(Context context): " + pbsEx.toString());
            } finally{
                log.error("Exception thrown in OjbPbContextDAO.deleteItemsNotInCollectionsInPaths(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbContextDAO.deleteItemsNotInCollectionsInPaths(Context context): " + e.toString(),e);
            }
        } finally {
            try{
                localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);
            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.deleteItemsNotInCollectionsInPaths(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.deleteItemsNotInCollectionsInPaths(Context context) in the finally clause: " + e.toString(),e);
            }
        }

        log.info("************Done with the OjbPbContextDAO.deleteItemsNotInCollectionsInPaths(Context context) ***************");

    }


    public void deletePathCascade(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.deletePathCascade(Context context)***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        try{
            Object parentVO =  context.get("parentVO");
            String path =  (String) context.get("path");
            Boolean ifM2NDeleteOnlyRelationship =  (Boolean) context.get("ifM2NDeleteOnlyRelationship");
            Boolean deleteOneToOne =  (Boolean) context.get("deleteOneToOne");



            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localPersistenceBrokerSupport.beginTransaction(context,pb);

            localOjbPbCore.deletePathCascade(parentVO, path, ifM2NDeleteOnlyRelationship,  deleteOneToOne,pb);
            localPersistenceBrokerSupport.commit(context,pb);


        } catch (PersistenceBrokerSupportException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the PersistenceBrokerSupportException in OjbPbContextDAO.deletePathCascade(Context context): " + pbsEx.toString());
            } finally{
                log.error("PersistenceBrokerSupportException thrown in OjbPbContextDAO.deletePathCascade(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbContextDAO.deletePathCascade(Context context): " + e.toString(),e);
            }
        } catch (OjbPbCoreException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OjbPbCoreException in OjbPbContextDAO.deletePathCascade(Context context): " + pbsEx.toString());
            } finally{
                log.error("OjbPbCoreException thrown in OjbPbContextDAO.deletePathCascade(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbContextDAO.deletePathCascade(Context context): " + e.toString(),e);
            }
        } catch (Exception e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the Exception in OjbPbContextDAO.deletePathCascade(Context context): " + pbsEx.toString());
            } finally{
                log.error("Exception thrown in OjbPbContextDAO.deletePathCascade(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbContextDAO.deletePathCascade(Context context): " + e.toString(),e);
            }
        } finally {
            try{
                localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);
            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.deletePathCascade(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.deletePathCascade(Context context) in the finally clause: " + e.toString(),e);
            }
        }

        log.info("************Done with the OjbPbContextDAO.deletePathCascade(Context context) ***************");

    }


    public void deletePathsCascade(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.deletePathsCascade(Context context)***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        try{
            Object parentVO =  context.get("parentVO");
            Collection paths =  (Collection) context.get("paths");
            Boolean ifM2NDeleteOnlyRelationship =  (Boolean) context.get("ifM2NDeleteOnlyRelationship");
            Boolean deleteOneToOne =  (Boolean) context.get("deleteOneToOne");


            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localPersistenceBrokerSupport.beginTransaction(context,pb);

            localOjbPbCore.deletePathsCascade(parentVO,paths, ifM2NDeleteOnlyRelationship,  deleteOneToOne,pb) ;
            localPersistenceBrokerSupport.commit(context,pb);


        } catch (PersistenceBrokerSupportException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the PersistenceBrokerSupportException in OjbPbContextDAO.deletePathsCascade(Context context): " + pbsEx.toString());
            } finally{
                log.error("PersistenceBrokerSupportException thrown in OjbPbContextDAO.deletePathsCascade(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbContextDAO.deletePathsCascade(Context context): " + e.toString(),e);
            }
        } catch (OjbPbCoreException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OjbPbCoreException in OjbPbContextDAO.deletePathsCascade(Context context): " + pbsEx.toString());
            } finally{
                log.error("OjbPbCoreException thrown in OjbPbContextDAO.deletePathsCascade(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbContextDAO.deletePathsCascade(Context context): " + e.toString(),e);
            }
        } catch (Exception e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the Exception in OjbPbContextDAO.deletePathsCascade(Context context): " + pbsEx.toString());
            } finally{
                log.error("Exception thrown in OjbPbContextDAO.deletePathsCascade(Context context): " + e.toString());
                throw new DataAccessException("Error in OjbPbContextDAO.deletePathsCascade(Context context): " + e.toString(),e);
            }
        } finally {
            try{
                localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);
            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.deletePathsCascade(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.deletePathsCascade(Context context) in the finally clause: " + e.toString(),e);
            }
        }

        log.info("************Done with the OjbPbContextDAO.deletePathsCascade(Context context) ***************");

    }



    public Object insert(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbContextDAO.insert(Context context)***************");
        Object insertVO;
        try{
            insertVO = store(context,ObjectModification.INSERT);
        } catch (DataOptimisticLockException e) {
            log.error("DataOptimisticLockException thrown in OjbPbContextDAO.insert(Context context): " + e.toString());
            throw new DataOptimisticLockException("Error in OjbPbContextDAO.insert(Context context): " + e.toString(),e);
        } catch (DataAccessException e) {
            log.error("DataAccessException thrown in OjbPbContextDAO.insert(Context context): " + e.toString());
            throw new DataAccessException("Error in OjbPbContextDAO.insert(Context context): " + e.toString(),e);
        }
        log.info("************Done with the OjbPbContextDAO.insert(Context context)***************");
        return insertVO;
    }

    public Object update(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbContextDAO.update(Context context)***************");
        Object storeVO;
        try{
            storeVO = store(context,ObjectModification.UPDATE);
        } catch (DataOptimisticLockException e) {
            log.error("DataOptimisticLockException thrown in OjbPbContextDAO.update(Context context): " + e.toString());
            throw new DataOptimisticLockException("Error in OjbPbContextDAO.update(Context context): " + e.toString(),e);
        } catch (DataAccessException e) {
            log.error("DataAccessException thrown in OjbPbContextDAO.update(Context context): " + e.toString());
            throw new DataAccessException("Error in OjbPbContextDAO.update(Context context): " + e.toString(),e);
        }
        log.info("************Done with the OjbPbContextDAO.update(Context context)***************");
        return storeVO;
    }

    public void updateCollection(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbContextDAO.updateCollection(Context context)***************");
        try{
            storeCollection(context);
        } catch (DataOptimisticLockException e) {
            log.error("DataOptimisticLockException thrown in OjbPbContextDAO.updateCollection(Context context): " + e.toString());
            throw new DataOptimisticLockException("Error in OjbPbContextDAO.updateCollection(Context context): " + e.toString(),e);
        } catch (DataAccessException e) {
            log.error("DataAccessException thrown in OjbPbContextDAO.updateCollection(Context context): " + e.toString());
            throw new DataAccessException("Error in OjbPbContextDAO.updateCollection(Context context): " + e.toString(),e);
        }
        log.info("************Done with the OjbPbContextDAO.updateCollection(Context context)***************");
    }





    public Object updateCollectionReference(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbContextDAO.updateCollectionReference(Context context)***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Object storeVO = null;
        PersistenceBroker pb = null;
        try{
            storeVO = context.get("storeVO");
            if (storeVO == null) throw new DataAccessException("Error in  OjbPbContextDAO.updateCollectionReference(Context context): storeVO not in context. ");

            String pAttributeName =(String) context.get("pAttributeName");
            if (pAttributeName == null) throw new DataAccessException("Error in  OjbPbContextDAO.updateCollectionReference(Context context): pAttributeName not in context. ");


            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localPersistenceBrokerSupport.beginTransaction(context,pb);
            storeVO = localOjbPbCore.updateCollectionReference(storeVO,pAttributeName,pb);
            localPersistenceBrokerSupport.commit(context,pb);

        } catch (OptimisticLockException e) {
        	try{
                localPersistenceBrokerSupport.rollback(context,pb); // change of policy. Now the if OptimisticLockException is rolled back , depends as other Exceptions, on if the environment is
                                                   // managed or not. Context can be used to add an apecial attribute for OptimisticLockException management
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OptimisticLockException in OjbPbContextDAO.updateCollectionReference(Context context): " + pbsEx.toString());
            } finally{
                log.error("OptimisticLockException thrown in OjbPbContextDAO.updateCollectionReference(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.updateCollectionReference(Context context): " + e.toString(),e);
            }
        } catch (PersistenceBrokerSupportException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the PersistenceBrokerSupportException in OjbPbContextDAO.updateCollectionReference(Context context): " + pbsEx.toString());
            } finally{
                log.error("PersistenceBrokerSupportException thrown in OjbPbContextDAO.updateCollectionReference(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.updateCollectionReference(Context context): " + e.toString(),e);
            }
        } catch (OjbPbCoreException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OjbPbCoreException in OjbPbContextDAO.updateCollectionReference(Context context): " + pbsEx.toString());
            } finally{
                log.error("OjbPbCoreException thrown in OjbPbContextDAO.updateCollectionReference(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.updateCollectionReference(Context context): " + e.toString(),e);
            }
        } catch (Exception e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the Exception in OjbPbContextDAO.updateCollectionReference(Context context): " + pbsEx.toString());
            } finally{
                log.error("Exception thrown in OjbPbContextDAO.updateCollectionReference(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.updateCollectionReference(Context context): " + e.toString(),e);
            }
        } finally {
            try{
                localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);
            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.updateCollectionReference(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.updateCollectionReference(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.updateCollectionReference(Context context)***************");
        return storeVO;
    }

    public Object updateCollectionReferences(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbContextDAO.updateCollectionReferences(Context context)***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Object storeVO = null;
        PersistenceBroker pb = null;
        try{
            storeVO = context.get("storeVO");
            if (storeVO == null) throw new DataAccessException("Error in  OjbPbContextDAO.updateCollectionReferences(Context context): storeVO not in context. ");


            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localPersistenceBrokerSupport.beginTransaction(context,pb);
            storeVO = localOjbPbCore.updateCollectionReferences(storeVO,pb);
            localPersistenceBrokerSupport.commit(context,pb);

        } catch (OptimisticLockException e) {
        	try{
                localPersistenceBrokerSupport.rollback(context,pb); // change of policy. Now the if OptimisticLockException is rolled back , depends as other Exceptions, on if the environment is
                                                   // managed or not. Context can be used to add an apecial attribute for OptimisticLockException management
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OptimisticLockException in OjbPbContextDAO.updateCollectionReferences(Context context): " + pbsEx.toString());
            } finally{
                log.error("OptimisticLockException thrown in OjbPbContextDAO.updateCollectionReferences(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.updateCollectionReferences(Context context): " + e.toString(),e);
            }
        } catch (PersistenceBrokerSupportException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the PersistenceBrokerSupportException in OjbPbContextDAO.updateCollectionReferences(Context context): " + pbsEx.toString());
            } finally{
                log.error("PersistenceBrokerSupportException thrown in OjbPbContextDAO.updateCollectionReferences(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.updateCollectionReferences(Context context): " + e.toString(),e);
            }
        } catch (OjbPbCoreException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OjbPbCoreException in OjbPbContextDAO.updateCollectionReferences(Context context): " + pbsEx.toString());
            } finally{
                log.error("OjbPbCoreException thrown in OjbPbContextDAO.updateCollectionReferences(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.updateCollectionReferences(Context context): " + e.toString(),e);
            }
        } catch (Exception e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the Exception in OjbPbContextDAO.updateCollectionReferences(Context context): " + pbsEx.toString());
            } finally{
                log.error("Exception thrown in OjbPbContextDAO.updateCollectionReferences(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.updateCollectionReferences(Context context): " + e.toString(),e);
            }
        } finally {
            try{
                localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);
            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.updateCollectionReferences(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.updateCollectionReferences(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.updateCollectionReferences(Context context)***************");
        return storeVO;
    }


    public void storePathCascade(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbContextDAO.storePathCascade(Context context)***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        try{
            Object storeVO = context.get("storeVO");
            String path = (String) context.get("path");


            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localPersistenceBrokerSupport.beginTransaction(context,pb);
            localOjbPbCore.storePathCascade(storeVO,path,pb);
            localPersistenceBrokerSupport.commit(context,pb);

        } catch (OptimisticLockException e) {
        	try{
                localPersistenceBrokerSupport.rollback(context,pb); // change of policy. Now the if OptimisticLockException is rolled back , depends as other Exceptions, on if the environment is
                                                   // managed or not. Context can be used to add an apecial attribute for OptimisticLockException management
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OptimisticLockException in OjbPbContextDAO.storePathCascade(Context context): " + pbsEx.toString());
            } finally{
                log.error("OptimisticLockException thrown in OjbPbContextDAO.storePathCascade(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.storePathCascade(Context context): " + e.toString(),e);
            }
        } catch (PersistenceBrokerSupportException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the PersistenceBrokerSupportException in OjbPbContextDAO.storePathCascade(Context context): " + pbsEx.toString());
            } finally{
                log.error("PersistenceBrokerSupportException thrown in OjbPbContextDAO.storePathCascade(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.storePathCascade(Context context): " + e.toString(),e);
            }
        } catch (OjbPbCoreException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OjbPbCoreException in OjbPbContextDAO.storePathCascade(Context context): " + pbsEx.toString());
            } finally{
                log.error("OjbPbCoreException thrown in OjbPbContextDAO.storePathCascade(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.storePathCascade(Context context): " + e.toString(),e);
            }
        } catch (Exception e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the Exception in OjbPbContextDAO.storePathCascade(Context context): " + pbsEx.toString());
            } finally{
                log.error("Exception thrown in OjbPbContextDAO.storePathCascade(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.storePathCascade(Context context): " + e.toString(),e);
            }
        } finally {
            try{
                localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);
            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.storePathCascade(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.storePathCascade(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.storePathCascade(Context context)***************");

    }

    public void storePathsCascade(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbContextDAO.storePathsCascade(Context context)***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        try{
            Object storeVO = context.get("storeVO");
            Collection paths = (Collection) context.get("paths");
            Boolean pathsHasToBeSorted = (Boolean) context.get("pathsHasToBeSorted");
            Boolean storeVOHasToBeStored = (Boolean) context.get("storeVOHasToBeStored");

            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localPersistenceBrokerSupport.beginTransaction(context,pb);
            localOjbPbCore.storePathsCascade(storeVO,paths,pathsHasToBeSorted,storeVOHasToBeStored,pb);
            localPersistenceBrokerSupport.commit(context,pb);

        } catch (OptimisticLockException e) {
        	try{
                localPersistenceBrokerSupport.rollback(context,pb); // change of policy. Now the if OptimisticLockException is rolled back , depends as other Exceptions, on if the environment is
                                                   // managed or not. Context can be used to add an apecial attribute for OptimisticLockException management
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OptimisticLockException in OjbPbContextDAO.storePathsCascade(Context context): " + pbsEx.toString());
            } finally{
                log.error("OptimisticLockException thrown in OjbPbContextDAO.storePathsCascade(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.storePathsCascade(Context context): " + e.toString(),e);
            }
        } catch (PersistenceBrokerSupportException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the PersistenceBrokerSupportException in OjbPbContextDAO.storePathsCascade(Context context): " + pbsEx.toString());
            } finally{
                log.error("PersistenceBrokerSupportException thrown in OjbPbContextDAO.storePathsCascade(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.storePathsCascade(Context context): " + e.toString(),e);
            }
        } catch (OjbPbCoreException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OjbPbCoreException in OjbPbContextDAO.storePathsCascade(Context context): " + pbsEx.toString());
            } finally{
                log.error("OjbPbCoreException thrown in OjbPbContextDAO.storePathsCascade(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.storePathsCascade(Context context): " + e.toString(),e);
            }
        } catch (Exception e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the Exception in OjbPbContextDAO.storePathsCascade(Context context): " + pbsEx.toString());
            } finally{
                log.error("Exception thrown in OjbPbContextDAO.storePathsCascade(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.storePathsCascade(Context context): " + e.toString(),e);
            }
        } finally {
            try{
                localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);
            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.storePathsCascade(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.storePathsCascade(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.storePathsCascade(Context context)***************");

    }

    public Object updateCreateTrees(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbContextDAO.updateCreateTrees(Context context)***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Object storeVO = null;
        PersistenceBroker pb = null;
        try{
            storeVO = context.get("storeVO");
            Collection<String> trees =(Collection<String>) context.get("trees");
            Boolean storeVOHasToBeUpdated = (Boolean)context.get("storeVOHasToBeUpdated");
            Boolean deleteChangedOneToOne = (Boolean)context.get("deleteChangedOneToOne");
            Boolean applyDeletePathCascade = (Boolean)context.get("applyDeletePathCascade");
            Boolean ifM2NDeleteOnlyRelationship = (Boolean)context.get("ifM2NDeleteOnlyRelationship");
            Boolean deleteOneToOne = (Boolean)context.get("deleteOneToOne");





            //if(storeVOHasToBeUpdated== null)storeVOHasToBeUpdated= Boolean.TRUE;


            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localPersistenceBrokerSupport.beginTransaction(context,pb);
            //storeVO = localOjbPbCore.updateCreateTrees(storeVO, trees,storeVOHasToBeUpdated,pb);
            storeVO = localOjbPbCore.updateCreateTrees(storeVO, trees,storeVOHasToBeUpdated,deleteChangedOneToOne,applyDeletePathCascade,ifM2NDeleteOnlyRelationship,deleteOneToOne,pb);
            localPersistenceBrokerSupport.commit(context,pb);

        } catch (OptimisticLockException e) {
        	try{
                localPersistenceBrokerSupport.rollback(context,pb); // change of policy. Now the if OptimisticLockException is rolled back , depends as other Exceptions, on if the environment is
                                                   // managed or not. Context can be used to add an apecial attribute for OptimisticLockException management
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OptimisticLockException in OjbPbContextDAO.updateCreateTrees(Context context): " + pbsEx.toString());
            } finally{
                log.error("OptimisticLockException thrown in OjbPbContextDAO.updateCreateTrees(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.updateCreateTrees(Context context): " + e.toString(),e);
            }
        } catch (PersistenceBrokerSupportException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the PersistenceBrokerSupportException in OjbPbContextDAO.updateCreateTrees(Context context): " + pbsEx.toString());
            } finally{
                log.error("PersistenceBrokerSupportException thrown in OjbPbContextDAO.updateCreateTrees(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.updateCreateTrees(Context context): " + e.toString(),e);
            }
        } catch (OjbPbCoreException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OjbPbCoreException in OjbPbContextDAO.updateCreateTrees(Context context): " + pbsEx.toString());
            } finally{
                log.error("OjbPbCoreException thrown in OjbPbContextDAO.updateCreateTrees(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.updateCreateTrees(Context context): " + e.toString(),e);
            }
        } catch (Exception e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the Exception in OjbPbContextDAO.updateCreateTrees(Context context): " + pbsEx.toString());
            } finally{
                log.error("Exception thrown in OjbPbContextDAO.updateCreateTrees(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.updateCreateTrees(Context context): " + e.toString(),e);
            }
        } finally {
            try{
                localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);
            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.updateCreateTrees(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.updateCreateTrees(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.updateCreateTrees(Context context) ***************");
        return storeVO;
    }

    private Object store(Context context,ObjectModification modification) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbContextDAO.store(Context context,ObjectModification modification)***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Object storeVO = null;
        PersistenceBroker pb = null;
        try{
            storeVO = context.get("storeVO");
            if (storeVO == null) throw new DataAccessException("Error in  OjbPbContextDAO.store(Context context,ObjectModification modification): storeVO not in context. ");

            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localPersistenceBrokerSupport.beginTransaction(context,pb);
            storeVO = localOjbPbCore.store(storeVO,modification,pb);
            //context.put("storeVO",storeVO);
            localPersistenceBrokerSupport.commit(context,pb);

        } catch (OptimisticLockException e) {
        	try{
                localPersistenceBrokerSupport.rollback(context,pb); // change of policy. Now the if OptimisticLockException is rolled back , depends as other Exceptions, on if the environment is
                                                   // managed or not. Context can be used to add an apecial attribute for OptimisticLockException management
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OptimisticLockException in OjbPbContextDAO.store(Context context,ObjectModification modification): " + pbsEx.toString());
            } finally{
                log.error("OptimisticLockException thrown in OjbPbContextDAO.store(Context context,ObjectModification modification): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.store(Context context,ObjectModification modification): " + e.toString(),e);
            }
        } catch (PersistenceBrokerSupportException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the PersistenceBrokerSupportException in OjbPbContextDAO.store(Context context,ObjectModification modification): " + pbsEx.toString());
            } finally{
                log.error("PersistenceBrokerSupportException thrown in OjbPbContextDAO.store(Context context,ObjectModification modification): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.store(Context context,ObjectModification modification): " + e.toString(),e);
            }
        } catch (OjbPbCoreException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OjbPbCoreException in OjbPbContextDAO.store(Context context,ObjectModification modification): " + pbsEx.toString());
            } finally{
                log.error("OjbPbCoreException thrown in OjbPbContextDAO.store(Context context,ObjectModification modification): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.store(Context context,ObjectModification modification): " + e.toString(),e);
            }
        } catch (Exception e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the Exception in OjbPbContextDAO.store(Context context,ObjectModification modification): " + pbsEx.toString());
            } finally{
                log.error("Exception thrown in OjbPbContextDAO.store(Context context,ObjectModification modification): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.store(Context context,ObjectModification modification): " + e.toString(),e);
            }
        } finally {
            try{
                localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);
            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.store(Context context,ObjectModification modification) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.store(Context context,ObjectModification modification) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.store(Context context,ObjectModification modification)***************");
        return storeVO;
    }

    private void storeCollection(Context context) throws DataAccessException, DataOptimisticLockException{
        log.info("************Entering the OjbPbContextDAO.storeCollection(Context context)***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        try{

            Collection storeVOs = (Collection) context.get("storeVOs");
            if (storeVOs == null) throw new DataAccessException("Error in  OjbPbContextDAO.storeCollection(Context context): storeVOs not in context. ");

            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localPersistenceBrokerSupport.beginTransaction(context,pb);
            localOjbPbCore.storeCollection(storeVOs,pb);
            localPersistenceBrokerSupport.commit(context,pb);

        }catch (OptimisticLockException e) {
        	try{
                localPersistenceBrokerSupport.rollback(context,pb); // change of policy. Now the if OptimisticLockException is rolled back , depends as other Exceptions, on if the environment is
                                                                // managed or not. Context can be used to add an apecial attribute for OptimisticLockException management
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OptimisticLockException in OjbPbContextDAO.storeCollection(Context context): " + pbsEx.toString());
            } finally{
                log.error("OptimisticLockException thrown in OjbPbContextDAO.storeCollection(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.storeCollection(Context context): " + e.toString(),e);
            }
        } catch (PersistenceBrokerSupportException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the PersistenceBrokerSupportException in OjbPbContextDAO.storeCollection(Context context): " + pbsEx.toString());
            } finally{
                log.error("PersistenceBrokerSupportException thrown in OjbPbContextDAO.storeCollection(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.storeCollection(Context context): " + e.toString(),e);
            }
        } catch (OjbPbCoreException e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the OjbPbCoreException in OjbPbContextDAO.storeCollection(Context context): " + pbsEx.toString());
            } finally{
                log.error("OjbPbCoreException thrown in OjbPbContextDAO.storeCollection(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.storeCollection(Context context): " + e.toString(),e);
            }
        } catch (Exception e) {
            try{
                localPersistenceBrokerSupport.rollback(context,pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException thrown in the catch block of the Exception in OjbPbContextDAO.storeCollection(Context context): " + pbsEx.toString());
            } finally{
                log.error("Exception thrown in OjbPbContextDAO.storeCollection(Context context): " + e.toString());
                throw new DataOptimisticLockException("Error in OjbPbContextDAO.storeCollection(Context context): " + e.toString(),e);
            }
        } finally {
            try{
                localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);
            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.storeCollection(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.storeCollection(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.storeCollection(Context context)***************");
    }

    public Class getClassFromPath(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.getClassFromPath(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Class realClass = null;
        PersistenceBroker pb = null;
        try{
            realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbContextDAO.getClassFromPath(Context context): realClass not in context. ");

            String path =(String) context.get("path");

            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            realClass = localOjbPbCore.getClassFromPath(realClass, path,pb );



        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.getClassFromPath(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getClassFromPath(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.getClassFromPath(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getClassFromPath(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.getClassFromPath(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getClassFromPath(Context context): " + e.toString(),e);
        } finally {
                try{
                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);
            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.getClassFromPath(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.getClassFromPath(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.getClassFromPath(Context context)***************");
        return realClass;
    }

    public Class getCollectionClassFromPath(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.getCollectionClassFromPath(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Class realClass = null;
        PersistenceBroker pb = null;
        try{
            realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbContextDAO.getCollectionClassFromPath(Context context): realClass not in context. ");

            String path =(String) context.get("path");

            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            //PersistenceBroker pb = localPersistenceBrokerSupport.getPersistenceBroker(context);
            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            realClass = localOjbPbCore.getCollectionClassFromPath(realClass, path,pb );



        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.getCollectionClassFromPath(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getCollectionClassFromPath(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.getCollectionClassFromPath(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getCollectionClassFromPath(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.getCollectionClassFromPath(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getCollectionClassFromPath(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.getCollectionClassFromPath(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.getCollectionClassFromPath(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.getCollectionClassFromPath(Context context)***************");
        return realClass;
    }

    public Vector getFksToItemClassInDecomposedRelationship(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.getFksToItemClassInDecomposedRelationship(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Vector flds = null;
        PersistenceBroker pb = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbContextDAO.getFksToItemClassInDecomposedRelationship(Context context): realClass not in context. ");


            String oneToN =(String) context.get("oneToN");
            if (oneToN == null || oneToN.trim().equals("")) throw new DataAccessException("Error in  OjbPbContextDAO.getFksToItemClassInDecomposedRelationship(Context context): oneToN not in context or empty string. ");

            String mToOne =(String) context.get("mToOne");
            if (mToOne == null || mToOne.trim().equals("")) throw new DataAccessException("Error in  OjbPbContextDAO.getFksToItemClassInDecomposedRelationship(Context context): mToOne not in context or empty string. ");


            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            flds = localOjbPbCore.getFksToItemClassInDecomposedRelationship(realClass,oneToN,mToOne,pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.getFksToItemClassInDecomposedRelationship(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getFksToItemClassInDecomposedRelationship(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.getFksToItemClassInDecomposedRelationship(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getFksToItemClassInDecomposedRelationship(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.getFksToItemClassInDecomposedRelationship(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getFksToItemClassInDecomposedRelationship(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.getFksToItemClassInDecomposedRelationship(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.getFksToItemClassInDecomposedRelationship(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.getFksToItemClassInDecomposedRelationship(Context context)***************");
        return flds;
    }

    public Object[] getKeyValues(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.getKeyValues(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Object[] keyValues = null;
        PersistenceBroker pb = null;
        try{
            Object pInstance = context.get("pInstance");
            if (pInstance == null) throw new DataAccessException("Error in  OjbPbContextDAO.getKeyValues(Context context): pInstance not in context. ");


            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            keyValues = localOjbPbCore.getKeyValues(pInstance,pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.getKeyValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getKeyValues(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.getKeyValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getKeyValues(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.getKeyValues(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getKeyValues(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.getKeyValues(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.getKeyValues(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.getKeyValues(Context context)***************");
        return keyValues;
    }

    public String[] getPkNames(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.getPkNames(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        String[] pkNames = null;
        PersistenceBroker pb = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbContextDAO.getPkNames(Context context): realClass not in context. ");


            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            pkNames = localOjbPbCore.getPkNames(realClass,pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.getPkNames(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getPkNames(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.getPkNames(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getPkNames(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.getPkNames(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getPkNames(Context context): " + e.toString(),e);
        } finally {
            try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.getPkNames(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.getPkNames(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.getPkNames(Context context)***************");
        return pkNames;
    }

    public String[] getFksToThisClass(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.getFksToThisClass(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        String[] flds = null;
        PersistenceBroker pb = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbContextDAO.getFksToThisClass(Context context): realClass not in context. ");

            String oneToN =(String) context.get("oneToN");
            if (oneToN == null||oneToN.trim().equals("")) throw new DataAccessException("Error in  OjbPbContextDAO.getFksToThisClass(Context context): oneToN not in context or empty string. ");


            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            flds = localOjbPbCore.getFksToThisClass(realClass,oneToN,pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.getFksToThisClass(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getFksToThisClass(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.getFksToThisClass(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getFksToThisClass(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.getFksToThisClass(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getFksToThisClass(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.getFksToThisClass(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.getFksToThisClass(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.getFksToThisClass(Context context)***************");
        return flds;
    }

    public Vector getForeignKeyFields(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.getForeignKeyFields(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Vector flds = null;
        PersistenceBroker pb = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbContextDAO.getForeignKeyFields(Context context): realClass not in context. ");

            String pAttributeName =(String) context.get("pAttributeName");
            if (pAttributeName == null||pAttributeName.trim().equals("")) throw new DataAccessException("Error in  OjbPbContextDAO.getForeignKeyFields(Context context): pAttributeName not in context or empty string. ");


            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            flds = localOjbPbCore.getForeignKeyFields(realClass,pAttributeName,pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.getForeignKeyFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getForeignKeyFields(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.getForeignKeyFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getForeignKeyFields(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.getForeignKeyFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getForeignKeyFields(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.getForeignKeyFields(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.getForeignKeyFields(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.getForeignKeyFields(Context context)***************");
        return flds;
    }

    public Vector getInverseForeignKeyFields(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.getInverseForeignKeyFields(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        Vector flds = null;
        PersistenceBroker pb = null;
        try{
            Class realClass =(Class) context.get("realClass");
            if (realClass == null) throw new DataAccessException("Error in  OjbPbContextDAO.getInverseForeignKeyFields(Context context): realClass not in context. ");

            String pAttributeName =(String) context.get("pAttributeName");
            if (pAttributeName == null||pAttributeName.trim().equals("")) throw new DataAccessException("Error in  OjbPbContextDAO.getInverseForeignKeyFields(Context context): pAttributeName not in context or empty string. ");


            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            flds = localOjbPbCore.getInverseForeignKeyFields(realClass,pAttributeName,pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.getInverseForeignKeyFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getInverseForeignKeyFields(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.getInverseForeignKeyFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getInverseForeignKeyFields(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.getInverseForeignKeyFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.getInverseForeignKeyFields(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.getInverseForeignKeyFields(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.getInverseForeignKeyFields(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.getInverseForeignKeyFields(Context context)***************");
        return flds;
    }

    ////public void setInverseForeignKeyFields(Object pInstance, String pAttributeName) throws DataAccessException
    public void setInverseForeignKeyFields(Context context) throws DataAccessException{
        log.info("************Entering the OjbPbContextDAO.setInverseForeignKeyFields(Context context) ***************");
        PersistenceBrokerSupport localPersistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        try{
            Object pInstance =context.get("pInstance");
            if (pInstance == null) throw new DataAccessException("Error in  OjbPbContextDAO.setInverseForeignKeyFields(Context context): pInstance not in context. ");

            String pAttributeName =(String) context.get("pAttributeName");
            if (pAttributeName == null||pAttributeName.trim().equals("")) throw new DataAccessException("Error in  OjbPbContextDAO.setInverseForeignKeyFields(Context context): pAttributeName not in context or empty string. ");


            localPersistenceBrokerSupport = getPersistenceBrokerSupport(context);
            OjbPbCore localOjbPbCore = getOjbPbCore(context);

            pb = localPersistenceBrokerSupport.getPersistenceBroker(context);

            localOjbPbCore.setInverseForeignKeyFields(pInstance,pAttributeName,pb);

        }catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerException thrown in  OjbPbContextDAO.setInverseForeignKeyFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.setInverseForeignKeyFields(Context context): " + e.toString(),e);
        } catch (OjbPbCoreException e) {
            log.error("OjbPbCoreException thrown in  OjbPbContextDAO.setInverseForeignKeyFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.setInverseForeignKeyFields(Context context): " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception thrown in  OjbPbContextDAO.setInverseForeignKeyFields(Context context): " + e.toString());
            throw new DataAccessException("Error in  OjbPbContextDAO.setInverseForeignKeyFields(Context context): " + e.toString(),e);
        } finally {
                try{

                    localPersistenceBrokerSupport.releasePersistenceBroker(context,pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbContextDAO.setInverseForeignKeyFields(Context context) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbContextDAO.setInverseForeignKeyFields(Context context) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the  OjbPbContextDAO.setInverseForeignKeyFields(Context context)***************");
    }

}