package subProj_752

import subProj_752.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_752")
    name = "subProj 752"

    buildType(subProj_bt_752_4)
    buildType(subProj_bt_752_5)
    buildType(subProj_bt_752_0)
    buildType(subProj_bt_752_1)
    buildType(subProj_bt_752_2)
    buildType(subProj_bt_752_3)
})
