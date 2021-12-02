package subProj_705

import subProj_705.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_705")
    name = "subProj 705"

    buildType(subProj_bt_705_2)
    buildType(subProj_bt_705_3)
    buildType(subProj_bt_705_0)
    buildType(subProj_bt_705_1)
    buildType(subProj_bt_705_4)
    buildType(subProj_bt_705_5)
})
