package subProj_312

import subProj_312.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_312")
    name = "subProj 312"

    buildType(subProj_bt_312_2)
    buildType(subProj_bt_312_3)
    buildType(subProj_bt_312_0)
    buildType(subProj_bt_312_1)
    buildType(subProj_bt_312_4)
    buildType(subProj_bt_312_5)
})
