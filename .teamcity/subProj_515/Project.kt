package subProj_515

import subProj_515.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_515")
    name = "subProj 515"

    buildType(subProj_bt_515_5)
    buildType(subProj_bt_515_3)
    buildType(subProj_bt_515_4)
    buildType(subProj_bt_515_1)
    buildType(subProj_bt_515_2)
    buildType(subProj_bt_515_0)
})
