package subProj_1752

import subProj_1752.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1752")
    name = "subProj 1752"

    buildType(subProj_bt_1752_5)
    buildType(subProj_bt_1752_4)
    buildType(subProj_bt_1752_3)
    buildType(subProj_bt_1752_2)
    buildType(subProj_bt_1752_1)
    buildType(subProj_bt_1752_0)
})
