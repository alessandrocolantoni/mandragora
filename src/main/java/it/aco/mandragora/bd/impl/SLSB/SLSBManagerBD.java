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

package it.aco.mandragora.bd.impl.SLSB;

import it.aco.mandragora.serviceFacade.sessionFacade.remoteFacade.SLSB.business.BusinessSLSBFacadeHome;
import it.aco.mandragora.serviceFacade.sessionFacade.remoteFacade.SLSB.business.BusinessSLSBFacade;
import it.aco.mandragora.serviceFacade.sessionFacade.remoteFacade.SLSB.crud.CrudSLSBFacadeHome;
import it.aco.mandragora.serviceFacade.sessionFacade.remoteFacade.SLSB.crud.CrudSLSBFacade;
import it.aco.mandragora.exception.ApplicationException;
import it.aco.mandragora.exception.ServiceLocatorException;
import it.aco.mandragora.common.ServiceLocator;
import it.aco.mandragora.common.Utils;
import it.aco.mandragora.query.LogicCondition;
import it.aco.mandragora.bd.BD;

import javax.ejb.CreateException;
import javax.ejb.EJBException;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;



public class SLSBManagerBD implements BD {

    static private org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(SLSBManagerBD.class.getName());

    //private BusinessSLSBFacadeHome businessSLSBFacadeHome; changed at protected on 17-04-2009
    protected BusinessSLSBFacadeHome businessSLSBFacadeHome;


    //private CrudSLSBFacadeHome crudSLSBFacadeHome; changed at protected on 17-04-2009
    protected CrudSLSBFacadeHome crudSLSBFacadeHome;




    protected static SLSBManagerBD sLSBManagerBD = null;

    static  {
        try{
            if (sLSBManagerBD!=null) throw new ApplicationException("thrown in the static block of SLSBManagerBD: static instance is already set");//added by alessandro on 24/09/2007
            sLSBManagerBD = new SLSBManagerBD();
        } catch(ApplicationException e){
            e.printStackTrace();
            log.error("ERROR in static of  SLSBManagerBD "+e);

        }

	}
    protected SLSBManagerBD() throws ApplicationException{
        try{
            ServiceLocator serviceLocator = ServiceLocator.getInstance();
            businessSLSBFacadeHome = (BusinessSLSBFacadeHome)serviceLocator.getEJBHome(Utils.getStringFromMandragoraProperties("SLSBManagerBD.businessManager"));
            //business = businessHome.create();
            crudSLSBFacadeHome = (CrudSLSBFacadeHome)serviceLocator.getEJBHome(Utils.getStringFromMandragoraProperties("SLSBManagerBD.crudManager"));
            //crud = crudHome.create();
        } catch(ServiceLocatorException e){
            throw new ApplicationException("ServiceLocator Exception en el constructor de SLSBManagerBD "+ e.toString());
        } catch(Exception e){
            e.printStackTrace();
            log.error("ERROR in Constructor SLSBManagerBD "+e);
            throw new ApplicationException("Error in SLSBManagerBD "+ e.toString());
        }
    }
    public static SLSBManagerBD getInstance() {
        return sLSBManagerBD;
    }




    /***********************R E A D start******************/

