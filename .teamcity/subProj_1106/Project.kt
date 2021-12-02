package subProj_1106

import subProj_1106.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1106")
    name = "subProj 1106"

    buildType(subProj_bt_1106_1)
    buildType(subProj_bt_1106_0)
    buildType(subProj_bt_1106_3)
    buildType(subProj_bt_1106_2)
    buildType(subProj_bt_1106_5)
    buildType(subProj_bt_1106_4)
})
