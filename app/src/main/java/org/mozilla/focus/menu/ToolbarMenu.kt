/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package org.mozilla.focus.menu

import mozilla.components.browser.menu.WebExtensionBrowserMenuBuilder
import mozilla.components.browser.menu.item.BrowserMenuItemToolbar

interface ToolbarMenu {

    sealed class Item {
        data class RequestDesktop(val isChecked: Boolean) : Item()
        object Reload : Item()
        object Back : Item()
        object Forward : Item()
        object Share : Item()
        object FindInPage : Item()
        object AddToHomeScreen : Item()
        object OpenInApp : Item()
        object Settings : Item()
        object Stop : Item()
    }

    val menuBuilder: WebExtensionBrowserMenuBuilder
    val menuToolbar: BrowserMenuItemToolbar
}
