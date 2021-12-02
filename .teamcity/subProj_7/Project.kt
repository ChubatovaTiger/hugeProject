package subProj_7

import subProj_7.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_7")
    name = "subProj 7"

    buildType(subProj_bt_7_5)
    buildType(subProj_bt_7_0)
    buildType(subProj_bt_7_3)
    buildType(subProj_bt_7_4)
    buildType(subProj_bt_7_1)
    buildType(subProj_bt_7_2)
})
