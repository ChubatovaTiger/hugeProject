package subProj_510

import subProj_510.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_510")
    name = "subProj 510"

    buildType(subProj_bt_510_4)
    buildType(subProj_bt_510_5)
    buildType(subProj_bt_510_2)
    buildType(subProj_bt_510_3)
    buildType(subProj_bt_510_0)
    buildType(subProj_bt_510_1)
})
