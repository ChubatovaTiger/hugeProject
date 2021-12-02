package subProj_1998

import subProj_1998.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1998")
    name = "subProj 1998"

    buildType(subProj_bt_1998_0)
    buildType(subProj_bt_1998_2)
    buildType(subProj_bt_1998_1)
    buildType(subProj_bt_1998_4)
    buildType(subProj_bt_1998_3)
    buildType(subProj_bt_1998_5)
})
