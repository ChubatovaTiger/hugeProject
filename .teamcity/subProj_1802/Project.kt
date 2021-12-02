package subProj_1802

import subProj_1802.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1802")
    name = "subProj 1802"

    buildType(subProj_bt_1802_0)
    buildType(subProj_bt_1802_4)
    buildType(subProj_bt_1802_3)
    buildType(subProj_bt_1802_2)
    buildType(subProj_bt_1802_1)
    buildType(subProj_bt_1802_5)
})
