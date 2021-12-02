package subProj_625

import subProj_625.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_625")
    name = "subProj 625"

    buildType(subProj_bt_625_4)
    buildType(subProj_bt_625_3)
    buildType(subProj_bt_625_5)
    buildType(subProj_bt_625_0)
    buildType(subProj_bt_625_2)
    buildType(subProj_bt_625_1)
})
