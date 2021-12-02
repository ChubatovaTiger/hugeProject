package subProj_1571

import subProj_1571.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1571")
    name = "subProj 1571"

    buildType(subProj_bt_1571_0)
    buildType(subProj_bt_1571_1)
    buildType(subProj_bt_1571_2)
    buildType(subProj_bt_1571_3)
    buildType(subProj_bt_1571_4)
    buildType(subProj_bt_1571_5)
})
