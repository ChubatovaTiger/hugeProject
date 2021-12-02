package subProj_1993

import subProj_1993.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1993")
    name = "subProj 1993"

    buildType(subProj_bt_1993_5)
    buildType(subProj_bt_1993_4)
    buildType(subProj_bt_1993_1)
    buildType(subProj_bt_1993_0)
    buildType(subProj_bt_1993_3)
    buildType(subProj_bt_1993_2)
})