    public Object findByPrimaryKey(Class realClass,Object[] pkValues) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.findByPrimaryKey(realClass,pkValues);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.findByPrimaryKey(Class realClass,Object[] pkValues): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findByPrimaryKey(Class realClass,Object[] pkValues)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.findByPrimaryKey(Class realClass,Object[] pkValues): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findByPrimaryKey(Class realClass,Object[] pkValues)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.findByPrimaryKey(Class realClass,Object[] pkValues): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findByPrimaryKey(Class realClass,Object[] pkValues)" + e.toString(),e);
        }
    }

    public Object findByPrimaryKey(Class realClass,String[] pkFieldNames, Object[] pkValues) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.findByPrimaryKey( realClass, pkFieldNames,  pkValues);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.findByPrimaryKey(Class realClass,String[] pkFieldNames, Object[] pkValues): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findByPrimaryKey(Class realClass,String[] pkFieldNames, Object[] pkValues)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.findByPrimaryKey(Class realClass,String[] pkFieldNames, Object[] pkValues): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findByPrimaryKey(Class realClass,String[] pkFieldNames, Object[] pkValues)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.findByPrimaryKey(Class realClass,String[] pkFieldNames, Object[] pkValues): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findByPrimaryKey(Class realClass,String[] pkFieldNames, Object[] pkValues)" + e.toString(),e);
        }
    }

    public Object findByPrimaryKey(Class realClass, Object pkValue) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.findByPrimaryKey( realClass,  pkValue);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.findByPrimaryKey(Class realClass, Object pkValue): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findByPrimaryKey(Class realClass, Object pkValue)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.findByPrimaryKey(Class realClass, Object pkValue): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findByPrimaryKey(Class realClass, Object pkValue)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.findByPrimaryKey(Class realClass, Object pkValue): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findByPrimaryKey(Class realClass, Object pkValue)" + e.toString(),e);
        }
    }

    public Object findObjectByTemplate(Object templateVO) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.findObjectByTemplate( templateVO);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.findObjectByTemplate(Object templateVO): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findObjectByTemplate(Object templateVO)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.findObjectByTemplate(Object templateVO): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findObjectByTemplate(Object templateVO)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.findObjectByTemplate(Object templateVO): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findObjectByTemplate(Object templateVO)" + e.toString(),e);
        }
    }

    public Collection findCollectionByTemplate(Object templateVO) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.findCollectionByTemplate( templateVO);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.findCollectionByTemplate(Object templateVO): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByTemplate(Object templateVO)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.findCollectionByTemplate(Object templateVO): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByTemplate(Object templateVO)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.findCollectionByTemplate(Object templateVO): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByTemplate(Object templateVO)" + e.toString(),e);
        }
    }

    public Collection findCollectionByTemplate(Object templateVO, String orderingField, Boolean asc) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.findCollectionByTemplate( templateVO,  orderingField,  asc);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.findCollectionByTemplate(Object templateVO, String orderingField, Boolean asc): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByTemplate(Object templateVO, String orderingField, Boolean asc)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.findCollectionByTemplate(Object templateVO, String orderingField, Boolean asc): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByTemplate(Object templateVO, String orderingField, Boolean asc)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.findCollectionByTemplate(Object templateVO, String orderingField, Boolean asc): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByTemplate(Object templateVO, String orderingField, Boolean asc)" + e.toString(),e);
        }
    }

    

    /**
     * @deprecated use {@link #findCollectionByTemplate(Object templateVO, String orderingField, Boolean asc)}
     */
    public Collection findOrderedCollectionByTemplate(Object templateVO, String orderingField, boolean asc) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.findCollectionByTemplate(templateVO,orderingField,new Boolean(asc));
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.findOrderedCollectionByTemplate(Object templateVO, String orderingField, boolean asc): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findOrderedCollectionByTemplate(Object templateVO, String orderingField, boolean asc)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.findOrderedCollectionByTemplate(Object templateVO, String orderingField, boolean asc): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findOrderedCollectionByTemplate(Object templateVO, String orderingField, boolean asc)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.findOrderedCollectionByTemplate(Object templateVO, String orderingField, boolean asc): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findOrderedCollectionByTemplate(Object templateVO, String orderingField, boolean asc)" + e.toString(),e);
        }
    }

    public Collection findCollectionByNullFields(Class realClass, String[] nullFields) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.findCollectionByNullFields(realClass,  nullFields);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.findCollectionByNullFields(Class realClass, String[] nullFields): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByNullFields(Class realClass, String[] nullFields) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("RemoteException caught in SLSBManagerBD.findCollectionByNullFields(Class realClass, String[] nullFields): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByNullFields(Class realClass, String[] nullFields) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("RemoteException caught in SLSBManagerBD.findCollectionByNullFields(Class realClass, String[] nullFields): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByNullFields(Class realClass, String[] nullFields) " + e.toString(),e);
        }
    }



    public Collection findCollectionByLogicCondition(Class realClass, LogicCondition logicCondition) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.findCollectionByLogicCondition(realClass, logicCondition);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.findCollectionByLogicCondition(Class realClass,LogicCondition logicCondition): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByLogicCondition(Class realClass,LogicCondition logicCondition) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.findCollectionByLogicCondition(Class realClass,LogicCondition logicCondition): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByLogicCondition(Class realClass,LogicCondition logicCondition) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.findCollectionByLogicCondition(Class realClass,LogicCondition logicCondition): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByLogicCondition(Class realClass,LogicCondition logicCondition) " + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #findCollectionByLogicCondition(Class realClass,LogicCondition logicCondition,String orderingField, Boolean asc,Integer startAtIndex, Integer endAtIndex)}
     */
    public Collection findLimitedOrderedCollectionByLogicCondition(Class realClass,LogicCondition logicCondition,String orderingField, boolean asc,int startAtIndex, int endAtIndex) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.findCollectionByLogicCondition(realClass,logicCondition,orderingField,  new Boolean(asc), new Integer(startAtIndex), new Integer(endAtIndex));
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.findLimitedOrderedCollectionByLogicCondition(Class realClass,LogicCondition logicCondition,String orderingField, boolean asc,int startAtIndex, int endAtIndex): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findLimitedOrderedCollectionByLogicCondition(Class realClass,LogicCondition logicCondition,String orderingField, boolean asc,int startAtIndex, int endAtIndex)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.findLimitedOrderedCollectionByLogicCondition(Class realClass,LogicCondition logicCondition,String orderingField, boolean asc,int startAtIndex, int endAtIndex): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findLimitedOrderedCollectionByLogicCondition(Class realClass,LogicCondition logicCondition,String orderingField, boolean asc,int startAtIndex, int endAtIndex)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.findLimitedOrderedCollectionByLogicCondition(Class realClass,LogicCondition logicCondition,String orderingField, boolean asc,int startAtIndex, int endAtIndex): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findLimitedOrderedCollectionByLogicCondition(Class realClass,LogicCondition logicCondition,String orderingField, boolean asc,int startAtIndex, int endAtIndex)" + e.toString(),e);
        }
    }


    public Collection findCollectionByLogicCondition(Class realClass,LogicCondition logicCondition,String orderingField, Boolean asc,Integer startAtIndex, Integer endAtIndex) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.findCollectionByLogicCondition( realClass, logicCondition, orderingField,  asc, startAtIndex,  endAtIndex);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.findCollectionByLogicCondition(Class realClass,LogicCondition logicCondition,String orderingField, Boolean asc,Integer startAtIndex, Integer endAtIndex): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByLogicCondition(Class realClass,LogicCondition logicCondition,String orderingField, Boolean asc,Integer startAtIndex, Integer endAtIndex)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.findCollectionByLogicCondition(Class realClass,LogicCondition logicCondition,String orderingField, Boolean asc,Integer startAtIndex, Integer endAtIndex): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByLogicCondition(Class realClass,LogicCondition logicCondition,String orderingField, Boolean asc,Integer startAtIndex, Integer endAtIndex)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.findCollectionByLogicCondition(Class realClass,LogicCondition logicCondition,String orderingField, Boolean asc,Integer startAtIndex, Integer endAtIndex): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByLogicCondition(Class realClass,LogicCondition logicCondition,String orderingField, Boolean asc,Integer startAtIndex, Integer endAtIndex)" + e.toString(),e);
        }
    }



    public Collection findCollectionByOrValues(Class realClass,String pAttributeName,Collection valuesCollection) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.findCollectionByOrValues( realClass, pAttributeName, valuesCollection);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.findCollectionByOrValues(Class realClass,String pAttributeName,Collection valuesCollection): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByOrValues(Class realClass,String pAttributeName,Collection valuesCollection)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.findCollectionByOrValues(Class realClass,String pAttributeName,Collection valuesCollection): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByOrValues(Class realClass,String pAttributeName,Collection valuesCollection)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.findCollectionByOrValues(Class realClass,String pAttributeName,Collection valuesCollection): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByOrValues(Class realClass,String pAttributeName,Collection valuesCollection)" + e.toString(),e);
        }
    }




    public Collection findCollectionByAndFieldsOperatorValues(Class realClass,String[] pAttributeNames, String[] operators,Object[] valuesArray) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.findCollectionByAndFieldsOperatorValues(realClass, pAttributeNames, operators, valuesArray);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.findCollectionByAndFieldsOperatorValues(Class realClass,String[] pAttributeNames, String[] operators,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByAndFieldsOperatorValues(Class realClass,String[] pAttributeNames, String[] operators,Object[] valuesArray)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.findCollectionByAndFieldsOperatorValues(Class realClass,String[] pAttributeNames, String[] operators,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByAndFieldsOperatorValues(Class realClass,String[] pAttributeNames, String[] operators,Object[] valuesArray)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.findCollectionByAndFieldsOperatorValues(Class realClass,String[] pAttributeNames, String[] operators,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByAndFieldsOperatorValues(Class realClass,String[] pAttributeNames, String[] operators,Object[] valuesArray)" + e.toString(),e);
        }
    }


    public Collection findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Class realClass,String[] pAttributeNames, String[] operators,Object[][] valuesMatrix)  throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(realClass, pAttributeNames, operators, valuesMatrix);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Class realClass,String[] pAttributeNames, String[] operators,Object[][] valuesMatrix): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Class realClass,String[] pAttributeNames, String[] operators,Object[][] valuesMatrix)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Class realClass,String[] pAttributeNames, String[] operators,Object[][] valuesMatrix): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Class realClass,String[] pAttributeNames, String[] operators,Object[][] valuesMatrix)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Class realClass,String[] pAttributeNames, String[] operators,Object[][] valuesMatrix): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByArrayOfFieldsOperatorsMatrixAndOrValues(Class realClass,String[] pAttributeNames, String[] operators,Object[][] valuesMatrix)" + e.toString(),e);
        }
    }


    public Collection findCollectionByFieldsNotEqualsToValues(Class realClass,String[] pAttributeNames,Object[] valuesArray) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.findCollectionByFieldsNotEqualsToValues(realClass, pAttributeNames, valuesArray) ;
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.findCollectionByFieldsNotEqualsToValues(Class realClass,String[] pAttributeNames,Object[] valuesArray) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByFieldsNotEqualsToValues(Class realClass,String[] pAttributeNames,Object[] valuesArray) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.findCollectionByFieldsNotEqualsToValues(Class realClass,String[] pAttributeNames,Object[] valuesArray) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByFieldsNotEqualsToValues(Class realClass,String[] pAttributeNames,Object[] valuesArray) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.findCollectionByFieldsNotEqualsToValues(Class realClass,String[] pAttributeNames,Object[] valuesArray) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByFieldsNotEqualsToValues(Class realClass,String[] pAttributeNames,Object[] valuesArray) " + e.toString(),e);
        }
    }



    public Collection findCollectionByFieldInCollection(Class realClass,String pAttributeName, Collection valuesCollection) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.findCollectionByFieldInCollection(realClass, pAttributeName,  valuesCollection);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.findCollectionByFieldInCollection(Class realClass,String pAttributeName, Collection valuesCollection) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByFieldInCollection(Class realClass,String pAttributeName, Collection valuesCollection) " + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.findCollectionByFieldInCollection(Class realClass,String pAttributeName, Collection valuesCollection) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByFieldInCollection(Class realClass,String pAttributeName, Collection valuesCollection) " + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.findCollectionByFieldInCollection(Class realClass,String pAttributeName, Collection valuesCollection) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.findCollectionByFieldInCollection(Class realClass,String pAttributeName, Collection valuesCollection) " + e.toString(),e);
        }
    }

    public Collection searchValueInFields(Class realClass,String[] pAttributeNames,Object value)  throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.searchValueInFields(realClass, pAttributeNames, value)  ;
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.searchValueInFields(Class realClass,String[] pAttributeNames,Object value)  : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.searchValueInFields(Class realClass,String[] pAttributeNames,Object value)  " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.searchValueInFields(Class realClass,String[] pAttributeNames,Object value)  : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.searchValueInFields(Class realClass,String[] pAttributeNames,Object value)  " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.searchValueInFields(Class realClass,String[] pAttributeNames,Object value)  : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.searchValueInFields(Class realClass,String[] pAttributeNames,Object value)  " + e.toString(),e);
        }
    }

    public Collection getCollectionOfStoredItemsNotInBean(Object pInstance, String pAttributeName) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.getCollectionOfStoredItemsNotInBean( pInstance,  pAttributeName);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.getCollectionOfStoredItemsNotInBean(Object pInstance, String pAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.getCollectionOfStoredItemsNotInBean(Object pInstance, String pAttributeName) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.getCollectionOfStoredItemsNotInBean(Object pInstance, String pAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.getCollectionOfStoredItemsNotInBean(Object pInstance, String pAttributeName) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.getCollectionOfStoredItemsNotInBean(Object pInstance, String pAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.getCollectionOfStoredItemsNotInBean(Object pInstance, String pAttributeName) " + e.toString(),e);
        }
    }




    public Collection getStoredCollection(Object pInstance, String pAttributeName) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.getStoredCollection(pInstance, pAttributeName);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.getStoredCollection(Object pInstance, String pAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.getStoredCollection(Object pInstance, String pAttributeName) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.getStoredCollection(Object pInstance, String pAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.getStoredCollection(Object pInstance, String pAttributeName) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.getStoredCollection(Object pInstance, String pAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.getStoredCollection(Object pInstance, String pAttributeName) " + e.toString(),e);
        }
    }



    public Iterator getReportQueryIterator(Class realClass,LogicCondition logicCondition, String[] pAttributeNames, String[] groupBy) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.getReportQueryIterator(realClass, logicCondition, pAttributeNames, groupBy);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.getReportQueryIterator(Class realClass,LogicCondition logicCondition, String[] pAttributeNames, String[] groupBy): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.getReportQueryIterator(Class realClass,LogicCondition logicCondition, String[] pAttributeNames, String[] groupBy) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.getReportQueryIterator(Class realClass,LogicCondition logicCondition, String[] pAttributeNames, String[] groupBy): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.getReportQueryIterator(Class realClass,LogicCondition logicCondition, String[] pAttributeNames, String[] groupBy) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.getReportQueryIterator(Class realClass,LogicCondition logicCondition, String[] pAttributeNames, String[] groupBy): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.getReportQueryIterator(Class realClass,LogicCondition logicCondition, String[] pAttributeNames, String[] groupBy) " + e.toString(),e);
        }
    }







    public void retrieveReference(Object pInstance, String pAttributeName) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            crudSLSBFacade.retrieveReference( pInstance,  pAttributeName) ;
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.retrieveReference(Object pInstance, String pAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveReference(Object pInstance, String pAttributeName) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.retrieveReference(Object pInstance, String pAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveReference(Object pInstance, String pAttributeName) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.retrieveReference(Object pInstance, String pAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveReference(Object pInstance, String pAttributeName) " + e.toString(),e);
        }
    }


    public void retrieveAllReferences(Object pInstance) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            crudSLSBFacade.retrieveAllReferences( pInstance) ;
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.retrieveAllReferences(Object pInstance) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveAllReferences(Object pInstance) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.retrieveAllReferences(Object pInstance) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveAllReferences(Object pInstance) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.retrieveAllReferences(Object pInstance) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveAllReferences(Object pInstance) " + e.toString(),e);
        }
    }


    public void retrieveAllReferencesInCollection(Collection valueObjectsCollection)  throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            crudSLSBFacade.retrieveAllReferencesInCollection(valueObjectsCollection) ;
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.retrieveAllReferencesInCollection(Collection valueObjectsCollection) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveAllReferencesInCollection(Collection valueObjectsCollection) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.retrieveAllReferencesInCollection(Collection valueObjectsCollection) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveAllReferencesInCollection(Collection valueObjectsCollection) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.retrieveAllReferencesInCollection(Collection valueObjectsCollection) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveAllReferencesInCollection(Collection valueObjectsCollection) " + e.toString(),e);
        }
    }


    public void retrieveReferenceInCollection(Collection valueObjectsCollection, String pAttributeName)  throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            crudSLSBFacade.retrieveReferenceInCollection(valueObjectsCollection, pAttributeName);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.retrieveReferenceInCollection(Collection valueObjectsCollection, String pAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveReferenceInCollection(Collection valueObjectsCollection, String pAttributeName) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.retrieveReferenceInCollection(Collection valueObjectsCollection, String pAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveReferenceInCollection(Collection valueObjectsCollection, String pAttributeName) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.retrieveReferenceInCollection(Collection valueObjectsCollection, String pAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveReferenceInCollection(Collection valueObjectsCollection, String pAttributeName) " + e.toString(),e);
        }
    }



    public void retrievePathReference(Object valueobjectOrCollection, String path)  throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            crudSLSBFacade.retrievePathReference( valueobjectOrCollection,  path);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.retrievePathReference(Object valueobjectOrCollection, String path) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrievePathReference(Object valueobjectOrCollection, String path) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.retrievePathReference(Object valueobjectOrCollection, String path) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrievePathReference(Object valueobjectOrCollection, String path) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.retrievePathReference(Object valueobjectOrCollection, String path) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrievePathReference(Object valueobjectOrCollection, String path) " + e.toString(),e);
        }
    }



    public void retrieveNullPathReference(Object valueobjectOrCollection, String path)  throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            crudSLSBFacade.retrieveNullPathReference(valueobjectOrCollection, path);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.retrieveNullPathReference(Object valueobjectOrCollection, String path) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveNullPathReference(Object valueobjectOrCollection, String path) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.retrieveNullPathReference(Object valueobjectOrCollection, String path) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveNullPathReference(Object valueobjectOrCollection, String path) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.retrieveNullPathReference(Object valueobjectOrCollection, String path) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveNullPathReference(Object valueobjectOrCollection, String path) " + e.toString(),e);
        }
    }



    public void retrieveNullReference(Object pInstance, String pAttributeName) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            crudSLSBFacade.retrieveNullReference( pInstance,  pAttributeName);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.retrieveNullReference(Object pInstance, String pAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveNullReference(Object pInstance, String pAttributeName) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.retrieveNullReference(Object pInstance, String pAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveNullReference(Object pInstance, String pAttributeName) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.retrieveNullReference(Object pInstance, String pAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveNullReference(Object pInstance, String pAttributeName) " + e.toString(),e);
        }
    }





    public void retrieveAllNullReferences(Object pInstance) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            crudSLSBFacade.retrieveAllNullReferences( pInstance);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.retrieveAllNullReferences(Object pInstance) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveAllNullReferences(Object pInstance) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.retrieveAllNullReferences(Object pInstance) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveAllNullReferences(Object pInstance) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.retrieveAllNullReferences(Object pInstance) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveAllNullReferences(Object pInstance) " + e.toString(),e);
        }
    }

    /***********************R E A D end ******************/




    /*********************** D E L E T E start******************/
    public void delete(Object deleteVO) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            crudSLSBFacade.delete( deleteVO);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.delete(Object deleteVO): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.delete(Object deleteVO) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.delete(Object deleteVO): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.delete(Object deleteVO) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.delete(Object deleteVO): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.delete(Object deleteVO) " + e.toString(),e);
        }
    }

    public void deleteCollection(Collection deleteVOs) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            crudSLSBFacade.deleteCollection(deleteVOs);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.deleteCollection(Collection deleteVOs): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deleteCollection(Collection deleteVOs) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.deleteCollection(Collection deleteVOs): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deleteCollection(Collection deleteVOs) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.deleteCollection(Collection deleteVOs): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deleteCollection(Collection deleteVOs) " + e.toString(),e);
        }
    }

    public void deleteMToNRelationshipCollection(Object left, String leftFieldName, Collection rightCollection) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            crudSLSBFacade.deleteMToNRelationshipCollection(left, leftFieldName, rightCollection) ;
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.deleteMToNRelationshipCollection(Object left, String leftFieldName, Collection rightCollection) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deleteMToNRelationshipCollection(Object left, String leftFieldName, Collection rightCollection)  " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.deleteMToNRelationshipCollection(Object left, String leftFieldName, Collection rightCollection) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deleteMToNRelationshipCollection(Object left, String leftFieldName, Collection rightCollection)  " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.deleteMToNRelationshipCollection(Object left, String leftFieldName, Collection rightCollection) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deleteMToNRelationshipCollection(Object left, String leftFieldName, Collection rightCollection)  " + e.toString(),e);
        }
    }


    public void deleteItemsNotInCollectionsInPath(Object rootVO, String path, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            crudSLSBFacade.deleteItemsNotInCollectionsInPath(rootVO, path, applyDeletePathCascade, ifM2NDeleteOnlyRelationship, deleteOneToOne) ;
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.deleteItemsNotInCollectionsInPath(Object rootVO, String path, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deleteItemsNotInCollectionsInPath(Object rootVO, String path, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.deleteItemsNotInCollectionsInPath(Object rootVO, String path, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deleteItemsNotInCollectionsInPath(Object rootVO, String path, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)  " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.deleteItemsNotInCollectionsInPath(Object rootVO, String path, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deleteItemsNotInCollectionsInPath(Object rootVO, String path, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)  " + e.toString(),e);
        }
    }

    public void deleteItemsNotInCollectionsInPath(Object rootVO, String path) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            crudSLSBFacade.deleteItemsNotInCollectionsInPath(rootVO, path);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.deleteItemsNotInCollectionsInPath(Object rootVO, String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deleteItemsNotInCollectionsInPath(Object rootVO, String path)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.deleteItemsNotInCollectionsInPath(Object rootVO, String path) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deleteItemsNotInCollectionsInPath(Object rootVO, String path)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.deleteItemsNotInCollectionsInPath(Object rootVO, String path) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deleteItemsNotInCollectionsInPath(Object rootVO, String path) " + e.toString(),e);
        }
    }


    public void deleteItemsNotInCollectionsInPath(Object rootVO, String path,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            crudSLSBFacade.deleteItemsNotInCollectionsInPath(rootVO, path, ifM2NDeleteOnlyRelationship, deleteOneToOne);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.deleteItemsNotInCollectionsInPath(Object rootVO, String path,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deleteItemsNotInCollectionsInPath(Object rootVO, String path,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.deleteItemsNotInCollectionsInPath(Object rootVO, String path,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deleteItemsNotInCollectionsInPath(Object rootVO, String path,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.deleteItemsNotInCollectionsInPath(Object rootVO, String path,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deleteItemsNotInCollectionsInPath(Object rootVO, String path,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) " + e.toString(),e);
        }
    }

    public void deleteItemsNotInCollectionsInPaths(Object rootVO, Collection paths,  Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            crudSLSBFacade.deleteItemsNotInCollectionsInPaths(rootVO, paths,  applyDeletePathCascade, ifM2NDeleteOnlyRelationship,  deleteOneToOne);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.deleteItemsNotInCollectionsInPaths(Object rootVO, Collection paths,  Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deleteItemsNotInCollectionsInPaths(Object rootVO, Collection paths,  Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.deleteItemsNotInCollectionsInPaths(Object rootVO, Collection paths,  Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deleteItemsNotInCollectionsInPaths(Object rootVO, Collection paths,  Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.deleteItemsNotInCollectionsInPaths(Object rootVO, Collection paths,  Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deleteItemsNotInCollectionsInPaths(Object rootVO, Collection paths,  Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)" + e.toString(),e);
        }
    }

    public void deletePathCascade(Object parentVO,String path,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            crudSLSBFacade.deletePathCascade(parentVO, path, ifM2NDeleteOnlyRelationship,  deleteOneToOne);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.deletePathCascade(Object parentVO,String path,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deletePathCascade(Object parentVO,String path,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.deletePathCascade(Object parentVO,String path,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deletePathCascade(Object parentVO,String path,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.deletePathCascade(Object parentVO,String path,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deletePathCascade(Object parentVO,String path,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)" + e.toString(),e);
        }
    }


    public void deletePathsCascade(Object parentVO,Collection paths,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            crudSLSBFacade.deletePathsCascade(parentVO, paths, ifM2NDeleteOnlyRelationship,  deleteOneToOne);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.deletePathsCascade(Object parentVO,Collection paths,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deletePathsCascade(Object parentVO,Collection paths,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.deletePathsCascade(Object parentVO,Collection paths,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deletePathsCascade(Object parentVO,Collection paths,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.deletePathsCascade(Object parentVO,Collection paths,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.deletePathsCascade(Object parentVO,Collection paths,Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne)" + e.toString(),e);
        }
    }


    /*********************** D E L E T E end******************/



    /*********************** C R E A T E  start******************/

    public Object insert(Object storeVO) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.insert(storeVO);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.insert(Object storeVO) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.insert(Object storeVO) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.insert(Object storeVO) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.insert(Object storeVO) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.insert(Object storeVO) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.insert(Object storeVO) " + e.toString(),e);
        }
    }



    /*********************** C R E A T E  end******************/




    /*********************** U P D A T E  start******************/

    public Object update(Object storeVO) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.update(storeVO);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.update(Object storeVO) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.update(Object storeVO) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.update(Object storeVO) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.update(Object storeVO) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.update(Object storeVO) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.update(Object storeVO) " + e.toString(),e);
        }
    }




    public void updateCollection(Collection storeVOs) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            crudSLSBFacade.updateCollection(storeVOs);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.updateCollection(Collection storeVOs) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollection(Collection storeVOs) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.updateCollection(Collection storeVOs) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollection(Collection storeVOs) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.updateCollection(Collection storeVOs) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollection(Collection storeVOs) " + e.toString(),e);
        }
    }



    public Object updateCollectionReference(Object storeVO, String pAttributeName)throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.updateCollectionReference(storeVO, pAttributeName);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.updateCollectionReference(Object storeVO, String pAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollectionReference(Object storeVO, String pAttributeName) " + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.updateCollectionReference(Object storeVO, String pAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollectionReference(Object storeVO, String pAttributeName) " + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.updateCollectionReference(Object storeVO, String pAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollectionReference(Object storeVO, String pAttributeName) " + e.toString(),e);
        }
    }

    public Object updateCollectionReferences(Object storeVO) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.updateCollectionReferences(storeVO);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.updateCollectionReferences(Object storeVO): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollectionReferences(Object storeVO) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.updateCollectionReferences(Object storeVO): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollectionReferences(Object storeVO) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.updateCollectionReferences(Object storeVO): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollectionReferences(Object storeVO) " + e.toString(),e);
        }
    }

    public void storePathCascade(Object storeVO,String path) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
             crudSLSBFacade.storePathCascade(storeVO, path);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.storePathCascade(Object storeVO,String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.storePathCascade(Object storeVO,String path) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.sstorePathCascade(Object storeVO,String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.storePathCascade(Object storeVO,String path) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.storePathCascade(Object storeVO,String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.storePathCascade(Object storeVO,String path) " + e.toString(),e);
        }
    }


    public void storePathsCascade(Object storeVO,Collection paths, Boolean pathsHasToBeSorted, Boolean  storeVOHasToBeStored) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
             crudSLSBFacade.storePathsCascade(storeVO, paths,  pathsHasToBeSorted,   storeVOHasToBeStored);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.storePathsCascade(Object storeVO,Collection paths, Boolean pathsHasToBeSorted, Boolean  storeVOHasToBeStored): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.storePathsCascade(Object storeVO,Collection paths, Boolean pathsHasToBeSorted, Boolean  storeVOHasToBeStored) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.storePathsCascade(storeVO, paths,  pathsHasToBeSorted,   storeVOHasToBeStored): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.storePathsCascade(storeVO, paths,  pathsHasToBeSorted,   storeVOHasToBeStored) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.storePathsCascade(storeVO, paths,  pathsHasToBeSorted,   storeVOHasToBeStored): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.storePathsCascade(storeVO, paths,  pathsHasToBeSorted,   storeVOHasToBeStored) " + e.toString(),e);
        }
    }

    /**
     *
     * @deprecated use {@link #updateCreateTrees(Object storeVO, Collection trees, Boolean storeVOHasToBeUpdated)}
     */
    public Object updateCreateTrees(Object storeVO, Collection trees, boolean storeVOHasToBeUpdated) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.updateCreateTrees( storeVO, trees,  new Boolean(storeVOHasToBeUpdated));
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.updateCreateTrees(Object storeVO, Collection trees, boolean storeVOHasToBeUpdated) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCreateTrees(Object storeVO, Collection trees, boolean storeVOHasToBeUpdated) " + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.updateCreateTrees(Object storeVO, Collection trees, boolean storeVOHasToBeUpdated) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCreateTrees(Object storeVO, Collection trees, boolean storeVOHasToBeUpdated) " + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.updateCreateTrees(Object storeVO, Collection trees, boolean storeVOHasToBeUpdated) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCreateTrees(Object storeVO, Collection trees, boolean storeVOHasToBeUpdated) " + e.toString(),e);
        }
    }

    public Object updateCreateTrees(Object storeVO,Collection trees, Boolean storeVOHasToBeUpdated, Boolean deleteChangedOneToOne, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.updateCreateTrees( storeVO, trees,  storeVOHasToBeUpdated , deleteChangedOneToOne,  applyDeletePathCascade,  ifM2NDeleteOnlyRelationship,  deleteOneToOne);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.updateCreateTrees(Object storeVO,Collection trees, Boolean storeVOHasToBeUpdated, Boolean deleteChangedOneToOne, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCreateTrees(Object storeVO,Collection trees, Boolean storeVOHasToBeUpdated, Boolean deleteChangedOneToOne, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) " + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.updateCreateTrees(Object storeVO,Collection trees, Boolean storeVOHasToBeUpdated, Boolean deleteChangedOneToOne, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCreateTrees(Object storeVO,Collection trees, Boolean storeVOHasToBeUpdated, Boolean deleteChangedOneToOne, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) " + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.updateCreateTrees(Object storeVO,Collection trees, Boolean storeVOHasToBeUpdated, Boolean deleteChangedOneToOne, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCreateTrees(Object storeVO,Collection trees, Boolean storeVOHasToBeUpdated, Boolean deleteChangedOneToOne, Boolean applyDeletePathCascade, Boolean ifM2NDeleteOnlyRelationship, Boolean deleteOneToOne) " + e.toString(),e);
        }
    }

    public Object updateCreateTrees(Object storeVO, Collection trees, Boolean storeVOHasToBeUpdated) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.updateCreateTrees( storeVO,  trees,  storeVOHasToBeUpdated);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.updateCreateTrees(Object storeVO, Collection trees, Boolean storeVOHasToBeUpdated): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCreateTrees(Object storeVO, Collection trees, Boolean storeVOHasToBeUpdated) " + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.updateCreateTrees(Object storeVO, Collection trees, Boolean storeVOHasToBeUpdated): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCreateTrees(Object storeVO, Collection trees, Boolean storeVOHasToBeUpdated) " + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.updateCreateTrees(Object storeVO, Collection trees, Boolean storeVOHasToBeUpdated): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCreateTrees(Object storeVO, Collection trees, Boolean storeVOHasToBeUpdated) " + e.toString(),e);
        }
    }

    public Object updateCreateTrees(Object storeVO,Collection trees) throws ApplicationException{
        try {
            CrudSLSBFacade crudSLSBFacade= crudSLSBFacadeHome.create();
            return crudSLSBFacade.updateCreateTrees( storeVO, trees) ;
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.updateCreateTrees(Object storeVO,Collection trees) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCreateTrees(Object storeVO,Collection trees) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.updateCreateTrees(Object storeVO,Collection trees) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCreateTrees(Object storeVO,Collection trees) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.updateCreateTrees(Object storeVO,Collection trees) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCreateTrees(Object storeVO,Collection trees) " + e.toString(),e);
        }
    }




    /*********************** U P D A T E  end******************/









    /*********************** B U S I N E S S   start******************/

    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass) throws ApplicationException{
        try {
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, valueObjectValueAttributeName, mapValueClassAttributeToSetName, mapValueClass);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)" + e.toString(),e);
        }
    }


    /**
     * @deprecated use {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)}
     */
    public HashMap buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass) throws ApplicationException{
        try {
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return (HashMap) businessSLSBFacade.buildMap( pInstance,  pAttributeName,  valueObjectKeyAttributeName,new  Boolean(isValueObjectKeyAttributeNameToSet),  valueObjectValueAttributeName, mapValueClass);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass) throws ApplicationException{
        try {
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, valueObjectValueAttributeName,mapValueClass);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass) throws ApplicationException{
        try {
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, mapValueClass);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass)" + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)}
     */
    public HashMap buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName) throws ApplicationException{
        try {
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return (HashMap) businessSLSBFacade.buildMap(pInstance,pAttributeName,valueObjectKeyAttributeName, new Boolean(isValueObjectKeyAttributeNameToSet),valueObjectValueAttributeName);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }


    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName) throws ApplicationException{
        try {
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.buildMap(pInstance,pAttributeName,valueObjectKeyAttributeName,isValueObjectKeyAttributeNameToSet,valueObjectValueAttributeName);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }

    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet) throws ApplicationException{
        try {
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.buildMap(pInstance,pAttributeName,valueObjectKeyAttributeName,isValueObjectKeyAttributeNameToSet);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet)" + e.toString(),e);
        }
    }

    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass) throws ApplicationException{
        try {
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName, mapValueClassAttributeToSetName,mapValueClass);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass) throws ApplicationException{
        try {
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName, mapValueClass);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Class mapValueClass) throws ApplicationException{
        try {
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, mapValueClass);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Class mapValueClass)" + e.toString(),e);
        }
    }


    /**
     * @deprecated use {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)}
     */
    public HashMap buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,String valueObjectValueAttributeName) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return (HashMap) businessSLSBFacade.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildHashMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildHashMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildHashMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildHashMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildHashMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildHashMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName)" + e.toString(),e);
        }
    }



    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName)" + e.toString(),e);
        }
    }

    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName)" + e.toString(),e);
        }
    }

    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.buildMap(valueObjectsCollection, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, valueObjectValueAttributeName, mapValueClassAttributeToSetName, mapValueClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)" + e.toString(),e);
        }
    }

    /**
     * @deprecated see{@link #buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass)}
     */
    public HashMap buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return (HashMap) businessSLSBFacade.buildMap(valueObjectsCollection, valueObjectKeyAttributeName, new Boolean(isValueObjectKeyAttributeNameToSet), valueObjectValueAttributeName, mapValueClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.buildMap(valueObjectsCollection, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, valueObjectValueAttributeName, mapValueClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.buildMap(valueObjectsCollection, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet,  mapValueClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.buildMap(valueObjectsCollection, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet,  valueObjectValueAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }

    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.buildMap(valueObjectsCollection, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet)" + e.toString(),e);
        }
    }

    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.buildMap(valueObjectsCollection, valueObjectKeyAttributeName,  valueObjectValueAttributeName, mapValueClassAttributeToSetName, mapValueClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.buildMap(valueObjectsCollection, valueObjectKeyAttributeName,  valueObjectValueAttributeName,  mapValueClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Class mapValueClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.buildMap(valueObjectsCollection, valueObjectKeyAttributeName,  mapValueClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Class mapValueClass)" + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)}
     */
    public HashMap buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return (HashMap) businessSLSBFacade.buildMap(valueObjectsCollection, valueObjectKeyAttributeName, valueObjectValueAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }

    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.buildMap(valueObjectsCollection, valueObjectKeyAttributeName, valueObjectValueAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }


    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.buildMap(valueObjectsCollection, valueObjectKeyAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName)" + e.toString(),e);
        }
    }




    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, valueObjectValueAttributeName, mapValueClassAttributeToSetName, mapValueClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)" + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass) }
     */
    public HashMap addToHashMap(Object pInstance, HashMap map, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return (HashMap) businessSLSBFacade.addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName, new Boolean(isValueObjectKeyAttributeNameToSet), valueObjectValueAttributeName, mapValueClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToHashMap(Object pInstance, HashMap map, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToHashMap(Object pInstance, HashMap map, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToHashMap(Object pInstance, HashMap map, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToHashMap(Object pInstance, HashMap map, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToHashMap(Object pInstance, HashMap map, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToHashMap(Object pInstance, HashMap map, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, valueObjectValueAttributeName, mapValueClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, mapValueClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass)" + e.toString(),e);
        }
    }

   /**
     * @deprecated use  {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)}
     */
    public HashMap addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return (HashMap) businessSLSBFacade.addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName, new Boolean(isValueObjectKeyAttributeNameToSet), valueObjectValueAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName) " + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName) " + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName) " + e.toString(),e);
        }
    }

    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, valueObjectValueAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }

    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName,isValueObjectKeyAttributeNameToSet) ;
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet) : " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet) " + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet) : " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet) " + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet) : " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet) " + e.toString(),e);
        }
    }

    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName, valueObjectValueAttributeName, mapValueClassAttributeToSetName, mapValueClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName, valueObjectValueAttributeName, mapValueClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Class mapValueClass)  throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName, mapValueClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Class mapValueClass)" + e.toString(),e);
        }
    }


    /**
     * @deprecated use {@link #addToMap(Object pInstance,String pAttributeName, Map map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)}
     */
    public HashMap addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,String valueObjectValueAttributeName) throws ApplicationException{
        try {
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return (HashMap) businessSLSBFacade.addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName,  valueObjectValueAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }

    public Map addToMap(Object pInstance,String pAttributeName, Map map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToMap(pInstance, pAttributeName,  map,  valueObjectKeyAttributeName, valueObjectValueAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Object pInstance,String pAttributeName, Map map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance,String pAttributeName, Map map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Object pInstance,String pAttributeName, Map map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance,String pAttributeName, Map map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Object pInstance,String pAttributeName, Map map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance,String pAttributeName, Map map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }

    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName)" + e.toString(),e);
        }
    }

    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToMap(valueObjectsCollection, map, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, valueObjectValueAttributeName, mapValueClassAttributeToSetName, mapValueClass) ;
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass) : " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass) " + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass) : " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass) " + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass) : " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass) " + e.toString(),e);
        }
    }

    /**
     * @deprecated use  {@link #addToMap(Collection valueObjectsCollection, Map map,  String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)}
     */
    public HashMap addToHashMap(Collection valueObjectsCollection, HashMap map,  String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return (HashMap) businessSLSBFacade.addToMap(valueObjectsCollection, map,  valueObjectKeyAttributeName, new Boolean(isValueObjectKeyAttributeNameToSet), valueObjectValueAttributeName, mapValueClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToHashMap(Collection valueObjectsCollection, HashMap map,  String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToHashMap(Collection valueObjectsCollection, HashMap map,  String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToHashMap(Collection valueObjectsCollection, HashMap map,  String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToHashMap(Collection valueObjectsCollection, HashMap map,  String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToHashMap(Collection valueObjectsCollection, HashMap map,  String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToHashMap(Collection valueObjectsCollection, HashMap map,  String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map addToMap(Collection valueObjectsCollection, Map map,  String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToMap(valueObjectsCollection, map,  valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, valueObjectValueAttributeName, mapValueClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map,  String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map,  String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map,  String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map,  String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map,  String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map,  String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToMap(valueObjectsCollection, map,  valueObjectKeyAttributeName,  isValueObjectKeyAttributeNameToSet,  mapValueClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass)" + e.toString(),e);
        }
    }

    /**
     *
     * @deprecated use {@link #addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName)}
     *
     */
    public HashMap addToHashMap(Collection valueObjectsCollection,HashMap map, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return (HashMap) businessSLSBFacade.addToMap(valueObjectsCollection, map, valueObjectKeyAttributeName, new Boolean(isValueObjectKeyAttributeNameToSet), valueObjectValueAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }

    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToMap(valueObjectsCollection, map, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, valueObjectValueAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }

    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToMap(valueObjectsCollection, map, valueObjectKeyAttributeName,isValueObjectKeyAttributeNameToSet);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet)" + e.toString(),e);
        }
    }

    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToMap(valueObjectsCollection, map, valueObjectKeyAttributeName, valueObjectValueAttributeName, mapValueClassAttributeToSetName, mapValueClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass)throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToMap(valueObjectsCollection, map, valueObjectKeyAttributeName, valueObjectValueAttributeName, mapValueClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Class mapValueClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToMap(valueObjectsCollection, map, valueObjectKeyAttributeName, mapValueClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Class mapValueClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Class mapValueClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Class mapValueClass): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Class mapValueClass)" + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #addToMap(Collection valueObjectsCollection ,Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)}
     */
    public HashMap addToHashMap(Collection valueObjectsCollection ,HashMap map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName) throws ApplicationException{
        try {
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return (HashMap) businessSLSBFacade.addToMap(valueObjectsCollection, map, valueObjectKeyAttributeName, valueObjectValueAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToHashMap(Collection valueObjectsCollection ,HashMap map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToHashMap(Collection valueObjectsCollection ,HashMap map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName) " + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToHashMap(Collection valueObjectsCollection ,HashMap map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToHashMap(Collection valueObjectsCollection ,HashMap map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName) " + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToHashMap(Collection valueObjectsCollection ,HashMap map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToHashMap(Collection valueObjectsCollection ,HashMap map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName) " + e.toString(),e);
        }
    }
    public Map addToMap(Collection valueObjectsCollection ,Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToMap(valueObjectsCollection, map, valueObjectKeyAttributeName, valueObjectValueAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection ,Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection ,Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName) " + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection ,Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection ,Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName) " + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection ,Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection ,Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName) " + e.toString(),e);
        }
    }

    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToMap( valueObjectsCollection,  map,  valueObjectKeyAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName) : " + e.toString());
            throw new ApplicationException("ApplicationExceptionthrown thrown in SLSBManagerBD.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName)" + e.toString(),e);
        }
    }



    public void updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.updateCollectionWithMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName, valueObjectValueAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }

    public void updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName)throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.updateCollectionWithMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName)" + e.toString(),e);
        }
    }


    public void updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.updateCollectionWithMap(valueObjectsCollection, map, valueObjectKeyAttributeName, valueObjectValueAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)" + e.toString(),e);
        }

    }

    public void updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName)throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.updateCollectionWithMap(valueObjectsCollection, map, valueObjectKeyAttributeName);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName)" + e.toString(),e);
        }
    }


    /**
     *  @deprecated use {@link it.aco.mandragora.common.utils.BeanCollectionUtils#getTreeLeaves(Object valueobjectOrCollection, String path)}
     * @param valueobjectOrCollection
     * @param path
     * @return
     * @throws ApplicationException
     */
    public Collection getTreeLeaves(Object valueobjectOrCollection, String path) throws ApplicationException {
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.getTreeLeaves( valueobjectOrCollection,  path);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.getTreeLeaves(Object valueobjectOrCollection, String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.getTreeLeaves(Object valueobjectOrCollection, String path)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.getTreeLeaves(Object valueobjectOrCollection, String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.getTreeLeaves(Object valueobjectOrCollection, String path)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.getTreeLeaves(Object valueobjectOrCollection, String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.getTreeLeaves(Object valueobjectOrCollection, String path)" + e.toString(),e);
        }
    }



    public Collection retrieveTreeLeaves(Object valueobjectOrCollection, String path) throws ApplicationException {
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.retrieveTreeLeaves( valueobjectOrCollection,  path);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.retrieveTreeLeaves(Object valueobjectOrCollection, String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveTreeLeaves(Object valueobjectOrCollection, String path)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.retrieveTreeLeaves(Object valueobjectOrCollection, String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveTreeLeaves(Object valueobjectOrCollection, String path)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.retrieveTreeLeaves(Object valueobjectOrCollection, String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveTreeLeaves(Object valueobjectOrCollection, String path)" + e.toString(),e);
        }
    }


    /**
     * @deprecated use {@link #retrieveTreeLeaves(Object valueobjectOrCollection, String path)}
     */
    public Collection getCollectionOfRelatedMToNElements(Object pInstance, String collectionName, String pAttributeName) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.retrieveTreeLeaves( pInstance,  "collectionName.pAttributeName");
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.getCollectionOfRelatedMToNElements(Object pInstance, String collectionName, String pAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.getCollectionOfRelatedMToNElements(Object pInstance, String collectionName, String pAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.getCollectionOfRelatedMToNElements(Object pInstance, String collectionName, String pAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.getCollectionOfRelatedMToNElements(Object pInstance, String collectionName, String pAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.getCollectionOfRelatedMToNElements(Object pInstance, String collectionName, String pAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.getCollectionOfRelatedMToNElements(Object pInstance, String collectionName, String pAttributeName)" + e.toString(),e);
        }
    }



    public Collection retrieveNullPathTreeLeaves(Object valueobjectOrCollection, String path) throws ApplicationException {
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.retrieveNullPathTreeLeaves( valueobjectOrCollection,  path);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.retrieveNullPathTreeLeaves(Object valueobjectOrCollection, String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveNullPathTreeLeaves(Object valueobjectOrCollection, String path)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.retrieveNullPathTreeLeaves(Object valueobjectOrCollection, String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveNullPathTreeLeaves(Object valueobjectOrCollection, String path)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.retrieveNullPathTreeLeaves(Object valueobjectOrCollection, String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retrieveNullPathTreeLeaves(Object valueobjectOrCollection, String path)" + e.toString(),e);
        }
    }



    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,attributesComparator, path, sourcePAttributeNames, targetPAttributeNames, valuesArray, pAttributeNames);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,attributesComparator, path, sourcePAttributeNames, targetPAttributeNames, null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,attributesComparator, path, sourcePAttributeNames, sourcePAttributeNames, null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,attributesComparator, path, null, null, null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,attributesComparator, path, sourcePAttributeNames, sourcePAttributeNames, valuesArray, pAttributeNames);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,Object[] valuesArray, String[] pAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,attributesComparator, path, null, null, valuesArray, pAttributeNames);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path, Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path, Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path, Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path, Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path, Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path, Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,null, path, sourcePAttributeNames, targetPAttributeNames, valuesArray, pAttributeNames);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,null, path, sourcePAttributeNames, targetPAttributeNames, null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,null, path, sourcePAttributeNames, sourcePAttributeNames, null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,null, path, null, null, null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,null, path, sourcePAttributeNames, sourcePAttributeNames, valuesArray, pAttributeNames);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,Object[] valuesArray, String[] pAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,null, path, null, null, valuesArray, pAttributeNames);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path, Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path, Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path, Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path, Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path, Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path, Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }
    }




    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeNodes(pInstance, pAttributeName, pkNames, path, nodeSourcePAttributeNames, nodeTargetPAttributeNames, pAttributeNames,valuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }


    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeNodes(pInstance, pAttributeName, pkNames, path, nodeSourcePAttributeNames, nodeTargetPAttributeNames, null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeNodes(pInstance, pAttributeName, pkNames, path, nodeSourcePAttributeNames, nodeSourcePAttributeNames, null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeNodes(pInstance, pAttributeName, pkNames, path, null, null, null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeNodes(pInstance, pAttributeName, null, path, null, null, null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeNodes(pInstance, pAttributeName, null, path, nodeSourcePAttributeNames, nodeTargetPAttributeNames, null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,   String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,   String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,   String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeNodes(pInstance, pAttributeName, null, path, nodeSourcePAttributeNames, nodeSourcePAttributeNames, null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,   String path, String[][] nodeSourcePAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,   String path, String[][] nodeSourcePAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,   String path, String[][] nodeSourcePAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames)" + e.toString(),e);
        }
    }



    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[] pAttributeNames,Object[] valuesArray) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeNodes(pInstance, pAttributeName, pkNames, path, nodeSourcePAttributeNames, nodeSourcePAttributeNames, pAttributeNames,valuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }


    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[] pAttributeNames,Object[] valuesArray) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeNodes(pInstance, pAttributeName, pkNames, path, null, null, pAttributeNames,valuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }


    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[] pAttributeNames,Object[] valuesArray) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeNodes(pInstance, pAttributeName, null, path, null, null, pAttributeNames,valuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeNodes(pInstance, pAttributeName, null, path, nodeSourcePAttributeNames, nodeTargetPAttributeNames, pAttributeNames,valuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[][] nodeSourcePAttributeNames,   String[] pAttributeNames,Object[] valuesArray) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollectionTreeNodes(pInstance, pAttributeName, null, path, nodeSourcePAttributeNames, nodeSourcePAttributeNames, pAttributeNames,valuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[][] nodeSourcePAttributeNames,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[][] nodeSourcePAttributeNames,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[][] nodeSourcePAttributeNames,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }



    /**
     * @deprecated use {@link #addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames,  String[] pAttributeNames,Object[] valuesArray)}
     */
    public void align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,String[] pkNames,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            String path ="";
            String[][] nodeSourcePAttributeNames = null;
            if (treePathCollectionSource!=null&&treePathCollectionSource.length>0){
                nodeSourcePAttributeNames = new String[treePathCollectionSource.length][];
                for (int i=0; i<treePathCollectionSource.length-1;i++) {
                    nodeSourcePAttributeNames[i] = sourcePAttributeNames;
                    path=path+treePathCollectionSource[i]+".";
                }
                path=path+treePathCollectionSource[treePathCollectionSource.length-1];
                nodeSourcePAttributeNames[treePathCollectionSource.length-1] = sourcePAttributeNames;

            }
            //businessSLSBFacade.addToRetainInCollectionTreeLeaves(pInstance, pAttributeName, attributesComparator, path, sourcePAttributeNames, sourcePAttributeNames, valuesArray, pAttributeNames);
            businessSLSBFacade.addToRetainInCollectionTreeNodes(pInstance,  pAttributeName, pkNames,  path,  nodeSourcePAttributeNames,  nodeSourcePAttributeNames,  pAttributeNames, valuesArray) ;
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,String[] pkNames,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,String[] pkNames,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,String[] pkNames,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,String[] pkNames,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,String[] pkNames,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,String[] pkNames,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames)" + e.toString(),e);
        }

    }

    /**
     * @deprecated use {@link #addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[][] nodeSourcePAttributeNames,   String[] pAttributeNames,Object[] valuesArray)}
     */
    public void align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            String path ="";
            String[][] nodeSourcePAttributeNames = null;
            if (treePathCollectionSource!=null&&treePathCollectionSource.length>0){
                nodeSourcePAttributeNames = new String[treePathCollectionSource.length][];
                for (int i=0; i<treePathCollectionSource.length-1;i++) {
                    nodeSourcePAttributeNames[i] = sourcePAttributeNames;
                    path=path+treePathCollectionSource[i]+".";
                }
                path=path+treePathCollectionSource[treePathCollectionSource.length-1];
                nodeSourcePAttributeNames[treePathCollectionSource.length-1] = sourcePAttributeNames;
            }
            //businessSLSBFacade.addToRetainInCollectionTreeLeaves(pInstance, pAttributeName, null,path, sourcePAttributeNames, sourcePAttributeNames, valuesArray, pAttributeNames);
            businessSLSBFacade.addToRetainInCollectionTreeNodes(pInstance,  pAttributeName, null,  path,  nodeSourcePAttributeNames,  nodeSourcePAttributeNames,  pAttributeNames, valuesArray) ;
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames)" + e.toString(),e);
        }
    }


    public void createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.createValueObjectsTreeWithCollection(pInstance, pAttributeName , path, groupedPkNames,  nodePAttributeNames, nodeValuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }
    }

    public void createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.createValueObjectsTreeWithCollection(pInstance, pAttributeName , path, groupedPkNames,  null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames)" + e.toString(),e);
        }
    }

    public void createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.createValueObjectsTreeWithCollection(pInstance, pAttributeName , path, null,  null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path)" + e.toString(),e);
        }
    }

    public void createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.createValueObjectsTreeWithCollection(pInstance, pAttributeName , path, null,   nodePAttributeNames, nodeValuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }
    }

    public void createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.createValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path,  groupedPkNames,  nodePAttributeNames, nodeValuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }
    }


    public void createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.createValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path,  groupedPkNames,  null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames)" + e.toString(),e);
        }
    }

    public void createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.createValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path, null,  null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path)" + e.toString(),e);
        }
    }

    public void createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.createValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path,  null,  nodePAttributeNames, nodeValuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }
    }



    public void addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToValueObjectsTreeWithCollection(pInstance, pAttributeName , path, groupedPkNames,  nodePAttributeNames, nodeValuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }
    }

    public void addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToValueObjectsTreeWithCollection(pInstance, pAttributeName , path, groupedPkNames,  null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames)" + e.toString(),e);
        }
    }

    public void addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToValueObjectsTreeWithCollection(pInstance, pAttributeName , path, null,  null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path)" + e.toString(),e);
        }
    }

    public void addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToValueObjectsTreeWithCollection(pInstance, pAttributeName , path, null,  nodePAttributeNames, nodeValuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }
    }



    public void addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            //businessSLSBFacade.createValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path,  groupedPkNames,  nodePAttributeNames, nodeValuesArray);
            businessSLSBFacade.addToValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path,  groupedPkNames,  nodePAttributeNames, nodeValuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }
    }


    public void addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            //businessSLSBFacade.createValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path,  groupedPkNames,  null, null);
            businessSLSBFacade.addToValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path,  groupedPkNames,  null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames)" + e.toString(),e);
        }
    }

    public void addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            //businessSLSBFacade.createValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path, null,  null, null);
            businessSLSBFacade.addToValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path, null,  null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path)" + e.toString(),e);
        }
    }

    public void addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            //businessSLSBFacade.createValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path,  null,  nodePAttributeNames, nodeValuesArray);
            businessSLSBFacade.addToValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path,  null,  nodePAttributeNames, nodeValuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }
    }





    /**
     * @deprecated use {@link #addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray)}
     */
    public void createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray)throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRelationshipCollectionMissingElements( pInstance,  collectionName,  pAttributeName,  null,   pAttributeNames, valuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName)}
     */
    public void createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName)throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRelationshipCollectionMissingElements( pInstance,  collectionName,  pAttributeName,  null,   null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName)" + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection)}
     */
    public void createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection)throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRelationshipCollectionMissingElements( pInstance,  collectionName,  pAttributeName,  valueObjectsCollection,   null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection)" + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)}
     */
    public void createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRelationshipCollectionMissingElements( pInstance,  collectionName,  pAttributeName,  valueObjectsCollection,   pAttributeNames, valuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }


    public void addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray)throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRelationshipCollectionMissingElements( pInstance,  collectionName,  pAttributeName,  null,   pAttributeNames, valuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }


    public void addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName)throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRelationshipCollectionMissingElements( pInstance,  collectionName,  pAttributeName,  null,   null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName)" + e.toString(),e);
        }
    }

    public void addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection)throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRelationshipCollectionMissingElements( pInstance,  collectionName,  pAttributeName,  valueObjectsCollection,   null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection)" + e.toString(),e);
        }
    }

    public void addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRelationshipCollectionMissingElements( pInstance,  collectionName,  pAttributeName,  valueObjectsCollection,   pAttributeNames, valuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }


    public void createRelationshipCollection(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.createRelationshipCollection( pInstance,  collectionName,  pAttributeName,  valueObjectsCollection,   pAttributeNames, valuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createRelationshipCollection(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createRelationshipCollection(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createRelationshipCollection(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createRelationshipCollection(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createRelationshipCollection(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createRelationshipCollection(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }

    

    public void createRelationshipCollectionByOrValues(Object pInstance, String collectionName, String pAttributeName, String orPAttributeName, Collection valuesCollection,  String[] pAttributeNames,Object[] valuesArray)throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.createRelationshipCollectionByOrValues( pInstance,  collectionName,  pAttributeName,  orPAttributeName,  valuesCollection,   pAttributeNames, valuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createRelationshipCollectionByOrValues(Object pInstance, String collectionName, String pAttributeName, String orPAttributeName, Collection valuesCollection,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createRelationshipCollectionByOrValues(Object pInstance, String collectionName, String pAttributeName, String orPAttributeName, Collection valuesCollection,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createRelationshipCollectionByOrValues(Object pInstance, String collectionName, String pAttributeName, String orPAttributeName, Collection valuesCollection,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createRelationshipCollectionByOrValues(Object pInstance, String collectionName, String pAttributeName, String orPAttributeName, Collection valuesCollection,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createRelationshipCollectionByOrValues(Object pInstance, String collectionName, String pAttributeName, String orPAttributeName, Collection valuesCollection,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createRelationshipCollectionByOrValues(Object pInstance, String collectionName, String pAttributeName, String orPAttributeName, Collection valuesCollection,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }



    /**
     *
     * @deprecated use {@link #createRelationshipCollectionByOrValues(Object pInstance, String collectionName, String pAttributeName, String orPAttributeName, Collection valuesCollection,  String[] pAttributeNames,Object[] valuesArray)}
     */
    public void setRelationshipElementWithQueryByOrValues(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String orPAttributeName,Collection valuesCollection)throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.createRelationshipCollectionByOrValues( pInstance,  collectionName,  pAttributeName,  orPAttributeName,  valuesCollection,   pAttributeNames, valuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.setRelationshipElementWithQueryByOrValues(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String orPAttributeName,Collection valuesCollection): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.setRelationshipElementWithQueryByOrValues(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String orPAttributeName,Collection valuesCollection)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.setRelationshipElementWithQueryByOrValues(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String orPAttributeName,Collection valuesCollection): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.setRelationshipElementWithQueryByOrValues(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String orPAttributeName,Collection valuesCollection)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.setRelationshipElementWithQueryByOrValues(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String orPAttributeName,Collection valuesCollection): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.setRelationshipElementWithQueryByOrValues(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String orPAttributeName,Collection valuesCollection)" + e.toString(),e);
        }

    }




    public void createRelationshipCollectionBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName, String[] toSearchInPAttributeNames, Object value,  String[] pAttributeNames,Object[] valuesArray)throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.createRelationshipCollectionBySearchValueInFields( pInstance,  collectionName,  pAttributeName, toSearchInPAttributeNames,  value,   pAttributeNames, valuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createRelationshipCollectionBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName, String[] toSearchInPAttributeNames, Object value,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createRelationshipCollectionBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName, String[] toSearchInPAttributeNames, Object value,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createRelationshipCollectionBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName, String[] toSearchInPAttributeNames, Object value,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createRelationshipCollectionBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName, String[] toSearchInPAttributeNames, Object value,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createRelationshipCollectionBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName, String[] toSearchInPAttributeNames, Object value,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createRelationshipCollectionBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName, String[] toSearchInPAttributeNames, Object value,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }



    /**
     *
     * @deprecated use {@link #createRelationshipCollectionBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName, String[] toSearchInPAttributeNames, Object value,  String[] pAttributeNames,Object[] valuesArray)}
     */
    public void setRelationshipElementWithQueryBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String[] toSearchInPAttributeNames,Object value)throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.createRelationshipCollectionBySearchValueInFields( pInstance,  collectionName,  pAttributeName, toSearchInPAttributeNames,  value,   pAttributeNames, valuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.setRelationshipElementWithQueryBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String[] toSearchInPAttributeNames,Object value): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.setRelationshipElementWithQueryBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String[] toSearchInPAttributeNames,Object value)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.setRelationshipElementWithQueryBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String[] toSearchInPAttributeNames,Object value): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.setRelationshipElementWithQueryBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String[] toSearchInPAttributeNames,Object value)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.setRelationshipElementWithQueryBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String[] toSearchInPAttributeNames,Object value): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.setRelationshipElementWithQueryBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String[] toSearchInPAttributeNames,Object value)" + e.toString(),e);
        }

    }



    public boolean addToCollection(Object pInstance, String pAttributeName, Object toAddPInstance) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToCollection(pInstance, pAttributeName, toAddPInstance) ;
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToCollection(Object pInstance, String pAttributeName, Object toAddPInstance): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToCollection(Object pInstance, String pAttributeName, Object toAddPInstance)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToCollection(Object pInstance, String pAttributeName, Object toAddPInstance): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToCollection(Object pInstance, String pAttributeName, Object toAddPInstance)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToCollection(Object pInstance, String pAttributeName, Object toAddPInstance): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToCollection(Object pInstance, String pAttributeName, Object toAddPInstance)" + e.toString(),e);
        }
    }



    /**
     * @deprecated use {@link #addToCollection(Object pInstance, String pAttributeName, Object toAddPInstance)}
     */
    public boolean addElementToCollectionReference(Object pInstance, String pAttributeName, Object toAddPInstance) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToCollection(pInstance, pAttributeName, toAddPInstance) ;
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addElementToCollectionReference(Object pInstance, String pAttributeName, Object toAddPInstance): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addElementToCollectionReference(Object pInstance, String pAttributeName, Object toAddPInstance)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addElementToCollectionReference(Object pInstance, String pAttributeName, Object toAddPInstance): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addElementToCollectionReference(Object pInstance, String pAttributeName, Object toAddPInstance)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addElementToCollectionReference(Object pInstance, String pAttributeName, Object toAddPInstance): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addElementToCollectionReference(Object pInstance, String pAttributeName, Object toAddPInstance)" + e.toString(),e);
        }
    }



    public boolean addAllToCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addAllToCollection(pInstance, pAttributeName, valueObjectsCollectionToAdd) ;
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addAllToCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addAllToCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addAllToCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addAllToCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addAllToCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addAllToCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd)" + e.toString(),e);
        }
    }



    /**
     * @deprecated use {@link #addAllToCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd)}
     */
    public Object addCollectionToCollectionReference(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addAllToCollection(pInstance, pAttributeName, valueObjectsCollectionToAdd) ;
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addCollectionToCollectionReference(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addCollectionToCollectionReference(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addCollectionToCollectionReference(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addCollectionToCollectionReference(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addCollectionToCollectionReference(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addCollectionToCollectionReference(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd)" + e.toString(),e);
        }
        return pInstance;
    }



    public boolean addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames,Object[] valuesArray) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addAllToCollection( targetRealClass,  valueObjectsCollection,   valueObjectsCollectionToAdd, sourcePAttributeNames, targetPAttributeNames, pAttributeNames, valuesArray) ;
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }



    /**
     * @deprecated use {@link #addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames,Object[] valuesArray)}
     */
    public Collection addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection, String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames, Object[] valuesArray ) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addAllToCollection( targetRealClass,  valueObjectsCollection,   valueObjectsCollectionToAdd, sourcePAttributeNames, targetPAttributeNames, pAttributeNames, valuesArray) ;
            return valueObjectsCollection;
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD. addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection, String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames, Object[] valuesArray ) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD. addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection, String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames, Object[] valuesArray )" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD. addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection, String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames, Object[] valuesArray ) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD. addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection, String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames, Object[] valuesArray )" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD. addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection, String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames, Object[] valuesArray ) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD. addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection, String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames, Object[] valuesArray )" + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames)}
     */
    public Collection addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection,String[] sourcePAttributeNames,String[] targetPAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addAllToCollection( targetRealClass,  valueObjectsCollection,   valueObjectsCollectionToAdd, sourcePAttributeNames, targetPAttributeNames, null, null) ;
            return valueObjectsCollection;
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection,String[] sourcePAttributeNames,String[] targetPAttributeNames) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection,String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection,String[] sourcePAttributeNames,String[] targetPAttributeNames) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection,String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection,String[] sourcePAttributeNames,String[] targetPAttributeNames) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection,String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }
    }



    public boolean addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, String[] pAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addAllToCollection(valueObjectsCollection,  valueObjectsCollectionToAdd, pAttributeNames);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, String[] pAttributeNames): " + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, String[] pAttributeNames): " + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, String[] pAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, String[] pAttributeNames): " + e.toString(),e);
        }
    }

    public boolean addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, Class realClass)  throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addAllToCollection( valueObjectsCollection,   valueObjectsCollectionToAdd,  realClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, Class realClass): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, Class realClass): " + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, Class realClass): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, Class realClass): " + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, Class realClass): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, Class realClass): " + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, Class realClass)}
     */
    public Collection mergeTwoCollections(Collection valueObjectsCollection, Collection valueObjectsCollectionToAdd, Class realClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addAllToCollection( valueObjectsCollection,   valueObjectsCollectionToAdd,  realClass);
            return valueObjectsCollection;
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.mergeTwoCollections(Collection valueObjectsCollection, Collection valueObjectsCollectionToAdd, Class realClass): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.mergeTwoCollections(Collection valueObjectsCollection, Collection valueObjectsCollectionToAdd, Class realClass): " + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.mergeTwoCollections(Collection valueObjectsCollection, Collection valueObjectsCollectionToAdd, Class realClass): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.mergeTwoCollections(Collection valueObjectsCollection, Collection valueObjectsCollectionToAdd, Class realClass): " + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.mergeTwoCollections(Collection valueObjectsCollection, Collection valueObjectsCollectionToAdd, Class realClass): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.mergeTwoCollections(Collection valueObjectsCollection, Collection valueObjectsCollectionToAdd, Class realClass): " + e.toString(),e);
        }
    }


    public boolean addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addAllToCollection( targetRealClass,  valueObjectsCollection,   valueObjectsCollectionToAdd, sourcePAttributeNames, targetPAttributeNames, null, null) ;
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }
    }

    public boolean addAllToCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAdd, String pAttributeNameMapKey) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addAllToCollection(valueObjectsCollection, map,  valueObjectsCollectionToAdd, pAttributeNameMapKey) ;
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addAllToCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAdd, String pAttributeNameMapKey) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addAllToCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAdd, String pAttributeNameMapKey) " + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addAllToCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAdd, String pAttributeNameMapKey) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addAllToCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAdd, String pAttributeNameMapKey) " + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addAllToCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAdd, String pAttributeNameMapKey) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addAllToCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAdd, String pAttributeNameMapKey) " + e.toString(),e);
        }
    }





    public boolean retainAllInCollection(Object pInstance, String pAttributeName, Collection  toRetainValueObjectsCollection) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.retainAllInCollection( pInstance,  pAttributeName,   toRetainValueObjectsCollection);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.retainAllInCollection(Object pInstance, String pAttributeName, Collection  toRetainValueObjectsCollection): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retainAllInCollection(Object pInstance, String pAttributeName, Collection  toRetainValueObjectsCollection)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.retainAllInCollection(Object pInstance, String pAttributeName, Collection  toRetainValueObjectsCollection): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retainAllInCollection(Object pInstance, String pAttributeName, Collection  toRetainValueObjectsCollection)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.retainAllInCollection(Object pInstance, String pAttributeName, Collection  toRetainValueObjectsCollection): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retainAllInCollection(Object pInstance, String pAttributeName, Collection  toRetainValueObjectsCollection)" + e.toString(),e);
        }
    }


    public boolean retainAllInCollection(Collection valueObjectsCollection, Collection  toRetainValueObjectsCollection, Class realClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.retainAllInCollection( valueObjectsCollection,   toRetainValueObjectsCollection,  realClass);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.retainAllInCollection(Collection valueObjectsCollection, Collection  toRetainValueObjectsCollection, Class realClass): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retainAllInCollection(Collection valueObjectsCollection, Collection  toRetainValueObjectsCollection, Class realClass)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.retainAllInCollection(Collection valueObjectsCollection, Collection  toRetainValueObjectsCollection, Class realClass): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retainAllInCollection(Collection valueObjectsCollection, Collection  toRetainValueObjectsCollection, Class realClass)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.retainAllInCollection(Collection valueObjectsCollection, Collection  toRetainValueObjectsCollection, Class realClass): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retainAllInCollection(Collection valueObjectsCollection, Collection  toRetainValueObjectsCollection, Class realClass)" + e.toString(),e);
        }
    }

    public boolean retainAllInCollection(Collection valueObjectsCollection, Collection toRetainValueObjectsCollection, String[] pAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.retainAllInCollection( valueObjectsCollection,  toRetainValueObjectsCollection,  pAttributeNames);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.retainAllInCollection(Collection valueObjectsCollection, Collection toRetainValueObjectsCollection, String[] pAttributeNames) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retainAllInCollection(Collection valueObjectsCollection, Collection toRetainValueObjectsCollection, String[] pAttributeNames)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.retainAllInCollection(Collection valueObjectsCollection, Collection toRetainValueObjectsCollection, String[] pAttributeNames) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retainAllInCollection(Collection valueObjectsCollection, Collection toRetainValueObjectsCollection, String[] pAttributeNames)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.retainAllInCollection(Collection valueObjectsCollection, Collection toRetainValueObjectsCollection, String[] pAttributeNames) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retainAllInCollection(Collection valueObjectsCollection, Collection toRetainValueObjectsCollection, String[] pAttributeNames)" + e.toString(),e);
        }
    }

    public boolean retainAllInCollection(Collection valueObjectsCollection, Map map, String pAttributeNameMapKey) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.retainAllInCollection(valueObjectsCollection,  map, pAttributeNameMapKey);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.retainAllInCollection(Collection valueObjectsCollection, Map map, String pAttributeNameMapKey) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retainAllInCollection(Collection valueObjectsCollection, Map map, String pAttributeNameMapKey)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.retainAllInCollection(Collection valueObjectsCollection, Map map, String pAttributeNameMapKey) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retainAllInCollection(Collection valueObjectsCollection, Map map, String pAttributeNameMapKey)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.retainAllInCollection(Collection valueObjectsCollection, Map map, String pAttributeNameMapKey) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.retainAllInCollection(Collection valueObjectsCollection, Map map, String pAttributeNameMapKey)" + e.toString(),e);
        }
    }





    /**
     * @deprecated use {@link #retainAllInCollection(Collection valueObjectsCollection, Map map, String pAttributeNameMapKey)}
     */
    public void removeFromCollectionElementsNotInMap(Collection valueObjectsCollection, HashMap map,  String pAttributeNameMapKey) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.retainAllInCollection(valueObjectsCollection,  map, pAttributeNameMapKey);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.removeFromCollectionElementsNotInMap(Collection valueObjectsCollection, HashMap map,  String pAttributeNameMapKey) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.removeFromCollectionElementsNotInMap(Collection valueObjectsCollection, HashMap map,  String pAttributeNameMapKey)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.removeFromCollectionElementsNotInMap(Collection valueObjectsCollection, HashMap map,  String pAttributeNameMapKey) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.removeFromCollectionElementsNotInMap(Collection valueObjectsCollection, HashMap map,  String pAttributeNameMapKey)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.removeFromCollectionElementsNotInMap(Collection valueObjectsCollection, HashMap map,  String pAttributeNameMapKey) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.removeFromCollectionElementsNotInMap(Collection valueObjectsCollection, HashMap map,  String pAttributeNameMapKey)" + e.toString(),e);
        }

    }

    public boolean addToRetainInCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAddAndRetain)throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToRetainInCollection( pInstance,  pAttributeName,   valueObjectsCollectionToAddAndRetain);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAddAndRetain) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAddAndRetain) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAddAndRetain) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAddAndRetain) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAddAndRetain) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAddAndRetain) " + e.toString(),e);
        }
    }

    public boolean addToRetainInCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAddAndRetain, Class realClass) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToRetainInCollection( valueObjectsCollection,   valueObjectsCollectionToAddAndRetain,  realClass);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAddAndRetain, Class realClass) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAddAndRetain, Class realClass) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAddAndRetain, Class realClass) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAddAndRetain, Class realClass) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAddAndRetain, Class realClass) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAddAndRetain, Class realClass) " + e.toString(),e);
        }
    }

    public boolean addToRetainInCollection(Collection valueObjectsCollection, Collection valueObjectsCollectionToAddAndRetain, String[] pAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToRetainInCollection( valueObjectsCollection,  valueObjectsCollectionToAddAndRetain,  pAttributeNames);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollection(Collection valueObjectsCollection, Collection valueObjectsCollectionToAddAndRetain, String[] pAttributeNames) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollection(Collection valueObjectsCollection, Collection valueObjectsCollectionToAddAndRetain, String[] pAttributeNames) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollection(Collection valueObjectsCollection, Collection valueObjectsCollectionToAddAndRetain, String[] pAttributeNames) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollection(Collection valueObjectsCollection, Collection valueObjectsCollectionToAddAndRetain, String[] pAttributeNames) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollection(Collection valueObjectsCollection, Collection valueObjectsCollectionToAddAndRetain, String[] pAttributeNames) " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollection(Collection valueObjectsCollection, Collection valueObjectsCollectionToAddAndRetain, String[] pAttributeNames) " + e.toString(),e);
        }
    }

    public boolean addToRetainInCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addToRetainInCollection( valueObjectsCollection,  map,   valueObjectsCollectionToAddAndRetain,  pAttributeNameMapKey);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addToRetainInCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)" + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addToRetainInCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)" + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addToRetainInCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)" + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addToRetainInCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)" + e.toString(),e);
        }
    }



    /**
     * @deprecated use {@link #addToRetainInCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)}
     *
     */
    public void refreshCollectionWithOtherCollectionUsingMapAsRelation(Collection valueObjectsCollection, HashMap map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addToRetainInCollection( valueObjectsCollection,  map,   valueObjectsCollectionToAddAndRetain,  pAttributeNameMapKey);
        } catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.refreshCollectionWithOtherCollectionUsingMapAsRelation(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)" + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.refreshCollectionWithOtherCollectionUsingMapAsRelation(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)" + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.refreshCollectionWithOtherCollectionUsingMapAsRelation(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)" + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.refreshCollectionWithOtherCollectionUsingMapAsRelation(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.refreshCollectionWithOtherCollectionUsingMapAsRelation(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)" + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.refreshCollectionWithOtherCollectionUsingMapAsRelation(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)" + e.toString(),e);
        }
    }


    public boolean removeFromCollection(Object pInstance, String pAttributeName, Object toRemovePInstance) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.removeFromCollection(pInstance, pAttributeName, toRemovePInstance) ;
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.removeFromCollection(Object pInstance, String pAttributeName, Object toRemovePInstance) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.removeFromCollection(Object pInstance, String pAttributeName, Object toRemovePInstance) " + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.removeFromCollection(Object pInstance, String pAttributeName, Object toRemovePInstance) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.removeFromCollection(Object pInstance, String pAttributeName, Object toRemovePInstance) " + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.removeFromCollection(Object pInstance, String pAttributeName, Object toRemovePInstance) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.removeFromCollection(Object pInstance, String pAttributeName, Object toRemovePInstance) " + e.toString(),e);
        }
    }

    public boolean removeFromCollection(Collection valueObjectsCollection, Object toRemovePInstance) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.removeFromCollection(valueObjectsCollection, toRemovePInstance);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.removeFromCollection(Collection valueObjectsCollection, Object toRemovePInstance): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.removeFromCollection(Collection valueObjectsCollection, Object toRemovePInstance)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.removeFromCollection(Collection valueObjectsCollection, Object toRemovePInstance): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.removeFromCollection(Collection valueObjectsCollection, Object toRemovePInstance)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.removeFromCollection(Collection valueObjectsCollection, Object toRemovePInstance): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.removeFromCollection(Collection valueObjectsCollection, Object toRemovePInstance)" + e.toString(),e);
        }
    }



    /**
     * @deprecated use {@link #removeFromCollection(Object pInstance, String pAttributeName, Object toRemovePInstance)}
     */
    public boolean removeElementFromCollectionReference(Object pInstance, String pAttributeName, Object toRemovePInstance) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.removeFromCollection(pInstance, pAttributeName, toRemovePInstance) ;
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.removeFromCollectionReference(Object pInstance, String pAttributeName, Object toRemovePInstance): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.removeFromCollectionReference(Object pInstance, String pAttributeName, Object toRemovePInstance)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.removeFromCollectionReference(Object pInstance, String pAttributeName, Object toRemovePInstance): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.removeFromCollectionReference(Object pInstance, String pAttributeName, Object toRemovePInstance)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.removeFromCollectionReference(Object pInstance, String pAttributeName, Object toRemovePInstance): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.removeFromCollectionReference(Object pInstance, String pAttributeName, Object toRemovePInstance)" + e.toString(),e);
        }
    }





    public boolean removeAllFromCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToRemove) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.removeAllFromCollection( pInstance,  pAttributeName, valueObjectsCollectionToRemove);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.removeAllFromCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToRemove) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.removeAllFromCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToRemove) " + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.removeAllFromCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToRemove) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.removeAllFromCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToRemove) " + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.removeAllFromCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToRemove) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.removeAllFromCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToRemove) " + e.toString(),e);
        }
    }




    public Object createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.createVOfromVO(sourceRealClass, pkFieldNames, pkValues, targetRealClass, sourcePAttributeNames, targetPAttributeNames, pAttributeNames, valuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }


    public Object createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.createVOfromVO(sourceRealClass, pkFieldNames, pkValues, targetRealClass, sourcePAttributeNames, targetPAttributeNames, null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }
    }

    public Object createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.createVOfromVO(sourceRealClass,  pkValues, targetRealClass, sourcePAttributeNames, targetPAttributeNames, pAttributeNames, valuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }



    public Object createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.createVOfromVO(sourceRealClass,  pkValues, targetRealClass, sourcePAttributeNames, targetPAttributeNames, null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }
    }

    public Object createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.createVOfromVO(sourcePInstance, targetRealClass, sourcePAttributeNames,targetPAttributeNames, pAttributeNames, valuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }

    public Object createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.createVOfromVO(sourcePInstance, targetRealClass, sourcePAttributeNames,targetPAttributeNames, null, null);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }
    }




    


    public boolean  addTreeToTree(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addTreeToTree( sourceRootVO,  targetRootVO, sourceTreePaths, targetTreePaths,  treeNodeSourcePAttributeNames,  treeNodeTargetPAttributeNames,  treeNodePAttributeNames,  treeNodeValuesArray );
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addTreeToTree(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addTreeToTree(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ):" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addTreeToTree(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addTreeToTree(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ):" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addTreeToTree(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addTreeToTree(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ):" + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #addTreeToTree(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray )}
     * */
    public Object addTreesToTrees(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames,Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            businessSLSBFacade.addTreeToTree( sourceRootVO,  targetRootVO, sourceTreePaths, targetTreePaths,  treeNodeSourcePAttributeNames,  treeNodeTargetPAttributeNames,  treeNodePAttributeNames,  treeNodeValuesArray );
            return targetRootVO;
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addTreesToTrees(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addTreesToTrees(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ):" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addTreesToTrees(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addTreesToTrees(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ):" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addTreesToTrees(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addTreesToTrees(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ):" + e.toString(),e);
        }

    }



    public boolean addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames, String[][] nodePAttributeNames, Object[][] nodeValuesArray)throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addTreeToTree( sourceRootVO,  targetRootVO,  sourceTreePath,  targetTreePath, nodeSourcePAttributeNames,  nodeTargetPAttributeNames,  nodePAttributeNames, nodeValuesArray);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames, String[][] nodePAttributeNames, Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames, String[][] nodePAttributeNames, Object[][] nodeValuesArray)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames, String[][] nodePAttributeNames, Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames, String[][] nodePAttributeNames, Object[][] nodeValuesArray)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames, String[][] nodePAttributeNames, Object[][] nodeValuesArray): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames, String[][] nodePAttributeNames, Object[][] nodeValuesArray)" + e.toString(),e);
        }
    }


    public boolean addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, Collection nodeSourcePAttributeNamesCollection, Collection nodeTargetPAttributeNamesCollection, Collection nodePAttributeNamesCollection, Collection nodeValuesArrayCollection) throws ApplicationException{
        try{
            BusinessSLSBFacade businessSLSBFacade= businessSLSBFacadeHome.create();
            return businessSLSBFacade.addTreeToTree( sourceRootVO,  targetRootVO,  sourceTreePath,  targetTreePath,  nodeSourcePAttributeNamesCollection,  nodeTargetPAttributeNamesCollection,  nodePAttributeNamesCollection,  nodeValuesArrayCollection);
        }catch (RemoteException e) {
            log.error("RemoteException caught in SLSBManagerBD.ddTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, Collection nodeSourcePAttributeNamesCollection, Collection nodeTargetPAttributeNamesCollection, Collection nodePAttributeNamesCollection, Collection nodeValuesArrayCollection): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.ddTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, Collection nodeSourcePAttributeNamesCollection, Collection nodeTargetPAttributeNamesCollection, Collection nodePAttributeNamesCollection, Collection nodeValuesArrayCollection)" + e.toString(),e);
        }catch (CreateException e) {
            log.error("CreateException caught in SLSBManagerBD.ddTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, Collection nodeSourcePAttributeNamesCollection, Collection nodeTargetPAttributeNamesCollection, Collection nodePAttributeNamesCollection, Collection nodeValuesArrayCollection): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.ddTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, Collection nodeSourcePAttributeNamesCollection, Collection nodeTargetPAttributeNamesCollection, Collection nodePAttributeNamesCollection, Collection nodeValuesArrayCollection)" + e.toString(),e);
        }catch (EJBException e) {
            log.error("EJBException caught in SLSBManagerBD.ddTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, Collection nodeSourcePAttributeNamesCollection, Collection nodeTargetPAttributeNamesCollection, Collection nodePAttributeNamesCollection, Collection nodeValuesArrayCollection): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in SLSBManagerBD.ddTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, Collection nodeSourcePAttributeNamesCollection, Collection nodeTargetPAttributeNamesCollection, Collection nodePAttributeNamesCollection, Collection nodeValuesArrayCollection)" + e.toString(),e);
        }

    }
	public Object findObjectByLogicCondition(Class realClass,
			LogicCondition logicCondition) throws ApplicationException {
		throw new UnsupportedOperationException("not yet implemented");
	}
	public Object findObjectByLogicCondition(String[] selectFields,
			Class realClass, LogicCondition logicCondition)
			throws ApplicationException {
		throw new UnsupportedOperationException("not yet implemented");
	}
	public Object findObjectByLogicCondition(String[] selectFields,
			Class realClass, LogicCondition logicCondition, String orderBy)
			throws ApplicationException {
		throw new UnsupportedOperationException("not yet implemented");
	}
	public Object findObjectByLogicCondition(Class realClass,
			LogicCondition logicCondition, String orderBy)
			throws ApplicationException {
		throw new UnsupportedOperationException("not yet implemented");
	}





    /*********************** B U S I N E S S   end******************/



}
