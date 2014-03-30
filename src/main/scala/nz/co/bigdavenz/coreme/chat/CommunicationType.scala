/*
 * CoreMe Minecraft Mod API
 * Copyright (c) 2014 by BigDaveNz aka David J. Dudson (bigdavenz@bigdavenz.co.nz).
 * Released under GNU General Public Licence version 3 https://www.gnu.org/licenses/gpl.html
 */

package nz.co.bigdavenz.coreme.chat

/**
 * Created by BigDaveNz aka David J. Dudson.
 * Date 30/03/2014.
 * Time 6:14 PM.
 */
class CommunicationType extends Enumeration {
  type CommunicationType = Value
  val ERROR, WARNING, DEBUG, CELEBRATION, NOTIFICATION = Value
}