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

package it.aco.mandragora.serviceFacade.sessionFacade.remoteFacade.SLSB.business;


import it.aco.mandragora.serviceFacade.ServiceFacade;
import it.aco.mandragora.common.ServiceLocator;
import it.aco.mandragora.exception.ServiceLocatorException;
import it.aco.mandragora.exception.ServiceFacadeException;

import javax.ejb.SessionContext;
import javax.ejb.SessionBean;


import java.rmi.RemoteException;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;


public class BusinessSLSBFacadeBean implements SessionBean{

    private SessionContext sc;
    protected static String ServiceFacadeFactoryClassName = "BusinessSLSBFacadeBean.ServiceFacadeFactoryClass" ;
    protected static String ServiceFacadeClassName = "BusinessSLSBFacadeBean.ServiceFacadeClass" ;
    static private org.apache.log4j.Category log = org.apache.log4j.Logger.getLogger(BusinessSLSBFacadeBean.class.getName());
    public BusinessSLSBFacadeBean(){}
    public void ejbCreate(){}
    public void ejbRemove(){}
    public void ejbActivate(){}
    public void ejbPassivate(){}
    public void setSessionContext(SessionContext sc){this.sc=sc; }




    protected ServiceFacade getServiceFacade()throws RemoteException{
        try{
            return ServiceLocator.getInstance().getServiceFacade(ServiceFacadeFactoryClassName,ServiceFacadeClassName);
        }catch (ServiceLocatorException e) {
            log.error("ServiceLocatorException caught in BusinessSLSBFacadeBean.getContextServiceFacade(): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.getContextServiceFacade()" + e.toString(),e);
        }
    }





    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass) throws RemoteException{
        try {
            return getServiceFacade().buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, valueObjectValueAttributeName, mapValueClassAttributeToSetName, mapValueClass);
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)" + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)}
     */
    public HashMap buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass) throws RemoteException{
        try {
            return (HashMap) getServiceFacade().buildMap( pInstance,  pAttributeName,  valueObjectKeyAttributeName,new  Boolean(isValueObjectKeyAttributeNameToSet),  valueObjectValueAttributeName, mapValueClass);
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass) throws RemoteException{
        try {
            return getServiceFacade().buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, valueObjectValueAttributeName,mapValueClass);
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass) throws RemoteException{
        try {
            return getServiceFacade().buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, mapValueClass);
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass)" + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)}
     */
    public HashMap buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName) throws RemoteException{
        try {
            return (HashMap) getServiceFacade().buildMap(pInstance,pAttributeName,valueObjectKeyAttributeName, new Boolean(isValueObjectKeyAttributeNameToSet),valueObjectValueAttributeName);
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }


    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName) throws RemoteException{
        try {
            return getServiceFacade().buildMap(pInstance,pAttributeName,valueObjectKeyAttributeName,isValueObjectKeyAttributeNameToSet,valueObjectValueAttributeName);
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }

    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet) throws RemoteException{
        try {
            return getServiceFacade().buildMap(pInstance,pAttributeName,valueObjectKeyAttributeName,isValueObjectKeyAttributeNameToSet);
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet)" + e.toString(),e);
        }
    }

    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass) throws RemoteException{
        try {
            return getServiceFacade().buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName, mapValueClassAttributeToSetName,mapValueClass);
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass) throws RemoteException{
        try {
            return getServiceFacade().buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName, mapValueClass);
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Class mapValueClass) throws RemoteException{
        try {
            return getServiceFacade().buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, mapValueClass);
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, Class mapValueClass)" + e.toString(),e);
        }
    }


    /**
     * @deprecated use {@link #buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)}
     */
    public HashMap buildHashMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName,String valueObjectValueAttributeName) throws RemoteException{
        try{
            return (HashMap) getServiceFacade().buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildHashMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildHashMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName)" + e.toString(),e);
        }
    }



    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName, String valueObjectValueAttributeName) throws RemoteException{
        try{
            return getServiceFacade().buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName, valueObjectValueAttributeName)" + e.toString(),e);
        }
    }

    public Map buildMap(Object pInstance, String pAttributeName, String valueObjectKeyAttributeName) throws RemoteException{
        try{
            return getServiceFacade().buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildMap(pInstance, pAttributeName, valueObjectKeyAttributeName)" + e.toString(),e);
        }
    }

    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass) throws RemoteException{
        try{
            return getServiceFacade().buildMap(valueObjectsCollection, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, valueObjectValueAttributeName, mapValueClassAttributeToSetName, mapValueClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)" + e.toString(),e);
        }
    }

    /**
     * @deprecated see{@link #buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass)}
     */
    public HashMap buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass) throws RemoteException{
        try{
            return (HashMap) getServiceFacade().buildMap(valueObjectsCollection, valueObjectKeyAttributeName, new Boolean(isValueObjectKeyAttributeNameToSet), valueObjectValueAttributeName, mapValueClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass) throws RemoteException{
        try{
            return getServiceFacade().buildMap(valueObjectsCollection, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, valueObjectValueAttributeName, mapValueClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass) throws RemoteException{
        try{
            return getServiceFacade().buildMap(valueObjectsCollection, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet,  mapValueClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName) throws RemoteException{
        try{
            return getServiceFacade().buildMap(valueObjectsCollection, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet,  valueObjectValueAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }

    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet) throws RemoteException{
        try{
            return getServiceFacade().buildMap(valueObjectsCollection, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet)" + e.toString(),e);
        }
    }

    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass) throws RemoteException{
        try{
            return getServiceFacade().buildMap(valueObjectsCollection, valueObjectKeyAttributeName,  valueObjectValueAttributeName, mapValueClassAttributeToSetName, mapValueClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass) throws RemoteException{
        try{
            return getServiceFacade().buildMap(valueObjectsCollection, valueObjectKeyAttributeName,  valueObjectValueAttributeName,  mapValueClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Class mapValueClass) throws RemoteException{
        try{
            return getServiceFacade().buildMap(valueObjectsCollection, valueObjectKeyAttributeName,  mapValueClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, Class mapValueClass)" + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)}
     */
    public HashMap buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName, String valueObjectValueAttributeName) throws RemoteException{
        try{
            return (HashMap) getServiceFacade().buildMap(valueObjectsCollection, valueObjectKeyAttributeName, valueObjectValueAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildHashMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }

    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName) throws RemoteException{
        try{
            return getServiceFacade().buildMap(valueObjectsCollection, valueObjectKeyAttributeName, valueObjectValueAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }


    public Map buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName) throws RemoteException{
        try{
            return getServiceFacade().buildMap(valueObjectsCollection, valueObjectKeyAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.buildMap(Collection valueObjectsCollection, String valueObjectKeyAttributeName)" + e.toString(),e);
        }
    }




    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass) throws RemoteException{
        try{
            return getServiceFacade().addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, valueObjectValueAttributeName, mapValueClassAttributeToSetName, mapValueClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass)" + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass) }
     */
    public HashMap addToHashMap(Object pInstance, HashMap map, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass) throws RemoteException{
        try{
            return (HashMap) getServiceFacade().addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName, new Boolean(isValueObjectKeyAttributeNameToSet), valueObjectValueAttributeName, mapValueClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToHashMap(Object pInstance, HashMap map, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToHashMap(Object pInstance, HashMap map, String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass) throws RemoteException{
        try{
            return getServiceFacade().addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, valueObjectValueAttributeName, mapValueClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass) throws RemoteException{
        try{
            return getServiceFacade().addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, mapValueClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass)" + e.toString(),e);
        }
    }

   /**
     * @deprecated use  {@link #addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)}
     */
    public HashMap addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName) throws RemoteException{
        try{
            return (HashMap) getServiceFacade().addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName, new Boolean(isValueObjectKeyAttributeNameToSet), valueObjectValueAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName) : " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName) " + e.toString(),e);
        }
    }

    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName) throws RemoteException{
        try{
            return getServiceFacade().addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, valueObjectValueAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }

    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet) throws RemoteException{
        try{
            return getServiceFacade().addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName,isValueObjectKeyAttributeNameToSet) ;
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet) : " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet) " + e.toString(),e);
        }
    }

    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass) throws RemoteException{
        try{
            return getServiceFacade().addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName, valueObjectValueAttributeName, mapValueClassAttributeToSetName, mapValueClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass) throws RemoteException{
        try{
            return getServiceFacade().addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName, valueObjectValueAttributeName, mapValueClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Class mapValueClass)  throws RemoteException{
        try{
            return getServiceFacade().addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName, mapValueClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, Class mapValueClass)" + e.toString(),e);
        }
    }


    /**
     * @deprecated use {@link #addToMap(Object pInstance,String pAttributeName, Map map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)}
     */
    public HashMap addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,String valueObjectValueAttributeName) throws RemoteException{
        try {
            return (HashMap) getServiceFacade().addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName,  valueObjectValueAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,String valueObjectValueAttributeName): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToHashMap(Object pInstance,HashMap map,String pAttributeName, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }

    public Map addToMap(Object pInstance,String pAttributeName, Map map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName) throws RemoteException{
        try{
            return getServiceFacade().addToMap(pInstance, pAttributeName,  map,  valueObjectKeyAttributeName, valueObjectValueAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Object pInstance,String pAttributeName, Map map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Object pInstance,String pAttributeName, Map map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }

    public Map addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName) throws RemoteException{
        try{
            return getServiceFacade().addToMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName)" + e.toString(),e);
        }
    }

    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass) throws RemoteException{
        try{
            return getServiceFacade().addToMap(valueObjectsCollection, map, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, valueObjectValueAttributeName, mapValueClassAttributeToSetName, mapValueClass) ;
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass) : " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName, Class mapValueClass) " + e.toString(),e);
        }
    }

    /**
     * @deprecated use  {@link #addToMap(Collection valueObjectsCollection, Map map,  String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)}
     */
    public HashMap addToHashMap(Collection valueObjectsCollection, HashMap map,  String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass) throws RemoteException{
        try{
            return (HashMap) getServiceFacade().addToMap(valueObjectsCollection, map,  valueObjectKeyAttributeName, new Boolean(isValueObjectKeyAttributeNameToSet), valueObjectValueAttributeName, mapValueClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToHashMap(Collection valueObjectsCollection, HashMap map,  String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToHashMap(Collection valueObjectsCollection, HashMap map,  String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map addToMap(Collection valueObjectsCollection, Map map,  String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass) throws RemoteException{
        try{
            return getServiceFacade().addToMap(valueObjectsCollection, map,  valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, valueObjectValueAttributeName, mapValueClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection, Map map,  String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection, Map map,  String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass) throws RemoteException{
        try{
            return getServiceFacade().addToMap(valueObjectsCollection, map,  valueObjectKeyAttributeName,  isValueObjectKeyAttributeNameToSet,  mapValueClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Boolean isValueObjectKeyAttributeNameToSet, Class mapValueClass)" + e.toString(),e);
        }
    }

    /**
     *
     * @deprecated use {@link #addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName)}
     *
     */
    public HashMap addToHashMap(Collection valueObjectsCollection,HashMap map, String valueObjectKeyAttributeName,boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName) throws RemoteException{
        try{
            return (HashMap) getServiceFacade().addToMap(valueObjectsCollection, map, valueObjectKeyAttributeName, new Boolean(isValueObjectKeyAttributeNameToSet), valueObjectValueAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }

    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName) throws RemoteException{
        try{
            return getServiceFacade().addToMap(valueObjectsCollection, map, valueObjectKeyAttributeName, isValueObjectKeyAttributeNameToSet, valueObjectValueAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet,String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }

    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet) throws RemoteException{
        try{
            return getServiceFacade().addToMap(valueObjectsCollection, map, valueObjectKeyAttributeName,isValueObjectKeyAttributeNameToSet);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName,Boolean isValueObjectKeyAttributeNameToSet)" + e.toString(),e);
        }
    }

    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass) throws RemoteException{
        try{
            return getServiceFacade().addToMap(valueObjectsCollection, map, valueObjectKeyAttributeName, valueObjectValueAttributeName, mapValueClassAttributeToSetName, mapValueClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName, String mapValueClassAttributeToSetName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass)throws RemoteException{
        try{
            return getServiceFacade().addToMap(valueObjectsCollection, map, valueObjectKeyAttributeName, valueObjectValueAttributeName, mapValueClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName,Class mapValueClass)" + e.toString(),e);
        }
    }

    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Class mapValueClass) throws RemoteException{
        try{
            return getServiceFacade().addToMap(valueObjectsCollection, map, valueObjectKeyAttributeName, mapValueClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Class mapValueClass): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, Class mapValueClass)" + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #addToMap(Collection valueObjectsCollection ,Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)}
     */
    public HashMap addToHashMap(Collection valueObjectsCollection ,HashMap map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName) throws RemoteException{
        try {
            return (HashMap) getServiceFacade().addToMap(valueObjectsCollection, map, valueObjectKeyAttributeName, valueObjectValueAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToHashMap(Collection valueObjectsCollection ,HashMap map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName): " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToHashMap(Collection valueObjectsCollection ,HashMap map, String valueObjectKeyAttributeName,String valueObjectValueAttributeName) " + e.toString(),e);
        }
    }
    public Map addToMap(Collection valueObjectsCollection ,Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName) throws RemoteException{
        try{
            return getServiceFacade().addToMap(valueObjectsCollection, map, valueObjectKeyAttributeName, valueObjectValueAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection ,Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName) : " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection ,Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName) " + e.toString(),e);
        }
    }

    public Map addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName) throws RemoteException{
        try{
            return getServiceFacade().addToMap( valueObjectsCollection,  map,  valueObjectKeyAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName) : " + e.toString());
            throw new RemoteException("RemoteExceptionthrown thrown in BusinessSLSBFacadeBean.addToMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName)" + e.toString(),e);
        }
    }




    public void updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)throws RemoteException{
        try{
            getServiceFacade().updateCollectionWithMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName, valueObjectValueAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)" + e.toString(),e);
        }
    }

    public void updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName)throws RemoteException{
        try{
            getServiceFacade().updateCollectionWithMap(pInstance, pAttributeName, map, valueObjectKeyAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.updateCollectionWithMap(Object pInstance, String pAttributeName, Map map, String valueObjectKeyAttributeName)" + e.toString(),e);
        }
    }


    public void updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)throws RemoteException{
        try{
            getServiceFacade().updateCollectionWithMap(valueObjectsCollection, map, valueObjectKeyAttributeName, valueObjectValueAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName, String valueObjectValueAttributeName)" + e.toString(),e);
        }

    }

    public void updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName)throws RemoteException{
        try{
            getServiceFacade().updateCollectionWithMap(valueObjectsCollection, map, valueObjectKeyAttributeName);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.updateCollectionWithMap(Collection valueObjectsCollection, Map map, String valueObjectKeyAttributeName)" + e.toString(),e);
        }
    }


    public Collection getTreeLeaves(Object valueobjectOrCollection, String path) throws RemoteException {
        try{
            return getServiceFacade().getTreeLeaves( valueobjectOrCollection,  path);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.getTreeLeaves(Object valueobjectOrCollection, String path): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.getTreeLeaves(Object valueobjectOrCollection, String path)" + e.toString(),e);
        }
    }



    public Collection retrieveTreeLeaves(Object valueobjectOrCollection, String path) throws RemoteException {
        try{
            return getServiceFacade().retrieveTreeLeaves( valueobjectOrCollection,  path);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.retrieveTreeLeaves(Object valueobjectOrCollection, String path): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.retrieveTreeLeaves(Object valueobjectOrCollection, String path)" + e.toString(),e);
        }
    }



    /**
     * @deprecated use {@link #retrieveTreeLeaves(Object valueobjectOrCollection, String path)}
     */
    public Collection getCollectionOfRelatedMToNElements(Object pInstance, String collectionName, String pAttributeName) throws RemoteException{
        try{
            return getServiceFacade().retrieveTreeLeaves( pInstance,  "collectionName.pAttributeName");
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.getCollectionOfRelatedMToNElements(Object pInstance, String collectionName, String pAttributeName): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.getCollectionOfRelatedMToNElements(Object pInstance, String collectionName, String pAttributeName)" + e.toString(),e);
        }
    }



    public Collection retrieveNullPathTreeLeaves(Object valueobjectOrCollection, String path) throws RemoteException {
        try{
            return getServiceFacade().retrieveNullPathTreeLeaves( valueobjectOrCollection,  path);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.retrieveNullPathTreeLeaves(Object valueobjectOrCollection, String path): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.retrieveNullPathTreeLeaves(Object valueobjectOrCollection, String path)" + e.toString(),e);
        }
    }



    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,attributesComparator, path, sourcePAttributeNames, targetPAttributeNames, valuesArray, pAttributeNames);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,attributesComparator, path, sourcePAttributeNames, targetPAttributeNames, null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,attributesComparator, path, sourcePAttributeNames, sourcePAttributeNames, null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String[] attributesComparator, String path) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,attributesComparator, path, null, null, null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,attributesComparator, path, sourcePAttributeNames, sourcePAttributeNames, valuesArray, pAttributeNames);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path,Object[] valuesArray, String[] pAttributeNames) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,attributesComparator, path, null, null, valuesArray, pAttributeNames);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path, Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName,String[] attributesComparator, String path, Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,null, path, sourcePAttributeNames, targetPAttributeNames, valuesArray, pAttributeNames);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames,Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,null, path, sourcePAttributeNames, targetPAttributeNames, null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,null, path, sourcePAttributeNames, sourcePAttributeNames, null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,null, path, null, null, null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,null, path, sourcePAttributeNames, sourcePAttributeNames, valuesArray, pAttributeNames);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,  String[] sourcePAttributeNames,Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path,Object[] valuesArray, String[] pAttributeNames) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeLeaves(pInstance, pAttributeName,null, path, null, null, valuesArray, pAttributeNames);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path, Object[] valuesArray, String[] pAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeLeaves(Object pInstance, String pAttributeName, String path, Object[] valuesArray, String[] pAttributeNames)" + e.toString(),e);
        }
    }




    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeNodes(pInstance, pAttributeName, pkNames, path, nodeSourcePAttributeNames, nodeTargetPAttributeNames, pAttributeNames,valuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }


    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeNodes(pInstance, pAttributeName, pkNames, path, nodeSourcePAttributeNames, nodeTargetPAttributeNames, null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeNodes(pInstance, pAttributeName, pkNames, path, nodeSourcePAttributeNames, nodeSourcePAttributeNames, null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeNodes(pInstance, pAttributeName, pkNames, path, null, null, null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeNodes(pInstance, pAttributeName, null, path, null, null, null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeNodes(pInstance, pAttributeName, null, path, nodeSourcePAttributeNames, nodeTargetPAttributeNames, null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,   String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeNodes(pInstance, pAttributeName, null, path, nodeSourcePAttributeNames, nodeSourcePAttributeNames, null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,   String path, String[][] nodeSourcePAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames)" + e.toString(),e);
        }
    }



    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[] pAttributeNames,Object[] valuesArray) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeNodes(pInstance, pAttributeName, pkNames, path, nodeSourcePAttributeNames, nodeSourcePAttributeNames, pAttributeNames,valuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames, String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }


    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[] pAttributeNames,Object[] valuesArray) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeNodes(pInstance, pAttributeName, pkNames, path, null, null, pAttributeNames,valuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }


    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[] pAttributeNames,Object[] valuesArray) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeNodes(pInstance, pAttributeName, null, path, null, null, pAttributeNames,valuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeNodes(pInstance, pAttributeName, null, path, nodeSourcePAttributeNames, nodeTargetPAttributeNames, pAttributeNames,valuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }

    public void addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[][] nodeSourcePAttributeNames,   String[] pAttributeNames,Object[] valuesArray) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollectionTreeNodes(pInstance, pAttributeName, null, path, nodeSourcePAttributeNames, nodeSourcePAttributeNames, pAttributeNames,valuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[][] nodeSourcePAttributeNames,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName,  String path, String[][] nodeSourcePAttributeNames,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }



    /**
     * @deprecated use {@link #addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String[] pkNames,  String path, String[][] nodeSourcePAttributeNames,  String[] pAttributeNames,Object[] valuesArray)}
     */
    public void align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,String[] pkNames,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames) throws RemoteException{
        try{
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
            //getContextServiceFacade().addToRetainInCollectionTreeLeaves(pInstance, pAttributeName, attributesComparator, path, sourcePAttributeNames, sourcePAttributeNames, valuesArray, pAttributeNames);
            getServiceFacade().addToRetainInCollectionTreeNodes(pInstance,  pAttributeName, pkNames,  path,  nodeSourcePAttributeNames,  nodeSourcePAttributeNames,  pAttributeNames, valuesArray) ;
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,String[] pkNames,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,String[] pkNames,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames)" + e.toString(),e);
        }

    }

    /**
     * @deprecated use {@link #addToRetainInCollectionTreeNodes(Object pInstance, String pAttributeName, String path, String[][] nodeSourcePAttributeNames,   String[] pAttributeNames,Object[] valuesArray)}
     */
    public void align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames) throws RemoteException{
        try{
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
            //getContextServiceFacade().addToRetainInCollectionTreeLeaves(pInstance, pAttributeName, null,path, sourcePAttributeNames, sourcePAttributeNames, valuesArray, pAttributeNames);
            getServiceFacade().addToRetainInCollectionTreeNodes(pInstance,  pAttributeName, null,  path,  nodeSourcePAttributeNames,  nodeSourcePAttributeNames,  pAttributeNames, valuesArray) ;
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.align(Object pInstance, String pAttributeName, String[] treePathCollectionSource,  String[] pAttributeNames, Object[] valuesArray,String[] sourcePAttributeNames)" + e.toString(),e);
        }
    }


    public void createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws RemoteException{
        try{
            getServiceFacade().createValueObjectsTreeWithCollection(pInstance, pAttributeName , path, groupedPkNames,  nodePAttributeNames, nodeValuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }
    }

    public void createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames) throws RemoteException{
        try{
            getServiceFacade().createValueObjectsTreeWithCollection(pInstance, pAttributeName , path, groupedPkNames,  null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames)" + e.toString(),e);
        }
    }

    public void createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path) throws RemoteException{
        try{
            getServiceFacade().createValueObjectsTreeWithCollection(pInstance, pAttributeName , path, null,  null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path)" + e.toString(),e);
        }
    }

    public void createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws RemoteException{
        try{
            getServiceFacade().createValueObjectsTreeWithCollection(pInstance, pAttributeName , path, null,   nodePAttributeNames, nodeValuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }
    }

    public void createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws RemoteException{
        try{
            getServiceFacade().createValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path,  groupedPkNames,  nodePAttributeNames, nodeValuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }
    }


    public void createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames) throws RemoteException{
        try{
            getServiceFacade().createValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path,  groupedPkNames,  null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames)" + e.toString(),e);
        }
    }

    public void createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path) throws RemoteException{
        try{
            getServiceFacade().createValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path, null,  null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path)" + e.toString(),e);
        }
    }

    public void createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws RemoteException{
        try{
            getServiceFacade().createValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path,  null,  nodePAttributeNames, nodeValuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }
    }


    public void addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws RemoteException{
        try{
            getServiceFacade().addToValueObjectsTreeWithCollection(pInstance, pAttributeName , path, groupedPkNames,  nodePAttributeNames, nodeValuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }
    }

    public void addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames) throws RemoteException{
        try{
            getServiceFacade().addToValueObjectsTreeWithCollection(pInstance, pAttributeName , path, groupedPkNames,  null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path, String[][] groupedPkNames)" + e.toString(),e);
        }
    }

    public void addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path) throws RemoteException{
        try{
            getServiceFacade().addToValueObjectsTreeWithCollection(pInstance, pAttributeName , path, null,  null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path)" + e.toString(),e);
        }
    }

    public void addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws RemoteException{
        try{
            getServiceFacade().addToValueObjectsTreeWithCollection(pInstance, pAttributeName , path, null,  nodePAttributeNames, nodeValuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToValueObjectsTreeWithCollection(Object pInstance, String pAttributeName ,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }
    }



    public void addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws RemoteException{
        try{
            //getServiceFacade().createValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path,  groupedPkNames,  nodePAttributeNames, nodeValuesArray);
            getServiceFacade().addToValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path,  groupedPkNames,  nodePAttributeNames, nodeValuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames,  String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }
    }


    public void addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames) throws RemoteException{
        try{
            //getServiceFacade().createValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path,  groupedPkNames,  null, null);
            getServiceFacade().addToValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path,  groupedPkNames,  null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] groupedPkNames)" + e.toString(),e);
        }
    }

    public void addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path) throws RemoteException{
        try{
            //getServiceFacade().createValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path, null,  null, null);
            getServiceFacade().addToValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path, null,  null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path)" + e.toString(),e);
        }
    }

    public void addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray) throws RemoteException{
        try{
            //getServiceFacade().createValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path,  null,  nodePAttributeNames, nodeValuesArray);
            getServiceFacade().addToValueObjectsTreeWithCollection( valueObjectsCollection,  pInstance, path,  null,  nodePAttributeNames, nodeValuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path,  String[][] nodePAttributeNames,Object[][] nodeValuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToValueObjectsTreeWithCollection(Collection  valueObjectsCollection, Object pInstance,String path, String[][] nodePAttributeNames,Object[][] nodeValuesArray)" + e.toString(),e);
        }
    }






    /**
     * @deprecated use {@link #addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray)}
     */
    public void createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray)throws RemoteException{
        try{
            getServiceFacade().addToRelationshipCollectionMissingElements( pInstance,  collectionName,  pAttributeName,  null,   pAttributeNames, valuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName)}
     */
    public void createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName)throws RemoteException{
        try{
            getServiceFacade().addToRelationshipCollectionMissingElements( pInstance,  collectionName,  pAttributeName,  null,   null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName)" + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection)}
     */
    public void createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection)throws RemoteException{
        try{
            getServiceFacade().addToRelationshipCollectionMissingElements( pInstance,  collectionName,  pAttributeName,  valueObjectsCollection,   null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection)" + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)}
     */
    public void createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)throws RemoteException{
        try{
            getServiceFacade().addToRelationshipCollectionMissingElements( pInstance,  collectionName,  pAttributeName,  valueObjectsCollection,   pAttributeNames, valuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }



    public void addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray)throws RemoteException{
        try{
            getServiceFacade().addToRelationshipCollectionMissingElements( pInstance,  collectionName,  pAttributeName,  null,   pAttributeNames, valuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }


    public void addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName)throws RemoteException{
        try{
            getServiceFacade().addToRelationshipCollectionMissingElements( pInstance,  collectionName,  pAttributeName,  null,   null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName)" + e.toString(),e);
        }
    }

    public void addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection)throws RemoteException{
        try{
            getServiceFacade().addToRelationshipCollectionMissingElements( pInstance,  collectionName,  pAttributeName,  valueObjectsCollection,   null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection)" + e.toString(),e);
        }
    }

    public void addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray) throws RemoteException{
        try{
            getServiceFacade().addToRelationshipCollectionMissingElements( pInstance,  collectionName,  pAttributeName,  valueObjectsCollection,   pAttributeNames, valuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRelationshipCollectionMissingElements(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createMissingRelationshipElement(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }



    public void createRelationshipCollection(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray) throws RemoteException{
        try{
            getServiceFacade().createRelationshipCollection( pInstance,  collectionName,  pAttributeName,  valueObjectsCollection,   pAttributeNames, valuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createRelationshipCollection(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createRelationshipCollection(Object pInstance, String collectionName, String pAttributeName, Collection valueObjectsCollection,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }



    public void createRelationshipCollectionByOrValues(Object pInstance, String collectionName, String pAttributeName, String orPAttributeName, Collection valuesCollection,  String[] pAttributeNames,Object[] valuesArray)throws RemoteException{
        try{
            getServiceFacade().createRelationshipCollectionByOrValues( pInstance,  collectionName,  pAttributeName,  orPAttributeName,  valuesCollection,   pAttributeNames, valuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createRelationshipCollectionByOrValues(Object pInstance, String collectionName, String pAttributeName, String orPAttributeName, Collection valuesCollection,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createRelationshipCollectionByOrValues(Object pInstance, String collectionName, String pAttributeName, String orPAttributeName, Collection valuesCollection,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }



    /**
     *
     * @deprecated use {@link #createRelationshipCollectionByOrValues(Object pInstance, String collectionName, String pAttributeName, String orPAttributeName, Collection valuesCollection,  String[] pAttributeNames,Object[] valuesArray)}
     */
    public void setRelationshipElementWithQueryByOrValues(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String orPAttributeName,Collection valuesCollection)throws RemoteException{
        try{
            getServiceFacade().createRelationshipCollectionByOrValues( pInstance,  collectionName,  pAttributeName,  orPAttributeName,  valuesCollection,   pAttributeNames, valuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.setRelationshipElementWithQueryByOrValues(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String orPAttributeName,Collection valuesCollection): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.setRelationshipElementWithQueryByOrValues(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String orPAttributeName,Collection valuesCollection)" + e.toString(),e);
        }

    }




    public void createRelationshipCollectionBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName, String[] toSearchInPAttributeNames, Object value,  String[] pAttributeNames,Object[] valuesArray)throws RemoteException{
        try{
            getServiceFacade().createRelationshipCollectionBySearchValueInFields( pInstance,  collectionName,  pAttributeName, toSearchInPAttributeNames,  value,   pAttributeNames, valuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createRelationshipCollectionBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName, String[] toSearchInPAttributeNames, Object value,  String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createRelationshipCollectionBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName, String[] toSearchInPAttributeNames, Object value,  String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }


    /**
     *
     * @deprecated use {@link #createRelationshipCollectionBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName, String[] toSearchInPAttributeNames, Object value,  String[] pAttributeNames,Object[] valuesArray)}
     */
    public void setRelationshipElementWithQueryBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String[] toSearchInPAttributeNames,Object value)throws RemoteException{
        try{
            getServiceFacade().createRelationshipCollectionBySearchValueInFields( pInstance,  collectionName,  pAttributeName, toSearchInPAttributeNames,  value,   pAttributeNames, valuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.setRelationshipElementWithQueryBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String[] toSearchInPAttributeNames,Object value): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.setRelationshipElementWithQueryBySearchValueInFields(Object pInstance, String collectionName, String pAttributeName,   String[] pAttributeNames, Object[] valuesArray, String[] toSearchInPAttributeNames,Object value)" + e.toString(),e);
        }

    }



    public boolean addToCollection(Object pInstance, String pAttributeName, Object toAddPInstance) throws RemoteException{
        try{
            return getServiceFacade().addToCollection(pInstance, pAttributeName, toAddPInstance) ;
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToCollection(Object pInstance, String pAttributeName, Object toAddPInstance): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToCollection(Object pInstance, String pAttributeName, Object toAddPInstance)" + e.toString(),e);
        }
    }


    /**
     * @deprecated use {@link #addToCollection(Object pInstance, String pAttributeName, Object toAddPInstance)}
     */
    public boolean addElementToCollectionReference(Object pInstance, String pAttributeName, Object toAddPInstance) throws RemoteException{
        try{
            return getServiceFacade().addToCollection(pInstance, pAttributeName, toAddPInstance) ;
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addElementToCollectionReference(Object pInstance, String pAttributeName, Object toAddPInstance): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addElementToCollectionReference(Object pInstance, String pAttributeName, Object toAddPInstance)" + e.toString(),e);
        }
    }



    public boolean addAllToCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd) throws RemoteException{
        try{
            return getServiceFacade().addAllToCollection(pInstance, pAttributeName, valueObjectsCollectionToAdd) ;
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addAllToCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addAllToCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd)" + e.toString(),e);
        }
    }



    /**
     * @deprecated use {@link #addAllToCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd)}
     */
    public Object addCollectionToCollectionReference(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd) throws RemoteException{
        try{
            getServiceFacade().addAllToCollection(pInstance, pAttributeName, valueObjectsCollectionToAdd) ;
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addCollectionToCollectionReference(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addCollectionToCollectionReference(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAdd)" + e.toString(),e);
        }
        return pInstance;
    }


    public boolean addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames,Object[] valuesArray) throws RemoteException{
        try{
            return getServiceFacade().addAllToCollection( targetRealClass,  valueObjectsCollection,   valueObjectsCollectionToAdd, sourcePAttributeNames, targetPAttributeNames, pAttributeNames, valuesArray) ;
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }



    /**
     * @deprecated use {@link #addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames,Object[] valuesArray)}
     */
    public Collection addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection, String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames, Object[] valuesArray ) throws RemoteException{
        try{
            getServiceFacade().addAllToCollection( targetRealClass,  valueObjectsCollection,   valueObjectsCollectionToAdd, sourcePAttributeNames, targetPAttributeNames, pAttributeNames, valuesArray) ;
            return valueObjectsCollection;
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean. addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection, String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames, Object[] valuesArray ) " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean. addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection, String[] sourcePAttributeNames,String[] targetPAttributeNames, String[] pAttributeNames, Object[] valuesArray )" + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames)}
     */
    public Collection addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection,String[] sourcePAttributeNames,String[] targetPAttributeNames) throws RemoteException{
        try{
            getServiceFacade().addAllToCollection( targetRealClass,  valueObjectsCollection,   valueObjectsCollectionToAdd, sourcePAttributeNames, targetPAttributeNames, null, null) ;
            return valueObjectsCollection;
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection,String[] sourcePAttributeNames,String[] targetPAttributeNames) " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addCollectionFromCollection(Class targetRealClass, Collection valueObjectsCollectionToAdd, Collection valueObjectsCollection,String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }
    }


    public boolean addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, String[] pAttributeNames) throws RemoteException{
        try{
            return getServiceFacade().addAllToCollection(valueObjectsCollection,  valueObjectsCollectionToAdd, pAttributeNames);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, String[] pAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, String[] pAttributeNames): " + e.toString(),e);
        }
    }

    public boolean addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, Class realClass)  throws RemoteException{
        try{
            return getServiceFacade().addAllToCollection( valueObjectsCollection,   valueObjectsCollectionToAdd,  realClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, Class realClass): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, Class realClass): " + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #addAllToCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd, Class realClass)}
     */
    public Collection mergeTwoCollections(Collection valueObjectsCollection, Collection valueObjectsCollectionToAdd, Class realClass) throws RemoteException{
        try{
            getServiceFacade().addAllToCollection( valueObjectsCollection,   valueObjectsCollectionToAdd,  realClass);
            return valueObjectsCollection;
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.mergeTwoCollections(Collection valueObjectsCollection, Collection valueObjectsCollectionToAdd, Class realClass): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.mergeTwoCollections(Collection valueObjectsCollection, Collection valueObjectsCollectionToAdd, Class realClass): " + e.toString(),e);
        }
    }



    public boolean addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames) throws RemoteException{
        try{
            return getServiceFacade().addAllToCollection( targetRealClass,  valueObjectsCollection,   valueObjectsCollectionToAdd, sourcePAttributeNames, targetPAttributeNames, null, null) ;
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addAllToCollection(Class targetRealClass, Collection valueObjectsCollection, Collection  valueObjectsCollectionToAdd,String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }
    }

    public boolean addAllToCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAdd, String pAttributeNameMapKey) throws RemoteException{
        try{
            return getServiceFacade().addAllToCollection(valueObjectsCollection, map,  valueObjectsCollectionToAdd, pAttributeNameMapKey) ;
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addAllToCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAdd, String pAttributeNameMapKey) : " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addAllToCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAdd, String pAttributeNameMapKey) " + e.toString(),e);
        }
    }




    public boolean retainAllInCollection(Object pInstance, String pAttributeName, Collection  toRetainValueObjectsCollection) throws RemoteException{
        try{
            return getServiceFacade().retainAllInCollection( pInstance,  pAttributeName,   toRetainValueObjectsCollection);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.retainAllInCollection(Object pInstance, String pAttributeName, Collection  toRetainValueObjectsCollection): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.retainAllInCollection(Object pInstance, String pAttributeName, Collection  toRetainValueObjectsCollection)" + e.toString(),e);
        }
    }


    public boolean retainAllInCollection(Collection valueObjectsCollection, Collection  toRetainValueObjectsCollection, Class realClass) throws RemoteException{
        try{
            return getServiceFacade().retainAllInCollection( valueObjectsCollection,   toRetainValueObjectsCollection,  realClass);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.retainAllInCollection(Collection valueObjectsCollection, Collection  toRetainValueObjectsCollection, Class realClass): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.retainAllInCollection(Collection valueObjectsCollection, Collection  toRetainValueObjectsCollection, Class realClass)" + e.toString(),e);
        }
    }

    public boolean retainAllInCollection(Collection valueObjectsCollection, Collection toRetainValueObjectsCollection, String[] pAttributeNames) throws RemoteException{
        try{
            return getServiceFacade().retainAllInCollection( valueObjectsCollection,  toRetainValueObjectsCollection,  pAttributeNames);
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.retainAllInCollection(Collection valueObjectsCollection, Collection toRetainValueObjectsCollection, String[] pAttributeNames) " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.retainAllInCollection(Collection valueObjectsCollection, Collection toRetainValueObjectsCollection, String[] pAttributeNames)" + e.toString(),e);
        }
    }

    public boolean retainAllInCollection(Collection valueObjectsCollection, Map map, String pAttributeNameMapKey) throws RemoteException{
        try{
            return getServiceFacade().retainAllInCollection(valueObjectsCollection,  map, pAttributeNameMapKey);
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.retainAllInCollection(Collection valueObjectsCollection, Map map, String pAttributeNameMapKey) " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.retainAllInCollection(Collection valueObjectsCollection, Map map, String pAttributeNameMapKey)" + e.toString(),e);
        }
    }





    /**
     * @deprecated use {@link #retainAllInCollection(Collection valueObjectsCollection, Map map, String pAttributeNameMapKey)}
     */
    public void removeFromCollectionElementsNotInMap(Collection valueObjectsCollection, HashMap map,  String pAttributeNameMapKey) throws RemoteException{
        try{
            getServiceFacade().retainAllInCollection(valueObjectsCollection,  map, pAttributeNameMapKey);
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.removeFromCollectionElementsNotInMap(Collection valueObjectsCollection, HashMap map,  String pAttributeNameMapKey) " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.removeFromCollectionElementsNotInMap(Collection valueObjectsCollection, HashMap map,  String pAttributeNameMapKey)" + e.toString(),e);
        }

    }

    public boolean addToRetainInCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAddAndRetain)throws RemoteException{
        try{
            return getServiceFacade().addToRetainInCollection( pInstance,  pAttributeName,   valueObjectsCollectionToAddAndRetain);
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAddAndRetain) " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToAddAndRetain) " + e.toString(),e);
        }
    }

    public boolean addToRetainInCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAddAndRetain, Class realClass) throws RemoteException{
        try{
            return getServiceFacade().addToRetainInCollection( valueObjectsCollection,   valueObjectsCollectionToAddAndRetain,  realClass);
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAddAndRetain, Class realClass) " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollection(Collection valueObjectsCollection, Collection  valueObjectsCollectionToAddAndRetain, Class realClass) " + e.toString(),e);
        }
    }

    public boolean addToRetainInCollection(Collection valueObjectsCollection, Collection valueObjectsCollectionToAddAndRetain, String[] pAttributeNames) throws RemoteException{
        try{
            return getServiceFacade().addToRetainInCollection( valueObjectsCollection,  valueObjectsCollectionToAddAndRetain,  pAttributeNames);
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollection(Collection valueObjectsCollection, Collection valueObjectsCollectionToAddAndRetain, String[] pAttributeNames) " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollection(Collection valueObjectsCollection, Collection valueObjectsCollectionToAddAndRetain, String[] pAttributeNames) " + e.toString(),e);
        }
    }

    public boolean addToRetainInCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)throws RemoteException{
        try{
            return getServiceFacade().addToRetainInCollection( valueObjectsCollection,  map,   valueObjectsCollectionToAddAndRetain,  pAttributeNameMapKey);
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addToRetainInCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)" + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addToRetainInCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)" + e.toString(),e);
        }
    }


    /**
     * @deprecated use {@link #addToRetainInCollection(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)}
     *
     */
    public void refreshCollectionWithOtherCollectionUsingMapAsRelation(Collection valueObjectsCollection, HashMap map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey) throws RemoteException{
        try{
            getServiceFacade().addToRetainInCollection( valueObjectsCollection,  map,   valueObjectsCollectionToAddAndRetain,  pAttributeNameMapKey);
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.refreshCollectionWithOtherCollectionUsingMapAsRelation(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)" + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.refreshCollectionWithOtherCollectionUsingMapAsRelation(Collection valueObjectsCollection, Map map, Collection  valueObjectsCollectionToAddAndRetain, String pAttributeNameMapKey)" + e.toString(),e);
        }
    }


    public boolean removeFromCollection(Object pInstance, String pAttributeName, Object toRemovePInstance) throws RemoteException{
        try{
            return getServiceFacade().removeFromCollection(pInstance, pAttributeName, toRemovePInstance) ;
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.removeFromCollection(Object pInstance, String pAttributeName, Object toRemovePInstance) : " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.removeFromCollection(Object pInstance, String pAttributeName, Object toRemovePInstance) " + e.toString(),e);
        }
    }

    public boolean removeFromCollection(Collection valueObjectsCollection, Object toRemovePInstance) throws RemoteException{
        try{
            return getServiceFacade().removeFromCollection(valueObjectsCollection, toRemovePInstance);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.removeFromCollection(Collection valueObjectsCollection, Object toRemovePInstance): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.removeFromCollection(Collection valueObjectsCollection, Object toRemovePInstance)" + e.toString(),e);
        }
    }



    /**
     * @deprecated use {@link #removeFromCollection(Object pInstance, String pAttributeName, Object toRemovePInstance)}
     */
    public boolean removeElementFromCollectionReference(Object pInstance, String pAttributeName, Object toRemovePInstance) throws RemoteException{
        try{
            return getServiceFacade().removeFromCollection(pInstance, pAttributeName, toRemovePInstance) ;
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.removeFromCollectionReference(Object pInstance, String pAttributeName, Object toRemovePInstance): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.removeFromCollectionReference(Object pInstance, String pAttributeName, Object toRemovePInstance)" + e.toString(),e);
        }
    }





    public boolean removeAllFromCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToRemove) throws RemoteException{
        try{
            return getServiceFacade().removeAllFromCollection( pInstance,  pAttributeName, valueObjectsCollectionToRemove);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.removeAllFromCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToRemove) : " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.removeAllFromCollection(Object pInstance, String pAttributeName, Collection  valueObjectsCollectionToRemove) " + e.toString(),e);
        }
    }





    public Object createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray) throws RemoteException{
        try{
            return getServiceFacade().createVOfromVO(sourceRealClass, pkFieldNames, pkValues, targetRealClass, sourcePAttributeNames, targetPAttributeNames, pAttributeNames, valuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }


    public Object createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames) throws RemoteException{
        try{
            return getServiceFacade().createVOfromVO(sourceRealClass, pkFieldNames, pkValues, targetRealClass, sourcePAttributeNames, targetPAttributeNames, null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createVOfromVO(Class sourceRealClass,String[] pkFieldNames, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }
    }

    public Object createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray) throws RemoteException{
        try{
            return getServiceFacade().createVOfromVO(sourceRealClass,  pkValues, targetRealClass, sourcePAttributeNames, targetPAttributeNames, pAttributeNames, valuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }



    public Object createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames) throws RemoteException{
        try{
            return getServiceFacade().createVOfromVO(sourceRealClass,  pkValues, targetRealClass, sourcePAttributeNames, targetPAttributeNames, null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createVOfromVO(Class sourceRealClass, Object[] pkValues, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }
    }

    public Object createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray) throws RemoteException{
        try{
            return getServiceFacade().createVOfromVO(sourcePInstance, targetRealClass, sourcePAttributeNames,targetPAttributeNames, pAttributeNames, valuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames,String[] pAttributeNames,Object[] valuesArray)" + e.toString(),e);
        }
    }

    public Object createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames) throws RemoteException{
        try{
            return getServiceFacade().createVOfromVO(sourcePInstance, targetRealClass, sourcePAttributeNames,targetPAttributeNames, null, null);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.createVOfromVO(Object sourcePInstance, Class targetRealClass, String[] sourcePAttributeNames,String[] targetPAttributeNames)" + e.toString(),e);
        }
    }









    public boolean  addTreeToTree(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ) throws RemoteException{
        try{
            return getServiceFacade().addTreeToTree( sourceRootVO,  targetRootVO, sourceTreePaths, targetTreePaths,  treeNodeSourcePAttributeNames,  treeNodeTargetPAttributeNames,  treeNodePAttributeNames,  treeNodeValuesArray );
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addTreeToTree(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addTreeToTree(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ):" + e.toString(),e);
        }
    }

    /**
     * @deprecated use {@link #addTreeToTree(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray )}
     * */
    public Object addTreesToTrees(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames,Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ) throws RemoteException{
        try{
            getServiceFacade().addTreeToTree( sourceRootVO,  targetRootVO, sourceTreePaths, targetTreePaths,  treeNodeSourcePAttributeNames,  treeNodeTargetPAttributeNames,  treeNodePAttributeNames,  treeNodeValuesArray );
            return targetRootVO;
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addTreesToTrees(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addTreesToTrees(Object sourceRootVO, Object targetRootVO,Collection sourceTreePaths,Collection targetTreePaths, Collection treeNodeSourcePAttributeNames, Collection treeNodeTargetPAttributeNames, Collection treeNodePAttributeNames, Collection treeNodeValuesArray ):" + e.toString(),e);
        }

    }




    public boolean addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames, String[][] nodePAttributeNames, Object[][] nodeValuesArray)throws RemoteException{
        try{
            return getServiceFacade().addTreeToTree( sourceRootVO,  targetRootVO,  sourceTreePath,  targetTreePath, nodeSourcePAttributeNames,  nodeTargetPAttributeNames,  nodePAttributeNames, nodeValuesArray);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames, String[][] nodePAttributeNames, Object[][] nodeValuesArray): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, String[][] nodeSourcePAttributeNames, String[][]  nodeTargetPAttributeNames, String[][] nodePAttributeNames, Object[][] nodeValuesArray)" + e.toString(),e);
        }
    }


    public boolean addTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, Collection nodeSourcePAttributeNamesCollection, Collection nodeTargetPAttributeNamesCollection, Collection nodePAttributeNamesCollection, Collection nodeValuesArrayCollection) throws RemoteException{
        try{
            return getServiceFacade().addTreeToTree( sourceRootVO,  targetRootVO,  sourceTreePath,  targetTreePath,  nodeSourcePAttributeNamesCollection,  nodeTargetPAttributeNamesCollection,  nodePAttributeNamesCollection,  nodeValuesArrayCollection);
        }catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in BusinessSLSBFacadeBean.ddTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, Collection nodeSourcePAttributeNamesCollection, Collection nodeTargetPAttributeNamesCollection, Collection nodePAttributeNamesCollection, Collection nodeValuesArrayCollection): " + e.toString());
            throw new RemoteException("RemoteException thrown in BusinessSLSBFacadeBean.ddTreeToTree(Object sourceRootVO, Object targetRootVO, String sourceTreePath, String targetTreePath, Collection nodeSourcePAttributeNamesCollection, Collection nodeTargetPAttributeNamesCollection, Collection nodePAttributeNamesCollection, Collection nodeValuesArrayCollection)" + e.toString(),e);
        }

    }


}