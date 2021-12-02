package subProj_106

import subProj_106.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_106")
    name = "subProj 106"

    buildType(subProj_bt_106_3)
    buildType(subProj_bt_106_4)
    buildType(subProj_bt_106_1)
    buildType(subProj_bt_106_2)
    buildType(subProj_bt_106_0)
    buildType(subProj_bt_106_5)
})
