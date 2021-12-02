package subProj_802

import subProj_802.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_802")
    name = "subProj 802"

    buildType(subProj_bt_802_2)
    buildType(subProj_bt_802_3)
    buildType(subProj_bt_802_4)
    buildType(subProj_bt_802_5)
    buildType(subProj_bt_802_0)
    buildType(subProj_bt_802_1)
})
